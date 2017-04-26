
package com.gmail.a2vplugin.api.files.pvas.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileOrUrlLocation;
import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pvasWsdlRequest", propOrder = { "location", "name", "parent" })
public class PvasWsdlRequest {

    @XmlElement(required = true)
    protected FileOrUrlLocation location;
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;

    public FileOrUrlLocation getLocation() {
        return location;
    }

    public void setLocation(FileOrUrlLocation value) {
        this.location = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent value) {
        this.parent = value;
    }

}
