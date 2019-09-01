package com.latidudue99.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Section")
public class Section {

    List<Field> fields;

    public List<Field> getFields() {
        return fields;
    }

    @XmlElement(name = "Field")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }


    public void add(Field field) {
        if (this.fields == null) {
            this.fields = new ArrayList<Field>();
        }
        this.fields.add(field);
    }

    @Override
    public String toString() {
        return "Section{" +
                "fields=" + fields +
                '}';
    }
}
