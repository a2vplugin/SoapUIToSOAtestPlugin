
package com.gmail.a2vplugin.api.testexecutions.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testManager", propOrder = { "verbose" })
public class TestManager {

    protected Boolean verbose;

    public Boolean isVerbose() {
        return verbose;
    }

    public void setVerbose(Boolean value) {
        this.verbose = value;
    }

}
