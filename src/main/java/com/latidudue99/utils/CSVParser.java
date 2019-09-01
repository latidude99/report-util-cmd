package com.latidudue99.utils;

import com.latidudue99.model.Publication;
import com.latidudue99.xml.GroupLevel2;
import com.latidudue99.xsd.Group;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
 * Deals with input in a CSV format
 */
public class CSVParser {

    public static List<Publication> parseCSV(String filename, RaportSchema schema){
        List<Publication> publications = new ArrayList<>();
        File inputFile = new File(filename);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String currentLine;
                while((currentLine = reader.readLine()) != null) {
                    String[] line = currentLine.split(",");
                    Publication publication = null;
                    if(schema == RaportSchema.SALES)
                        publication = salesRowToPublication(line);
                    if(schema == RaportSchema.STOCK)
                        publication = stockRowToPublication(line);
                    publications.add(publication);

                    publications.add(publication);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return publications;
    }

//  ISBN, QTY SOLD (DATE RANGE) , QTY IN HAND, QTY ON ORDER, TITLE, AUTHOR, PUBLISHER,
//  PRICE, SPECIAL PRICE, COST, SALES VALUE (DATE RANGE), REPORT (IP/OP etc.),
//  CATEGORY, DEPARTMENT, CORE STOCK, WEB EXPORT, LAST DELIVERY DATE, LAST DELIVERY QTY,
//  WEEK TO DATE, WEEK -1, WEEK -2, WEEK -3, CURRENT MONTH,
    private static Publication salesRowToPublication(String[] line){
        Publication publication = new Publication();
        publication.setIsbn(line[0]);
        publication.setTitle(line[1]);
        publication.setPublisher(line[2]);
        publication.setCategory1(line[3]);
        publication.setDepartment(line[4]);
        if(line[5].trim().length() > 0)
            publication.setPrice(Double.parseDouble(line[5].trim()));
        if(line[6].trim().length() > 0)
            publication.setCost(Double.parseDouble(line[5].trim()));
        if(line[5].trim().length() > 0)
            publication.setQuantitySoldDateRange(Integer.parseInt(line[7]));
        if(line[5].trim().length() > 0)
            publication.setQuantityInHand(Integer.parseInt(line[8]));
        if(line[5].trim().length() > 0)
            publication.setQuantityOrdered(Integer.parseInt(line[9]));

        return publication;
    }

//
    private static Publication stockRowToPublication(String[] line){
        Publication publication = new Publication();
        publication.setIsbn(line[0]);
        publication.setTitle(line[1]);
        publication.setPublisher(line[2]);
        publication.setCategory1(line[3]);
        publication.setDepartment(line[4]);
        if(line[5].trim().length() > 0)
            publication.setPrice(Double.parseDouble(line[5].trim()));
        if(line[6].trim().length() > 0)
            publication.setCost(Double.parseDouble(line[5].trim()));
        if(line[5].trim().length() > 0)
            publication.setQuantitySoldDateRange(Integer.parseInt(line[7]));
        if(line[5].trim().length() > 0)
            publication.setQuantityInHand(Integer.parseInt(line[8]));
        if(line[5].trim().length() > 0)
            publication.setQuantityOrdered(Integer.parseInt(line[9]));

        return publication;
    }


}
