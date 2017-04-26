
package com.gmail.a2vplugin.api.testexecutions.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataSource", propOrder = { "dataSourceName", "dataSourceRow" })
public class DataSource {

    protected String dataSourceName;
    protected int dataSourceRow;

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String value) {
        this.dataSourceName = value;
    }

    public int getDataSourceRow() {
        return dataSourceRow;
    }

    public void setDataSourceRow(int value) {
        this.dataSourceRow = value;
    }

}
