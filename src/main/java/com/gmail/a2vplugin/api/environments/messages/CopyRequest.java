
package com.gmail.a2vplugin.api.environments.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.From;
import com.gmail.a2vplugin.api.common.messages.To;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyRequest", propOrder = { "from", "to" })
public class CopyRequest {

    @XmlElement(required = true)
    protected From from;
    @XmlElement(required = true)
    protected To to;

    public From getFrom() {
        return from;
    }

    public void setFrom(From value) {
        this.from = value;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To value) {
        this.to = value;
    }

}
