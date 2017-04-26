
package com.gmail.a2vplugin.api.files.tsts.messages.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "value", propOrder = { "environmentSource", "variableTypes" })
public class Value {

    protected EnvironmentSource environmentSource;
    @XmlSchemaType(name = "string")
    protected VariableTypes variableTypes;

    public EnvironmentSource getEnvironmentSource() {
        return environmentSource;
    }

    public void setEnvironmentSource(EnvironmentSource value) {
        this.environmentSource = value;
    }

    public VariableTypes getVariableTypes() {
        return variableTypes;
    }

    public void setVariableTypes(VariableTypes value) {
        this.variableTypes = value;
    }

}
