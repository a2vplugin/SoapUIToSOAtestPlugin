
package com.gmail.a2vplugin.api.suites.responders.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponderSuitesPUTRequest_QNAME = new QName(
            "http://www.parasoft.com/api/suites/responders/messages", "responderSuitesPUTRequest");
    private final static QName _ResponderSuitesRequest_QNAME = new QName(
            "http://www.parasoft.com/api/suites/responders/messages", "responderSuitesRequest");
    private final static QName _ResponderSuitesResponse_QNAME = new QName(
            "http://www.parasoft.com/api/suites/responders/messages", "responderSuitesResponse");

    public ObjectFactory() {
    }

    public ResponderSuitesPUTRequest createResponderSuitesPUTRequest() {
        return new ResponderSuitesPUTRequest();
    }

    public ResponderSuitesRequest createResponderSuitesRequest() {
        return new ResponderSuitesRequest();
    }

    public ResponderSuitesResponse createResponderSuitesResponse() {
        return new ResponderSuitesResponse();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/suites/responders/messages", name = "responderSuitesPUTRequest")
    public JAXBElement<ResponderSuitesPUTRequest> createResponderSuitesPUTRequest(ResponderSuitesPUTRequest value) {
        return new JAXBElement<ResponderSuitesPUTRequest>(_ResponderSuitesPUTRequest_QNAME,
                ResponderSuitesPUTRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/suites/responders/messages", name = "responderSuitesRequest")
    public JAXBElement<ResponderSuitesRequest> createResponderSuitesRequest(ResponderSuitesRequest value) {
        return new JAXBElement<ResponderSuitesRequest>(_ResponderSuitesRequest_QNAME, ResponderSuitesRequest.class,
                null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/suites/responders/messages", name = "responderSuitesResponse")
    public JAXBElement<ResponderSuitesResponse> createResponderSuitesResponse(ResponderSuitesResponse value) {
        return new JAXBElement<ResponderSuitesResponse>(_ResponderSuitesResponse_QNAME, ResponderSuitesResponse.class,
                null, value);
    }

}
