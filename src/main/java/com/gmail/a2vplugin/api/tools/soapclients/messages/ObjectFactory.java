
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _SoapClientsPUTRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/soapclients/messages", "soapClientsPUTRequest");
    private final static QName _SoapClientsRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/soapclients/messages", "soapClientsRequest");
    private final static QName _SoapClientsResponse_QNAME = new QName(
            "http://www.parasoft.com/api/tools/soapclients/messages", "soapClientsResponse");

    public ObjectFactory() {
    }

    public SoapClientsPUTRequest createSoapClientsPUTRequest() {
        return new SoapClientsPUTRequest();
    }

    public SoapClientsRequest createSoapClientsRequest() {
        return new SoapClientsRequest();
    }

    public SoapClientsResponse createSoapClientsResponse() {
        return new SoapClientsResponse();
    }

    public Request createRequest() {
        return new Request();
    }

    public Transport createTransport() {
        return new Transport();
    }

    public Http10Transport createHttp10Transport() {
        return new Http10Transport();
    }

    public Http10General createHttp10General() {
        return new Http10General();
    }

    public Endpoint createEndpoint() {
        return new Endpoint();
    }

    public Security createSecurity() {
        return new Security();
    }

    public Http11Transport createHttp11Transport() {
        return new Http11Transport();
    }

    public Http11General createHttp11General() {
        return new Http11General();
    }

    public Misc createMisc() {
        return new Misc();
    }

    public Timeout createTimeout() {
        return new Timeout();
    }

    public Milliseconds createMilliseconds() {
        return new Milliseconds();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/soapclients/messages", name = "soapClientsPUTRequest")
    public JAXBElement<SoapClientsPUTRequest> createSoapClientsPUTRequest(SoapClientsPUTRequest value) {
        return new JAXBElement<SoapClientsPUTRequest>(_SoapClientsPUTRequest_QNAME, SoapClientsPUTRequest.class, null,
                value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/soapclients/messages", name = "soapClientsRequest")
    public JAXBElement<SoapClientsRequest> createSoapClientsRequest(SoapClientsRequest value) {
        return new JAXBElement<SoapClientsRequest>(_SoapClientsRequest_QNAME, SoapClientsRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/soapclients/messages", name = "soapClientsResponse")
    public JAXBElement<SoapClientsResponse> createSoapClientsResponse(SoapClientsResponse value) {
        return new JAXBElement<SoapClientsResponse>(_SoapClientsResponse_QNAME, SoapClientsResponse.class, null, value);
    }

}
