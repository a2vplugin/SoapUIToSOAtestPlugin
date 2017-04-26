
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transport", propOrder = { "type", "http10", "http11" })
public class Transport {

    @XmlElement(required = true, defaultValue = "http10")
    @XmlSchemaType(name = "string")
    protected TransportType type;
    protected Http10 http10;
    protected Http11 http11;

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType value) {
        this.type = value;
    }

    public Http10 getHttp10() {
        return http10;
    }

    public void setHttp10(Http10 value) {
        this.http10 = value;
    }

    public Http11 getHttp11() {
        return http11;
    }

    public void setHttp11(Http11 value) {
        this.http11 = value;
    }

}
