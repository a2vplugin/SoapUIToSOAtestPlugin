
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "literalType")
@XmlEnum
public enum LiteralType {

    @XmlEnumValue("text")
    text("text"), @XmlEnumValue("file")
    file("file");
    private final String value;

    LiteralType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LiteralType fromValue(String v) {
        for (LiteralType c : LiteralType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
