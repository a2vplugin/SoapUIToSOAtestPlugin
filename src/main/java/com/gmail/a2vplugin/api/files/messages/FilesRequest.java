
package com.gmail.a2vplugin.api.files.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filesRequest", propOrder = { "name", "parent", "type" })
public class FilesRequest {

    @XmlElement(required = true)
    protected String name;
    protected Parent parent;
    @XmlElement(required = true, defaultValue = "directory")
    @XmlSchemaType(name = "string")
    protected FileType type;

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

    public FileType getType() {
        return type;
    }

    public void setType(FileType value) {
        this.type = value;
    }

}
