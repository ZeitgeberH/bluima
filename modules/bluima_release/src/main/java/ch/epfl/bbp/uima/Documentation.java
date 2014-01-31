package ch.epfl.bbp.uima;

import static ch.epfl.bbp.hamcrest.NoneOf.noneOf;
import static ch.epfl.bbp.hamcrest.ShorterThan.shorterThan;
import static ch.epfl.bbp.uima.BlueUima.BLUE_UIMA_ROOT;
import static ch.lambdaj.Lambda.filter;
import static java.util.regex.Pattern.compile;
import static org.apache.commons.io.FileUtils.iterateFiles;
import static org.apache.commons.io.FileUtils.readFileToString;
import static org.apache.commons.io.FilenameUtils.getExtension;
import static org.apache.commons.lang.StringUtils.join;
import static org.hamcrest.text.StringContains.containsString;
import static org.slf4j.LoggerFactory.getLogger;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.AnalysisComponent;
import org.apache.uima.fit.component.JCasCollectionReader_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.slf4j.Logger;

import ch.epfl.bbp.io.TextFileWriter;

/**
 * Generates documentation for all annotators and readers, in html format.
 * 
 * @author renaud.richardet@epfl.ch
 */
public class Documentation {
    private static Logger LOG = getLogger(Documentation.class);

    public static void main(String[] args) throws Exception {

        List<CompInfo> components = new ArrayList<CompInfo>();

        File repo = new File(BLUE_UIMA_ROOT);
        Iterator<File> it = iterateFiles(repo,
                new String[] { "java", "scala" }, true);
        while (it.hasNext()) {
            File classFile = it.next();
            String extension = getExtension(classFile.getName());

            if (classFile.getAbsolutePath().indexOf("src/test/") > -1)
                continue; // a test
            int indexOf = classFile.getAbsolutePath().indexOf(
                    "src/main/" + extension);
            String className = classFile.getAbsolutePath().substring(
                    indexOf + 9 + extension.length());
            // transform a file path to a package name (replace / and \)
            className = className.replace("." + extension, "")
                    .replace("/", ".").replace("\\", ".")//
                    .replaceFirst(".", "");
            try {
                Class<?> clazz = Class.forName(className);

                // all uimafit AnnotationEngines
                if (AnalysisComponent.class.isAssignableFrom(clazz)) {
                    LOG.debug("AnnotationEngine: {}", clazz.getSimpleName());
                    CompInfo comp = parseCompInfo(clazz, classFile);
                    comp.isCr = false;
                    components.add(comp);
                }
                // all uimafit CollectionReaders
                else if (JCasCollectionReader_ImplBase.class.isAssignableFrom(//
                        clazz)) {
                    LOG.debug("CollectionReaders: {}", clazz.getSimpleName());
                    CompInfo comp = parseCompInfo(clazz, classFile);
                    comp.isCr = true;
                    components.add(comp);
                }
            } catch (Exception e) {
                // System.err.println(e.getMessage());
            }
        }

        TextFileWriter writer = new TextFileWriter(new File(
                "target/DOCUMENTATION.html"));
        writer.addLine("<html><body><head><style type=\"text/css\">"
                + "table { border-collapse:collapse; }"
                + "table td, table thead { border:1px solid black;padding:5px; }"
                + "table thead {font-weight: bold;}" + "</style></head><body>");

        writer.addLine("<h1>Bluima Components</h1>" + "");
        writer.addLine("<h2>Collection Readers</h2><ul>");
        for (CompInfo comp : components) {
            if (comp.isCr) {
                writer.addLine("<li><a href=\"#" + comp.fullName + "\">"
                        + comp.name + "</a></li>");
            }
        }
        writer.addLine("</ul>");

        writer.addLine("<h2>Analysis Engines</h2><ul>");
        for (CompInfo comp : components) {
            if (!comp.isCr) {
                writer.addLine("<li><a href=\"#" + comp.fullName + "\">"
                        + comp.name + "</a></li>");
            }
        }
        writer.addLine("</ul><hr>");

        for (CompInfo comp : components) {

            writer.addLine("<h3><a id=\"" + comp.fullName + "\">" + comp.name
                    + " (" + comp.fullName + ")</a></h3>");
            writer.addLine("<p>" + comp.javaDoc + "</p>");
            if (!comp.params.isEmpty()) {
                writer.addLine("<table><thead><td>Param. Name</td><td>Description</td><td>Required</td><td>Default Value</td></thead>");
                for (ConfigurationParameter param : comp.params) {
                    String defVal = (param.defaultValue().length == 1 && param
                            .defaultValue()[0]
                            .equals(ConfigurationParameter.NO_DEFAULT_VALUE)) ? ""
                            : join(param.defaultValue(), ", ");
                    writer.addLine("<tr><td>" + param.name() + "</td><td>"
                            + param.description() + "</td><td>"
                            + (param.mandatory() ? "Y" : "N") + "</td><td>"
                            + defVal + "</td></tr>");
                }
                writer.addLine("</table>");
            }

            if (comp.scriptShortcut != null) {
                writer.addLine("<p>Usage (example):</p><pre>"
                        + comp.scriptShortcut + "</pre>");
            } else {
                writer.addLine("<p>Usage (example):</p>" + "<pre>"
                        + (comp.isCr ? "cr: " : "ae: ") + comp.fullName);
                for (ConfigurationParameter param : comp.params) {
                    String val = (param.defaultValue().length == 1 && param
                            .defaultValue()[0]
                            .equals(ConfigurationParameter.NO_DEFAULT_VALUE)) ? "<put value here>"
                            : join(param.defaultValue(), ", ");
                    writer.addLine(" " + param.name() + ": " + val);
                }
                writer.addLine("</pre>");
            }
            writer.addLine("<br/>");
        }

        writer.addLine("</body></html>");
        writer.close();
    }

    private static CompInfo parseCompInfo(Class<?> clazz, File classFile) {
        CompInfo comp = new CompInfo();
        comp.name = clazz.getSimpleName();
        comp.fullName = clazz.getName();
        comp.javaDoc = extractJavaDoc(classFile);
        try {
            for (Field f : clazz.getDeclaredFields()) {
                ConfigurationParameter c = f
                        .getAnnotation(ConfigurationParameter.class);
                if (c != null) {
                    comp.params.add(c);
                }
            }
        } catch (Throwable e) {
            // TODO: handle exception
        }
        comp.scriptShortcut = clazz.getAnnotation(ScriptingShortcut.class);

        return comp;
    }

    public static class CompInfo {
        boolean isCr;
        String name, fullName, javaDoc;
        List<ConfigurationParameter> params = new ArrayList<ConfigurationParameter>();
        ScriptingShortcut scriptShortcut = null;
    }

    public static String extractJavaDoc(File classFile) {

        // matches /** */ for comment
        Pattern pattern = compile("\\/\\*\\*(.|\\n|\\r)*?\\*\\/");

        try {
            String classText = readFileToString(classFile);
            Matcher matcher = pattern.matcher(classText);
            if (matcher.find()) {

                String rawJavaDoc = matcher.group().replace("*", "")
                        .replace("\r", "");
                String[] split = rawJavaDoc.split("\n");

                @SuppressWarnings("unchecked")
                String javaDoc = join(
                        filter(noneOf(shorterThan(3), containsString("@author")),
                                split), " ");
                // remove {@link ... }
                javaDoc = javaDoc.replaceAll("\\{@link (.*?)\\}", "$1");
                // remove double spaces, breaks
                javaDoc = javaDoc.replaceAll("  ", " ").replaceAll("  ", " ")
                        .replaceAll("<br>", "");
                return javaDoc.trim();
            }
        } catch (Throwable t) {
            // TODO fails for some classes...
            LOG.info("COuld not extract javadoc for class {}",
                    classFile.getAbsolutePath());
        }
        return "";
    }

}
