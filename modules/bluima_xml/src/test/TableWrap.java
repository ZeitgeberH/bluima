//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 01:22:27 PM CEST 
//


package test;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{}object-id" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}label" minOccurs="0"/>
 *         &lt;element ref="{}caption" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}alt-text"/>
 *           &lt;element ref="{}long-desc"/>
 *           &lt;element ref="{}email"/>
 *           &lt;element ref="{}ext-link"/>
 *           &lt;element ref="{}uri"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}disp-quote"/>
 *           &lt;element ref="{}speech"/>
 *           &lt;element ref="{}statement"/>
 *           &lt;element ref="{}verse-group"/>
 *           &lt;element ref="{}def-list"/>
 *           &lt;element ref="{}list"/>
 *           &lt;element ref="{}alternatives"/>
 *           &lt;element ref="{}chem-struct-wrap"/>
 *           &lt;element ref="{}graphic"/>
 *           &lt;element ref="{}media"/>
 *           &lt;element ref="{}preformat"/>
 *           &lt;element ref="{}table"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}table-wrap-foot"/>
 *           &lt;element ref="{}attrib"/>
 *           &lt;element ref="{}permissions"/>
 *         &lt;/choice>
 *       &lt;/sequence>
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
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "objectId",
    "label",
    "caption",
    "altTextOrLongDescOrEmail",
    "dispQuoteOrSpeechOrStatement",
    "tableWrapFootOrAttribOrPermissions"
})
@XmlRootElement(name = "table-wrap")
public class TableWrap {

    @XmlElement(name = "object-id")
    protected java.util.List<ObjectId> objectId;
    protected Label label;
    protected Caption caption;
    @XmlElements({
        @XmlElement(name = "ext-link", type = ExtLink.class),
        @XmlElement(name = "email", type = Email.class),
        @XmlElement(name = "long-desc", type = LongDesc.class),
        @XmlElement(name = "uri", type = Uri.class),
        @XmlElement(name = "alt-text", type = AltText.class)
    })
    protected java.util.List<Object> altTextOrLongDescOrEmail;
    @XmlElements({
        @XmlElement(name = "speech", type = Speech.class),
        @XmlElement(name = "alternatives", type = Alternatives.class),
        @XmlElement(name = "chem-struct-wrap", type = ChemStructWrap.class),
        @XmlElement(name = "graphic", type = Graphic.class),
        @XmlElement(name = "def-list", type = DefList.class),
        @XmlElement(name = "statement", type = Statement.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "list", type = test.List.class),
        @XmlElement(name = "disp-quote", type = DispQuote.class),
        @XmlElement(name = "media", type = Media.class),
        @XmlElement(name = "preformat", type = Preformat.class),
        @XmlElement(name = "verse-group", type = VerseGroup.class)
    })
    protected java.util.List<Object> dispQuoteOrSpeechOrStatement;
    @XmlElements({
        @XmlElement(name = "attrib", type = Attrib.class),
        @XmlElement(name = "table-wrap-foot", type = TableWrapFoot.class),
        @XmlElement(name = "permissions", type = Permissions.class)
    })
    protected java.util.List<Object> tableWrapFootOrAttribOrPermissions;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String position;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;

    /**
     * Gets the value of the objectId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectId }
     * 
     * 
     */
    public java.util.List<ObjectId> getObjectId() {
        if (objectId == null) {
            objectId = new ArrayList<ObjectId>();
        }
        return this.objectId;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the altTextOrLongDescOrEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altTextOrLongDescOrEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltTextOrLongDescOrEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtLink }
     * {@link Email }
     * {@link LongDesc }
     * {@link Uri }
     * {@link AltText }
     * 
     * 
     */
    public java.util.List<Object> getAltTextOrLongDescOrEmail() {
        if (altTextOrLongDescOrEmail == null) {
            altTextOrLongDescOrEmail = new ArrayList<Object>();
        }
        return this.altTextOrLongDescOrEmail;
    }

    /**
     * Gets the value of the dispQuoteOrSpeechOrStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispQuoteOrSpeechOrStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispQuoteOrSpeechOrStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Speech }
     * {@link Alternatives }
     * {@link ChemStructWrap }
     * {@link Graphic }
     * {@link DefList }
     * {@link Statement }
     * {@link Table }
     * {@link test.List }
     * {@link DispQuote }
     * {@link Media }
     * {@link Preformat }
     * {@link VerseGroup }
     * 
     * 
     */
    public java.util.List<Object> getDispQuoteOrSpeechOrStatement() {
        if (dispQuoteOrSpeechOrStatement == null) {
            dispQuoteOrSpeechOrStatement = new ArrayList<Object>();
        }
        return this.dispQuoteOrSpeechOrStatement;
    }

    /**
     * Gets the value of the tableWrapFootOrAttribOrPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableWrapFootOrAttribOrPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableWrapFootOrAttribOrPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attrib }
     * {@link TableWrapFoot }
     * {@link Permissions }
     * 
     * 
     */
    public java.util.List<Object> getTableWrapFootOrAttribOrPermissions() {
        if (tableWrapFootOrAttribOrPermissions == null) {
            tableWrapFootOrAttribOrPermissions = new ArrayList<Object>();
        }
        return this.tableWrapFootOrAttribOrPermissions;
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
