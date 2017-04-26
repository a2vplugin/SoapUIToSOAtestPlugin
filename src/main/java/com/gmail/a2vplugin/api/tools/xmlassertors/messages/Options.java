
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "options", propOrder = { "trimContent" })
public class Options {

    protected Boolean trimContent;

    public Boolean isTrimContent() {
        return trimContent;
    }

    public void setTrimContent(Boolean value) {
        this.trimContent = value;
    }

}
