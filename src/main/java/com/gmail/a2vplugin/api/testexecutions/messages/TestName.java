
package com.gmail.a2vplugin.api.testexecutions.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testName", propOrder = { "dataSourceName", "dataSourceRow", "match", "value" })
public class TestName {

    protected String dataSourceName;
    protected Integer dataSourceRow;
    protected Boolean match;
    @XmlElement(required = true)
    protected String value;

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String value) {
        this.dataSourceName = value;
    }

    public Integer getDataSourceRow() {
        return dataSourceRow;
    }

    public void setDataSourceRow(Integer value) {
        this.dataSourceRow = value;
    }

    public Boolean isMatch() {
        return match;
    }

    public void setMatch(Boolean value) {
        this.match = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
