
package com.gmail.a2vplugin.api.children.messages;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Child;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childrenQueryResponse", propOrder = { "children" })
public class ChildrenQueryResponse {

    protected List<Child> children;

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> value) {
        this.children = value;
    }
}
