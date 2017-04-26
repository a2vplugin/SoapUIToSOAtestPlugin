
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responderCorrelation", propOrder = { "urlPath", "transport", "urlParameters", "xmlMessage" })
public class ResponderCorrelation {

    protected UrlPath urlPath;
    protected Transport transport;
    protected UrlParameters urlParameters;
    protected XmlMessage xmlMessage;

    public UrlPath getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(UrlPath value) {
        this.urlPath = value;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport value) {
        this.transport = value;
    }

    public UrlParameters getUrlParameters() {
        return urlParameters;
    }

    public void setUrlParameters(UrlParameters value) {
        this.urlParameters = value;
    }

    public XmlMessage getXmlMessage() {
        return xmlMessage;
    }

    public void setXmlMessage(XmlMessage value) {
        this.xmlMessage = value;
    }

}
