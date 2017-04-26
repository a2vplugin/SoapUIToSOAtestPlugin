
package com.gmail.a2vplugin.api.tools.writefiletools.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _WritefiletoolsRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/writefiletools/messages", "writefiletoolsRequest");
    private final static QName _WritefiletoolsResponse_QNAME = new QName(
            "http://www.parasoft.com/api/tools/writefiletools/messages", "writefiletoolsResponse");

    public ObjectFactory() {
    }

    public WritefiletoolsRequest createWritefiletoolsRequest() {
        return new WritefiletoolsRequest();
    }

    public WritefiletoolsResponse createWritefiletoolsResponse() {
        return new WritefiletoolsResponse();
    }

    public ToolSettings createToolSettings() {
        return new ToolSettings();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/writefiletools/messages", name = "writefiletoolsRequest")
    public JAXBElement<WritefiletoolsRequest> createWritefiletoolsRequest(WritefiletoolsRequest value) {
        return new JAXBElement<WritefiletoolsRequest>(_WritefiletoolsRequest_QNAME, WritefiletoolsRequest.class, null,
                value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/writefiletools/messages", name = "writefiletoolsResponse")
    public JAXBElement<WritefiletoolsResponse> createWritefiletoolsResponse(WritefiletoolsResponse value) {
        return new JAXBElement<WritefiletoolsResponse>(_WritefiletoolsResponse_QNAME, WritefiletoolsResponse.class,
                null, value);
    }

}
