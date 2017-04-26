
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odbc", propOrder = { "settings" })
public class Odbc {

    protected OdbcSettings settings;

    public OdbcSettings getSettings() {
        return settings;
    }

    public void setSettings(OdbcSettings value) {
        this.settings = value;
    }

}
