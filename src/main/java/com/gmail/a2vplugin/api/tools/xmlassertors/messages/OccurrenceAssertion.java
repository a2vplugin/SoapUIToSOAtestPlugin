
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "occurrenceAssertion", propOrder = { "configuration", "name", "selectedElement" })
public class OccurrenceAssertion {

    protected OccurrenceConfiguration configuration;
    protected String name;
    protected SelectedElement selectedElement;

    public OccurrenceConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(OccurrenceConfiguration value) {
        this.configuration = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public SelectedElement getSelectedElement() {
        return selectedElement;
    }

    public void setSelectedElement(SelectedElement value) {
        this.selectedElement = value;
    }

}
