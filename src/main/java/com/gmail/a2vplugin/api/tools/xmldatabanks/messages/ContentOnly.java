
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "contentOnly")
@XmlEnum
public enum ContentOnly {

    @XmlEnumValue("textContent")
    textContent("textContent"), @XmlEnumValue("allChildNodes")
    allChildNodes("allChildNodes");
    private final String value;

    ContentOnly(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentOnly fromValue(String v) {
        for (ContentOnly c : ContentOnly.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
