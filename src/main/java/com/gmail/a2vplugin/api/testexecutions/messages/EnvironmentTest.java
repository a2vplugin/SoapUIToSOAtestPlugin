
package com.gmail.a2vplugin.api.testexecutions.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentTest", propOrder = { "environment", "workspacePath" })
public class EnvironmentTest {

    @XmlElement(required = true)
    protected Environment environment;
    @XmlElement(required = true)
    protected String workspacePath;

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment value) {
        this.environment = value;
    }

    public String getWorkspacePath() {
        return workspacePath;
    }

    public void setWorkspacePath(String value) {
        this.workspacePath = value;
    }

}
