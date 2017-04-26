
package com.gmail.a2vplugin.api.suites.tests.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _TestSuitesPUTRequest_QNAME = new QName(
            "http://www.parasoft.com/api/suites/tests/messages", "testSuitesPUTRequest");
    private final static QName _TestSuitesRequest_QNAME = new QName("http://www.parasoft.com/api/suites/tests/messages",
            "testSuitesRequest");
    private final static QName _TestSuitesResponse_QNAME = new QName(
            "http://www.parasoft.com/api/suites/tests/messages", "testSuitesResponse");

    public ObjectFactory() {
    }

    public TestSuitesPUTRequest createTestSuitesPUTRequest() {
        return new TestSuitesPUTRequest();
    }

    public TestSuitesRequest createTestSuitesRequest() {
        return new TestSuitesRequest();
    }

    public TestSuitesResponse createTestSuitesResponse() {
        return new TestSuitesResponse();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/suites/tests/messages", name = "testSuitesPUTRequest")
    public JAXBElement<TestSuitesPUTRequest> createTestSuitesPUTRequest(TestSuitesPUTRequest value) {
        return new JAXBElement<TestSuitesPUTRequest>(_TestSuitesPUTRequest_QNAME, TestSuitesPUTRequest.class, null,
                value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/suites/tests/messages", name = "testSuitesRequest")
    public JAXBElement<TestSuitesRequest> createTestSuitesRequest(TestSuitesRequest value) {
        return new JAXBElement<TestSuitesRequest>(_TestSuitesRequest_QNAME, TestSuitesRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/suites/tests/messages", name = "testSuitesResponse")
    public JAXBElement<TestSuitesResponse> createTestSuitesResponse(TestSuitesResponse value) {
        return new JAXBElement<TestSuitesResponse>(_TestSuitesResponse_QNAME, TestSuitesResponse.class, null, value);
    }

}
