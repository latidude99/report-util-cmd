package com.latidudue99.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Details")
public class Details {

    Section section;

    public Section getSection() {
        return section;
    }

    @XmlElement(name = "Section")
    public void setSection(Section section) {
        this.section = section;
    }


    @Override
    public String toString() {
        return "Details{" +
                "section=" + section +
                '}';
    }
}
