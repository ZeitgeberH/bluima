//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.11 at 04:35:24 PM CET 
//


package ch.epfl.bbp.uima.xml.genia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.w3.org/namespace/}cons"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "cons")
public class Cons {

    @XmlElementRef(name = "cons", namespace = "http://www.w3.org/namespace/", type = Cons.class)
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute
    protected String sem;
    @XmlAttribute
    protected String lex;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cons }
     * {@link String }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the sem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSem() {
        return sem;
    }

    /**
     * Sets the value of the sem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSem(String value) {
        this.sem = value;
    }

    /**
     * Gets the value of the lex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLex() {
        return lex;
    }

    /**
     * Sets the value of the lex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLex(String value) {
        this.lex = value;
    }

}
