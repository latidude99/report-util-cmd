package com.latidudue99;

import com.latidudue99.utils.XMLParser;
import com.latidudue99.xsd.Group;

import java.io.FileNotFoundException;

public class AppXSD {

    public static void main(String[] args) throws FileNotFoundException {
//
//        String filename = "./booksolve_sales.xml";
//        GroupLevel2 groupLevel2 = XMLParser.parseXML(filename);
//        List<Publication> publications = PublicationConverter.convertXMLToPublications(groupLevel2);
//        publications.forEach(p -> System.out.println(p));
//
//        if(args.length > 0)
//            publications = FilterISBN.filter(publications, args);
//
//        ExportUtils.exportCSV(publications, "xml_booksolve_processed.csv");

        String filename = "./booksolve_sales.xml";
        Group group = XMLParser.parseXSD(filename);

        System.out.println(group.getDetails().get(0).getSection().get(0).getFieldOrTextOrPicture().get(0));

    }
}
