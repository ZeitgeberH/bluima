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
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}journal-id"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *         &lt;element ref="{}annotation"/>
 *         &lt;element ref="{}article-title"/>
 *         &lt;element ref="{}chapter-title"/>
 *         &lt;element ref="{}collab"/>
 *         &lt;element ref="{}comment"/>
 *         &lt;element ref="{}conf-date"/>
 *         &lt;element ref="{}conf-loc"/>
 *         &lt;element ref="{}conf-name"/>
 *         &lt;element ref="{}conf-sponsor"/>
 *         &lt;element ref="{}date"/>
 *         &lt;element ref="{}date-in-citation"/>
 *         &lt;element ref="{}day"/>
 *         &lt;element ref="{}edition"/>
 *         &lt;element ref="{}email"/>
 *         &lt;element ref="{}elocation-id"/>
 *         &lt;element ref="{}etal"/>
 *         &lt;element ref="{}ext-link"/>
 *         &lt;element ref="{}fpage"/>
 *         &lt;element ref="{}gov"/>
 *         &lt;element ref="{}institution"/>
 *         &lt;element ref="{}isbn"/>
 *         &lt;element ref="{}issn"/>
 *         &lt;element ref="{}issue"/>
 *         &lt;element ref="{}issue-id"/>
 *         &lt;element ref="{}issue-part"/>
 *         &lt;element ref="{}issue-title"/>
 *         &lt;element ref="{}lpage"/>
 *         &lt;element ref="{}month"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}object-id"/>
 *         &lt;element ref="{}page-range"/>
 *         &lt;element ref="{}part-title"/>
 *         &lt;element ref="{}patent"/>
 *         &lt;element ref="{}person-group"/>
 *         &lt;element ref="{}pub-id"/>
 *         &lt;element ref="{}publisher-loc"/>
 *         &lt;element ref="{}publisher-name"/>
 *         &lt;element ref="{}role"/>
 *         &lt;element ref="{}season"/>
 *         &lt;element ref="{}series"/>
 *         &lt;element ref="{}size"/>
 *         &lt;element ref="{}source"/>
 *         &lt;element ref="{}std"/>
 *         &lt;element ref="{}string-name"/>
 *         &lt;element ref="{}supplement"/>
 *         &lt;element ref="{}trans-source"/>
 *         &lt;element ref="{}trans-title"/>
 *         &lt;element ref="{}uri"/>
 *         &lt;element ref="{}volume"/>
 *         &lt;element ref="{}volume-id"/>
 *         &lt;element ref="{}volume-series"/>
 *         &lt;element ref="{}year"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="related-article-type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ext-link-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="vol" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="issue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="elocation-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="journal-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="journal-id-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}type"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}role"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}title"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}show"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}actuate"/>
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
@XmlRootElement(name = "related-article")
public class RelatedArticle {

    @XmlElementRefs({
        @XmlElementRef(name = "issue-title", type = IssueTitle.class),
        @XmlElementRef(name = "comment", type = Comment.class),
        @XmlElementRef(name = "volume-series", type = VolumeSeries.class),
        @XmlElementRef(name = "size", type = Size.class),
        @XmlElementRef(name = "date", type = Date.class),
        @XmlElementRef(name = "month", type = Month.class),
        @XmlElementRef(name = "named-content", type = NamedContent.class),
        @XmlElementRef(name = "object-id", type = ObjectId.class),
        @XmlElementRef(name = "gov", type = Gov.class),
        @XmlElementRef(name = "uri", type = Uri.class),
        @XmlElementRef(name = "part-title", type = PartTitle.class),
        @XmlElementRef(name = "string-name", type = StringName.class),
        @XmlElementRef(name = "issn", type = Issn.class),
        @XmlElementRef(name = "sub", type = Sub.class),
        @XmlElementRef(name = "volume", type = Volume.class),
        @XmlElementRef(name = "issue-part", type = JAXBElement.class),
        @XmlElementRef(name = "publisher-loc", type = PublisherLoc.class),
        @XmlElementRef(name = "pub-id", type = PubId.class),
        @XmlElementRef(name = "journal-id", type = JournalId.class),
        @XmlElementRef(name = "issue-id", type = IssueId.class),
        @XmlElementRef(name = "etal", type = JAXBElement.class),
        @XmlElementRef(name = "isbn", type = Isbn.class),
        @XmlElementRef(name = "person-group", type = PersonGroup.class),
        @XmlElementRef(name = "role", type = Role.class),
        @XmlElementRef(name = "collab", type = Collab.class),
        @XmlElementRef(name = "ext-link", type = ExtLink.class),
        @XmlElementRef(name = "series", type = Series.class),
        @XmlElementRef(name = "issue", type = Issue.class),
        @XmlElementRef(name = "annotation", type = Annotation.class),
        @XmlElementRef(name = "strike", type = Strike.class),
        @XmlElementRef(name = "trans-source", type = TransSource.class),
        @XmlElementRef(name = "conf-date", type = ConfDate.class),
        @XmlElementRef(name = "name", type = Name.class),
        @XmlElementRef(name = "overline", type = Overline.class),
        @XmlElementRef(name = "elocation-id", type = ElocationId.class),
        @XmlElementRef(name = "source", type = Source.class),
        @XmlElementRef(name = "underline", type = Underline.class),
        @XmlElementRef(name = "monospace", type = Monospace.class),
        @XmlElementRef(name = "bold", type = Bold.class),
        @XmlElementRef(name = "day", type = Day.class),
        @XmlElementRef(name = "sup", type = Sup.class),
        @XmlElementRef(name = "date-in-citation", type = DateInCitation.class),
        @XmlElementRef(name = "styled-content", type = StyledContent.class),
        @XmlElementRef(name = "institution", type = Institution.class),
        @XmlElementRef(name = "patent", type = Patent.class),
        @XmlElementRef(name = "roman", type = Roman.class),
        @XmlElementRef(name = "sc", type = Sc.class),
        @XmlElementRef(name = "publisher-name", type = JAXBElement.class),
        @XmlElementRef(name = "sans-serif", type = SansSerif.class),
        @XmlElementRef(name = "chapter-title", type = ChapterTitle.class),
        @XmlElementRef(name = "edition", type = Edition.class),
        @XmlElementRef(name = "conf-sponsor", type = ConfSponsor.class),
        @XmlElementRef(name = "year", type = Year.class),
        @XmlElementRef(name = "volume-id", type = VolumeId.class),
        @XmlElementRef(name = "email", type = Email.class),
        @XmlElementRef(name = "supplement", type = Supplement.class),
        @XmlElementRef(name = "page-range", type = PageRange.class),
        @XmlElementRef(name = "conf-loc", type = ConfLoc.class),
        @XmlElementRef(name = "fpage", type = Fpage.class),
        @XmlElementRef(name = "article-title", type = ArticleTitle.class),
        @XmlElementRef(name = "lpage", type = Lpage.class),
        @XmlElementRef(name = "std", type = Std.class),
        @XmlElementRef(name = "season", type = Season.class),
        @XmlElementRef(name = "italic", type = Italic.class),
        @XmlElementRef(name = "conf-name", type = ConfName.class),
        @XmlElementRef(name = "trans-title", type = TransTitle.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "related-article-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String relatedArticleType;
    @XmlAttribute(name = "ext-link-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String extLinkType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String vol;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String page;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String issue;
    @XmlAttribute(name = "elocation-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String elocationId;
    @XmlAttribute(name = "journal-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String journalId;
    @XmlAttribute(name = "journal-id-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String journalIdType;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String href;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String title;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String show;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;

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
     * {@link IssueTitle }
     * {@link Comment }
     * {@link VolumeSeries }
     * {@link Size }
     * {@link Date }
     * {@link Month }
     * {@link NamedContent }
     * {@link Gov }
     * {@link ObjectId }
     * {@link String }
     * {@link Uri }
     * {@link PartTitle }
     * {@link StringName }
     * {@link Issn }
     * {@link Sub }
     * {@link Volume }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link PublisherLoc }
     * {@link IssueId }
     * {@link JournalId }
     * {@link PubId }
     * {@link Isbn }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Collab }
     * {@link Role }
     * {@link PersonGroup }
     * {@link Series }
     * {@link ExtLink }
     * {@link Issue }
     * {@link Annotation }
     * {@link TransSource }
     * {@link Strike }
     * {@link ConfDate }
     * {@link Name }
     * {@link Overline }
     * {@link ElocationId }
     * {@link Underline }
     * {@link Source }
     * {@link Bold }
     * {@link Monospace }
     * {@link DateInCitation }
     * {@link Sup }
     * {@link Day }
     * {@link Institution }
     * {@link StyledContent }
     * {@link Roman }
     * {@link Patent }
     * {@link Sc }
     * {@link SansSerif }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link ChapterTitle }
     * {@link Edition }
     * {@link ConfSponsor }
     * {@link Year }
     * {@link VolumeId }
     * {@link Email }
     * {@link PageRange }
     * {@link Supplement }
     * {@link ConfLoc }
     * {@link Fpage }
     * {@link Lpage }
     * {@link ArticleTitle }
     * {@link Std }
     * {@link Season }
     * {@link ConfName }
     * {@link Italic }
     * {@link TransTitle }
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
     * Gets the value of the relatedArticleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedArticleType() {
        return relatedArticleType;
    }

    /**
     * Sets the value of the relatedArticleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedArticleType(String value) {
        this.relatedArticleType = value;
    }

    /**
     * Gets the value of the extLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtLinkType() {
        return extLinkType;
    }

    /**
     * Sets the value of the extLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtLinkType(String value) {
        this.extLinkType = value;
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
     * Gets the value of the vol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVol() {
        return vol;
    }

    /**
     * Sets the value of the vol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVol(String value) {
        this.vol = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the elocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElocationId() {
        return elocationId;
    }

    /**
     * Sets the value of the elocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElocationId(String value) {
        this.elocationId = value;
    }

    /**
     * Gets the value of the journalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalId() {
        return journalId;
    }

    /**
     * Sets the value of the journalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalId(String value) {
        this.journalId = value;
    }

    /**
     * Gets the value of the journalIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalIdType() {
        return journalIdType;
    }

    /**
     * Sets the value of the journalIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalIdType(String value) {
        this.journalIdType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

}
