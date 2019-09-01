
package com.latidudue99.xsd;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormattedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field", propOrder = {
    "formattedValue",
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Field {

    @XmlElement(name = "FormattedValue")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String formattedValue;
    @XmlElement(name = "Value")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "Name", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlAttribute(name = "FieldName", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String fieldName;

    /**
     * Gets the value of the formattedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFormattedValue() {
        return formattedValue;
    }

    /**
     * Sets the value of the formattedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFormattedValue(String value) {
        this.formattedValue = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFieldName(String value) {
        this.fieldName = value;
    }

}
