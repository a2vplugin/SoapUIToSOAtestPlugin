
package com.gmail.a2vplugin.api.tools.writefiletools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.LiteralMime;
import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "writefiletoolsRequest", propOrder = { "input", "name", "parent", "toolSettings" })
public class WritefiletoolsRequest {

    protected LiteralMime input;
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;
    protected ToolSettings toolSettings;

    public LiteralMime getInput() {
        return input;
    }

    public void setInput(LiteralMime value) {
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
