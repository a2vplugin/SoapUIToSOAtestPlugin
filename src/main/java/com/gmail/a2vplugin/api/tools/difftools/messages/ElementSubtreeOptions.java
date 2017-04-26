
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elementSubtreeOptions", propOrder = { "delete", "insert" })
public class ElementSubtreeOptions {

    protected boolean delete;
    protected boolean insert;

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean value) {
        this.delete = value;
    }

    public boolean isInsert() {
        return insert;
    }

    public void setInsert(boolean value) {
        this.insert = value;
    }

}
