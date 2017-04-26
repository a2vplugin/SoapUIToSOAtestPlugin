
package com.gmail.a2vplugin.api.datasources.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;
import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "csvDataSourcesRequest", propOrder = { "name", "parent", "location", "separator", "quote",
        "trimLeadingAndTrailingWhitespace", "firstRowSpecifiesColumnNames", "rows" })
public class CsvDataSourcesRequest {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;
    @XmlElement(required = true)
    protected FileLocation location;
    @XmlElement(required = true)
    protected String separator;
    @XmlElement(required = true)
    protected String quote;
    protected Boolean trimLeadingAndTrailingWhitespace;
    protected Boolean firstRowSpecifiesColumnNames;
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

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String value) {
        this.separator = value;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String value) {
        this.quote = value;
    }

    public Boolean isTrimLeadingAndTrailingWhitespace() {
        return trimLeadingAndTrailingWhitespace;
    }

    public void setTrimLeadingAndTrailingWhitespace(Boolean value) {
        this.trimLeadingAndTrailingWhitespace = value;
    }

    public Boolean isFirstRowSpecifiesColumnNames() {
        return firstRowSpecifiesColumnNames;
    }

    public void setFirstRowSpecifiesColumnNames(Boolean value) {
        this.firstRowSpecifiesColumnNames = value;
    }

    public Rows getRows() {
        return rows;
    }

    public void setRows(Rows value) {
        this.rows = value;
    }

}
