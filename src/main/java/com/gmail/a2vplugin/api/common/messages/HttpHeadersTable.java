
package com.gmail.a2vplugin.api.common.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "httpHeadersTable", propOrder = { "rows" })
public class HttpHeadersTable {

    @XmlElement(required = true)
    protected List<NameComplexValue> rows;

    public List<NameComplexValue> getRows() {
        return rows;
    }

    public void setRows(List<NameComplexValue> value) {
        this.rows = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "row" })
    public static class Rows {

        protected List<NameComplexValue> row;

        public List<NameComplexValue> getRow() {
            if (row == null) {
                row = new ArrayList<NameComplexValue>();
            }
            return this.row;
        }

    }

}
