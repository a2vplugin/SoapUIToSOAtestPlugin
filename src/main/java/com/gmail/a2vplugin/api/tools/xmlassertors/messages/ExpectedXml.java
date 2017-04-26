
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expectedXml", propOrder = { "literal", "saveExpectedXml" })
public class ExpectedXml {

    protected String literal;
    protected boolean saveExpectedXml;

    public String getLiteral() {
        return literal;
    }

    public void setLiteral(String value) {
        this.literal = value;
    }

    public boolean isSaveExpectedXml() {
        return saveExpectedXml;
    }

    public void setSaveExpectedXml(boolean value) {
        this.saveExpectedXml = value;
    }

}
