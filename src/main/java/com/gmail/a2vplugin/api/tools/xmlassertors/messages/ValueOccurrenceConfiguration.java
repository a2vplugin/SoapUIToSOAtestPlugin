
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueOccurrenceConfiguration", propOrder = { "elementValue", "expectedValue", "operator" })
public class ValueOccurrenceConfiguration {

    protected ComplexValueFP elementValue;
    protected ComplexValueFP expectedValue;
    protected String operator;

    public ComplexValueFP getElementValue() {
        return elementValue;
    }

    public void setElementValue(ComplexValueFP value) {
        this.elementValue = value;
    }

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
