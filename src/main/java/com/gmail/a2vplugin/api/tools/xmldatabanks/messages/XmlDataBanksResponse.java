
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Literal;
import com.gmail.a2vplugin.api.common.messages.Relationships;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlDataBanksResponse", propOrder = { "dataSource", "id", "input", "name", "referenced",
        "relationships", "toolSettings", "url" })
public class XmlDataBanksResponse {

    protected String dataSource;
    @XmlElement(required = true)
    protected String id;
    protected Literal input;
    @XmlElement(required = true)
    protected String name;
    protected Boolean referenced;
    @XmlElement(required = true)
    protected Relationships relationships;
    protected ToolSettings toolSettings;
    @XmlElement(required = true)
    protected String url;

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String value) {
        this.dataSource = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public Literal getInput() {
        return input;
    }

    public void setInput(Literal value) {
        this.input = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Boolean isReferenced() {
        return referenced;
    }

    public void setReferenced(Boolean value) {
        this.referenced = value;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

    public ToolSettings getToolSettings() {
        return toolSettings;
    }

    public void setToolSettings(ToolSettings value) {
        this.toolSettings = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

}
