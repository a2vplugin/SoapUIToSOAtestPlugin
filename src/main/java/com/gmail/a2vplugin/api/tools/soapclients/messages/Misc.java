
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "misc", propOrder = { "notes", "timeout" })
public class Misc {

    protected String notes;
    protected Timeout timeout;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        this.notes = value;
    }

    public Timeout getTimeout() {
        return timeout;
    }

    public void setTimeout(Timeout value) {
        this.timeout = value;
    }

}
