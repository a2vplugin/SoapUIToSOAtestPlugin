
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toolSettings", propOrder = { "assertion", "expectedXml" })
public class ToolSettings {

    protected List<Assertion> assertion;
    protected ExpectedXml expectedXml;

    public List<Assertion> getAssertion() {
        return assertion;
    }

    public void setAssertion(List<Assertion> value) {
        this.assertion = value;
    }

    public ExpectedXml getExpectedXml() {
        return expectedXml;
    }

    public void setExpectedXml(ExpectedXml value) {
        this.expectedXml = value;
    }

}
