
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "method", propOrder = { "methodType", "value" })
public class Method {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MethodType methodType;
    protected String value;

    public MethodType getMethodType() {
        return methodType;
    }

    public void setMethodType(MethodType value) {
        this.methodType = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
