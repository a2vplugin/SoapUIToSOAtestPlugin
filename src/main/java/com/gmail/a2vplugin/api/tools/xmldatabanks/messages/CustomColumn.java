
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customColumn", propOrder = { "customColumnName" })
public class CustomColumn {

    @XmlElement(required = true)
    protected String customColumnName;

    public String getCustomColumnName() {
        return customColumnName;
    }

    public void setCustomColumnName(String value) {
        this.customColumnName = value;
    }

}
