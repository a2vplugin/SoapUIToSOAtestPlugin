
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dbToolsRequest", propOrder = { "parent", "name", "dataSource", "toolSettings" })
public class DbToolsRequest {

    @XmlElement(required = true)
    protected Parent parent;
    protected String name;
    protected String dataSource;
    protected ToolSettings toolSettings;

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent value) {
        this.parent = value;
    }

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
