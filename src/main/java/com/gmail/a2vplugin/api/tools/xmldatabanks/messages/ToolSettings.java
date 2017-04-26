
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toolSettings", propOrder = { "expectedXml", "selectedElements", "options" })
public class ToolSettings {

    protected String expectedXml;
    @XmlElement(required = true)
    protected List<SelectedXpath> selectedElements;
    protected Options options;

    public String getExpectedXml() {
        return expectedXml;
    }

    public void setExpectedXml(String value) {
        this.expectedXml = value;
    }

    public List<SelectedXpath> getSelectedElements() {
        return selectedElements;
    }

    public void setSelectedElements(List<SelectedXpath> value) {
        this.selectedElements = value;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options value) {
        this.options = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "selectedXpath" })
    public static class SelectedElements {

        protected List<SelectedXpath> selectedXpath;

        public List<SelectedXpath> getSelectedXpath() {
            if (selectedXpath == null) {
                selectedXpath = new ArrayList<SelectedXpath>();
            }
            return this.selectedXpath;
        }

    }

}
