
package com.gmail.a2vplugin.api.tools.xmlvalidators.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "mode")
@XmlEnum
public enum Mode {

    @XmlEnumValue("validateAgainstSchema")
    VALIDATE_AGAINST_SCHEMA("validateAgainstSchema"), @XmlEnumValue("checkWellFormednessOnly")
    CHECK_WELL_FORMEDNESS_ONLY("checkWellFormednessOnly");
    private final String value;

    Mode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Mode fromValue(String v) {
        for (Mode c : Mode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
