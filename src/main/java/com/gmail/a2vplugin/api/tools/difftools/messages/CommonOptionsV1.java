
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonOptionsV1", propOrder = { "delete", "insert", "modify" })
@XmlSeeAlso({ AttributeOptions.class, TextContentOptions.class })
public class CommonOptionsV1 {

    protected boolean delete;
    protected boolean insert;
    protected boolean modify;

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

    public boolean isModify() {
        return modify;
    }

    public void setModify(boolean value) {
        this.modify = value;
    }

}
