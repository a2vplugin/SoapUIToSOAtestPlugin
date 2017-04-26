
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "literal", propOrder = { "text" })
public class Literal {

    protected String text;

    public String getText() {
        return text;
    }

    public void setText(String value) {
        this.text = value;
    }

}
