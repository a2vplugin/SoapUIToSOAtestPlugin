
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentsTypeData", propOrder = { "active", "referencedEnvironment" })
public class EnvironmentsTypeData {

    protected Boolean active;
    protected ReferencedEnvironment referencedEnvironment;

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean value) {
        this.active = value;
    }

    public ReferencedEnvironment getReferencedEnvironment() {
        return referencedEnvironment;
    }

    public void setReferencedEnvironment(ReferencedEnvironment value) {
        this.referencedEnvironment = value;
    }

}
