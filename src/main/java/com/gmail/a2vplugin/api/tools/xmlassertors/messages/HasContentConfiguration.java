
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hasContentConfiguration", propOrder = { "hasContent" })
public class HasContentConfiguration {

    protected ComplexValueFP hasContent;

    public ComplexValueFP getHasContent() {
        return hasContent;
    }

    public void setHasContent(ComplexValueFP value) {
        this.hasContent = value;
    }

}
