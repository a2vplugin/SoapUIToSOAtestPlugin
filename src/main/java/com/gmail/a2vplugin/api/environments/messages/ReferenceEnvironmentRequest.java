
package com.gmail.a2vplugin.api.environments.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceEnvironmentRequest", propOrder = { "activeEnvironmentName", "location", "name" })
public class ReferenceEnvironmentRequest {

    protected String activeEnvironmentName;
    @XmlElement(required = true)
    protected FileLocation location;
    protected String name;

    public String getActiveEnvironmentName() {
        return activeEnvironmentName;
    }

    public void setActiveEnvironmentName(String value) {
        this.activeEnvironmentName = value;
    }

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

}
