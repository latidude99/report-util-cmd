
package com.latidudue99.xsd;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossTab complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossTab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="OlapSectHead" type="{urn:crystal-reports:schemas:report-detail}OlapSectHead"/>
 *         &lt;/choice>
 *         &lt;element name="RowGroups" type="{urn:crystal-reports:schemas:report-detail}RowGroups"/>
 *         &lt;element name="ColumnGroups" type="{urn:crystal-reports:schemas:report-detail}ColumnGroups"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="SummaryFieldLabels" type="{urn:crystal-reports:schemas:report-detail}SummaryFieldLabels"/>
 *         &lt;/choice>
 *         &lt;element name="Cells" type="{urn:crystal-reports:schemas:report-detail}Cells"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossTab", propOrder = {
    "olapSectHead",
    "rowGroups",
    "columnGroups",
    "summaryFieldLabels",
    "cells"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class CrossTab {

    @XmlElement(name = "OlapSectHead")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected OlapSectHead olapSectHead;
    @XmlElement(name = "RowGroups", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected RowGroups rowGroups;
    @XmlElement(name = "ColumnGroups", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ColumnGroups columnGroups;
    @XmlElement(name = "SummaryFieldLabels")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected SummaryFieldLabels summaryFieldLabels;
    @XmlElement(name = "Cells", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Cells cells;
    @XmlAttribute(name = "Name", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;

    /**
     * Gets the value of the olapSectHead property.
     * 
     * @return
     *     possible object is
     *     {@link OlapSectHead }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public OlapSectHead getOlapSectHead() {
        return olapSectHead;
    }

    /**
     * Sets the value of the olapSectHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link OlapSectHead }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOlapSectHead(OlapSectHead value) {
        this.olapSectHead = value;
    }

    /**
     * Gets the value of the rowGroups property.
     * 
     * @return
     *     possible object is
     *     {@link RowGroups }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public RowGroups getRowGroups() {
        return rowGroups;
    }

    /**
     * Sets the value of the rowGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowGroups }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRowGroups(RowGroups value) {
        this.rowGroups = value;
    }

    /**
     * Gets the value of the columnGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnGroups }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ColumnGroups getColumnGroups() {
        return columnGroups;
    }

    /**
     * Sets the value of the columnGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnGroups }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setColumnGroups(ColumnGroups value) {
        this.columnGroups = value;
    }

    /**
     * Gets the value of the summaryFieldLabels property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryFieldLabels }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public SummaryFieldLabels getSummaryFieldLabels() {
        return summaryFieldLabels;
    }

    /**
     * Sets the value of the summaryFieldLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryFieldLabels }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSummaryFieldLabels(SummaryFieldLabels value) {
        this.summaryFieldLabels = value;
    }

    /**
     * Gets the value of the cells property.
     * 
     * @return
     *     possible object is
     *     {@link Cells }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Cells getCells() {
        return cells;
    }

    /**
     * Sets the value of the cells property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cells }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-26T03:23:46+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCells(Cells value) {
        this.cells = value;
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

}
