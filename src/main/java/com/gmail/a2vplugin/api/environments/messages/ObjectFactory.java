
package com.gmail.a2vplugin.api.environments.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _CopyRequest_QNAME = new QName("http://www.parasoft.com/api/environments/messages",
            "copyRequest");
    private final static QName _CopyResponse_QNAME = new QName("http://www.parasoft.com/api/environments/messages",
            "copyResponse");
    private final static QName _EnvironmentsPUTRequest_QNAME = new QName(
            "http://www.parasoft.com/api/environments/messages", "environmentsPUTRequest");
    private final static QName _EnvironmentsRequest_QNAME = new QName(
            "http://www.parasoft.com/api/environments/messages", "environmentsRequest");
    private final static QName _EnvironmentsResponse_QNAME = new QName(
            "http://www.parasoft.com/api/environments/messages", "environmentsResponse");

    public ObjectFactory() {
    }

    public ReferenceEnvironmentResponse createReferenceEnvironmentResponse() {
        return new ReferenceEnvironmentResponse();
    }

    public Environment createEnvironment() {
        return new Environment();
    }

    public CopyRequest createCopyRequest() {
        return new CopyRequest();
    }

    public CopyResponse createCopyResponse() {
        return new CopyResponse();
    }

    public EnvironmentsPUTRequest createEnvironmentsPUTRequest() {
        return new EnvironmentsPUTRequest();
    }

    public EnvironmentsRequest createEnvironmentsRequest() {
        return new EnvironmentsRequest();
    }

    public EnvironmentsResponse createEnvironmentsResponse() {
        return new EnvironmentsResponse();
    }

    public Variable createVariable() {
        return new Variable();
    }

    public ReferenceEnvironmentRequest createReferenceEnvironmentRequest() {
        return new ReferenceEnvironmentRequest();
    }

    public ReferenceEnvironmentResponse.Environments createReferenceEnvironmentResponseEnvironments() {
        return new ReferenceEnvironmentResponse.Environments();
    }

    public Environment.Variables createEnvironmentVariables() {
        return new Environment.Variables();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/environments/messages", name = "copyRequest")
    public JAXBElement<CopyRequest> createCopyRequest(CopyRequest value) {
        return new JAXBElement<CopyRequest>(_CopyRequest_QNAME, CopyRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/environments/messages", name = "copyResponse")
    public JAXBElement<CopyResponse> createCopyResponse(CopyResponse value) {
        return new JAXBElement<CopyResponse>(_CopyResponse_QNAME, CopyResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/environments/messages", name = "environmentsPUTRequest")
    public JAXBElement<EnvironmentsPUTRequest> createEnvironmentsPUTRequest(EnvironmentsPUTRequest value) {
        return new JAXBElement<EnvironmentsPUTRequest>(_EnvironmentsPUTRequest_QNAME, EnvironmentsPUTRequest.class,
                null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/environments/messages", name = "environmentsRequest")
    public JAXBElement<EnvironmentsRequest> createEnvironmentsRequest(EnvironmentsRequest value) {
        return new JAXBElement<EnvironmentsRequest>(_EnvironmentsRequest_QNAME, EnvironmentsRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/environments/messages", name = "environmentsResponse")
    public JAXBElement<EnvironmentsResponse> createEnvironmentsResponse(EnvironmentsResponse value) {
        return new JAXBElement<EnvironmentsResponse>(_EnvironmentsResponse_QNAME, EnvironmentsResponse.class, null,
                value);
    }

}
