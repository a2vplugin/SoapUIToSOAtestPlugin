
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.HttpHeaders;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "http10Transport", propOrder = { "general", "security", "httpHeaders" })
public class Http10Transport {

    protected Http10General general;
    protected Security security;
    protected HttpHeaders httpHeaders;

    public Http10General getGeneral() {
        return general;
    }

    public void setGeneral(Http10General value) {
        this.general = value;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security value) {
        this.security = value;
    }

    public HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(HttpHeaders value) {
        this.httpHeaders = value;
    }

}
