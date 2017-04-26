
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "inputMode")
@XmlEnum
public enum InputMode {

    @XmlEnumValue("formInput")
    formInput("formInput"), @XmlEnumValue("formXML")
    formXML("formXML"), @XmlEnumValue("literal")
    literal("literal"), @XmlEnumValue("scripted")
    scripted("scripted");
    private final String value;

    InputMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InputMode fromValue(String v) {
        for (InputMode c : InputMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
