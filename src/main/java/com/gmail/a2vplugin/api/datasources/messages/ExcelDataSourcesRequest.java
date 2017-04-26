
package com.gmail.a2vplugin.api.datasources.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;
import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "excelDataSourcesRequest", propOrder = { "name", "parent", "location", "sheet",
        "stopAtTheFirstEmptyRow", "rows" })
public class ExcelDataSourcesRequest {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;
    @XmlElement(required = true)
    protected FileLocation location;
    protected String sheet;
    protected Boolean stopAtTheFirstEmptyRow;
    protected Rows rows;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent value) {
        this.parent = value;
    }

    public FileLocation getLocation() {
        return location;
    }

    public void setLocation(FileLocation value) {
        this.location = value;
    }

    public String getSheet() {
        return sheet;
    }

    public void setSheet(String value) {
        this.sheet = value;
    }

    public Boolean isStopAtTheFirstEmptyRow() {
        return stopAtTheFirstEmptyRow;
    }

    public void setStopAtTheFirstEmptyRow(Boolean value) {
        this.stopAtTheFirstEmptyRow = value;
    }

    public Rows getRows() {
        return rows;
    }

    public void setRows(Rows value) {
        this.rows = value;
    }

}
