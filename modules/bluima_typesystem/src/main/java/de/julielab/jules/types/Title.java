

/* First created by JCasGen Wed Oct 19 19:11:10 CEST 2011 */
package de.julielab.jules.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Title annotates titles covering various text units, including the whole paper, sections and subsections.
 * Updated by JCasGen Fri Oct 21 11:02:43 CEST 2011
 * XML source: /Users/ren/dev/bluebrain/svn_nlp/UIMA/julielab/trunk/julielab_typesystem-2.6.8/src/main/resources/typeSystem/julie-document-structure-types.xml
 * @generated */
public class Title extends Zone {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Title.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Title() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Title(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Title(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Title(JCas jcas, int begin, int end) {
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

    