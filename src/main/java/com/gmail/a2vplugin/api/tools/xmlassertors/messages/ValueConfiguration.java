
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueConfiguration", propOrder = { "expectedValue" })
public class ValueConfiguration {

    protected ComplexValueFP expectedValue;

    public ComplexValueFP getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(ComplexValueFP value) {
        this.expectedValue = value;
    }

}
