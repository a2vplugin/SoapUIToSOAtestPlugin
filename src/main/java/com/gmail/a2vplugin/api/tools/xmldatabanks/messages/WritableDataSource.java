
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "writableDataSource", propOrder = { "writableDataSourceColumn", "writeToColumnsThatMatch" })
public class WritableDataSource {

    @XmlElement(required = true)
    protected String writableDataSourceColumn;
    protected String writeToColumnsThatMatch;

    public String getWritableDataSourceColumn() {
        return writableDataSourceColumn;
    }

    public void setWritableDataSourceColumn(String value) {
        this.writableDataSourceColumn = value;
    }

    public String getWriteToColumnsThatMatch() {
        return writeToColumnsThatMatch;
    }

    public void setWriteToColumnsThatMatch(String value) {
        this.writeToColumnsThatMatch = value;
    }

}
