
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputFileSettings", propOrder = { "location" })
public class InputFileSettings {

    @XmlElement(required = true)
    protected FileLocation location;

    public FileLocation getLocation() {
        return location;
    }

    public void setLocation(FileLocation value) {
        this.location = value;
    }

}
