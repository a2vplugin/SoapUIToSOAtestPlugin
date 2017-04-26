
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.HttpHeaders;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportHeader", propOrder = { "httpTransportHeaders" })
public class TransportHeader {

    protected HttpHeaders httpTransportHeaders;

    public HttpHeaders getHttpTransportHeaders() {
        return httpTransportHeaders;
    }

    public void setHttpTransportHeaders(HttpHeaders value) {
        this.httpTransportHeaders = value;
    }

}
