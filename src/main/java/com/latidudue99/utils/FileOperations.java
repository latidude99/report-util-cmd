package com.latidudue99.utils;

import com.latidudue99.model.Publication;
import com.latidudue99.xml.GroupLevel2;

import java.io.FileNotFoundException;
import java.util.List;

public class FileOperations {

    public static List<Publication> getPublicationList(String[] args){
        String inputFormat = args[0];
        String inputName = args[1];

        List<Publication> publications = null;
        switch (inputFormat.toLowerCase()){
            case "xml":
                List<String> phrases = InputFileConverter.getBannedPhrases();
                String filenameCleaned =
                        InputFileConverter.xmlInputConverter("./" + inputName + ".xml", phrases);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                GroupLevel2 groupLevel2 = null;
                try {
                    groupLevel2 = XMLParser.parseXML("./" + filenameCleaned + ".xml");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                publications = PublicationConverter.convertXMLToPublicationsShort(groupLevel2);
//                publications.forEach(p -> System.out.println(p));


                break;
            case "csv":

                break;
        }
        return publications;
    }
}
