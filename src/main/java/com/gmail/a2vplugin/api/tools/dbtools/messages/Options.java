
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "options", propOrder = { "runtimeSettings", "xmlOutput" })
public class Options {

    protected RuntimeSettings runtimeSettings;
    protected XmlOutput xmlOutput;

    public RuntimeSettings getRuntimeSettings() {
        return runtimeSettings;
    }

    public void setRuntimeSettings(RuntimeSettings value) {
        this.runtimeSettings = value;
    }

    public XmlOutput getXmlOutput() {
        return xmlOutput;
    }

    public void setXmlOutput(XmlOutput value) {
        this.xmlOutput = value;
    }

}
