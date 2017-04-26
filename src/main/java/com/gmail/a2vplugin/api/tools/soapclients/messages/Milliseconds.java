
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "milliseconds", propOrder = { "mode", "value" })
public class Milliseconds {

    @XmlSchemaType(name = "string")
    protected Mode mode;
    protected Long value;

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode value) {
        this.mode = value;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

}
