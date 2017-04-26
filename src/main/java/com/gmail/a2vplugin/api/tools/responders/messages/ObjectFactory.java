
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _MessageRespondersRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/responders/messages", "messageRespondersRequest");
    private final static QName _MessageRespondersResponse_QNAME = new QName(
            "http://www.parasoft.com/api/tools/responders/messages", "messageRespondersResponse");

    public ObjectFactory() {
    }

    public UrlParameters createUrlParameters() {
        return new UrlParameters();
    }

    public Transport createTransport() {
        return new Transport();
    }

    public MessageRespondersRequest createMessageRespondersRequest() {
        return new MessageRespondersRequest();
    }

    public MessageRespondersResponse createMessageRespondersResponse() {
        return new MessageRespondersResponse();
    }

    public ResponderCorrelation createResponderCorrelation() {
        return new ResponderCorrelation();
    }

    public UrlPath createUrlPath() {
        return new UrlPath();
    }

    public XmlMessage createXmlMessage() {
        return new XmlMessage();
    }

    public Options createOptions() {
        return new Options();
    }

    public RequestHandling createRequestHandling() {
        return new RequestHandling();
    }

    public Response createResponse() {
        return new Response();
    }

    public TransportHeader createTransportHeader() {
        return new TransportHeader();
    }

    public UrlParameters.Parameters createUrlParametersParameters() {
        return new UrlParameters.Parameters();
    }

    public Transport.Headers createTransportHeaders() {
        return new Transport.Headers();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/responders/messages", name = "messageRespondersRequest")
    public JAXBElement<MessageRespondersRequest> createMessageRespondersRequest(MessageRespondersRequest value) {
        return new JAXBElement<MessageRespondersRequest>(_MessageRespondersRequest_QNAME,
                MessageRespondersRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/responders/messages", name = "messageRespondersResponse")
    public JAXBElement<MessageRespondersResponse> createMessageRespondersResponse(MessageRespondersResponse value) {
        return new JAXBElement<MessageRespondersResponse>(_MessageRespondersResponse_QNAME,
                MessageRespondersResponse.class, null, value);
    }

}
