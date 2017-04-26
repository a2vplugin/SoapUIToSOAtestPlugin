
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "literalMime", propOrder = { "text" })
public class LiteralMime {

    @XmlElement(required = true)
    protected TextMime text;

    public TextMime getText() {
        return text;
    }

    public void setText(TextMime value) {
        this.text = value;
    }

}
