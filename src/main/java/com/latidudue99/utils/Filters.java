package com.latidudue99.utils;

import com.latidudue99.model.Publication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {

    public static List<Publication> filerPublications(List<Publication> publications, String[] args){
        String filterType = "";
        String[] fiterParams = args.clone();
        if(args.length > 3){
            filterType = args[2].toLowerCase();
            fiterParams[0] = "-----";
            fiterParams[1] = "-----";
            fiterParams[2] = "-----";
        }
        switch(filterType){
            case "isbn":
                publications = Filters.filterISBN(publications, fiterParams);
                break;
            case "title":
                publications = Filters.filterTitle(publications, fiterParams);
                break;
            case "author":
                publications = Filters.filterAuthor(publications, fiterParams);
                break;
            case "publisher":
                publications = Filters.filterPublisher(publications, fiterParams);
                break;
        }
        return publications;
    }

    public static List<Publication> filterISBN(List<Publication> publications, String[] fiterParams){
        List<String> isbns = Arrays.asList(fiterParams);
        List<Publication> publicationsFiltered = publications.stream()
                .filter(p -> isbns.contains(p.getIsbn()))
                .collect(Collectors.toList());
        return publicationsFiltered;
    }

    public static List<Publication> filterTitle(List<Publication> publications, String[] fiterParams){
        List<String> titles = Arrays.asList(fiterParams);
        List<Publication> publicationsFiltered = new ArrayList<>();
        for(String title :titles){
            for(Publication publication :publications){
                if(publication.getTitle() != null &&
                        publication.getTitle().toLowerCase().contains(title.toLowerCase()))
                    publicationsFiltered.add(publication);
            }
        }
        return publicationsFiltered;
    }

    public static List<Publication> filterAuthor(List<Publication> publications, String[] fiterParams){
        List<String> authors = Arrays.asList(fiterParams);
        List<Publication> publicationsFiltered = new ArrayList<>();
        for(String author :authors){
            for(Publication publication :publications){
                if(publication.getAuthor() != null &&
                        publication.getAuthor().toLowerCase().contains(author.toLowerCase()))
                    publicationsFiltered.add(publication);
            }
        }
        return publicationsFiltered;
    }

    public static List<Publication> filterPublisher(List<Publication> publications, String[] fiterParams){
        List<String> publishers = Arrays.asList(fiterParams);
        List<Publication> publicationsFiltered = new ArrayList<>();
        for(String publisher :publishers){
            for(Publication publication :publications){
                if(publication.getTitle() != null &&
                        publication.getPublisher().toLowerCase().contains(publisher.toLowerCase()))
                    publicationsFiltered.add(publication);
            }
        }
        return publicationsFiltered;
    }
}
