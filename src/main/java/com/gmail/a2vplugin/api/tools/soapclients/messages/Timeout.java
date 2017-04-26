
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeout", propOrder = { "action", "milliseconds" })
public class Timeout {

    @XmlSchemaType(name = "string")
    protected Action action;
    protected Milliseconds milliseconds;

    public Action getAction() {
        return action;
    }

    public void setAction(Action value) {
        this.action = value;
    }

    public Milliseconds getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Milliseconds value) {
        this.milliseconds = value;
    }

}
