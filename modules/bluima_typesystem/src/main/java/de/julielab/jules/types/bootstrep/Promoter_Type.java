
/* First created by JCasGen Wed Oct 19 19:12:42 CEST 2011 */
package de.julielab.jules.types.bootstrep;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import de.julielab.jules.types.BioEntityMention_Type;

/** promoter region of gene
 * Updated by JCasGen Wed Oct 19 19:12:42 CEST 2011
 * @generated */
public class Promoter_Type extends BioEntityMention_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Promoter_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Promoter_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Promoter(addr, Promoter_Type.this);
  			   Promoter_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Promoter(addr, Promoter_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = Promoter.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.julielab.jules.types.bootstrep.Promoter");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Promoter_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    