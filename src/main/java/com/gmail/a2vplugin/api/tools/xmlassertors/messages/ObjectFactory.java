
package com.gmail.a2vplugin.api.tools.xmlassertors.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _XmlAssertorsRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/xmlAssertors/messages", "xmlAssertorsRequest");
    private final static QName _XmlAssertorsResponse_QNAME = new QName(
            "http://www.parasoft.com/api/tools/xmlAssertors/messages", "xmlAssertorsResponse");

    public ObjectFactory() {
    }

    public ToolSettings createToolSettings() {
        return new ToolSettings();
    }

    public XmlAssertorsRequest createXmlAssertorsRequest() {
        return new XmlAssertorsRequest();
    }

    public XmlAssertorsResponse createXmlAssertorsResponse() {
        return new XmlAssertorsResponse();
    }

    public com.gmail.a2vplugin.api.tools.xmlassertors.messages.Assertion createAssertion() {
        return new com.gmail.a2vplugin.api.tools.xmlassertors.messages.Assertion();
    }

    public ValueAssertion createValueAssertion() {
        return new ValueAssertion();
    }

    public ValueConfiguration createValueConfiguration() {
        return new ValueConfiguration();
    }

    public Options createOptions() {
        return new Options();
    }

    public SelectedElement createSelectedElement() {
        return new SelectedElement();
    }

    public ValueOccurrenceAssertion createValueOccurrenceAssertion() {
        return new ValueOccurrenceAssertion();
    }

    public ValueOccurrenceConfiguration createValueOccurrenceConfiguration() {
        return new ValueOccurrenceConfiguration();
    }

    public OccurrenceAssertion createOccurrenceAssertion() {
        return new OccurrenceAssertion();
    }

    public OccurrenceConfiguration createOccurrenceConfiguration() {
        return new OccurrenceConfiguration();
    }

    public HasContentAssertion createHasContentAssertion() {
        return new HasContentAssertion();
    }

    public HasContentConfiguration createHasContentConfiguration() {
        return new HasContentConfiguration();
    }

    public ExpectedXml createExpectedXml() {
        return new ExpectedXml();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/xmlAssertors/messages", name = "xmlAssertorsRequest")
    public JAXBElement<XmlAssertorsRequest> createXmlAssertorsRequest(XmlAssertorsRequest value) {
        return new JAXBElement<XmlAssertorsRequest>(_XmlAssertorsRequest_QNAME, XmlAssertorsRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/xmlAssertors/messages", name = "xmlAssertorsResponse")
    public JAXBElement<XmlAssertorsResponse> createXmlAssertorsResponse(XmlAssertorsResponse value) {
        return new JAXBElement<XmlAssertorsResponse>(_XmlAssertorsResponse_QNAME, XmlAssertorsResponse.class, null,
                value);
    }

}
