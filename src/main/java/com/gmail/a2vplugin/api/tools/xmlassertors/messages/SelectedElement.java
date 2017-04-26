
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectedElement", propOrder = { "xpath" })
public class SelectedElement {

    protected String xpath;

    public String getXpath() {
        return xpath;
    }

    public void setXpath(String value) {
        this.xpath = value;
    }

}
