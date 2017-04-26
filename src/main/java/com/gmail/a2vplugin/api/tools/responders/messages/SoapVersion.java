
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "soapVersion")
@XmlEnum
public enum SoapVersion {

    @XmlEnumValue("Default")
    Default("Default"), @XmlEnumValue("SOAP1.1")
    SOAP_1_1("SOAP1.1"), @XmlEnumValue("SOAP1.2")
    SOAP_1_2("SOAP1.2");
    private final String value;

    SoapVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapVersion fromValue(String v) {
        for (SoapVersion c : SoapVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
