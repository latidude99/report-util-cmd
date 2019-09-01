package com.latidudue99.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


//@XmlRootElement(name = "CrystalReport")
public class CrystalReport {

    GroupLevel1 groupLevel1;

    public GroupLevel1 getGroupLevel1() {
        return groupLevel1;
    }

    @XmlElement(name = "Group")
    public void setGroupLevel1(GroupLevel1 groupLevel1) {
        this.groupLevel1 = groupLevel1;
    }
}
