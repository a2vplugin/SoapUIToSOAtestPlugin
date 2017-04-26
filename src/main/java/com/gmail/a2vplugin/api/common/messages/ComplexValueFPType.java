
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "complexValueFPType")
@XmlEnum
public enum ComplexValueFPType {

    @XmlEnumValue("fixed")
    fixed("fixed"), @XmlEnumValue("parameterized")
    parameterized("parameterized");
    private final String value;

    ComplexValueFPType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplexValueFPType fromValue(String v) {
        for (ComplexValueFPType c : ComplexValueFPType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
