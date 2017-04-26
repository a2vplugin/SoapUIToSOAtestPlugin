
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fixedElement", propOrder = { "fixed" })
public class FixedElement {

    protected String fixed;

    public String getFixed() {
        return fixed;
    }

    public void setFixed(String value) {
        this.fixed = value;
    }

}
