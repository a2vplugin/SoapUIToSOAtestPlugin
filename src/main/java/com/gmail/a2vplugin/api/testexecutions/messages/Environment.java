
package com.gmail.a2vplugin.api.testexecutions.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.NameValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environment", propOrder = { "variables" })
public class Environment {

    @XmlElement(required = true)
    protected Environment.Variables variables;

    public Environment.Variables getVariables() {
        return variables;
    }

    public void setVariables(Environment.Variables value) {
        this.variables = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "variable" })
    public static class Variables {

        @XmlElement(required = true)
        protected List<NameValue> variable;

        public List<NameValue> getVariable() {
            if (variable == null) {
                variable = new ArrayList<NameValue>();
            }
            return this.variable;
        }

    }

}
