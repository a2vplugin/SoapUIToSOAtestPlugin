
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "literalXml", propOrder = { "mimeType", "text", "type" })
public class LiteralXml {

    protected String mimeType;
    protected String text;
    @XmlElement(required = true, defaultValue = "text")
    @XmlSchemaType(name = "string")
    protected LiteralType type;

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String value) {
        this.mimeType = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String value) {
        this.text = value;
    }

    public LiteralType getType() {
        return type;
    }

    public void setType(LiteralType value) {
        this.type = value;
    }

}
