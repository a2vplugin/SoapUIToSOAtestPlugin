
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.HttpHeaders;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "http11", propOrder = { "httpHeaders", "security" })
public class Http11 {

    protected HttpHeaders httpHeaders;
    protected Security security;

    public HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(HttpHeaders value) {
        this.httpHeaders = value;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security value) {
        this.security = value;
    }

}
