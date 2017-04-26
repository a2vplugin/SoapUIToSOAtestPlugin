
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "httpHeaders", propOrder = { "type", "httpHeadersTable" })
public class HttpHeaders {

    @XmlElement(required = true, defaultValue = "table")
    @XmlSchemaType(name = "string")
    protected HttpHeadersType type;
    protected HttpHeadersTable httpHeadersTable;

    public HttpHeadersType getType() {
        return type;
    }

    public void setType(HttpHeadersType value) {
        this.type = value;
    }

    public HttpHeadersTable getHttpHeadersTable() {
        return httpHeadersTable;
    }

    public void setHttpHeadersTable(HttpHeadersTable value) {
        this.httpHeadersTable = value;
    }

}
