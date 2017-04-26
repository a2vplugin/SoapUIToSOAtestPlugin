
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payload", propOrder = { "contentType", "input", "inputMode" })
public class Payload {

    protected String contentType;
    protected Input input;
    @XmlElement(required = true, defaultValue = "literal")
    @XmlSchemaType(name = "string")
    protected InputMode inputMode;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String value) {
        this.contentType = value;
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input value) {
        this.input = value;
    }

    public InputMode getInputMode() {
        return inputMode;
    }

    public void setInputMode(InputMode value) {
        this.inputMode = value;
    }

}
