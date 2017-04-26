
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suiteVariable", propOrder = { "variable" })
public class SuiteVariable {

    @XmlElement(required = true)
    protected String variable;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String value) {
        this.variable = value;
    }

}
