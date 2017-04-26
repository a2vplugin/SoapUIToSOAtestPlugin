
package com.gmail.a2vplugin.api.testexecutions.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _TestExecutionsRequest_QNAME = new QName(
            "http://www.parasoft.com/api/testExecutions/messages", "testExecutionsRequest");
    private final static QName _TestExecutionsResponse_QNAME = new QName(
            "http://www.parasoft.com/api/testExecutions/messages", "testExecutionsResponse");
    private final static QName _TestExecutionsStatusResponse_QNAME = new QName(
            "http://www.parasoft.com/api/testExecutions/messages", "testExecutionsStatusResponse");

    public ObjectFactory() {
    }

    public Environment createEnvironment() {
        return new Environment();
    }

    public EnvironmentConfig createEnvironmentConfig() {
        return new EnvironmentConfig();
    }

    public DataGroupTest createDataGroupTest() {
        return new DataGroupTest();
    }

    public DataGroupConfig createDataGroupConfig() {
        return new DataGroupConfig();
    }

    public SoatestOptions createSoatestOptions() {
        return new SoatestOptions();
    }

    public Workspace createWorkspace() {
        return new Workspace();
    }

    public TestExecutionsRequest createTestExecutionsRequest() {
        return new TestExecutionsRequest();
    }

    public TestExecutionsResponse createTestExecutionsResponse() {
        return new TestExecutionsResponse();
    }

    public TestExecutionsStatusResponse createTestExecutionsStatusResponse() {
        return new TestExecutionsStatusResponse();
    }

    public General createGeneral() {
        return new General();
    }

    public ScopeOptions createScopeOptions() {
        return new ScopeOptions();
    }

    public DataGroup createDataGroup() {
        return new DataGroup();
    }

    public DataSource createDataSource() {
        return new DataSource();
    }

    public EnvironmentTest createEnvironmentTest() {
        return new EnvironmentTest();
    }

    public Router createRouter() {
        return new Router();
    }

    public TestManager createTestManager() {
        return new TestManager();
    }

    public TestName createTestName() {
        return new TestName();
    }

    public Environment.Variables createEnvironmentVariables() {
        return new Environment.Variables();
    }

    public EnvironmentConfig.EnvironmentTests createEnvironmentConfigEnvironmentTests() {
        return new EnvironmentConfig.EnvironmentTests();
    }

    public DataGroupTest.DataGroups createDataGroupTestDataGroups() {
        return new DataGroupTest.DataGroups();
    }

    public DataGroupConfig.DataGroupTests createDataGroupConfigDataGroupTests() {
        return new DataGroupConfig.DataGroupTests();
    }

    public SoatestOptions.TestNames createSoatestOptionsTestNames() {
        return new SoatestOptions.TestNames();
    }

    public Workspace.Excludes createWorkspaceExcludes() {
        return new Workspace.Excludes();
    }

    public Workspace.Includes createWorkspaceIncludes() {
        return new Workspace.Includes();
    }

    public Workspace.Resources createWorkspaceResources() {
        return new Workspace.Resources();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/testExecutions/messages", name = "testExecutionsRequest")
    public JAXBElement<TestExecutionsRequest> createTestExecutionsRequest(TestExecutionsRequest value) {
        return new JAXBElement<TestExecutionsRequest>(_TestExecutionsRequest_QNAME, TestExecutionsRequest.class, null,
                value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/testExecutions/messages", name = "testExecutionsResponse")
    public JAXBElement<TestExecutionsResponse> createTestExecutionsResponse(TestExecutionsResponse value) {
        return new JAXBElement<TestExecutionsResponse>(_TestExecutionsResponse_QNAME, TestExecutionsResponse.class,
                null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/testExecutions/messages", name = "testExecutionsStatusResponse")
    public JAXBElement<TestExecutionsStatusResponse> createTestExecutionsStatusResponse(
            TestExecutionsStatusResponse value) {
        return new JAXBElement<TestExecutionsStatusResponse>(_TestExecutionsStatusResponse_QNAME,
                TestExecutionsStatusResponse.class, null, value);
    }

}
