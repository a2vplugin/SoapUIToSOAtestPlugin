
package com.gmail.a2vplugin.api.files.tsts.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileOrUrlLocation;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.files.tsts.messages.wsdl.CreateEnvironment;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tstsWsdlRequest", propOrder = { "createEnvironment", "location", "name", "parent" })
public class TstsWsdlRequest {

    protected CreateEnvironment createEnvironment;
    @XmlElement(required = true)
    protected FileOrUrlLocation location;
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;

    public CreateEnvironment getCreateEnvironment() {
        return createEnvironment;
    }

    public void setCreateEnvironment(CreateEnvironment value) {
        this.createEnvironment = value;
    }

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
