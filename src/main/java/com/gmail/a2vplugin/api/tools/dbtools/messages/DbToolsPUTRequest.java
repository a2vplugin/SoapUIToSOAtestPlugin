
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dbToolsPUTRequest", propOrder = { "name", "dataSource", "toolSettings" })
public class DbToolsPUTRequest {

    protected String name;
    protected String dataSource;
    protected ToolSettings toolSettings;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String value) {
        this.dataSource = value;
    }

    public ToolSettings getToolSettings() {
        return toolSettings;
    }

    public void setToolSettings(ToolSettings value) {
        this.toolSettings = value;
    }

}
