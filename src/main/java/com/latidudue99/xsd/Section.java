
package com.latidudue99.xsd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Section complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Section">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Field" type="{urn:crystal-reports:schemas:report-detail}Field" minOccurs="0"/>
 *         &lt;element name="Text" type="{urn:crystal-reports:schemas:report-detail}Text" minOccurs="0"/>
 *         &lt;element name="Picture" type="{urn:crystal-reports:schemas:report-detail}Picture" minOccurs="0"/>
 *         &lt;element name="CrossTab" type="{urn:crystal-reports:schemas:report-detail}CrossTab" minOccurs="0"/>
 *         &lt;element name="Subreport" type="{urn:crystal-reports:schemas:report-detail}Subreport" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="SectionNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Section", propOrder = {
    "fieldOrTextOrPicture"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Section {

    @XmlElements({
        @XmlElement(name = "Field", type = Field.class),
        @XmlElement(name = "Text", type = Text.class),
        @XmlElement(name = "Picture", type = Picture.class),
        @XmlElement(name = "CrossTab", type = CrossTab.class),
        @XmlElement(name = "Subreport", type = Subreport.class)
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Object> fieldOrTextOrPicture;
    @XmlAttribute(name = "SectionNumber", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger sectionNumber;

    /**
     * Gets the value of the fieldOrTextOrPicture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldOrTextOrPicture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldOrTextOrPicture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * {@link Text }
     * {@link Picture }
     * {@link CrossTab }
     * {@link Subreport }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Object> getFieldOrTextOrPicture() {
        if (fieldOrTextOrPicture == null) {
            fieldOrTextOrPicture = new ArrayList<Object>();
        }
        return this.fieldOrTextOrPicture;
    }

    /**
     * Gets the value of the sectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Sets the value of the sectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSectionNumber(BigInteger value) {
        this.sectionNumber = value;
    }

}
