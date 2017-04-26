
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexValueFPS", propOrder = { "type", "fixed", "parameterized" })
public class ComplexValueFPS {

    @XmlElement(required = true, defaultValue = "fixed")
    @XmlSchemaType(name = "string")
    protected ComplexValueFPSType type;
    protected String fixed;
    protected Parameterized parameterized;

    public ComplexValueFPSType getType() {
        return type;
    }

    public void setType(ComplexValueFPSType value) {
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
