
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "db2", propOrder = { "settings" })
public class Db2 {

    protected Db2Settings settings;

    public Db2Settings getSettings() {
        return settings;
    }

    public void setSettings(Db2Settings value) {
        this.settings = value;
    }

}
