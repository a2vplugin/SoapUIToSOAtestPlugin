
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticationType", propOrder = { "type", "basic" })
public class AuthenticationType {

    @XmlElement(required = true, defaultValue = "basic")
    @XmlSchemaType(name = "string")
    protected AuthenticationTypeType type;
    protected Basic basic;

    public AuthenticationTypeType getType() {
        return type;
    }

    public void setType(AuthenticationTypeType value) {
        this.type = value;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic value) {
        this.basic = value;
    }

}
