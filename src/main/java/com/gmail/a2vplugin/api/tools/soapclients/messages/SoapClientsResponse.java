
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Relationships;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapClientsResponse", propOrder = { "id", "url", "referenced", "name", "dataSource", "request",
        "transport", "misc", "relationships" })
public class SoapClientsResponse {

    @XmlElement(required = true)
    protected String id;
    protected String url;
    protected Boolean referenced;
    protected String name;
    protected String dataSource;
    protected Request request;
    protected Transport transport;
    protected Misc misc;
    protected Relationships relationships;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public Boolean isReferenced() {
        return referenced;
    }

    public void setReferenced(Boolean value) {
        this.referenced = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String value) {
        this.dataSource = value;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request value) {
        this.request = value;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport value) {
        this.transport = value;
    }

    public Misc getMisc() {
        return misc;
    }

    public void setMisc(Misc value) {
        this.misc = value;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

}
