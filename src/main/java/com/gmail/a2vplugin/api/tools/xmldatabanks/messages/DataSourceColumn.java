
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataSourceColumn", propOrder = { "customColumn", "suiteVariable", "writableDataSource" })
public class DataSourceColumn {

    protected CustomColumn customColumn;
    protected SuiteVariable suiteVariable;
    protected WritableDataSource writableDataSource;

    public CustomColumn getCustomColumn() {
        return customColumn;
    }

    public void setCustomColumn(CustomColumn value) {
        this.customColumn = value;
    }

    public SuiteVariable getSuiteVariable() {
        return suiteVariable;
    }

    public void setSuiteVariable(SuiteVariable value) {
        this.suiteVariable = value;
    }

    public WritableDataSource getWritableDataSource() {
        return writableDataSource;
    }

    public void setWritableDataSource(WritableDataSource value) {
        this.writableDataSource = value;
    }

}
