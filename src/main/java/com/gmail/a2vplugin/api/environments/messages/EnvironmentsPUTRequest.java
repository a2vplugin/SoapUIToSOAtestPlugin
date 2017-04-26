
package com.gmail.a2vplugin.api.environments.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentsPUTRequest", propOrder = { "local", "reference" })
public class EnvironmentsPUTRequest {

    protected Environment local;
    protected ReferenceEnvironmentRequest reference;

    public Environment getLocal() {
        return local;
    }

    public void setLocal(Environment value) {
        this.local = value;
    }

    public ReferenceEnvironmentRequest getReference() {
        return reference;
    }

    public void setReference(ReferenceEnvironmentRequest value) {
        this.reference = value;
    }

}
