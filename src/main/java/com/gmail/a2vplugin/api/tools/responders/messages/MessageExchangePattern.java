
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "messageExchangePattern")
@XmlEnum
public enum MessageExchangePattern {

    @XmlEnumValue("solicitReponse")
    solicitReponse("solicitReponse"), @XmlEnumValue("notificationOnly")
    notificationOnly("notificationOnly");
    private final String value;

    MessageExchangePattern(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageExchangePattern fromValue(String v) {
        for (MessageExchangePattern c : MessageExchangePattern.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
