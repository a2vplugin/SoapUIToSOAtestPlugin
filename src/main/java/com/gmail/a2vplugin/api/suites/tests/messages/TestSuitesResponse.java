
package com.gmail.a2vplugin.api.suites.tests.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;
import com.gmail.a2vplugin.api.common.messages.Relationships;
import com.gmail.a2vplugin.api.suites.messages.RequirementsAndNotes;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testSuitesResponse", propOrder = { "id", "name", "referenceLocation", "referenced", "relationships",
        "requirementsAndNotes", "url" })
public class TestSuitesResponse {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    protected FileLocation referenceLocation;
    protected Boolean referenced;
    @XmlElement(required = true)
    protected Relationships relationships;
    protected RequirementsAndNotes requirementsAndNotes;
    @XmlElement(required = true)
    protected String url;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public FileLocation getReferenceLocation() {
        return referenceLocation;
    }

    public void setReferenceLocation(FileLocation value) {
        this.referenceLocation = value;
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

    public RequirementsAndNotes getRequirementsAndNotes() {
        return requirementsAndNotes;
    }

    public void setRequirementsAndNotes(RequirementsAndNotes value) {
        this.requirementsAndNotes = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

}
