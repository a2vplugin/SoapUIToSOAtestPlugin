
package com.gmail.a2vplugin.api.suites.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _CopySuitesRequest_QNAME = new QName("http://www.parasoft.com/api/suites/messages",
            "copySuitesRequest");
    private final static QName _CopySuitesResponse_QNAME = new QName("http://www.parasoft.com/api/suites/messages",
            "copySuitesResponse");

    public ObjectFactory() {
    }

    public CopySuitesRequest createCopySuitesRequest() {
        return new CopySuitesRequest();
    }

    public CopySuitesResponse createCopySuitesResponse() {
        return new CopySuitesResponse();
    }

    public RequirementsAndNotes createRequirementsAndNotes() {
        return new RequirementsAndNotes();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/suites/messages", name = "copySuitesRequest")
    public JAXBElement<CopySuitesRequest> createCopySuitesRequest(CopySuitesRequest value) {
        return new JAXBElement<CopySuitesRequest>(_CopySuitesRequest_QNAME, CopySuitesRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/suites/messages", name = "copySuitesResponse")
    public JAXBElement<CopySuitesResponse> createCopySuitesResponse(CopySuitesResponse value) {
        return new JAXBElement<CopySuitesResponse>(_CopySuitesResponse_QNAME, CopySuitesResponse.class, null, value);
    }

}
