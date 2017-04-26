
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "afterRunningQuery")
@XmlEnum
public enum AfterRunningQuery {

    @XmlEnumValue("autoCommit")
    autoCommit("autoCommit"), @XmlEnumValue("rollback")
    rollback("rollback"), @XmlEnumValue("noAction")
    noAction("noAction");
    private final String value;

    AfterRunningQuery(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AfterRunningQuery fromValue(String v) {
        for (AfterRunningQuery c : AfterRunningQuery.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
