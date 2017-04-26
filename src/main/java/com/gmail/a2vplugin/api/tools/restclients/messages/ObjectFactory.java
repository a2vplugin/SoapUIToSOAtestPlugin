
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _RestClientsPUTRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/restClients/messages", "restClientsPUTRequest");
    private final static QName _RestClientsRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/restClients/messages", "restClientsRequest");
    private final static QName _RestClientsResponse_QNAME = new QName(
            "http://www.parasoft.com/api/tools/restClients/messages", "restClientsResponse");

    public ObjectFactory() {
    }

    public RestClientsPUTRequest createRestClientsPUTRequest() {
        return new RestClientsPUTRequest();
    }

    public RestClientsRequest createRestClientsRequest() {
        return new RestClientsRequest();
    }

    public RestClientsResponse createRestClientsResponse() {
        return new RestClientsResponse();
    }

    public Header createHeader() {
        return new Header();
    }

    public Method createMethod() {
        return new Method();
    }

    public HttpOptions createHttpOptions() {
        return new HttpOptions();
    }

    public Transport createTransport() {
        return new Transport();
    }

    public Http10 createHttp10() {
        return new Http10();
    }

    public Security createSecurity() {
        return new Security();
    }

    public Http11 createHttp11() {
        return new Http11();
    }

    public Payload createPayload() {
        return new Payload();
    }

    public Input createInput() {
        return new Input();
    }

    public Resource createResource() {
        return new Resource();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/restClients/messages", name = "restClientsPUTRequest")
    public JAXBElement<RestClientsPUTRequest> createRestClientsPUTRequest(RestClientsPUTRequest value) {
        return new JAXBElement<RestClientsPUTRequest>(_RestClientsPUTRequest_QNAME, RestClientsPUTRequest.class, null,
                value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/restClients/messages", name = "restClientsRequest")
    public JAXBElement<RestClientsRequest> createRestClientsRequest(RestClientsRequest value) {
        return new JAXBElement<RestClientsRequest>(_RestClientsRequest_QNAME, RestClientsRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/restClients/messages", name = "restClientsResponse")
    public JAXBElement<RestClientsResponse> createRestClientsResponse(RestClientsResponse value) {
        return new JAXBElement<RestClientsResponse>(_RestClientsResponse_QNAME, RestClientsResponse.class, null, value);
    }

}
