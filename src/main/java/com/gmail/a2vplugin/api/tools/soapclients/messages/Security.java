
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.HttpAuthentication;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security", propOrder = { "httpAuthentication" })
public class Security {

    protected HttpAuthentication httpAuthentication;

    public HttpAuthentication getHttpAuthentication() {
        return httpAuthentication;
    }

    public void setHttpAuthentication(HttpAuthentication value) {
        this.httpAuthentication = value;
    }

}
