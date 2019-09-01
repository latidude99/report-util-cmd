package com.latidudue99.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "Group")
public class GroupLevel2 {

    List<Details> details;


    public List<Details> getDetails() {
        return details;
    }

    @XmlElement(name = "Details")
    public void setDetails(List<Details> details) {
        this.details = details;
    }

    public void add(Details details) {
        if (this.details == null) {
            this.details = new ArrayList<Details>();
        }
        this.details.add(details);
    }

    @Override
    public String toString() {
        return "GroupLevel2{" +
                "details=" + details +
                '}';
    }
}
