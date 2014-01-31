package ch.epfl.bbp.uima;

import static ch.epfl.bbp.MapUtils.sortByValue;
import static ch.epfl.bbp.uima.LexicaHelper.LEXICA_ROOT;
import static ch.epfl.bbp.uima.xml.ConceptMapperParser.parse;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.newHashSet;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ch.epfl.bbp.Histogram;
import ch.epfl.bbp.io.LineReader;
import ch.epfl.bbp.uima.utils.ConceptFileWriter.Concept;

/**
 * ABA-SYN plus manual augmentation of most frequent missing terms<br>
 * Takes a large list of extracted br's from BRAINER, computes coverage and
 * outputs most frequent non-matched BRs
 * 
 * @author renaud.richardet@epfl.ch
 */
public class AugmentABA_AUG {

    static String ROOT = LEXICA_ROOT + "resources/brainregions/";

    public static void main(String[] args) throws Exception {

        // parse large list of extracted br's from BRAINER
        String fromBrainer = "/Volumes/simulation/nlp/data/20131117_prot/aggregate/br.txt";
        Histogram<String> hist = new Histogram<String>();
        for (String line : new LineReader(new FileInputStream(fromBrainer)))
            hist.add(line.toLowerCase());
        System.out.println("br: " + hist.size() + " (uniques)");
        System.out.println("br: " + hist.totalSize() + " (occurences)");

        // all ABA-SYN variants
        Set<String> abaVariants = newHashSet();
        Map<String, Concept> abaConcepts = parse(new File(ROOT + "aba-syn.xml"));
        for (Concept c : abaConcepts.values())
            for (String variant : c.getVariants())
                abaVariants.add(variant.toLowerCase());

        // find unmatched
        Map<String, Integer> unmatcheds = newHashMap();
        for (Entry<String, Long> t : hist.getMap().entrySet())
            if (!abaVariants.contains(t.getKey().toLowerCase()))
                unmatcheds.put(t.getKey().toLowerCase(), t.getValue()
                        .intValue());

        System.out.println("br unmatched: " + unmatcheds.size() + " (uniques)");
        int totalUnmatched = 0;
        for (int i : unmatcheds.values()) {
            totalUnmatched += i;
        }
        System.out
                .println("br unmatched : " + totalUnmatched + " (occurences)");

        
        // print unmatched
        int i = 0, TOP = 1000;
        System.out.println("\nTOP "+TOP+" UNMATCHED:");
        for (Entry<String, Integer> unmatched : (sortByValue(unmatcheds, true)
                .entrySet()))
            if (i++ < TOP)
                System.out.println(unmatched.getKey() + "\t"
                        + unmatched.getValue());
    }
}
