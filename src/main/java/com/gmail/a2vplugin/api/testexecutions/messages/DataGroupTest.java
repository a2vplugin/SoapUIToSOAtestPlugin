
package com.gmail.a2vplugin.api.testexecutions.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataGroupTest", propOrder = { "dataGroups", "workspacePath" })
public class DataGroupTest {

    @XmlElement(required = true)
    protected DataGroupTest.DataGroups dataGroups;
    @XmlElement(required = true)
    protected String workspacePath;

    public DataGroupTest.DataGroups getDataGroups() {
        return dataGroups;
    }

    public void setDataGroups(DataGroupTest.DataGroups value) {
        this.dataGroups = value;
    }

    public String getWorkspacePath() {
        return workspacePath;
    }

    public void setWorkspacePath(String value) {
        this.workspacePath = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "dataGroup" })
    public static class DataGroups {

        @XmlElement(required = true)
        protected List<DataGroup> dataGroup;

        public List<DataGroup> getDataGroup() {
            if (dataGroup == null) {
                dataGroup = new ArrayList<DataGroup>();
            }
            return this.dataGroup;
        }

    }

}
