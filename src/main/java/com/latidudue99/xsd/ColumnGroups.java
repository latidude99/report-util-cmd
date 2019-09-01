
package com.latidudue99.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ColumnTotal" type="{urn:crystal-reports:schemas:report-detail}ColumnTotal"/>
 *         &lt;element name="ColumnGroup" type="{urn:crystal-reports:schemas:report-detail}ColumnGroups"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnGroups", propOrder = {
    "columnTotalOrColumnGroup"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ColumnGroups {

    @XmlElements({
        @XmlElement(name = "ColumnTotal", type = ColumnTotal.class),
        @XmlElement(name = "ColumnGroup", type = ColumnGroups.class)
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Object> columnTotalOrColumnGroup;

    /**
     * Gets the value of the columnTotalOrColumnGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnTotalOrColumnGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnTotalOrColumnGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnTotal }
     * {@link ColumnGroups }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Object> getColumnTotalOrColumnGroup() {
        if (columnTotalOrColumnGroup == null) {
            columnTotalOrColumnGroup = new ArrayList<Object>();
        }
        return this.columnTotalOrColumnGroup;
    }

}
