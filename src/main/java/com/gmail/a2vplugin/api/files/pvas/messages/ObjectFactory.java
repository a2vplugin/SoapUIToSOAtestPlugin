
package com.gmail.a2vplugin.api.files.pvas.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _PvasRequest_QNAME = new QName("http://www.parasoft.com/api/files/pvas/messages",
            "pvasRequest");
    private final static QName _PvasResponse_QNAME = new QName("http://www.parasoft.com/api/files/pvas/messages",
            "pvasResponse");
    private final static QName _PvasWsdlRequest_QNAME = new QName("http://www.parasoft.com/api/files/pvas/messages",
            "pvasWsdlRequest");

    public ObjectFactory() {
    }

    public PvasRequest createPvasRequest() {
        return new PvasRequest();
    }

    public PvasResponse createPvasResponse() {
        return new PvasResponse();
    }

    public PvasWsdlRequest createPvasWsdlRequest() {
        return new PvasWsdlRequest();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/pvas/messages", name = "pvasRequest")
    public JAXBElement<PvasRequest> createPvasRequest(PvasRequest value) {
        return new JAXBElement<PvasRequest>(_PvasRequest_QNAME, PvasRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/pvas/messages", name = "pvasResponse")
    public JAXBElement<PvasResponse> createPvasResponse(PvasResponse value) {
        return new JAXBElement<PvasResponse>(_PvasResponse_QNAME, PvasResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/pvas/messages", name = "pvasWsdlRequest")
    public JAXBElement<PvasWsdlRequest> createPvasWsdlRequest(PvasWsdlRequest value) {
        return new JAXBElement<PvasWsdlRequest>(_PvasWsdlRequest_QNAME, PvasWsdlRequest.class, null, value);
    }

}
