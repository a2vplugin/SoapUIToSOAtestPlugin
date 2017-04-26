
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "connectionSettings")
@XmlEnum
public enum ConnectionSettings {

    @XmlEnumValue("keepAlive")
    keepAlive("keepAlive"), @XmlEnumValue("close")
    close("close");
    private final String value;

    ConnectionSettings(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionSettings fromValue(String v) {
        for (ConnectionSettings c : ConnectionSettings.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
