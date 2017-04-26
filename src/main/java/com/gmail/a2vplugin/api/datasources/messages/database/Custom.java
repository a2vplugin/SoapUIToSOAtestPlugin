
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custom", propOrder = { "settings" })
public class Custom {

    protected CustomSettings settings;

    public CustomSettings getSettings() {
        return settings;
    }

    public void setSettings(CustomSettings value) {
        this.settings = value;
    }

}
