
package com.latidudue99.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.latidudue99.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrystalReport_QNAME = new QName("urn:crystal-reports:schemas:report-detail", "CrystalReport");
    private final static QName _CellValueFormattedValue_QNAME = new QName("urn:crystal-reports:schemas:report-detail", "FormattedValue");
    private final static QName _CellValueValue_QNAME = new QName("urn:crystal-reports:schemas:report-detail", "Value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.latidudue99.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrystalReport }
     * 
     */
    public CrystalReport createCrystalReport() {
        return new CrystalReport();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link ColumnTotal }
     * 
     */
    public ColumnTotal createColumnTotal() {
        return new ColumnTotal();
    }

    /**
     * Create an instance of {@link HeaderFooter }
     * 
     */
    public HeaderFooter createHeaderFooter() {
        return new HeaderFooter();
    }

    /**
     * Create an instance of {@link SummaryFieldLabels }
     * 
     */
    public SummaryFieldLabels createSummaryFieldLabels() {
        return new SummaryFieldLabels();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Section }
     * 
     */
    public Section createSection() {
        return new Section();
    }

    /**
     * Create an instance of {@link Cells }
     * 
     */
    public Cells createCells() {
        return new Cells();
    }

    /**
     * Create an instance of {@link ColumnGroups }
     * 
     */
    public ColumnGroups createColumnGroups() {
        return new ColumnGroups();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link SummaryFieldLabel }
     * 
     */
    public SummaryFieldLabel createSummaryFieldLabel() {
        return new SummaryFieldLabel();
    }

    /**
     * Create an instance of {@link OlapSectHead }
     * 
     */
    public OlapSectHead createOlapSectHead() {
        return new OlapSectHead();
    }

    /**
     * Create an instance of {@link RowTotal }
     * 
     */
    public RowTotal createRowTotal() {
        return new RowTotal();
    }

    /**
     * Create an instance of {@link Details }
     * 
     */
    public Details createDetails() {
        return new Details();
    }

    /**
     * Create an instance of {@link Picture }
     * 
     */
    public Picture createPicture() {
        return new Picture();
    }

    /**
     * Create an instance of {@link RowGroups }
     * 
     */
    public RowGroups createRowGroups() {
        return new RowGroups();
    }

    /**
     * Create an instance of {@link CellValue }
     * 
     */
    public CellValue createCellValue() {
        return new CellValue();
    }

    /**
     * Create an instance of {@link Subreport }
     * 
     */
    public Subreport createSubreport() {
        return new Subreport();
    }

    /**
     * Create an instance of {@link CrossTab }
     * 
     */
    public CrossTab createCrossTab() {
        return new CrossTab();
    }

    /**
     * Create an instance of {@link Cell }
     * 
     */
    public Cell createCell() {
        return new Cell();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrystalReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:crystal-reports:schemas:report-detail", name = "CrystalReport")
    public JAXBElement<CrystalReport> createCrystalReport(CrystalReport value) {
        return new JAXBElement<CrystalReport>(_CrystalReport_QNAME, CrystalReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:crystal-reports:schemas:report-detail", name = "FormattedValue", scope = CellValue.class)
    public JAXBElement<String> createCellValueFormattedValue(String value) {
        return new JAXBElement<String>(_CellValueFormattedValue_QNAME, String.class, CellValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:crystal-reports:schemas:report-detail", name = "Value", scope = CellValue.class)
    public JAXBElement<String> createCellValueValue(String value) {
        return new JAXBElement<String>(_CellValueValue_QNAME, String.class, CellValue.class, value);
    }

}
