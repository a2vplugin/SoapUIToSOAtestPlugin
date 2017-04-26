
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.LiteralMime;
import com.gmail.a2vplugin.api.common.messages.Relationships;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "difftoolsResponse", propOrder = { "id", "input", "name", "referenced", "relationships", "toolSettings",
        "url" })
public class DifftoolsResponse {

    @XmlElement(required = true)
    protected String id;
    protected LiteralMime input;
    protected String name;
    protected Boolean referenced;
    protected Relationships relationships;
    protected ToolSettings toolSettings;
    protected String url;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public LiteralMime getInput() {
        return input;
    }

    public void setInput(LiteralMime value) {
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
