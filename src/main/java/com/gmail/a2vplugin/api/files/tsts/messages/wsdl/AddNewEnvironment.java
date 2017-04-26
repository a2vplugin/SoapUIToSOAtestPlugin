
package com.gmail.a2vplugin.api.files.tsts.messages.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addNewEnvironment", propOrder = { "name", "prefix" })
public class AddNewEnvironment {

    @XmlElement(required = true)
    protected String name;
    protected String prefix;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String value) {
        this.prefix = value;
    }

}
