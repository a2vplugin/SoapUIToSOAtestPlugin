
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assertion", propOrder = { "valueAssertion", "valueOccurrenceAssertion", "occurrenceAssertion",
        "hasContentAssertion" })
public class Assertion {

    protected ValueAssertion valueAssertion;
    protected ValueOccurrenceAssertion valueOccurrenceAssertion;
    protected OccurrenceAssertion occurrenceAssertion;
    protected HasContentAssertion hasContentAssertion;

    public ValueAssertion getValueAssertion() {
        return valueAssertion;
    }

    public void setValueAssertion(ValueAssertion value) {
        this.valueAssertion = value;
    }

    public ValueOccurrenceAssertion getValueOccurrenceAssertion() {
        return valueOccurrenceAssertion;
    }

    public void setValueOccurrenceAssertion(ValueOccurrenceAssertion value) {
        this.valueOccurrenceAssertion = value;
    }

    public OccurrenceAssertion getOccurrenceAssertion() {
        return occurrenceAssertion;
    }

    public void setOccurrenceAssertion(OccurrenceAssertion value) {
        this.occurrenceAssertion = value;
    }

    public HasContentAssertion getHasContentAssertion() {
        return hasContentAssertion;
    }

    public void setHasContentAssertion(HasContentAssertion value) {
        this.hasContentAssertion = value;
    }

}
