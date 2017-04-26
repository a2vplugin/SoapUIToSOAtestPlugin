
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "http10General", propOrder = { "soapAction", "endpoint", "expectSynchronousResponse",
        "connectionSettings" })
public class Http10General {

    protected ComplexValueFP soapAction;
    protected String endpoint;
    @XmlElement(defaultValue = "true")
    protected boolean expectSynchronousResponse;
    @XmlSchemaType(name = "string")
    protected ConnectionSettings connectionSettings;

    public ComplexValueFP getSoapAction() {
        return soapAction;
    }

    public void setSoapAction(ComplexValueFP value) {
        this.soapAction = value;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String value) {
        this.endpoint = value;
    }

    public boolean isExpectSynchronousResponse() {
        return expectSynchronousResponse;
    }

    public void setExpectSynchronousResponse(boolean value) {
        this.expectSynchronousResponse = value;
    }

    public ConnectionSettings getConnectionSettings() {
        return connectionSettings;
    }

    public void setConnectionSettings(ConnectionSettings value) {
        this.connectionSettings = value;
    }

}
