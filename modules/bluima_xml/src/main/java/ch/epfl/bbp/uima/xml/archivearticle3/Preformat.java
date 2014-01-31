//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.14 at 03:30:44 PM CET 
//


package ch.epfl.bbp.uima.xml.archivearticle3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}alt-text"/>
 *         &lt;element ref="{}long-desc"/>
 *         &lt;element ref="{}email"/>
 *         &lt;element ref="{}ext-link"/>
 *         &lt;element ref="{}uri"/>
 *         &lt;element ref="{}inline-supplementary-material"/>
 *         &lt;element ref="{}related-article"/>
 *         &lt;element ref="{}related-object"/>
 *         &lt;element ref="{}hr"/>
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}overline-start"/>
 *         &lt;element ref="{}overline-end"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}underline-start"/>
 *         &lt;element ref="{}underline-end"/>
 *         &lt;element ref="{}alternatives"/>
 *         &lt;element ref="{}inline-graphic"/>
 *         &lt;element ref="{}private-char"/>
 *         &lt;element ref="{}chem-struct"/>
 *         &lt;element ref="{}inline-formula"/>
 *         &lt;element ref="{}tex-math"/>
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *         &lt;element ref="{}abbrev"/>
 *         &lt;element ref="{}milestone-end"/>
 *         &lt;element ref="{}milestone-start"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *         &lt;element ref="{}fn"/>
 *         &lt;element ref="{}target"/>
 *         &lt;element ref="{}xref"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *         &lt;element ref="{}x"/>
 *         &lt;element ref="{}attrib"/>
 *         &lt;element ref="{}permissions"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="position" default="float">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="anchor"/>
 *             &lt;enumeration value="float"/>
 *             &lt;enumeration value="margin"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="orientation" default="portrait">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="portrait"/>
 *             &lt;enumeration value="landscape"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="preformat-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}space default="preserve""/>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
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
@XmlRootElement(name = "preformat")
public class Preformat {

    @XmlElementRefs({
        @XmlElementRef(name = "alt-text", type = AltText.class),
        @XmlElementRef(name = "sans-serif", type = SansSerif.class),
        @XmlElementRef(name = "monospace", type = Monospace.class),
        @XmlElementRef(name = "attrib", type = Attrib.class),
        @XmlElementRef(name = "ext-link", type = ExtLink.class),
        @XmlElementRef(name = "milestone-start", type = MilestoneStart.class),
        @XmlElementRef(name = "x", type = X.class),
        @XmlElementRef(name = "xref", type = Xref.class),
        @XmlElementRef(name = "roman", type = Roman.class),
        @XmlElementRef(name = "sup", type = Sup.class),
        @XmlElementRef(name = "italic", type = Italic.class),
        @XmlElementRef(name = "sc", type = Sc.class),
        @XmlElementRef(name = "underline-end", type = UnderlineEnd.class),
        @XmlElementRef(name = "related-object", type = RelatedObject.class),
        @XmlElementRef(name = "bold", type = Bold.class),
        @XmlElementRef(name = "private-char", type = PrivateChar.class),
        @XmlElementRef(name = "inline-formula", type = InlineFormula.class),
        @XmlElementRef(name = "alternatives", type = Alternatives.class),
        @XmlElementRef(name = "target", type = Target.class),
        @XmlElementRef(name = "overline-start", type = OverlineStart.class),
        @XmlElementRef(name = "related-article", type = RelatedArticle.class),
        @XmlElementRef(name = "styled-content", type = StyledContent.class),
        @XmlElementRef(name = "fn", type = Fn.class),
        @XmlElementRef(name = "strike", type = Strike.class),
        @XmlElementRef(name = "underline-start", type = UnderlineStart.class),
        @XmlElementRef(name = "sub", type = Sub.class),
        @XmlElementRef(name = "overline", type = Overline.class),
        @XmlElementRef(name = "long-desc", type = LongDesc.class),
        @XmlElementRef(name = "milestone-end", type = MilestoneEnd.class),
        @XmlElementRef(name = "named-content", type = NamedContent.class),
        @XmlElementRef(name = "inline-graphic", type = InlineGraphic.class),
        @XmlElementRef(name = "tex-math", type = TexMath.class),
        @XmlElementRef(name = "hr", type = Hr.class),
        @XmlElementRef(name = "chem-struct", type = ChemStruct.class),
        @XmlElementRef(name = "inline-supplementary-material", type = InlineSupplementaryMaterial.class),
        @XmlElementRef(name = "overline-end", type = OverlineEnd.class),
        @XmlElementRef(name = "abbrev", type = Abbrev.class),
        @XmlElementRef(name = "email", type = Email.class),
        @XmlElementRef(name = "permissions", type = Permissions.class),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class),
        @XmlElementRef(name = "underline", type = Underline.class),
        @XmlElementRef(name = "uri", type = Uri.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "position")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String position;
    @XmlAttribute(name = "orientation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "preformat-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String preformatType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;

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
     * {@link SansSerif }
     * {@link AltText }
     * {@link Monospace }
     * {@link ExtLink }
     * {@link Attrib }
     * {@link MilestoneStart }
     * {@link Roman }
     * {@link Xref }
     * {@link X }
     * {@link Sup }
     * {@link Italic }
     * {@link UnderlineEnd }
     * {@link Sc }
     * {@link RelatedObject }
     * {@link Bold }
     * {@link PrivateChar }
     * {@link Alternatives }
     * {@link InlineFormula }
     * {@link Target }
     * {@link OverlineStart }
     * {@link RelatedArticle }
     * {@link StyledContent }
     * {@link Strike }
     * {@link Fn }
     * {@link UnderlineStart }
     * {@link LongDesc }
     * {@link Overline }
     * {@link Sub }
     * {@link MilestoneEnd }
     * {@link NamedContent }
     * {@link InlineGraphic }
     * {@link TexMath }
     * {@link Hr }
     * {@link ChemStruct }
     * {@link String }
     * {@link OverlineEnd }
     * {@link InlineSupplementaryMaterial }
     * {@link Email }
     * {@link Abbrev }
     * {@link Permissions }
     * {@link JAXBElement }{@code <}{@link MathType }{@code >}
     * {@link Underline }
     * {@link Uri }
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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        if (position == null) {
            return "float";
        } else {
            return position;
        }
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "portrait";
        } else {
            return orientation;
        }
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the preformatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreformatType() {
        return preformatType;
    }

    /**
     * Sets the value of the preformatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreformatType(String value) {
        this.preformatType = value;
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

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        if (space == null) {
            return "preserve";
        } else {
            return space;
        }
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
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

}
