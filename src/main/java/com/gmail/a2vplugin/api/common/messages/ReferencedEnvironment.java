
package com.gmail.a2vplugin.api.common.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referencedEnvironment", propOrder = { "environments" })
public class ReferencedEnvironment {

    protected ReferencedEnvironment.Environments environments;

    public ReferencedEnvironment.Environments getEnvironments() {
        return environments;
    }

    public void setEnvironments(ReferencedEnvironment.Environments value) {
        this.environments = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "environment" })
    public static class Environments {

        protected List<Environment> environment;

        public List<Environment> getEnvironment() {
            if (environment == null) {
                environment = new ArrayList<Environment>();
            }
            return this.environment;
        }

    }

}
