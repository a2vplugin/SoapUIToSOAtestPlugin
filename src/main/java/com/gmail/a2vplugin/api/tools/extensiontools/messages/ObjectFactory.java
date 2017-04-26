
package com.gmail.a2vplugin.api.tools.extensiontools.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _ExtensionToolsRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/extensionTools/messages", "extensionToolsRequest");
    private final static QName _ExtensionToolsResponse_QNAME = new QName(
            "http://www.parasoft.com/api/tools/extensionTools/messages", "extensionToolsResponse");

    public ObjectFactory() {
    }

    public Method createMethod() {
        return new Method();
    }

    public ExtensionToolsRequest createExtensionToolsRequest() {
        return new ExtensionToolsRequest();
    }

    public ExtensionToolsResponse createExtensionToolsResponse() {
        return new ExtensionToolsResponse();
    }

    public ToolSettings createToolSettings() {
        return new ToolSettings();
    }

    public Value createValue() {
        return new Value();
    }

    public File createFile() {
        return new File();
    }

    public Method.Arguments createMethodArguments() {
        return new Method.Arguments();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/extensionTools/messages", name = "extensionToolsRequest")
    public JAXBElement<ExtensionToolsRequest> createExtensionToolsRequest(ExtensionToolsRequest value) {
        return new JAXBElement<ExtensionToolsRequest>(_ExtensionToolsRequest_QNAME, ExtensionToolsRequest.class, null,
                value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/extensionTools/messages", name = "extensionToolsResponse")
    public JAXBElement<ExtensionToolsResponse> createExtensionToolsResponse(ExtensionToolsResponse value) {
        return new JAXBElement<ExtensionToolsResponse>(_ExtensionToolsResponse_QNAME, ExtensionToolsResponse.class,
                null, value);
    }

}
