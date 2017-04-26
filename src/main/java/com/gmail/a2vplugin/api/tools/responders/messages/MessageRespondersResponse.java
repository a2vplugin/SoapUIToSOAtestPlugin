
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Relationships;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageRespondersResponse", propOrder = { "dataSource", "id", "name", "referenced", "relationships",
        "responderCorrelation", "options", "response", "transportHeader", "url" })
public class MessageRespondersResponse {

    protected String dataSource;
    @XmlElement(required = true)
    protected String id;
    protected String name;
    protected Boolean referenced;
    @XmlElement(required = true)
    protected Relationships relationships;
    protected ResponderCorrelation responderCorrelation;
    protected Options options;
    protected Response response;
    protected TransportHeader transportHeader;
    @XmlElement(required = true)
    protected String url;

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String value) {
        this.dataSource = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Boolean isReferenced() {
        return referenced;
    }

    public void setReferenced(Boolean value) {
        this.referenced = value;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships value) {
        this.relationships = value;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

}
