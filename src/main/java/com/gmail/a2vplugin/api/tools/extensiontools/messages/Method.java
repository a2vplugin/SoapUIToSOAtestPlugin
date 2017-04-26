
package com.gmail.a2vplugin.api.tools.extensiontools.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "method", propOrder = { "arguments", "name" })
public class Method {

    protected Method.Arguments arguments;
    @XmlElement(required = true)
    protected String name;

    public Method.Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Method.Arguments value) {
        this.arguments = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "argument" })
    public static class Arguments {

        protected List<String> argument;

        public List<String> getArgument() {
            if (argument == null) {
                argument = new ArrayList<String>();
            }
            return this.argument;
        }

    }

}
