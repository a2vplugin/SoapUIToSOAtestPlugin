
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueAssertion", propOrder = { "configuration", "name", "options", "selectedElement" })
public class ValueAssertion {

    protected ValueConfiguration configuration;
    protected String name;
    protected Options options;
    protected SelectedElement selectedElement;

    public ValueConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ValueConfiguration value) {
        this.configuration = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options value) {
        this.options = value;
    }

    public SelectedElement getSelectedElement() {
        return selectedElement;
    }

    public void setSelectedElement(SelectedElement value) {
        this.selectedElement = value;
    }

}
