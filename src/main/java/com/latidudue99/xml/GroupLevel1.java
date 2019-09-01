package com.latidudue99.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "Group")
public class GroupLevel1 {

    GroupLevel2 groupLevel2;

    public GroupLevel2 getGroupLevel2() {
        return groupLevel2;
    }

    @XmlElement(name = "Group")
    public void setGroupLevel2(GroupLevel2 groupLevel2) {
        this.groupLevel2 = groupLevel2;
    }
}
