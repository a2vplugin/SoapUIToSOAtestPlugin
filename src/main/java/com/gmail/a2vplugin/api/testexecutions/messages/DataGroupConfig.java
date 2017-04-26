
package com.gmail.a2vplugin.api.testexecutions.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataGroupConfig", propOrder = { "dataGroupTests" })
public class DataGroupConfig {

    @XmlElement(required = true)
    protected DataGroupConfig.DataGroupTests dataGroupTests;

    public DataGroupConfig.DataGroupTests getDataGroupTests() {
        return dataGroupTests;
    }

    public void setDataGroupTests(DataGroupConfig.DataGroupTests value) {
        this.dataGroupTests = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "dataGroupTest" })
    public static class DataGroupTests {

        @XmlElement(required = true)
        protected List<DataGroupTest> dataGroupTest;

        public List<DataGroupTest> getDataGroupTest() {
            if (dataGroupTest == null) {
                dataGroupTest = new ArrayList<DataGroupTest>();
            }
            return this.dataGroupTest;
        }

    }

}
