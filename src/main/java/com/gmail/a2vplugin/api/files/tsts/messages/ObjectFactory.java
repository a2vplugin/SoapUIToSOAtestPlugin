
package com.gmail.a2vplugin.api.files.tsts.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _TstsRequest_QNAME = new QName("http://www.parasoft.com/api/files/tsts/messages",
            "tstsRequest");
    private final static QName _TstsResponse_QNAME = new QName("http://www.parasoft.com/api/files/tsts/messages",
            "tstsResponse");
    private final static QName _TstsWsdlRequest_QNAME = new QName("http://www.parasoft.com/api/files/tsts/messages",
            "tstsWsdlRequest");

    public ObjectFactory() {
    }

    public TstsRequest createTstsRequest() {
        return new TstsRequest();
    }

    public TstsResponse createTstsResponse() {
        return new TstsResponse();
    }

    public TstsWsdlRequest createTstsWsdlRequest() {
        return new TstsWsdlRequest();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/tsts/messages", name = "tstsRequest")
    public JAXBElement<TstsRequest> createTstsRequest(TstsRequest value) {
        return new JAXBElement<TstsRequest>(_TstsRequest_QNAME, TstsRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/tsts/messages", name = "tstsResponse")
    public JAXBElement<TstsResponse> createTstsResponse(TstsResponse value) {
        return new JAXBElement<TstsResponse>(_TstsResponse_QNAME, TstsResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/tsts/messages", name = "tstsWsdlRequest")
    public JAXBElement<TstsWsdlRequest> createTstsWsdlRequest(TstsWsdlRequest value) {
        return new JAXBElement<TstsWsdlRequest>(_TstsWsdlRequest_QNAME, TstsWsdlRequest.class, null, value);
    }

}
