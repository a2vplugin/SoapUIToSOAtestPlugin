
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diffArrayjson", propOrder = { "insert", "modify", "property", "remove" })
public class DiffArrayjson {

    protected boolean insert;
    protected boolean modify;
    protected String property;
    protected boolean remove;

    public boolean isInsert() {
        return insert;
    }

    public void setInsert(boolean value) {
        this.insert = value;
    }

    public boolean isModify() {
        return modify;
    }

    public void setModify(boolean value) {
        this.modify = value;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String value) {
        this.property = value;
    }

    public boolean isRemove() {
        return remove;
    }

    public void setRemove(boolean value) {
        this.remove = value;
    }

}
