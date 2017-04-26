
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "httpOptions", propOrder = { "transport" })
public class HttpOptions {

    @XmlElement(required = true)
    protected Transport transport;

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport value) {
        this.transport = value;
    }

}
