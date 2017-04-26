
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "occurrenceConfiguration", propOrder = { "expectedValue", "operator" })
public class OccurrenceConfiguration {

    protected ComplexValueFP expectedValue;
    protected String operator;

    public ComplexValueFP getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(ComplexValueFP value) {
        this.expectedValue = value;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String value) {
        this.operator = value;
    }

}
