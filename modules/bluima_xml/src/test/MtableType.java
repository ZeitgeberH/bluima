//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 01:22:27 PM CEST 
//


package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for mtable.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mtable.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1998/Math/MathML}mtable.content" maxOccurs="unbounded"/>
 *       &lt;attGroup ref="{http://www.w3.org/1998/Math/MathML}mtable.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mtable.type", namespace = "http://www.w3.org/1998/Math/MathML", propOrder = {
    "mtableContent"
})
public class MtableType {

    @XmlElements({
        @XmlElement(name = "mlabeledtr", type = MlabeledtrType.class),
        @XmlElement(name = "mtr", type = MtrType.class)
    })
    protected List<Object> mtableContent;
    @XmlAttribute
    protected String align;
    @XmlAttribute
    protected String alignmentscope;
    @XmlAttribute
    protected String columnwidth;
    @XmlAttribute
    protected String width;
    @XmlAttribute
    protected String rowspacing;
    @XmlAttribute
    protected String columnspacing;
    @XmlAttribute
    protected String rowlines;
    @XmlAttribute
    protected String columnlines;
    @XmlAttribute
    protected String frame;
    @XmlAttribute
    protected String framespacing;
    @XmlAttribute
    protected Boolean equalrows;
    @XmlAttribute
    protected Boolean equalcolumns;
    @XmlAttribute
    protected Boolean displaystyle;
    @XmlAttribute
    protected String side;
    @XmlAttribute
    protected String minlabelspacing;
    @XmlAttribute
    protected String rowalign;
    @XmlAttribute
    protected String columnalign;
    @XmlAttribute
    protected String groupalign;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> clazz;
    @XmlAttribute
    protected String style;
    @XmlAttribute
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object xref;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String href;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the mtableContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtableContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtableContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MlabeledtrType }
     * {@link MtrType }
     * 
     * 
     */
    public List<Object> getMtableContent() {
        if (mtableContent == null) {
            mtableContent = new ArrayList<Object>();
        }
        return this.mtableContent;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        if (align == null) {
            return "axis";
        } else {
            return align;
        }
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the alignmentscope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignmentscope() {
        if (alignmentscope == null) {
            return "true";
        } else {
            return alignmentscope;
        }
    }

    /**
     * Sets the value of the alignmentscope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignmentscope(String value) {
        this.alignmentscope = value;
    }

    /**
     * Gets the value of the columnwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnwidth() {
        if (columnwidth == null) {
            return "auto";
        } else {
            return columnwidth;
        }
    }

    /**
     * Sets the value of the columnwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnwidth(String value) {
        this.columnwidth = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        if (width == null) {
            return "auto";
        } else {
            return width;
        }
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the rowspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowspacing() {
        if (rowspacing == null) {
            return "1.0ex";
        } else {
            return rowspacing;
        }
    }

    /**
     * Sets the value of the rowspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowspacing(String value) {
        this.rowspacing = value;
    }

    /**
     * Gets the value of the columnspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnspacing() {
        if (columnspacing == null) {
            return "0.8em";
        } else {
            return columnspacing;
        }
    }

    /**
     * Sets the value of the columnspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnspacing(String value) {
        this.columnspacing = value;
    }

    /**
     * Gets the value of the rowlines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowlines() {
        if (rowlines == null) {
            return "none";
        } else {
            return rowlines;
        }
    }

    /**
     * Sets the value of the rowlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowlines(String value) {
        this.rowlines = value;
    }

    /**
     * Gets the value of the columnlines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnlines() {
        if (columnlines == null) {
            return "none";
        } else {
            return columnlines;
        }
    }

    /**
     * Sets the value of the columnlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnlines(String value) {
        this.columnlines = value;
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        if (frame == null) {
            return "none";
        } else {
            return frame;
        }
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
     * Gets the value of the framespacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFramespacing() {
        if (framespacing == null) {
            return "0.4em 0.5ex";
        } else {
            return framespacing;
        }
    }

    /**
     * Sets the value of the framespacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFramespacing(String value) {
        this.framespacing = value;
    }

    /**
     * Gets the value of the equalrows property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEqualrows() {
        if (equalrows == null) {
            return false;
        } else {
            return equalrows;
        }
    }

    /**
     * Sets the value of the equalrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEqualrows(Boolean value) {
        this.equalrows = value;
    }

    /**
     * Gets the value of the equalcolumns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEqualcolumns() {
        if (equalcolumns == null) {
            return false;
        } else {
            return equalcolumns;
        }
    }

    /**
     * Sets the value of the equalcolumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEqualcolumns(Boolean value) {
        this.equalcolumns = value;
    }

    /**
     * Gets the value of the displaystyle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisplaystyle() {
        if (displaystyle == null) {
            return false;
        } else {
            return displaystyle;
        }
    }

    /**
     * Sets the value of the displaystyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplaystyle(Boolean value) {
        this.displaystyle = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        if (side == null) {
            return "right";
        } else {
            return side;
        }
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the minlabelspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinlabelspacing() {
        if (minlabelspacing == null) {
            return "0.8em";
        } else {
            return minlabelspacing;
        }
    }

    /**
     * Sets the value of the minlabelspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinlabelspacing(String value) {
        this.minlabelspacing = value;
    }

    /**
     * Gets the value of the rowalign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowalign() {
        if (rowalign == null) {
            return "baseline";
        } else {
            return rowalign;
        }
    }

    /**
     * Sets the value of the rowalign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowalign(String value) {
        this.rowalign = value;
    }

    /**
     * Gets the value of the columnalign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnalign() {
        if (columnalign == null) {
            return "center";
        } else {
            return columnalign;
        }
    }

    /**
     * Sets the value of the columnalign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnalign(String value) {
        this.columnalign = value;
    }

    /**
     * Gets the value of the groupalign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupalign() {
        return groupalign;
    }

    /**
     * Sets the value of the groupalign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupalign(String value) {
        this.groupalign = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<String>();
        }
        return this.clazz;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getXref() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setXref(Object value) {
        this.xref = value;
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
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
