
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toolSettings", propOrder = { "diffMode" })
public class ToolSettings {

    protected DiffMode diffMode;

    public DiffMode getDiffMode() {
        return diffMode;
    }

    public void setDiffMode(DiffMode value) {
        this.diffMode = value;
    }

}
