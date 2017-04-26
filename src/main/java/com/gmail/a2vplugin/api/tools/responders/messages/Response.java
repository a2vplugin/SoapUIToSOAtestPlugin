
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.LiteralXml;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = { "literal" })
public class Response {

    protected LiteralXml literal;

    public LiteralXml getLiteral() {
        return literal;
    }

    public void setLiteral(LiteralXml value) {
        this.literal = value;
    }

}
