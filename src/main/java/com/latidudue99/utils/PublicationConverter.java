package com.latidudue99.utils;

import com.latidudue99.model.Publication;
import com.latidudue99.xml.Details;
import com.latidudue99.xml.Field;
import com.latidudue99.xml.GroupLevel2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PublicationConverter {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    public static List<Publication> convertXMLToPublicationsShort(GroupLevel2 groupLevel2){
        List<Publication> publications = new ArrayList<>();

        for(Details details : groupLevel2.getDetails()) {
            List<Field> fields = details.getSection().getFields();
            Publication publication = new Publication();
            
            for(Field field : fields){
                String option = field.getName();
                switch (option){
                    case "ISBN1":
                        publication.setIsbn(field.getValue());
                        break;
                    case "QTYSOLD1":
                        publication.setQuantitySoldDateRange(Integer.parseInt(field.getValue().trim()));
                        break;
                    case "QIH1":
                        publication.setQuantityInHand(Integer.parseInt(field.getValue().trim()));
                        break;
                    case "QOO1":
                        publication.setQuantityOrdered(Integer.parseInt(field.getValue().trim()));
                        break;
                    case "TITLE1":
                        publication.setTitle(field.getValue());
                        break;
                    case "AUTHOR1":
                        publication.setAuthor(field.getValue());
                        break;
                    case "COSTPRICE1":
                        publication.setCost(Double.parseDouble(field.getValue()));
                        break;
                    case "PRICE1":
                        publication.setPrice(Double.parseDouble(field.getValue()));
                        break;
                    case "VSB1":
                        publication.setSalesValueDateRange(Double.parseDouble(field.getValue()));
                        break;
                    case "REPORT1":
                        publication.setReport(field.getValue());
                        break;
                    case "CNAME1":
                        publication.setCategory1(field.getValue());
                        break;
                    case "COREST1":
                        if("Y".equalsIgnoreCase(field.getValue()))
                            publication.setCoreStock(true);
                        break;
                    case "PNAME1":
                        publication.setPublisher(field.getValue());
                        break;
                    case "DEPT1":
                        publication.setDepartment(field.getValue());
                        break;
                    case "SPRICE1":
                        publication.setSpecialPrice(Double.parseDouble(field.getValue()));
                        break;
                    case "DDELX1":
                        LocalDate dateTime = null;
                        if(field.getValue().length() != 0)
                            dateTime =  LocalDate.parse(field.getValue(), formatter);
                        publication.setLastDelivered(dateTime);
                        break;
                    case "QDEL1":
                        publication.setQuantityLastDelivered(Integer.parseInt(field.getValue().trim()));
                        break;
                    case "WEBEXP1":
                        if("Y".equalsIgnoreCase(field.getValue()))
                            publication.setWeb(true);
//                    case "SW1":
//                        publication.getWeeks().put("week-0", Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "SW11":
//                        publication.getWeeks().put("week-1", Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "SW21":
//                        publication.getWeeks().put("week-2", Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "SW31":
//                        publication.getWeeks().put("week-3", Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S1":
//                        publication.getMonths().put("month-0",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S11":
//                        publication.getMonths().put("month-1",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S21":
//                        publication.getMonths().put("month-2",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S31":
//                        publication.getMonths().put("month-3",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S41":
//                        publication.getMonths().put("month-4",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S51":
//                        publication.getMonths().put("month-5",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S61":
//                        publication.getMonths().put("month-6",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S71":
//                        publication.getMonths().put("month-7",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S81":
//                        publication.getMonths().put("month-8",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S91":
//                        publication.getMonths().put("month-9",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S101":
//                        publication.getMonths().put("month-10",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S111":
//                        publication.getMonths().put("month-11",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S121":
//                        publication.getMonths().put("month-12",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "SYEAR11":
//                        publication.getYears().put("year-1",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "SYEAR21":
//                        publication.getYears().put("year-2",Integer.parseInt(field.getValue().trim()));
//                        break;
                }
                publication.getYears().put("year-0", calculateCurrentYearSoldQuantity(publication.getMonths()));
            }
            publications.add(publication);
        }

        System.out.println("  OK");
        System.out.println("     .");
        System.out.println("     .");
        System.out.println("     .");
        return publications;
    }

    private static Integer calculateCurrentYearSoldQuantity(Map<String, Integer> months){
        Integer sum = 0;
        // to be implemented

        return sum;
    }

    public static List<Publication> convertXMLToPublicationsFull(GroupLevel2 groupLevel2){
        List<Publication> publications = new ArrayList<>();

        for(Details details : groupLevel2.getDetails()) {
            List<Field> fields = details.getSection().getFields();
            Publication publication = new Publication();

            for(Field field : fields){
                String option = field.getName();
                switch (option){
                    case "ISBN1":
                        publication.setIsbn(field.getValue());
                        break;
                    case "QTYSOLD1":
                        publication.setQuantitySoldDateRange(Integer.parseInt(field.getValue().trim()));
                        break;
                    case "QIH1":
                        publication.setQuantityInHand(Integer.parseInt(field.getValue().trim()));
                        break;
                    case "QOO1":
                        publication.setQuantityOrdered(Integer.parseInt(field.getValue().trim()));
                        break;
                    case "TITLE1":
                        publication.setTitle(field.getValue());
                        break;
                    case "AUTHOR1":
                        publication.setAuthor(field.getValue());
                        break;
                    case "COSTPRICE1":
                        publication.setCost(Double.parseDouble(field.getValue()));
                        break;
                    case "PRICE1":
                        publication.setPrice(Double.parseDouble(field.getValue()));
                        break;
                    case "VSB1":
                        publication.setSalesValueDateRange(Double.parseDouble(field.getValue()));
                        break;
                    case "REPORT1":
                        publication.setReport(field.getValue());
                        break;
                    case "CNAME1":
                        publication.setCategory1(field.getValue());
                        break;
                    case "COREST1":
                        if("Y".equalsIgnoreCase(field.getValue()))
                            publication.setCoreStock(true);
                        break;
                    case "PNAME1":
                        publication.setPublisher(field.getValue());
                        break;
                    case "DEPT1":
                        publication.setDepartment(field.getValue());
                        break;
                    case "SPRICE1":
                        publication.setSpecialPrice(Double.parseDouble(field.getValue()));
                        break;
                    case "DDELX1":
//                        System.out.println(">" + field.getValue().length() + "<");
                        LocalDate dateTime = null;
                        if(field.getValue().length() != 0)
                            dateTime =  LocalDate.parse(field.getValue(), formatter);
                        publication.setLastDelivered(dateTime);
                        break;
                    case "QDEL1":
                        publication.setQuantityLastDelivered(Integer.parseInt(field.getValue().trim()));
                        break;
                    case "WEBEXP1":
                        if("Y".equalsIgnoreCase(field.getValue()))
                            publication.setWeb(true);
//                    case "SW1":
//                        publication.getWeeks().put("week-0", Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "SW11":
//                        publication.getWeeks().put("week-1", Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "SW21":
//                        publication.getWeeks().put("week-2", Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "SW31":
//                        publication.getWeeks().put("week-3", Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S1":
//                        publication.getMonths().put("month-0",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S11":
//                        publication.getMonths().put("month-1",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S21":
//                        publication.getMonths().put("month-2",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S31":
//                        publication.getMonths().put("month-3",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S41":
//                        publication.getMonths().put("month-4",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S51":
//                        publication.getMonths().put("month-5",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S61":
//                        publication.getMonths().put("month-6",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S71":
//                        publication.getMonths().put("month-7",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S81":
//                        publication.getMonths().put("month-8",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S91":
//                        publication.getMonths().put("month-9",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S101":
//                        publication.getMonths().put("month-10",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S111":
//                        publication.getMonths().put("month-11",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "S121":
//                        publication.getMonths().put("month-12",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "SYEAR11":
//                        publication.getYears().put("year-1",Integer.parseInt(field.getValue().trim()));
//                        break;
//                    case "SYEAR21":
//                        publication.getYears().put("year-2",Integer.parseInt(field.getValue().trim()));
//                        break;
                }
                publication.getYears().put("year-0", calculateCurrentYearSoldQuantity(publication.getMonths()));
            }
            publications.add(publication);
        }
        return publications;
    }

    

}
