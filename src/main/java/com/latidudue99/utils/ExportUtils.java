package com.latidudue99.utils;

import com.latidudue99.model.Publication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ExportUtils {
    private static DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static DateTimeFormatter formatterOut =
            DateTimeFormatter.ofPattern("dd MMM yyyy HH.mm");

    public static boolean exportSalesCSVShort(String[] args, List<Publication> publications, String filename) {
        boolean isDone = false;
        filename = addCriteriaToFilename(args, filename);
        filename =  addDateToFilename(filename)+ ".csv";

        StringBuilder sb =  new StringBuilder();
        String headers = "" +         // column headers
                " ISBN" +
                ", QTY SOLD (DATE RANGE) " +
                ", QTY IN HAND" +
                ", QTY ON ORDER" +
                ", TITLE" +
                ", AUTHOR" +
                ", PUBLISHER" +
                ", PRICE" +
                ", SPECIAL PRICE" +
                ", COST" +
                ", SALES VALUE (DATE RANGE)" +
                ", REPORT (IP/OP etc.)" +
                ", CATEGORY" +
                ", DEPARTMENT";
;
        sb.append(headers);
        sb.append(System.lineSeparator());
        sb.append(System.lineSeparator());

        if(args.length > 3)
            System.out.print("Filtering publications by " + args[2] + ": " + args[3] + "...");

        for(Publication p :publications){
            sb.append(" ");
            sb.append(p.getIsbn() + ", ");
            sb.append(p.getQuantitySoldDateRange() + ", ");
            sb.append(p.getQuantityInHand() + ", ");
            sb.append(p.getQuantityOrdered() + ", ");
            sb.append("\"" + p.getTitle() + "\"" + ", ");
            sb.append("\"" + p.getAuthor() + "\"" + ", ");
            sb.append("\"" + p.getPublisher() + "\"" + ", ");
            sb.append(p.getPrice() + ", ");
            sb.append(p.getSpecialPrice() + ", ");
            sb.append(p.getCost() + ", ");
            sb.append(p.getSalesValueDateRange() + ", ");
            sb.append(p.getReport() + ", ");
            sb.append(p.getCategory1() + ", ");
            sb.append(p.getDepartment() + ", ");

            sb.append(System.lineSeparator());
        }

        try (FileWriter fw = new FileWriter(filename);
             BufferedWriter bw = new BufferedWriter(fw)) {
            
            bw.write(sb.toString());
            isDone = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("  OK");
        return isDone;
    }

    public static boolean exportSalesCSVFull(List<Publication> publications, String filename) {
        boolean isDone = false;
        filename =  addDateToFilename(filename)+ ".csv";

        StringBuilder sb =  new StringBuilder();
        String headers = "" +         // column headers
                " ISBN" +
                ", QTY SOLD (DATE RANGE) " +
                ", QTY IN HAND" +
                ", QTY ON ORDER" +
                ", TITLE" +
                ", AUTHOR" +
                ", PUBLISHER" +
                ", PRICE" +
                ", SPECIAL PRICE" +
                ", COST" +
                ", SALES VALUE (DATE RANGE)" +
                ", REPORT (IP/OP etc.)" +
                ", CATEGORY" +
                ", DEPARTMENT" +
                ", CORE STOCK" +
                ", WEB EXPORT" +
                ", LAST DELIVERY DATE" +
                ", LAST DELIVERY QTY" +
                ", WEEK TO DATE" +
                ", WEEK -1" +
                ", WEEK -2" +
                ", WEEK -3" +
                ", CURRENT MONTH" +
                ", MONTH -1" +
                ", MONTH -2" +
                ", MONTH -3" +
                ", MONTH -4" +
                ", MONTH -5" +
                ", MONTH -6" +
                ", MONTH -7" +
                ", MONTH -8" +
                ", MONTH -9" +
                ", MONTH -10" +
                ", MONTH -11" +
                ", MONTH -12" +
                ", CURRENT YEAR" +
                ", YEAR -1" +
                ", YEAR -2";
        sb.append(headers);
        sb.append(System.lineSeparator());
        sb.append(System.lineSeparator());

        for(Publication p :publications){
            sb.append(" ");
            sb.append(p.getIsbn() + ", ");
            sb.append(p.getQuantitySoldDateRange() + ", ");
            sb.append(p.getQuantityInHand() + ", ");
            sb.append(p.getQuantityOrdered() + ", ");
            sb.append("\"" + p.getTitle() + "\"" + ", ");
            sb.append("\"" + p.getAuthor() + "\"" + ", ");
            sb.append("\"" + p.getPublisher() + "\"" + ", ");
            sb.append(p.getPrice() + ", ");
            sb.append(p.getSpecialPrice() + ", ");
            sb.append(p.getCost() + ", ");
            sb.append(p.getSalesValueDateRange() + ", ");
            sb.append(p.getReport() + ", ");
            sb.append(p.getCategory1() + ", ");
            sb.append(p.getDepartment() + ", ");
            sb.append(p.isCoreStock() + ", ");
            sb.append(p.isWeb() + ", ");
            if(p.getLastDelivered() != null)
                sb.append(p.getLastDelivered().format(formatter) + ", ");
            else
                sb.append(null + ", ");
            sb.append(p.getQuantityLastDelivered() + ", ");
            sb.append(p.getWeeks().get("week-0") + ", ");
            sb.append(p.getWeeks().get("week-1") + ", ");
            sb.append(p.getWeeks().get("week-2") + ", ");
            sb.append(p.getWeeks().get("week-3") + ", ");
            sb.append(p.getWeeks().get("month-0") + ", ");
            sb.append(p.getWeeks().get("month-1") + ", ");
            sb.append(p.getWeeks().get("month-2") + ", ");
            sb.append(p.getWeeks().get("month-3") + ", ");
            sb.append(p.getWeeks().get("month-4") + ", ");
            sb.append(p.getWeeks().get("month-5") + ", ");
            sb.append(p.getWeeks().get("month-6") + ", ");
            sb.append(p.getWeeks().get("month-7") + ", ");
            sb.append(p.getWeeks().get("month-8") + ", ");
            sb.append(p.getWeeks().get("month-9") + ", ");
            sb.append(p.getWeeks().get("month-10") + ", ");
            sb.append(p.getWeeks().get("month-11") + ", ");
            sb.append(p.getWeeks().get("month-12") + ", ");
            sb.append(p.getWeeks().get("year-0") + ", ");
            sb.append(p.getWeeks().get("year-1") + ", ");
            sb.append(p.getWeeks().get("year-2") + ", ");
            sb.append(System.lineSeparator());
        }
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
        //    fw = new FileWriter(addDateToFilename(filename));
            Path path = FileSystems.getDefault().getPath(addDateToFilename(filename));
            bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
            bw.write(sb.toString());
            isDone = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return isDone;
    }

    private static String addCriteriaToFilename(String[] args, String filename){
        if(args.length > 3){
            filename =  filename + "--filtered by " + args[2];
            for(int i = 3; i < args.length;i++) {
                filename = filename + "-" + args[i];
            }
            if(filename.length() >250)
                filename =  filename.substring(0,50) + ".....more";
        }
        return filename;
    }

    private static String addDateToFilename(String filename){ ;
        LocalDateTime localDateTime = LocalDateTime.now();
        String time = localDateTime.format(formatterOut);
        filename = filename + "__" + time;
        return filename;
    }

    private static void displayProgress(List<Publication> publications){
        int size = publications.size();

    }


}
