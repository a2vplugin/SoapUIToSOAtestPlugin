
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attribute", propOrder = { "attributeOptions", "enabled" })
public class Attribute {

    protected AttributeOptions attributeOptions;
    protected boolean enabled;

    public AttributeOptions getAttributeOptions() {
        return attributeOptions;
    }

    public void setAttributeOptions(AttributeOptions value) {
        this.attributeOptions = value;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean value) {
        this.enabled = value;
    }

}
