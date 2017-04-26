
package com.gmail.a2vplugin.api.datasources.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rows", propOrder = { "rowsMode", "rangeFrom", "rangeTo" })
public class Rows {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RowsMode rowsMode;
    protected int rangeFrom;
    protected int rangeTo;

    public RowsMode getRowsMode() {
        return rowsMode;
    }

    public void setRowsMode(RowsMode value) {
        this.rowsMode = value;
    }

    public int getRangeFrom() {
        return rangeFrom;
    }

    public void setRangeFrom(int value) {
        this.rangeFrom = value;
    }

    public int getRangeTo() {
        return rangeTo;
    }

    public void setRangeTo(int value) {
        this.rangeTo = value;
    }

}
