
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "transportType")
@XmlEnum
public enum TransportType {

    @XmlEnumValue("http10")
    http10("http10"), @XmlEnumValue("http11")
    http11("http11"), @XmlEnumValue("customExtension")
    CUSTOM_EXTENSION("customExtension"), @XmlEnumValue("jms")
    JMS("jms"), @XmlEnumValue("netWcfHttp")
    NET_WCF_HTTP("netWcfHttp"), @XmlEnumValue("netWcfTcp")
    NET_WCF_TCP("netWcfTcp"), @XmlEnumValue("none")
    NONE("none"), @XmlEnumValue("rmi")
    RMI("rmi"), @XmlEnumValue("smtp")
    SMTP("smtp"), @XmlEnumValue("sonicMq")
    SONIC_MQ("sonicMq"), @XmlEnumValue("tibco")
    TIBCO("tibco"), @XmlEnumValue("webSphereMq")
    WEB_SPHERE_MQ("webSphereMq");
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
