
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "performAuthentication", propOrder = { "enabled", "value" })
public class PerformAuthentication {

    protected boolean enabled;
    protected AuthenticationSettings value;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    public AuthenticationSettings getValue() {
        return value;
    }

    public void setValue(AuthenticationSettings value) {
        this.value = value;
    }

}
