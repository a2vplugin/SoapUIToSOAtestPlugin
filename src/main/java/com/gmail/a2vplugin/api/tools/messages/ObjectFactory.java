
package com.gmail.a2vplugin.api.tools.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _CopyRequest_QNAME = new QName("http://www.parasoft.com/api/tools/messages",
            "copyRequest");
    private final static QName _CopyResponse_QNAME = new QName("http://www.parasoft.com/api/tools/messages",
            "copyResponse");

    public ObjectFactory() {
    }

    public CopyRequest createCopyRequest() {
        return new CopyRequest();
    }

    public CopyResponse createCopyResponse() {
        return new CopyResponse();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/messages", name = "copyRequest")
    public JAXBElement<CopyRequest> createCopyRequest(CopyRequest value) {
        return new JAXBElement<CopyRequest>(_CopyRequest_QNAME, CopyRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/messages", name = "copyResponse")
    public JAXBElement<CopyResponse> createCopyResponse(CopyResponse value) {
        return new JAXBElement<CopyResponse>(_CopyResponse_QNAME, CopyResponse.class, null, value);
    }

}
