
package com.gmail.a2vplugin.api.tools.restclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restClientsRequest", propOrder = { "dataSource", "header", "httpOptions", "name", "parent", "payload",
        "resource" })
public class RestClientsRequest {

    protected String dataSource;
    protected Header header;
    protected HttpOptions httpOptions;
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;
    protected Payload payload;
    protected Resource resource;

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

    public HttpOptions getHttpOptions() {
        return httpOptions;
    }

    public void setHttpOptions(HttpOptions value) {
        this.httpOptions = value;
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

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload value) {
        this.payload = value;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource value) {
        this.resource = value;
    }

}
