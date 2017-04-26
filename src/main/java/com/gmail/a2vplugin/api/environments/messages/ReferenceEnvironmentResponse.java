
package com.gmail.a2vplugin.api.environments.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceEnvironmentResponse", propOrder = { "location", "name", "active", "environments" })
public class ReferenceEnvironmentResponse {

    @XmlElement(required = true)
    protected FileLocation location;
    @XmlElement(required = true)
    protected String name;
    protected Boolean active;
    @XmlElement(required = true)
    protected ReferenceEnvironmentResponse.Environments environments;

    public FileLocation getLocation() {
        return location;
    }

    public void setLocation(FileLocation value) {
        this.location = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean value) {
        this.active = value;
    }

    public ReferenceEnvironmentResponse.Environments getEnvironments() {
        return environments;
    }

    public void setEnvironments(ReferenceEnvironmentResponse.Environments value) {
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
