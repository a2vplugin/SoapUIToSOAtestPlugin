
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticationSettings", propOrder = { "authenticationType", "useGlobal" })
public class AuthenticationSettings {

    protected AuthenticationType authenticationType;
    protected Boolean useGlobal;

    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(AuthenticationType value) {
        this.authenticationType = value;
    }

    public Boolean isUseGlobal() {
        return useGlobal;
    }

    public void setUseGlobal(Boolean value) {
        this.useGlobal = value;
    }

}
