
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputFile", propOrder = { "settings" })
public class InputFile {

    protected InputFileSettings settings;

    public InputFileSettings getSettings() {
        return settings;
    }

    public void setSettings(InputFileSettings value) {
        this.settings = value;
    }

}
