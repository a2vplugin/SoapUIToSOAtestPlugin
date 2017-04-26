
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oracle", propOrder = { "settings" })
public class Oracle {

    protected OracleSettings settings;

    public OracleSettings getSettings() {
        return settings;
    }

    public void setSettings(OracleSettings value) {
        this.settings = value;
    }

}
