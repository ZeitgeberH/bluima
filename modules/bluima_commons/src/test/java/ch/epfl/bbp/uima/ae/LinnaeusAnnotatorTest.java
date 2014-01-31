package ch.epfl.bbp.uima.ae;

import static ch.epfl.bbp.ResourceHelper.getFile;
import static ch.epfl.bbp.uima.testutils.UimaTests.getTestCas;
import static org.apache.commons.io.FileUtils.readFileToString;
import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngine;
import static org.apache.uima.fit.util.JCasUtil.select;

import java.util.Collection;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.jcas.JCas;
import org.junit.Test;

import ch.epfl.bbp.uima.testutils.UimaTests;
import ch.epfl.bbp.uima.types.LinnaeusSpecies;
import ch.epfl.bbp.uima.typesystem.Prin;

public class LinnaeusAnnotatorTest {

	@Test
	public void test() throws Exception {

		String testtext = readFileToString(getFile("linnaeus/pmcA1239921.txt"));
		JCas jCas = getTestCas(testtext);

		AnalysisEngine ae = createEngine(LinnaeusAnnotator.class);
		ae.process(jCas);

		Collection<LinnaeusSpecies> sps = select(jCas, LinnaeusSpecies.class);
		Prin.t(sps);

		UimaTests.assertResultsContains(sps, "mostProbableSpeciesId",
		        "species:ncbi:9606");
		UimaTests.assertResultsContains(sps, "mostProbableSpeciesId",
		        "species:ncbi:9913");
	}

	@Test
	public void test2() throws Exception {

		// TODO won't work
		// JCas jcas = UimaTests.getTestCas("bla bla rodent bla bla");
		JCas jcas = getTestCas("bla bla rat bla bla");

		AnalysisEngine ae = createEngine(LinnaeusAnnotator.class);
		ae.process(jcas);

		Collection<LinnaeusSpecies> sps = select(jcas, LinnaeusSpecies.class);
		Prin.t(sps);

		UimaTests.assertResultsContains(sps, "mostProbableSpeciesId",
		        "species:ncbi:10116");
	}
}
