
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectedElementOptions", propOrder = { "contentOnly", "entireElement" })
public class SelectedElementOptions {

    @XmlSchemaType(name = "string")
    protected ContentOnly contentOnly;
    protected EntireElement entireElement;

    public ContentOnly getContentOnly() {
        return contentOnly;
    }

    public void setContentOnly(ContentOnly value) {
        this.contentOnly = value;
    }

    public EntireElement getEntireElement() {
        return entireElement;
    }

    public void setEntireElement(EntireElement value) {
        this.entireElement = value;
    }

}
