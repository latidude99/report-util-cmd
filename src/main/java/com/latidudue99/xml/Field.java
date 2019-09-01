package com.latidudue99.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Field")
public class Field {

    String Name;
    String value;
    String formattedValue;

    public String getName() {
        return Name;
    }

    @XmlAttribute(name = "Name")
    public void setName(String name) {
        Name = name;
    }

    public String getFormattedValue() {
        return formattedValue;
    }

    @XmlElement(name = "FormattedValue")
    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    public String getValue() {
        return value;
    }

    @XmlElement(name = "Value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Field{" +
                "Name='" + Name + '\'' +
                ", value='" + value + '\'' +
                ", formattedValue='" + formattedValue + '\'' +
                '}';
    }
}
