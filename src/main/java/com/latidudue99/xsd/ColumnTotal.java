
package com.latidudue99.xsd;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ColumnTotal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnTotal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ColumnNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnTotal", propOrder = {
    "content"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ColumnTotal {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String content;
    @XmlAttribute(name = "ColumnNumber", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger columnNumber;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the columnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getColumnNumber() {
        return columnNumber;
    }

    /**
     * Sets the value of the columnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setColumnNumber(BigInteger value) {
        this.columnNumber = value;
    }

}
