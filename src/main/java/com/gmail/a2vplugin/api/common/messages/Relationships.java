
package com.gmail.a2vplugin.api.common.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationships", propOrder = { "parentRel", "childrenRel" })
public class Relationships {

    @XmlElement(required = true)
    protected Entity parentRel;
    protected List<Child> childrenRel;

    public Entity getParentRel() {
        return parentRel;
    }

    public void setParentRel(Entity value) {
        this.parentRel = value;
    }

    public List<Child> getChildrenRel() {
        return childrenRel;
    }

    public void setChildrenRel(List<Child> value) {
        this.childrenRel = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "child" })
    public static class ChildrenRel {

        protected List<Child> child;

        public List<Child> getChild() {
            if (child == null) {
                child = new ArrayList<Child>();
            }
            return this.child;
        }

    }

}
