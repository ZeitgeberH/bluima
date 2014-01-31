

/* First created by JCasGen Wed Oct 19 19:12:42 CEST 2011 */
package de.julielab.jules.types.bootstrep;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.julielab.jules.types.BioEventMention;


/** 
 * Updated by JCasGen Wed Oct 19 19:12:42 CEST 2011
 * XML source: /Users/ren/dev/bluebrain/svn_nlp/UIMA/julielab/trunk/julielab_typesystem-2.6.8/src/main/resources/typeSystem/julie-semantics-bootstrep-types.xml
 * @generated */
public class GeneExpression extends BioEventMention {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(GeneExpression.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneExpression() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GeneExpression(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GeneExpression(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GeneExpression(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
}

    