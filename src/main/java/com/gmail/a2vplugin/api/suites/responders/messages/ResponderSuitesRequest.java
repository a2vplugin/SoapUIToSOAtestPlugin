
package com.gmail.a2vplugin.api.suites.responders.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.suites.messages.RequirementsAndNotes;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responderSuitesRequest", propOrder = { "name", "parent", "referenceLocation", "referenced",
        "requirementsAndNotes" })
public class ResponderSuitesRequest {

    protected String name;
    @XmlElement(required = true)
    protected Parent parent;
    protected FileLocation referenceLocation;
    protected Boolean referenced;
    protected RequirementsAndNotes requirementsAndNotes;

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

    public RequirementsAndNotes getRequirementsAndNotes() {
        return requirementsAndNotes;
    }

    public void setRequirementsAndNotes(RequirementsAndNotes value) {
        this.requirementsAndNotes = value;
    }

}
