
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlMessage", propOrder = { "enabled", "xpath" })
public class XmlMessage {

    protected boolean enabled;
    protected String xpath;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    public String getXpath() {
        return xpath;
    }

    public void setXpath(String value) {
        this.xpath = value;
    }

}
