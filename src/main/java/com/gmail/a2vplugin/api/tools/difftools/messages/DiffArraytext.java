
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diffArraytext", propOrder = { "property" })
public class DiffArraytext {

    protected String property;

    public String getProperty() {
        return property;
    }

    public void setProperty(String value) {
        this.property = value;
    }

}
