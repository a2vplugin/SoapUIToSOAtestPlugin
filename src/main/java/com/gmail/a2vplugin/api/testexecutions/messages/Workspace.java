
package com.gmail.a2vplugin.api.testexecutions.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workspace", propOrder = { "excludes", "includes", "resources" })
public class Workspace {

    protected Workspace.Excludes excludes;
    protected Workspace.Includes includes;
    protected Workspace.Resources resources;

    public Workspace.Excludes getExcludes() {
        return excludes;
    }

    public void setExcludes(Workspace.Excludes value) {
        this.excludes = value;
    }

    public Workspace.Includes getIncludes() {
        return includes;
    }

    public void setIncludes(Workspace.Includes value) {
        this.includes = value;
    }

    public Workspace.Resources getResources() {
        return resources;
    }

    public void setResources(Workspace.Resources value) {
        this.resources = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "exclude" })
    public static class Excludes {

        protected List<String> exclude;

        public List<String> getExclude() {
            if (exclude == null) {
                exclude = new ArrayList<String>();
            }
            return this.exclude;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "include" })
    public static class Includes {

        protected List<String> include;

        public List<String> getInclude() {
            if (include == null) {
                include = new ArrayList<String>();
            }
            return this.include;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "resource" })
    public static class Resources {

        protected List<String> resource;

        public List<String> getResource() {
            if (resource == null) {
                resource = new ArrayList<String>();
            }
            return this.resource;
        }

    }

}
