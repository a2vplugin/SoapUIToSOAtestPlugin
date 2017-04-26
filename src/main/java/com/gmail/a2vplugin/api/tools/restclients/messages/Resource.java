
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FixedElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource", propOrder = { "type", "literalText" })
public class Resource {

    @XmlElement(required = true, defaultValue = "literalText")
    @XmlSchemaType(name = "string")
    protected ResourceType type;
    protected FixedElement literalText;

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType value) {
        this.type = value;
    }

    public FixedElement getLiteralText() {
        return literalText;
    }

    public void setLiteralText(FixedElement value) {
        this.literalText = value;
    }

}
