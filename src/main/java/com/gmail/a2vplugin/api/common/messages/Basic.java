
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basic", propOrder = { "password", "username" })
public class Basic {

    protected ComplexValueFP password;
    protected ComplexValueFP username;

    public ComplexValueFP getPassword() {
        return password;
    }

    public void setPassword(ComplexValueFP value) {
        this.password = value;
    }

    public ComplexValueFP getUsername() {
        return username;
    }

    public void setUsername(ComplexValueFP value) {
        this.username = value;
    }

}
