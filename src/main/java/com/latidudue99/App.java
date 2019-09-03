package com.latidudue99;

import com.latidudue99.model.Publication;
import com.latidudue99.utils.ExportUtils;
import com.latidudue99.utils.FileOperations;
import com.latidudue99.utils.Filters;

import java.io.FileNotFoundException;
import java.util.List;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        if(args.length > 1){
            String inputName = args[1];
            List<Publication> publications = FileOperations.getPublicationList(args);

            publications = Filters.filerPublications(publications, args);

            ExportUtils.exportSalesCSVShortTrimmed(args, publications, inputName);
        }

    }


}
