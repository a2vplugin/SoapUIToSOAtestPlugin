
package com.gmail.a2vplugin.api.status.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testSettings", propOrder = { "version" })
public class TestSettings {

    @XmlElement(required = true)
    protected Version version;

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version value) {
        this.version = value;
    }

}
