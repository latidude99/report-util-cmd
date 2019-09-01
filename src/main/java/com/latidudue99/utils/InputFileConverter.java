package com.latidudue99.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InputFileConverter {

    public static String xmlInputConverter(String filename, List<String> phrases){
        String inputClean = "";
        File inputFile = new File(filename);
        File tmpFile = new File("input_clean.xml");
        Path pathIn = FileSystems.getDefault().getPath(filename);
        Path pathOut = FileSystems.getDefault().getPath("input_clean.xml");

        System.out.print("XML input file conversion, may take a few seconds... ");

        {
            try {
            //    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            //    BufferedWriter writer = new BufferedWriter(new FileWriter(tmpFile));
                BufferedReader reader = Files.newBufferedReader(pathIn, StandardCharsets.UTF_8);
                BufferedWriter writer = Files.newBufferedWriter(pathOut, StandardCharsets.UTF_8);

                String currentLine;
                boolean remove;

                Task:
                while((currentLine = reader.readLine()) != null) {
                    remove =  false;
                    for(String s : phrases){
                        if(currentLine.contains(s))
                            remove =  true;
                        if(currentLine.contains("<GroupFooter>"))
                            break Task;
                    }
                    if(!remove)
                        writer.write(currentLine + System.lineSeparator());
                }
                writer.close();
                reader.close();
                inputClean = "input_clean";
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" OK");
        System.out.println("     .");
        System.out.println("     .");
        System.out.println("     .");
        System.out.print("Parsing input file...");
        return inputClean;
    }

    public static List<String> getBannedPhrases() {
        List<String> phrases = new ArrayList<>();
        phrases.add("CrystalReport");
        phrases.add("schemaLocation");
        phrases.add("<Group Level=\"1\">");
        phrases.add("</CrystalReport>");
        return phrases;
    }




}
