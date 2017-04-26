
package com.gmail.a2vplugin.api.files.tsts.messages.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "variableTypes")
@XmlEnum
public enum VariableTypes {

    @XmlEnumValue("wsdlUriFields")
    WSDL_URI_FIELDS("wsdlUriFields"), @XmlEnumValue("clientEndpoints")
    CLIENT_ENDPOINTS("clientEndpoints"), @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    VariableTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariableTypes fromValue(String v) {
        for (VariableTypes c : VariableTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
