//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 01:22:27 PM CEST 
//


package test;

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
 *         &lt;element ref="{}break"/>
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}inline-graphic"/>
 *         &lt;element ref="{}private-char"/>
 *         &lt;element ref="{}chem-struct"/>
 *         &lt;element ref="{}inline-formula"/>
 *         &lt;element ref="{}label"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *         &lt;element ref="{}tex-math"/>
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *         &lt;element ref="{}alternatives"/>
 *         &lt;element ref="{}array"/>
 *         &lt;element ref="{}graphic"/>
 *         &lt;element ref="{}media"/>
 *         &lt;element ref="{}preformat"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "disp-formula")
public class DispFormula {

    @XmlElementRefs({
        @XmlElementRef(name = "break", type = Break.class),
        @XmlElementRef(name = "label", type = Label.class),
        @XmlElementRef(name = "overline", type = Overline.class),
        @XmlElementRef(name = "chem-struct", type = ChemStruct.class),
        @XmlElementRef(name = "underline", type = Underline.class),
        @XmlElementRef(name = "monospace", type = Monospace.class),
        @XmlElementRef(name = "bold", type = Bold.class),
        @XmlElementRef(name = "named-content", type = NamedContent.class),
        @XmlElementRef(name = "sup", type = Sup.class),
        @XmlElementRef(name = "styled-content", type = StyledContent.class),
        @XmlElementRef(name = "uri", type = Uri.class),
        @XmlElementRef(name = "alt-text", type = AltText.class),
        @XmlElementRef(name = "roman", type = Roman.class),
        @XmlElementRef(name = "sc", type = Sc.class),
        @XmlElementRef(name = "sans-serif", type = SansSerif.class),
        @XmlElementRef(name = "array", type = Array.class),
        @XmlElementRef(name = "long-desc", type = LongDesc.class),
        @XmlElementRef(name = "private-char", type = PrivateChar.class),
        @XmlElementRef(name = "sub", type = Sub.class),
        @XmlElementRef(name = "email", type = Email.class),
        @XmlElementRef(name = "preformat", type = Preformat.class),
        @XmlElementRef(name = "graphic", type = Graphic.class),
        @XmlElementRef(name = "inline-graphic", type = InlineGraphic.class),
        @XmlElementRef(name = "tex-math", type = TexMath.class),
        @XmlElementRef(name = "alternatives", type = Alternatives.class),
        @XmlElementRef(name = "ext-link", type = ExtLink.class),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class),
        @XmlElementRef(name = "italic", type = Italic.class),
        @XmlElementRef(name = "media", type = Media.class),
        @XmlElementRef(name = "strike", type = Strike.class),
        @XmlElementRef(name = "inline-formula", type = InlineFormula.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;

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
     * {@link Break }
     * {@link Label }
     * {@link Overline }
     * {@link ChemStruct }
     * {@link Underline }
     * {@link Monospace }
     * {@link Bold }
     * {@link NamedContent }
     * {@link Sup }
     * {@link StyledContent }
     * {@link String }
     * {@link Uri }
     * {@link AltText }
     * {@link Roman }
     * {@link Sc }
     * {@link SansSerif }
     * {@link Array }
     * {@link LongDesc }
     * {@link PrivateChar }
     * {@link Sub }
     * {@link Email }
     * {@link Preformat }
     * {@link Graphic }
     * {@link InlineGraphic }
     * {@link TexMath }
     * {@link Alternatives }
     * {@link ExtLink }
     * {@link JAXBElement }{@code <}{@link MathType }{@code >}
     * {@link Italic }
     * {@link Media }
     * {@link Strike }
     * {@link InlineFormula }
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
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
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
