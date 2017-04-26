
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endpoint", propOrder = { "endpointType", "value" })
public class Endpoint {

    @XmlElement(defaultValue = "default")
    @XmlSchemaType(name = "string")
    protected String endpointType;
    protected ComplexValueFP value;

    public String getEndpointType() {
        return endpointType;
    }

    public void setEndpointType(String value) {
        this.endpointType = value;
    }

    public ComplexValueFP getValue() {
        return value;
    }

    public void setValue(ComplexValueFP value) {
        this.value = value;
    }

}
