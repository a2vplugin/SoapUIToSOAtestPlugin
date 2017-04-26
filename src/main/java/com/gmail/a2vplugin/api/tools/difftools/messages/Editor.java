
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editor", propOrder = { "text" })
public class Editor {

    protected String text;

    public String getText() {
        return text;
    }

    public void setText(String value) {
        this.text = value;
    }

}
