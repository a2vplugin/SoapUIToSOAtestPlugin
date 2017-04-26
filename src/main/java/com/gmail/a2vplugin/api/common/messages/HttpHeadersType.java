
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "httpHeadersType")
@XmlEnum
public enum HttpHeadersType {

    @XmlEnumValue("literal")
    literal("literal"), @XmlEnumValue("table")
    table("table");
    private final String value;

    HttpHeadersType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HttpHeadersType fromValue(String v) {
        for (HttpHeadersType c : HttpHeadersType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
