
package com.gmail.a2vplugin.api.testexecutions.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "general", propOrder = { "config", "nobuild", "publish", "report", "showdetails" })
public class General {

    @XmlElement(required = true)
    protected String config;
    protected Boolean nobuild;
    protected Boolean publish;
    protected String report;
    protected Boolean showdetails;

    public String getConfig() {
        return config;
    }

    public void setConfig(String value) {
        this.config = value;
    }

    public Boolean isNobuild() {
        return nobuild;
    }

    public void setNobuild(Boolean value) {
        this.nobuild = value;
    }

    public Boolean isPublish() {
        return publish;
    }

    public void setPublish(Boolean value) {
        this.publish = value;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String value) {
        this.report = value;
    }

    public Boolean isShowdetails() {
        return showdetails;
    }

    public void setShowdetails(Boolean value) {
        this.showdetails = value;
    }

}
