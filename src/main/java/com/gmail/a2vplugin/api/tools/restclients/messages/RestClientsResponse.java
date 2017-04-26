
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Relationships;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restClientsResponse", propOrder = { "id", "url", "referenced", "name", "dataSource", "header",
        "resource", "payload", "httpOptions", "relationships" })
public class RestClientsResponse {

    @XmlElement(required = true)
    protected String id;
    protected String url;
    protected Boolean referenced;
    @XmlElement(required = true)
    protected String name;
    protected String dataSource;
    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected Resource resource;
    @XmlElement(required = true)
    protected Payload payload;
    @XmlElement(required = true)
    protected HttpOptions httpOptions;
    @XmlElement(required = true)
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

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header value) {
        this.header = value;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource value) {
        this.resource = value;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload value) {
        this.payload = value;
    }

    public HttpOptions getHttpOptions() {
        return httpOptions;
    }

    public void setHttpOptions(HttpOptions value) {
        this.httpOptions = value;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

}
