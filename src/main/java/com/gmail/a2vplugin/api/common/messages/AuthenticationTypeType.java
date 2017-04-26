
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "authenticationTypeType")
@XmlEnum
public enum AuthenticationTypeType {

    @XmlEnumValue("basic")
    basic("basic"), @XmlEnumValue("ntlm")
    NTLM("NTLM"), @XmlEnumValue("kerberos")
    kerberos("kerberos"), @XmlEnumValue("digest")
    digest("digest");
    private final String value;

    AuthenticationTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationTypeType fromValue(String v) {
        for (AuthenticationTypeType c : AuthenticationTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
