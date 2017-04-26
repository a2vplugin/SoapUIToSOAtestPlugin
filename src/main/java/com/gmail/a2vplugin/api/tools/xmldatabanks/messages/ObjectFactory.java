
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _XmlDataBanksRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/xmlDataBanks/messages", "xmlDataBanksRequest");
    private final static QName _XmlDataBanksResponse_QNAME = new QName(
            "http://www.parasoft.com/api/tools/xmlDataBanks/messages", "xmlDataBanksResponse");

    public ObjectFactory() {
    }

    public ToolSettings createToolSettings() {
        return new ToolSettings();
    }

    public XmlDataBanksRequest createXmlDataBanksRequest() {
        return new XmlDataBanksRequest();
    }

    public XmlDataBanksResponse createXmlDataBanksResponse() {
        return new XmlDataBanksResponse();
    }

    public SelectedXpath createSelectedXpath() {
        return new SelectedXpath();
    }

    public DataSourceColumn createDataSourceColumn() {
        return new DataSourceColumn();
    }

    public CustomColumn createCustomColumn() {
        return new CustomColumn();
    }

    public SuiteVariable createSuiteVariable() {
        return new SuiteVariable();
    }

    public WritableDataSource createWritableDataSource() {
        return new WritableDataSource();
    }

    public SelectedElement createSelectedElement() {
        return new SelectedElement();
    }

    public SelectedElementOptions createSelectedElementOptions() {
        return new SelectedElementOptions();
    }

    public EntireElement createEntireElement() {
        return new EntireElement();
    }

    public Options createOptions() {
        return new Options();
    }

    public ToolSettings.SelectedElements createToolSettingsSelectedElements() {
        return new ToolSettings.SelectedElements();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/xmlDataBanks/messages", name = "xmlDataBanksRequest")
    public JAXBElement<XmlDataBanksRequest> createXmlDataBanksRequest(XmlDataBanksRequest value) {
        return new JAXBElement<XmlDataBanksRequest>(_XmlDataBanksRequest_QNAME, XmlDataBanksRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/xmlDataBanks/messages", name = "xmlDataBanksResponse")
    public JAXBElement<XmlDataBanksResponse> createXmlDataBanksResponse(XmlDataBanksResponse value) {
        return new JAXBElement<XmlDataBanksResponse>(_XmlDataBanksResponse_QNAME, XmlDataBanksResponse.class, null,
                value);
    }

}
