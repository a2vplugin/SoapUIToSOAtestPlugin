
package com.gmail.a2vplugin.api.tools.extensiontools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "value", propOrder = { "text", "clazz", "file" })
public class Value {

    protected String text;
    @XmlElement(name = "class")
    protected String clazz;
    protected File file;

    public String getText() {
        return text;
    }

    public void setText(String value) {
        this.text = value;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String value) {
        this.clazz = value;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File value) {
        this.file = value;
    }

}
