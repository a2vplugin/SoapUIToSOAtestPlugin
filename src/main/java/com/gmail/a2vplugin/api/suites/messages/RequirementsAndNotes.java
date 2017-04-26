
package com.gmail.a2vplugin.api.suites.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requirementsAndNotes", propOrder = { "notes" })
public class RequirementsAndNotes {

    protected String notes;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        this.notes = value;
    }

}
