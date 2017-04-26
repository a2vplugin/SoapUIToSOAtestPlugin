
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "httpAuthentication", propOrder = { "performAuthentication" })
public class HttpAuthentication {

    protected PerformAuthentication performAuthentication;

    public PerformAuthentication getPerformAuthentication() {
        return performAuthentication;
    }

    public void setPerformAuthentication(PerformAuthentication value) {
        this.performAuthentication = value;
    }

}
