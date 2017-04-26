
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "statementSeparator")
@XmlEnum
public enum StatementSeparator {

    @XmlEnumValue("semicolon")
    semicolon("semicolon"), @XmlEnumValue("magicToken")
    magicToken("magicToken");
    private final String value;

    StatementSeparator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatementSeparator fromValue(String v) {
        for (StatementSeparator c : StatementSeparator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
