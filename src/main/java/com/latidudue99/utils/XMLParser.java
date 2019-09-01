package com.latidudue99.utils;

import com.latidudue99.xml.GroupLevel2;
import com.latidudue99.xsd.Group;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/*
 * Deals with input in an XML format
 */
public class XMLParser {

    public static String getPathAndName(String filename){
        String pathAndName;
        File tmpFile = new File("tmp.txt");
        String path = tmpFile.getAbsolutePath();
        path = path.substring(0, path.lastIndexOf("\\"));
        pathAndName = path +
                File.separator + filename;
        tmpFile.delete();
        return pathAndName;
    }

    public static GroupLevel2 parseXML(String filename)  throws FileNotFoundException {
        GroupLevel2 groupLevel2 = null;

        String filePath = getPathAndName(filename);
        try {
            File file = new File(filePath);
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }

            JAXBContext jaxbContext;
            jaxbContext = JAXBContext.newInstance(GroupLevel2.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            groupLevel2 = (GroupLevel2) unmarshaller.unmarshal(fis);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println("  OK");
        System.out.println("     .");
        System.out.println("     .");
        System.out.println("     .");
        System.out.print("Importing publications form a file...");
        return groupLevel2;
    }

    public static Group parseXSD(String filename)  throws FileNotFoundException {
        Group group = null;

        String filePath = getPathAndName(filename);
        try {
            File file = new File(filePath);
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }

            JAXBContext jaxbContext;
            jaxbContext = JAXBContext.newInstance(Group.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            group = (Group) unmarshaller.unmarshal(fis);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return group;
    }


}
