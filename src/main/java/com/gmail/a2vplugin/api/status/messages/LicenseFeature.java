
package com.gmail.a2vplugin.api.status.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "licenseFeature", propOrder = { "name", "active" })
public class LicenseFeature {

    protected String name;
    protected Boolean active;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean value) {
        this.active = value;
    }

}
