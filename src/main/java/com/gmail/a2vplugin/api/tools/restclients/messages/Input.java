
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Literal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "input", propOrder = { "literal" })
public class Input {

    protected Literal literal;

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal value) {
        this.literal = value;
    }

}
