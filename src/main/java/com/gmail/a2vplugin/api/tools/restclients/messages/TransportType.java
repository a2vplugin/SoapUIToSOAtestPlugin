
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "transportType")
@XmlEnum
public enum TransportType {

    @XmlEnumValue("http10")
    http10("http10"), @XmlEnumValue("http11")
    http11("http11"), @XmlEnumValue("none")
    none("none");
    private final String value;

    TransportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransportType fromValue(String v) {
        for (TransportType c : TransportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
