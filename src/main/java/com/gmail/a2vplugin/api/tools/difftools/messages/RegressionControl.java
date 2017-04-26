
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regressionControl", propOrder = { "editor" })
public class RegressionControl {

    protected Editor editor;

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor value) {
        this.editor = value;
    }

}
