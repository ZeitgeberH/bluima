//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.13 at 02:20:32 PM CET 
//


package ch.epfl.bbp.uima.xml.pubmed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "yearOrMonthOrDayOrSeasonOrMedlineDate"
})
@XmlRootElement(name = "PubDate")
public class PubDate {

    @XmlElements({
        @XmlElement(name = "Year", required = true, type = Year.class),
        @XmlElement(name = "Month", required = true, type = Month.class),
        @XmlElement(name = "Day", required = true, type = Day.class),
        @XmlElement(name = "Season", required = true, type = Season.class),
        @XmlElement(name = "MedlineDate", required = true, type = MedlineDate.class)
    })
    protected List<java.lang.Object> yearOrMonthOrDayOrSeasonOrMedlineDate;

    /**
     * Gets the value of the yearOrMonthOrDayOrSeasonOrMedlineDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yearOrMonthOrDayOrSeasonOrMedlineDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYearOrMonthOrDayOrSeasonOrMedlineDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Year }
     * {@link Month }
     * {@link Day }
     * {@link Season }
     * {@link MedlineDate }
     * 
     * 
     */
    public List<java.lang.Object> getYearOrMonthOrDayOrSeasonOrMedlineDate() {
        if (yearOrMonthOrDayOrSeasonOrMedlineDate == null) {
            yearOrMonthOrDayOrSeasonOrMedlineDate = new ArrayList<java.lang.Object>();
        }
        return this.yearOrMonthOrDayOrSeasonOrMedlineDate;
    }

}
