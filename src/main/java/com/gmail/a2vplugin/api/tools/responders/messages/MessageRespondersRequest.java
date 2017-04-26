
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageRespondersRequest", propOrder = { "dataSource", "name", "parent", "responderCorrelation",
        "options", "response", "transportHeader" })
public class MessageRespondersRequest {

    protected String dataSource;
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;
    protected ResponderCorrelation responderCorrelation;
    protected Options options;
    protected Response response;
    protected TransportHeader transportHeader;

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String value) {
        this.dataSource = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent value) {
        this.parent = value;
    }

    public ResponderCorrelation getResponderCorrelation() {
        return responderCorrelation;
    }

    public void setResponderCorrelation(ResponderCorrelation value) {
        this.responderCorrelation = value;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options value) {
        this.options = value;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response value) {
        this.response = value;
    }

    public TransportHeader getTransportHeader() {
        return transportHeader;
    }

    public void setTransportHeader(TransportHeader value) {
        this.transportHeader = value;
    }

}
