//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 01:22:27 PM CEST 
//


package test;

import java.util.ArrayList;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}sec-meta" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{}label"/>
 *             &lt;element ref="{}title" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{}title"/>
 *         &lt;/choice>
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
 *           &lt;element ref="{}disp-quote"/>
 *           &lt;element ref="{}speech"/>
 *           &lt;element ref="{}statement"/>
 *           &lt;element ref="{}verse-group"/>
 *         &lt;/choice>
 *         &lt;element ref="{}sec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}fn-group"/>
 *           &lt;element ref="{}glossary"/>
 *           &lt;element ref="{}ref-list"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *       &lt;attribute name="sec-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "sec")
public class Sec {

    @XmlElementRefs({
        @XmlElementRef(name = "def-list", type = DefList.class),
        @XmlElementRef(name = "label", type = Label.class),
        @XmlElementRef(name = "related-article", type = RelatedArticle.class),
        @XmlElementRef(name = "glossary", type = Glossary.class),
        @XmlElementRef(name = "disp-formula-group", type = DispFormulaGroup.class),
        @XmlElementRef(name = "sec", type = Sec.class),
        @XmlElementRef(name = "list", type = test.List.class),
        @XmlElementRef(name = "ref-list", type = RefList.class),
        @XmlElementRef(name = "address", type = Address.class),
        @XmlElementRef(name = "fig-group", type = FigGroup.class),
        @XmlElementRef(name = "disp-formula", type = DispFormula.class),
        @XmlElementRef(name = "array", type = Array.class),
        @XmlElementRef(name = "statement", type = Statement.class),
        @XmlElementRef(name = "boxed-text", type = BoxedText.class),
        @XmlElementRef(name = "sec-meta", type = SecMeta.class),
        @XmlElementRef(name = "title", type = Title.class),
        @XmlElementRef(name = "table-wrap", type = TableWrap.class),
        @XmlElementRef(name = "graphic", type = Graphic.class),
        @XmlElementRef(name = "preformat", type = Preformat.class),
        @XmlElementRef(name = "tex-math", type = TexMath.class),
        @XmlElementRef(name = "speech", type = Speech.class),
        @XmlElementRef(name = "fn-group", type = FnGroup.class),
        @XmlElementRef(name = "disp-quote", type = DispQuote.class),
        @XmlElementRef(name = "p", type = P.class),
        @XmlElementRef(name = "alternatives", type = Alternatives.class),
        @XmlElementRef(name = "verse-group", type = VerseGroup.class),
        @XmlElementRef(name = "supplementary-material", type = SupplementaryMaterial.class),
        @XmlElementRef(name = "table-wrap-group", type = TableWrapGroup.class),
        @XmlElementRef(name = "fig", type = Fig.class),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class),
        @XmlElementRef(name = "media", type = Media.class),
        @XmlElementRef(name = "related-object", type = RelatedObject.class),
        @XmlElementRef(name = "chem-struct-wrap", type = ChemStructWrap.class)
    })
    protected java.util.List<Object> content;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;
    @XmlAttribute(name = "sec-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String secType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Title" is used by two different parts of a schema. See: 
     * line 4918 of http://dtd.nlm.nih.gov/publishing/3.0/xsd/journalpublishing3.xsd
     * line 4916 of http://dtd.nlm.nih.gov/publishing/3.0/xsd/journalpublishing3.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
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
     * {@link DefList }
     * {@link RelatedArticle }
     * {@link Label }
     * {@link Glossary }
     * {@link DispFormulaGroup }
     * {@link Sec }
     * {@link test.List }
     * {@link RefList }
     * {@link Address }
     * {@link FigGroup }
     * {@link Array }
     * {@link DispFormula }
     * {@link Statement }
     * {@link BoxedText }
     * {@link SecMeta }
     * {@link Title }
     * {@link TableWrap }
     * {@link Preformat }
     * {@link Graphic }
     * {@link TexMath }
     * {@link Speech }
     * {@link P }
     * {@link DispQuote }
     * {@link FnGroup }
     * {@link SupplementaryMaterial }
     * {@link VerseGroup }
     * {@link Alternatives }
     * {@link Fig }
     * {@link TableWrapGroup }
     * {@link JAXBElement }{@code <}{@link MathType }{@code >}
     * {@link Media }
     * {@link RelatedObject }
     * {@link ChemStructWrap }
     * 
     * 
     */
    public java.util.List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the secType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecType() {
        return secType;
    }

    /**
     * Sets the value of the secType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecType(String value) {
        this.secType = value;
    }

    /**
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
    }

}
