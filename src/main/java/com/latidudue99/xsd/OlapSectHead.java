
package com.latidudue99.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OlapSectHead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OlapSectHead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="SectHead" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OlapSectHead", propOrder = {
    "sectHead"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class OlapSectHead {

    @XmlElement(name = "SectHead")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<String> sectHead;

    /**
     * Gets the value of the sectHead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectHead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectHead().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<String> getSectHead() {
        if (sectHead == null) {
            sectHead = new ArrayList<String>();
        }
        return this.sectHead;
    }

}
