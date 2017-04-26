
package com.gmail.a2vplugin.api.files.tsts.messages.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceExistingEnvironment", propOrder = { "file" })
public class ReferenceExistingEnvironment {

    @XmlElement(required = true)
    protected FileLocation file;

    public FileLocation getFile() {
        return file;
    }

    public void setFile(FileLocation value) {
        this.file = value;
    }

}
