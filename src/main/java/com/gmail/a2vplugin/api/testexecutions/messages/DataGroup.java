
package com.gmail.a2vplugin.api.testexecutions.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataGroup", propOrder = { "activeDataSource", "name" })
public class DataGroup {

    @XmlElement(required = true)
    protected String activeDataSource;
    @XmlElement(required = true)
    protected String name;

    public String getActiveDataSource() {
        return activeDataSource;
    }

    public void setActiveDataSource(String value) {
        this.activeDataSource = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
