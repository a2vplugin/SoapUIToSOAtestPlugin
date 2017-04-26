
package com.gmail.a2vplugin.api.testexecutions.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentConfig", propOrder = { "environmentTests" })
public class EnvironmentConfig {

    @XmlElement(required = true)
    protected EnvironmentConfig.EnvironmentTests environmentTests;

    public EnvironmentConfig.EnvironmentTests getEnvironmentTests() {
        return environmentTests;
    }

    public void setEnvironmentTests(EnvironmentConfig.EnvironmentTests value) {
        this.environmentTests = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "environmentTest" })
    public static class EnvironmentTests {

        @XmlElement(required = true)
        protected List<EnvironmentTest> environmentTest;

        public List<EnvironmentTest> getEnvironmentTest() {
            if (environmentTest == null) {
                environmentTest = new ArrayList<EnvironmentTest>();
            }
            return this.environmentTest;
        }

    }

}
