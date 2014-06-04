

/* First created by JCasGen Mon Feb 17 12:26:53 CET 2014 */
package ch.epfl.bbp.uima.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FloatArray;


/** 
 * Updated by JCasGen Wed Jun 04 18:01:55 CEST 2014
 * XML source: /Users/richarde/dev/bluebrain/git/Bluima/modules/bluima_typesystem/src/main/resources/typeSystem/bbp-types.xml
 * @generated */
public class DocumentLine extends DocumentElement {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocumentLine.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DocumentLine() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DocumentLine(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DocumentLine(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public DocumentLine(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: block

  /** getter for block - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBlock() {
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_block == null)
      jcasType.jcas.throwFeatMissing("block", "ch.epfl.bbp.uima.types.DocumentLine");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_block);}
    
  /** setter for block - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBlock(int v) {
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_block == null)
      jcasType.jcas.throwFeatMissing("block", "ch.epfl.bbp.uima.types.DocumentLine");
    jcasType.ll_cas.ll_setIntValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_block, v);}    
   
    
  //*--------------*
  //* Feature: lineText

  /** getter for lineText - gets workaround to get the line text
   * @generated
   * @return value of the feature 
   */
  public String getLineText() {
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_lineText == null)
      jcasType.jcas.throwFeatMissing("lineText", "ch.epfl.bbp.uima.types.DocumentLine");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_lineText);}
    
  /** setter for lineText - sets workaround to get the line text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLineText(String v) {
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_lineText == null)
      jcasType.jcas.throwFeatMissing("lineText", "ch.epfl.bbp.uima.types.DocumentLine");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_lineText, v);}    
   
    
  //*--------------*
  //* Feature: beginnings

  /** getter for beginnings - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getBeginnings() {
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_beginnings == null)
      jcasType.jcas.throwFeatMissing("beginnings", "ch.epfl.bbp.uima.types.DocumentLine");
    return (FloatArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_beginnings)));}
    
  /** setter for beginnings - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginnings(FloatArray v) {
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_beginnings == null)
      jcasType.jcas.throwFeatMissing("beginnings", "ch.epfl.bbp.uima.types.DocumentLine");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_beginnings, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for beginnings - gets an indexed value - 
   * @generated */
  public float getBeginnings(int i) {
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_beginnings == null)
      jcasType.jcas.throwFeatMissing("beginnings", "ch.epfl.bbp.uima.types.DocumentLine");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_beginnings), i);
    return jcasType.ll_cas.ll_getFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_beginnings), i);}

  /** indexed setter for beginnings - sets an indexed value - 
   * @generated */
  public void setBeginnings(int i, float v) { 
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_beginnings == null)
      jcasType.jcas.throwFeatMissing("beginnings", "ch.epfl.bbp.uima.types.DocumentLine");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_beginnings), i);
    jcasType.ll_cas.ll_setFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_beginnings), i, v);}
   
    
  //*--------------*
  //* Feature: endings

  /** getter for endings - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getEndings() {
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_endings == null)
      jcasType.jcas.throwFeatMissing("endings", "ch.epfl.bbp.uima.types.DocumentLine");
    return (FloatArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_endings)));}
    
  /** setter for endings - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndings(FloatArray v) {
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_endings == null)
      jcasType.jcas.throwFeatMissing("endings", "ch.epfl.bbp.uima.types.DocumentLine");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_endings, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for endings - gets an indexed value - 
   * @generated */
  public float getEndings(int i) {
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_endings == null)
      jcasType.jcas.throwFeatMissing("endings", "ch.epfl.bbp.uima.types.DocumentLine");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_endings), i);
    return jcasType.ll_cas.ll_getFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_endings), i);}

  /** indexed setter for endings - sets an indexed value - 
   * @generated */
  public void setEndings(int i, float v) { 
    if (DocumentLine_Type.featOkTst && ((DocumentLine_Type)jcasType).casFeat_endings == null)
      jcasType.jcas.throwFeatMissing("endings", "ch.epfl.bbp.uima.types.DocumentLine");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_endings), i);
    jcasType.ll_cas.ll_setFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentLine_Type)jcasType).casFeatCode_endings), i, v);}
  }

    