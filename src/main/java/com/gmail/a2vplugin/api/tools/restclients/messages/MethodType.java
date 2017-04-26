
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "methodType")
@XmlEnum
public enum MethodType {

    GET, POST, OPTIONS, HEAD, PUT, DELETE, TRACE, CUSTOM;

    public String value() {
        return name();
    }

    public static MethodType fromValue(String v) {
        return valueOf(v);
    }

}
