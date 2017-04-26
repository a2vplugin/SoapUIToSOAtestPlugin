
package com.gmail.a2vplugin.api.datasources.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Relationships;
import com.gmail.a2vplugin.api.datasources.messages.respository.LocalRepositorySettings;
import com.gmail.a2vplugin.api.datasources.messages.respository.RepositoryDataSettings;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repositoryDataSourcesResponse", propOrder = { "id", "url", "referenced", "name", "local", "data",
        "rows", "relationships" })
public class RepositoryDataSourcesResponse {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String url;
    protected Boolean referenced;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected LocalRepositorySettings local;
    @XmlElement(required = true)
    protected RepositoryDataSettings data;
    protected Rows rows;
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

    public LocalRepositorySettings getLocal() {
        return local;
    }

    public void setLocal(LocalRepositorySettings value) {
        this.local = value;
    }

    public RepositoryDataSettings getData() {
        return data;
    }

    public void setData(RepositoryDataSettings value) {
        this.data = value;
    }

    public Rows getRows() {
        return rows;
    }

    public void setRows(Rows value) {
        this.rows = value;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

}
