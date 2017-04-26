
package com.gmail.a2vplugin.api.testexecutions.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soatestOptions", propOrder = { "centrasite", "dataGroupConfig", "dataSource", "environment",
        "environmentConfig", "router", "testManager", "testNames" })
public class SoatestOptions {

    protected Boolean centrasite;
    protected DataGroupConfig dataGroupConfig;
    protected DataSource dataSource;
    protected String environment;
    protected EnvironmentConfig environmentConfig;
    protected Router router;
    protected TestManager testManager;
    protected SoatestOptions.TestNames testNames;

    public Boolean isCentrasite() {
        return centrasite;
    }

    public void setCentrasite(Boolean value) {
        this.centrasite = value;
    }

    public DataGroupConfig getDataGroupConfig() {
        return dataGroupConfig;
    }

    public void setDataGroupConfig(DataGroupConfig value) {
        this.dataGroupConfig = value;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource value) {
        this.dataSource = value;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String value) {
        this.environment = value;
    }

    public EnvironmentConfig getEnvironmentConfig() {
        return environmentConfig;
    }

    public void setEnvironmentConfig(EnvironmentConfig value) {
        this.environmentConfig = value;
    }

    public Router getRouter() {
        return router;
    }

    public void setRouter(Router value) {
        this.router = value;
    }

    public TestManager getTestManager() {
        return testManager;
    }

    public void setTestManager(TestManager value) {
        this.testManager = value;
    }

    public SoatestOptions.TestNames getTestNames() {
        return testNames;
    }

    public void setTestNames(SoatestOptions.TestNames value) {
        this.testNames = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "testName" })
    public static class TestNames {

        protected List<TestName> testName;

        public List<TestName> getTestName() {
            if (testName == null) {
                testName = new ArrayList<TestName>();
            }
            return this.testName;
        }

    }

}
