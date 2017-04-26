
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diffMode", propOrder = { "binary", "text", "xml", "json" })
public class DiffMode {

    protected Binary binary;
    protected Text text;
    protected Xml xml;
    protected Json json;

    public Binary getBinary() {
        return binary;
    }

    public void setBinary(Binary value) {
        this.binary = value;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text value) {
        this.text = value;
    }

    public Xml getXml() {
        return xml;
    }

    public void setXml(Xml value) {
        this.xml = value;
    }

    public Json getJson() {
        return json;
    }

    public void setJson(Json value) {
        this.json = value;
    }

}
