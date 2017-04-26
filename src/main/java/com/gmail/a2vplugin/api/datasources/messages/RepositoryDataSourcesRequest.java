
package com.gmail.a2vplugin.api.datasources.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.datasources.messages.respository.LocalRepositorySettings;
import com.gmail.a2vplugin.api.datasources.messages.respository.RepositoryDataSettings;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repositoryDataSourcesRequest", propOrder = { "name", "parent", "local", "data", "rows" })
public class RepositoryDataSourcesRequest {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;
    @XmlElement(required = true)
    protected LocalRepositorySettings local;
    @XmlElement(required = true)
    protected RepositoryDataSettings data;
    protected Rows rows;

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

}
