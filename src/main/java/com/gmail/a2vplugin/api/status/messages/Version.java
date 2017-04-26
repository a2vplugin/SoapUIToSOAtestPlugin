
package com.gmail.a2vplugin.api.status.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "version", propOrder = { "major", "minor", "subminor", "build" })
public class Version {

    @XmlElement(required = true)
    protected String major;
    @XmlElement(required = true)
    protected String minor;
    @XmlElement(required = true)
    protected String subminor;
    @XmlElement(required = true)
    protected String build;

    public String getMajor() {
        return major;
    }

    public void setMajor(String value) {
        this.major = value;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String value) {
        this.minor = value;
    }

    public String getSubminor() {
        return subminor;
    }

    public void setSubminor(String value) {
        this.subminor = value;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String value) {
        this.build = value;
    }

}
