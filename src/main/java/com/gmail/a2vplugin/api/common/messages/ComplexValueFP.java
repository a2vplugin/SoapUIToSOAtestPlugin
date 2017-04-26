
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexValueFP", propOrder = { "type", "fixed", "parameterized" })
public class ComplexValueFP {

    @XmlElement(required = true, defaultValue = "fixed")
    @XmlSchemaType(name = "string")
    protected ComplexValueFPType type;
    protected String fixed;
    protected Parameterized parameterized;

    public ComplexValueFPType getType() {
        return type;
    }

    public void setType(ComplexValueFPType value) {
        this.type = value;
    }

    public String getFixed() {
        return fixed;
    }

    public void setFixed(String value) {
        this.fixed = value;
    }

    public Parameterized getParameterized() {
        return parameterized;
    }

    public void setParameterized(Parameterized value) {
        this.parameterized = value;
    }

}
