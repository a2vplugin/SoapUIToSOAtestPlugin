
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "options", propOrder = { "messageExchangePattern", "requestHandling", "soapVersion" })
public class Options {

    @XmlSchemaType(name = "string")
    protected MessageExchangePattern messageExchangePattern;
    protected RequestHandling requestHandling;
    @XmlSchemaType(name = "string")
    protected SoapVersion soapVersion;

    public MessageExchangePattern getMessageExchangePattern() {
        return messageExchangePattern;
    }

    public void setMessageExchangePattern(MessageExchangePattern value) {
        this.messageExchangePattern = value;
    }

    public RequestHandling getRequestHandling() {
        return requestHandling;
    }

    public void setRequestHandling(RequestHandling value) {
        this.requestHandling = value;
    }

    public SoapVersion getSoapVersion() {
        return soapVersion;
    }

    public void setSoapVersion(SoapVersion value) {
        this.soapVersion = value;
    }

}
