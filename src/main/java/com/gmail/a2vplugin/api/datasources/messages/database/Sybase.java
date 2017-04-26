
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sybase", propOrder = { "settings" })
public class Sybase {

    protected GenericSettings settings;

    public GenericSettings getSettings() {
        return settings;
    }

    public void setSettings(GenericSettings value) {
        this.settings = value;
    }

}
