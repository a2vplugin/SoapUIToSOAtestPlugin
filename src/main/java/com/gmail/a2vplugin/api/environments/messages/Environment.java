
package com.gmail.a2vplugin.api.environments.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environment", propOrder = { "active", "name", "variables" })
public class Environment {

    protected Boolean active;
    protected String name;
    protected List<Variable> variables;

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean value) {
        this.active = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable> value) {
        this.variables = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "variable" })
    public static class Variables {

        protected List<Variable> variable;

        public List<Variable> getVariable() {
            if (variable == null) {
                variable = new ArrayList<Variable>();
            }
            return this.variable;
        }

    }

}
