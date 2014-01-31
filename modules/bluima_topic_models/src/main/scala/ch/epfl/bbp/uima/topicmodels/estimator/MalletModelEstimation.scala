package ch.epfl.bbp.uima.topicmodels.estimator
import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.util.regex.PatternSyntaxException
import java.util.zip.GZIPInputStream

import scala.Array.canBuildFrom
import scala.collection.immutable.HashMap
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

import scopt.immutable.OptionParser

/**
 *  Estimation program for LDA models generated by Mallet
 *  The model is reconstructed from a Mallet state file.
 *  
 *  This serves for test purposes. Otherwise, the tools provided by Mallet should be 
 *  preferred to do likelihood estimation, as this program uses the very same code. 
 */
object MalletModelEstimation extends LikelihoodEstimation[MalletConfig] {
  private var dictMap = HashMap.empty[String, Int]
  
  def main(args: Array[String]) {
	  this.estimate(args, MalletConfig())
  }
  
  private var alpha : Array[Double] = null
  override def getAlpha(c : MalletConfig) = {
    if(alpha == null) {
    	val src = prepareStateFile(c)
    	alpha = src.getLine(2).drop("#alpha : ".length).split(' ').map(_.toDouble)
    }
    alpha
  }
  
  private var beta : Double = Double.NaN
  override def getBeta(c : MalletConfig) = {
     if(beta.equals(Double.NaN)) {
    	val src = prepareStateFile(c)
    	// third line: #beta : 0.01
    	beta = src.getLine(3).drop("#beta : ".length).trim().toDouble
    }
    beta
  }
  
  override def getTokenDict(c : MalletConfig) : Map[String, Int] = dictMap
  
  override def getTermTopicMatrix(c : MalletConfig) : Array[Array[Int]] = {
    val src = prepareStateFile(c)
    
    val nrTopics = getAlpha(c).length

    val m = new ArrayBuffer[Array[Int]]
    
     src.getLines().drop(3) // remove header
      	.foreach(l => 
      	  { val a = l.split(' ')
      	    // Mallet state file columns: #doc source pos typeindex type topic
      	    // Mallet output doesn't seem consistent. Sometimes we need to look at 5 or at 6 (not further investigated)
      	    val topicNr = if(a(5).length > 0) a(5).toInt else a(6).toInt 
      	    val typeIndex = a(3).toInt
      	    val typeStr = a(4)
      	    dictMap = dictMap.updated(typeStr, typeIndex)
      	    val old = if(typeIndex < m.length) m(typeIndex).apply(topicNr)
      	    		  else {
      	    		    m += Array.fill(nrTopics)(0)
      	    		    0
      	    		  }
      	    			
      	    m(typeIndex).update(topicNr, old+1)
      	  })
      	  
    m.toArray.map(_.toArray)
  }
    
  override def argumentParser() = {
    new OptionParser[MalletConfig]("MalletLikelihoodEstimation") {
      def options = Seq(
        arg("<state file>", "Mallet model file (state file, obtained with \'--output-state\' in Mallet)") { (v: String, c: MalletConfig) => c.copy(stateFile = v) },
        arg("<test docs>", "Documents to test (one line per instance)") { (v: String, c: MalletConfig) => c.copy(tests = v) },
        intOpt("c", "cycles", "beta value") { (v: Int, c: MalletConfig) => c.copy(cycles = v) }
        )
    }
  }
  
  /**
   * Opens a Mallet state file, which is a gzipped text file
   */
  private def prepareStateFile(c : MalletConfig) = {
    val f = new File(c.stateFile)
    Source.fromInputStream(new GZIPInputStream(new BufferedInputStream(new FileInputStream(f))))
  }
}