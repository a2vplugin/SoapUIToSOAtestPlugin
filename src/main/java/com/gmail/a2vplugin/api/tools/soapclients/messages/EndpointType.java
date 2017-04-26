
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "endpointType")
@XmlEnum
public enum EndpointType {

    @XmlEnumValue("custom")
    custom("custom"), @XmlEnumValue("default")
    Default("default"), @XmlEnumValue("wsdl")
    wsdl("wsdl"), @XmlEnumValue("uddiServiceKey")
    uddiServiceKey("uddiServiceKey");
    private final String value;

    EndpointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndpointType fromValue(String v) {
        for (EndpointType c : EndpointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
