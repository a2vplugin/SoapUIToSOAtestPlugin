
package com.gmail.a2vplugin.api.descendants.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.TypeData;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "child", propOrder = { "id", "name", "url", "type", "referenced", "typeData", "children" })
public class Child {

    protected String id;
    protected String name;
    protected String url;
    protected String type;
    protected Boolean referenced;
    protected TypeData typeData;
    protected Child.Children children;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public Boolean isReferenced() {
        return referenced;
    }

    public void setReferenced(Boolean value) {
        this.referenced = value;
    }

    public TypeData getTypeData() {
        return typeData;
    }

    public void setTypeData(TypeData value) {
        this.typeData = value;
    }

    public Child.Children getChildren() {
        return children;
    }

    public void setChildren(Child.Children value) {
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
