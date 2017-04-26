
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectedElement", propOrder = { "options", "xpath" })
public class SelectedElement {

    protected SelectedElementOptions options;
    @XmlElement(required = true)
    protected String xpath;

    public SelectedElementOptions getOptions() {
        return options;
    }

    public void setOptions(SelectedElementOptions value) {
        this.options = value;
    }

    public String getXpath() {
        return xpath;
    }

    public void setXpath(String value) {
        this.xpath = value;
    }

}
