
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sqlServer2005", propOrder = { "settings" })
public class SqlServer2005 {

    protected GenericSettings settings;

    public GenericSettings getSettings() {
        return settings;
    }

    public void setSettings(GenericSettings value) {
        this.settings = value;
    }

}
