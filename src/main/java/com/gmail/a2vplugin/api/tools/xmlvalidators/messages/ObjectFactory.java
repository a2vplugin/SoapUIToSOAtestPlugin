
package com.gmail.a2vplugin.api.tools.xmlvalidators.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _XmlValidatorsRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/xmlValidators/messages", "xmlValidatorsRequest");
    private final static QName _XmlValidatorsResponse_QNAME = new QName(
            "http://www.parasoft.com/api/tools/xmlValidators/messages", "xmlValidatorsResponse");

    public ObjectFactory() {
    }

    public SchemaValidationOptions createSchemaValidationOptions() {
        return new SchemaValidationOptions();
    }

    public XmlValidatorsRequest createXmlValidatorsRequest() {
        return new XmlValidatorsRequest();
    }

    public XmlValidatorsResponse createXmlValidatorsResponse() {
        return new XmlValidatorsResponse();
    }

    public ToolSettings createToolSettings() {
        return new ToolSettings();
    }

    public SchemaValidationOptions.IgnoredNamespaces createSchemaValidationOptionsIgnoredNamespaces() {
        return new SchemaValidationOptions.IgnoredNamespaces();
    }

    public SchemaValidationOptions.NamespacesMappedToSchemaLocations createSchemaValidationOptionsNamespacesMappedToSchemaLocations() {
        return new SchemaValidationOptions.NamespacesMappedToSchemaLocations();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/xmlValidators/messages", name = "xmlValidatorsRequest")
    public JAXBElement<XmlValidatorsRequest> createXmlValidatorsRequest(XmlValidatorsRequest value) {
        return new JAXBElement<XmlValidatorsRequest>(_XmlValidatorsRequest_QNAME, XmlValidatorsRequest.class, null,
                value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/xmlValidators/messages", name = "xmlValidatorsResponse")
    public JAXBElement<XmlValidatorsResponse> createXmlValidatorsResponse(XmlValidatorsResponse value) {
        return new JAXBElement<XmlValidatorsResponse>(_XmlValidatorsResponse_QNAME, XmlValidatorsResponse.class, null,
                value);
    }

}
