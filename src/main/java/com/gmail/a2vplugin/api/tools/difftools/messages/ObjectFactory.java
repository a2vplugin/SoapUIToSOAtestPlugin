
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _DifftoolsRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/difftools/messages", "difftoolsRequest");
    private final static QName _DifftoolsResponse_QNAME = new QName(
            "http://www.parasoft.com/api/tools/difftools/messages", "difftoolsResponse");

    public ObjectFactory() {
    }

    public IgnoredJSONDifferences createIgnoredJSONDifferences() {
        return new IgnoredJSONDifferences();
    }

    public IgnoredXPathDifferences createIgnoredXPathDifferences() {
        return new IgnoredXPathDifferences();
    }

    public IgnoredTextDifferences createIgnoredTextDifferences() {
        return new IgnoredTextDifferences();
    }

    public DifftoolsRequest createDifftoolsRequest() {
        return new DifftoolsRequest();
    }

    public DifftoolsResponse createDifftoolsResponse() {
        return new DifftoolsResponse();
    }

    public ToolSettings createToolSettings() {
        return new ToolSettings();
    }

    public DiffMode createDiffMode() {
        return new DiffMode();
    }

    public Binary createBinary() {
        return new Binary();
    }

    public RegressionControl createRegressionControl() {
        return new RegressionControl();
    }

    public Editor createEditor() {
        return new Editor();
    }

    public Text createText() {
        return new Text();
    }

    public DiffArraytext createDiffArraytext() {
        return new DiffArraytext();
    }

    public TextOptions createTextOptions() {
        return new TextOptions();
    }

    public Xml createXml() {
        return new Xml();
    }

    public DiffArrayxml createDiffArrayxml() {
        return new DiffArrayxml();
    }

    public Attribute createAttribute() {
        return new Attribute();
    }

    public AttributeOptions createAttributeOptions() {
        return new AttributeOptions();
    }

    public CommonOptionsV1 createCommonOptionsV1() {
        return new CommonOptionsV1();
    }

    public ElementSubtreeOptions createElementSubtreeOptions() {
        return new ElementSubtreeOptions();
    }

    public TextContentOptions createTextContentOptions() {
        return new TextContentOptions();
    }

    public XmlOptions createXmlOptions() {
        return new XmlOptions();
    }

    public Json createJson() {
        return new Json();
    }

    public DiffArrayjson createDiffArrayjson() {
        return new DiffArrayjson();
    }

    public JsonOptions createJsonOptions() {
        return new JsonOptions();
    }

    public IgnoredJSONDifferences.DiffArray createIgnoredJSONDifferencesDiffArray() {
        return new IgnoredJSONDifferences.DiffArray();
    }

    public IgnoredXPathDifferences.DiffArray createIgnoredXPathDifferencesDiffArray() {
        return new IgnoredXPathDifferences.DiffArray();
    }

    public IgnoredTextDifferences.DiffArray createIgnoredTextDifferencesDiffArray() {
        return new IgnoredTextDifferences.DiffArray();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/difftools/messages", name = "difftoolsRequest")
    public JAXBElement<DifftoolsRequest> createDifftoolsRequest(DifftoolsRequest value) {
        return new JAXBElement<DifftoolsRequest>(_DifftoolsRequest_QNAME, DifftoolsRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/difftools/messages", name = "difftoolsResponse")
    public JAXBElement<DifftoolsResponse> createDifftoolsResponse(DifftoolsResponse value) {
        return new JAXBElement<DifftoolsResponse>(_DifftoolsResponse_QNAME, DifftoolsResponse.class, null, value);
    }

}
