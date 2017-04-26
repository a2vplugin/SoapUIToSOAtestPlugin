
package com.gmail.a2vplugin.api.environments.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Relationships;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentsResponse", propOrder = { "id", "local", "reference", "relationships", "url" })
public class EnvironmentsResponse {

    @XmlElement(required = true)
    protected String id;
    protected Environment local;
    protected ReferenceEnvironmentResponse reference;
    @XmlElement(required = true)
    protected Relationships relationships;
    @XmlElement(required = true)
    protected String url;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public Environment getLocal() {
        return local;
    }

    public void setLocal(Environment value) {
        this.local = value;
    }

    public ReferenceEnvironmentResponse getReference() {
        return reference;
    }

    public void setReference(ReferenceEnvironmentResponse value) {
        this.reference = value;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

}
