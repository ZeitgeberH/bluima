

/* First created by JCasGen Mon Feb 17 12:26:53 CET 2014 */
package ch.epfl.bbp.uima.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** e.g. x =3, p < 0.05
 * Updated by JCasGen Wed Jun 04 18:01:56 CEST 2014
 * XML source: /Users/richarde/dev/bluebrain/git/Bluima/modules/bluima_typesystem/src/main/resources/typeSystem/bbp-types.xml
 * @generated */
public class VariableAssignment extends Measure {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(VariableAssignment.class);
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
  protected VariableAssignment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public VariableAssignment(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public VariableAssignment(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public VariableAssignment(JCas jcas, int begin, int end) {
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
  //* Feature: operator

  /** getter for operator - gets math operator like equal, lt, gt, ...
   * @generated
   * @return value of the feature 
   */
  public String getOperator() {
    if (VariableAssignment_Type.featOkTst && ((VariableAssignment_Type)jcasType).casFeat_operator == null)
      jcasType.jcas.throwFeatMissing("operator", "ch.epfl.bbp.uima.types.VariableAssignment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VariableAssignment_Type)jcasType).casFeatCode_operator);}
    
  /** setter for operator - sets math operator like equal, lt, gt, ... 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOperator(String v) {
    if (VariableAssignment_Type.featOkTst && ((VariableAssignment_Type)jcasType).casFeat_operator == null)
      jcasType.jcas.throwFeatMissing("operator", "ch.epfl.bbp.uima.types.VariableAssignment");
    jcasType.ll_cas.ll_setStringValue(addr, ((VariableAssignment_Type)jcasType).casFeatCode_operator, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public float getValue() {
    if (VariableAssignment_Type.featOkTst && ((VariableAssignment_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "ch.epfl.bbp.uima.types.VariableAssignment");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((VariableAssignment_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(float v) {
    if (VariableAssignment_Type.featOkTst && ((VariableAssignment_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "ch.epfl.bbp.uima.types.VariableAssignment");
    jcasType.ll_cas.ll_setFloatValue(addr, ((VariableAssignment_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: variableName

  /** getter for variableName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVariableName() {
    if (VariableAssignment_Type.featOkTst && ((VariableAssignment_Type)jcasType).casFeat_variableName == null)
      jcasType.jcas.throwFeatMissing("variableName", "ch.epfl.bbp.uima.types.VariableAssignment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VariableAssignment_Type)jcasType).casFeatCode_variableName);}
    
  /** setter for variableName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVariableName(String v) {
    if (VariableAssignment_Type.featOkTst && ((VariableAssignment_Type)jcasType).casFeat_variableName == null)
      jcasType.jcas.throwFeatMissing("variableName", "ch.epfl.bbp.uima.types.VariableAssignment");
    jcasType.ll_cas.ll_setStringValue(addr, ((VariableAssignment_Type)jcasType).casFeatCode_variableName, v);}    
   
    
  //*--------------*
  //* Feature: textValue

  /** getter for textValue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTextValue() {
    if (VariableAssignment_Type.featOkTst && ((VariableAssignment_Type)jcasType).casFeat_textValue == null)
      jcasType.jcas.throwFeatMissing("textValue", "ch.epfl.bbp.uima.types.VariableAssignment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VariableAssignment_Type)jcasType).casFeatCode_textValue);}
    
  /** setter for textValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTextValue(String v) {
    if (VariableAssignment_Type.featOkTst && ((VariableAssignment_Type)jcasType).casFeat_textValue == null)
      jcasType.jcas.throwFeatMissing("textValue", "ch.epfl.bbp.uima.types.VariableAssignment");
    jcasType.ll_cas.ll_setStringValue(addr, ((VariableAssignment_Type)jcasType).casFeatCode_textValue, v);}    
  }

    