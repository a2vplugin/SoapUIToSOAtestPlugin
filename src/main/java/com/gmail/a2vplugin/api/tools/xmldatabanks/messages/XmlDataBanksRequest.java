
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Literal;
import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlDataBanksRequest", propOrder = { "dataSource", "input", "name", "parent", "toolSettings" })
public class XmlDataBanksRequest {

    protected String dataSource;
    protected Literal input;
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;
    protected ToolSettings toolSettings;

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String value) {
        this.dataSource = value;
    }

    public Literal getInput() {
        return input;
    }

    public void setInput(Literal value) {
        this.input = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent value) {
        this.parent = value;
    }

    public ToolSettings getToolSettings() {
        return toolSettings;
    }

    public void setToolSettings(ToolSettings value) {
        this.toolSettings = value;
    }

}
