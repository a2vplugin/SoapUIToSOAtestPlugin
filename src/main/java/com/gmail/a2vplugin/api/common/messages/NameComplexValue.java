
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nameComplexValue", propOrder = { "name", "value" })
public class NameComplexValue {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ComplexValueFPS value;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public ComplexValueFPS getValue() {
        return value;
    }

    public void setValue(ComplexValueFPS value) {
        this.value = value;
    }

}
