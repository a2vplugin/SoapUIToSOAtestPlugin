
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "complexValueFPSType")
@XmlEnum
public enum ComplexValueFPSType {

    @XmlEnumValue("fixed")
    fixed("fixed"), @XmlEnumValue("parameterized")
    parameterized("parameterized"), @XmlEnumValue("scripted")
    scripted("scripted");
    private final String value;

    ComplexValueFPSType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplexValueFPSType fromValue(String v) {
        for (ComplexValueFPSType c : ComplexValueFPSType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
