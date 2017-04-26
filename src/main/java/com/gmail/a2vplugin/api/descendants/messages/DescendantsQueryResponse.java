
package com.gmail.a2vplugin.api.descendants.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "descendantsQueryResponse", propOrder = { "children" })
public class DescendantsQueryResponse {

    protected DescendantsQueryResponse.Children children;

    public DescendantsQueryResponse.Children getChildren() {
        return children;
    }

    public void setChildren(DescendantsQueryResponse.Children value) {
        this.children = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "child" })
    public static class Children {

        protected List<Child> child;

        public List<Child> getChild() {
            if (child == null) {
                child = new ArrayList<Child>();
            }
            return this.child;
        }

    }

}
