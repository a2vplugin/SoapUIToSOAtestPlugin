
package com.gmail.a2vplugin.api.datasources.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;
import com.gmail.a2vplugin.api.common.messages.Relationships;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "excelDataSourcesResponse", propOrder = { "id", "url", "referenced", "name", "location", "sheet",
        "stopAtTheFirstEmptyRow", "rows", "relationships" })
public class ExcelDataSourcesResponse {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String url;
    protected Boolean referenced;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected FileLocation location;
    protected String sheet;
    protected Boolean stopAtTheFirstEmptyRow;
    protected Rows rows;
    @XmlElement(required = true)
    protected Relationships relationships;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public Boolean isReferenced() {
        return referenced;
    }

    public void setReferenced(Boolean value) {
        this.referenced = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
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

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

}
