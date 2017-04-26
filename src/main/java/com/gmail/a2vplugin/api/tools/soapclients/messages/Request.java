
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.LiteralXml;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = { "inputMode", "literal" })
public class Request {

    @XmlElement(required = true, defaultValue = "literal")
    @XmlSchemaType(name = "string")
    protected InputMode inputMode;
    protected LiteralXml literal;

    public InputMode getInputMode() {
        return inputMode;
    }

    public void setInputMode(InputMode value) {
        this.inputMode = value;
    }

    public LiteralXml getLiteral() {
        return literal;
    }

    public void setLiteral(LiteralXml value) {
        this.literal = value;
    }

}
