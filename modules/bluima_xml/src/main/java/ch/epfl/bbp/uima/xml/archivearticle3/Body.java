//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.14 at 03:30:44 PM CET 
//


package ch.epfl.bbp.uima.xml.archivearticle3;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}address"/>
 *           &lt;element ref="{}alternatives"/>
 *           &lt;element ref="{}array"/>
 *           &lt;element ref="{}boxed-text"/>
 *           &lt;element ref="{}chem-struct-wrap"/>
 *           &lt;element ref="{}fig"/>
 *           &lt;element ref="{}fig-group"/>
 *           &lt;element ref="{}graphic"/>
 *           &lt;element ref="{}media"/>
 *           &lt;element ref="{}preformat"/>
 *           &lt;element ref="{}supplementary-material"/>
 *           &lt;element ref="{}table-wrap"/>
 *           &lt;element ref="{}table-wrap-group"/>
 *           &lt;element ref="{}disp-formula"/>
 *           &lt;element ref="{}disp-formula-group"/>
 *           &lt;element ref="{}p"/>
 *           &lt;element ref="{}def-list"/>
 *           &lt;element ref="{}list"/>
 *           &lt;element ref="{}tex-math"/>
 *           &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *           &lt;element ref="{}related-article"/>
 *           &lt;element ref="{}related-object"/>
 *           &lt;element ref="{}ack"/>
 *           &lt;element ref="{}disp-quote"/>
 *           &lt;element ref="{}speech"/>
 *           &lt;element ref="{}statement"/>
 *           &lt;element ref="{}verse-group"/>
 *           &lt;element ref="{}x"/>
 *         &lt;/choice>
 *         &lt;element ref="{}sec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}sig-block" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressOrAlternativesOrArray",
    "sec",
    "sigBlock"
})
@XmlRootElement(name = "body")
public class Body {

    @XmlElements({
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "alternatives", type = Alternatives.class),
        @XmlElement(name = "array", type = Array.class),
        @XmlElement(name = "boxed-text", type = BoxedText.class),
        @XmlElement(name = "chem-struct-wrap", type = ChemStructWrap.class),
        @XmlElement(name = "fig", type = Fig.class),
        @XmlElement(name = "fig-group", type = FigGroup.class),
        @XmlElement(name = "graphic", type = Graphic.class),
        @XmlElement(name = "media", type = Media.class),
        @XmlElement(name = "preformat", type = Preformat.class),
        @XmlElement(name = "supplementary-material", type = SupplementaryMaterial.class),
        @XmlElement(name = "table-wrap", type = TableWrap.class),
        @XmlElement(name = "table-wrap-group", type = TableWrapGroup.class),
        @XmlElement(name = "disp-formula", type = DispFormula.class),
        @XmlElement(name = "disp-formula-group", type = DispFormulaGroup.class),
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "def-list", type = DefList.class),
        @XmlElement(name = "list", type = ch.epfl.bbp.uima.xml.archivearticle3.List.class),
        @XmlElement(name = "tex-math", type = TexMath.class),
        @XmlElement(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = MathType.class),
        @XmlElement(name = "related-article", type = RelatedArticle.class),
        @XmlElement(name = "related-object", type = RelatedObject.class),
        @XmlElement(name = "ack", type = Ack.class),
        @XmlElement(name = "disp-quote", type = DispQuote.class),
        @XmlElement(name = "speech", type = Speech.class),
        @XmlElement(name = "statement", type = Statement.class),
        @XmlElement(name = "verse-group", type = VerseGroup.class),
        @XmlElement(name = "x", type = X.class)
    })
    protected java.util.List<Object> addressOrAlternativesOrArray;
    protected java.util.List<Sec> sec;
    @XmlElement(name = "sig-block")
    protected SigBlock sigBlock;

    /**
     * Gets the value of the addressOrAlternativesOrArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressOrAlternativesOrArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressOrAlternativesOrArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * {@link Alternatives }
     * {@link Array }
     * {@link BoxedText }
     * {@link ChemStructWrap }
     * {@link Fig }
     * {@link FigGroup }
     * {@link Graphic }
     * {@link Media }
     * {@link Preformat }
     * {@link SupplementaryMaterial }
     * {@link TableWrap }
     * {@link TableWrapGroup }
     * {@link DispFormula }
     * {@link DispFormulaGroup }
     * {@link P }
     * {@link DefList }
     * {@link ch.epfl.bbp.uima.xml.archivearticle3.List }
     * {@link TexMath }
     * {@link MathType }
     * {@link RelatedArticle }
     * {@link RelatedObject }
     * {@link Ack }
     * {@link DispQuote }
     * {@link Speech }
     * {@link Statement }
     * {@link VerseGroup }
     * {@link X }
     * 
     * 
     */
    public java.util.List<Object> getAddressOrAlternativesOrArray() {
        if (addressOrAlternativesOrArray == null) {
            addressOrAlternativesOrArray = new ArrayList<Object>();
        }
        return this.addressOrAlternativesOrArray;
    }

    /**
     * Gets the value of the sec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sec }
     * 
     * 
     */
    public java.util.List<Sec> getSec() {
        if (sec == null) {
            sec = new ArrayList<Sec>();
        }
        return this.sec;
    }

    /**
     * Gets the value of the sigBlock property.
     * 
     * @return
     *     possible object is
     *     {@link SigBlock }
     *     
     */
    public SigBlock getSigBlock() {
        return sigBlock;
    }

    /**
     * Sets the value of the sigBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigBlock }
     *     
     */
    public void setSigBlock(SigBlock value) {
        this.sigBlock = value;
    }

}
