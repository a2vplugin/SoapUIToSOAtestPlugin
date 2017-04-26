
package com.gmail.a2vplugin.api.datasources.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "rowsMode")
@XmlEnum
public enum RowsMode {

    @XmlEnumValue("all")
    all("all"), @XmlEnumValue("range")
    range("range");
    private final String value;

    RowsMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RowsMode fromValue(String v) {
        for (RowsMode c : RowsMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
