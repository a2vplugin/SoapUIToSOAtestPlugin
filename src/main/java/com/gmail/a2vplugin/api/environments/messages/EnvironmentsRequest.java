
package com.gmail.a2vplugin.api.environments.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentsRequest", propOrder = { "local", "reference", "parent" })
public class EnvironmentsRequest {

    protected Environment local;
    protected ReferenceEnvironmentRequest reference;
    @XmlElement(required = true)
    protected Parent parent;

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

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent value) {
        this.parent = value;
    }

}
