//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.04 at 08:09:15 PM CET 
//


package ch.epfl.bbp.uima.xml.mesh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "qualifierUI",
    "qualifierName"
})
@XmlRootElement(name = "QualifierReferredTo")
public class QualifierReferredTo {

    @XmlElement(name = "QualifierUI", required = true)
    protected String qualifierUI;
    @XmlElement(name = "QualifierName", required = true)
    protected QualifierName qualifierName;

    /**
     * Gets the value of the qualifierUI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifierUI() {
        return qualifierUI;
    }

    /**
     * Sets the value of the qualifierUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifierUI(String value) {
        this.qualifierUI = value;
    }

    /**
     * Gets the value of the qualifierName property.
     * 
     * @return
     *     possible object is
     *     {@link QualifierName }
     *     
     */
    public QualifierName getQualifierName() {
        return qualifierName;
    }

    /**
     * Sets the value of the qualifierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifierName }
     *     
     */
    public void setQualifierName(QualifierName value) {
        this.qualifierName = value;
    }

}
