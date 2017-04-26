
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlOptions", propOrder = { "outputResultsAsXML", "soapMode" })
public class XmlOptions {

    protected boolean outputResultsAsXML;
    @XmlElement(name = "SOAPMode")
    protected boolean soapMode;

    public boolean isOutputResultsAsXML() {
        return outputResultsAsXML;
    }

    public void setOutputResultsAsXML(boolean value) {
        this.outputResultsAsXML = value;
    }

    public boolean isSOAPMode() {
        return soapMode;
    }

    public void setSOAPMode(boolean value) {
        this.soapMode = value;
    }

}
