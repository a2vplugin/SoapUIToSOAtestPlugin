
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileLocation", propOrder = { "id", "external" })
public class FileLocation {

    protected String id;
    protected String external;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getExternal() {
        return external;
    }

    public void setExternal(String value) {
        this.external = value;
    }

}
