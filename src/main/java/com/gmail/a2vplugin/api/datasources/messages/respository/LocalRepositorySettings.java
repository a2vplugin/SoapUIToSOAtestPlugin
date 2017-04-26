
package com.gmail.a2vplugin.api.datasources.messages.respository;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localRepositorySettings", propOrder = { "host", "port", "repositoryName", "user", "password" })
public class LocalRepositorySettings {

    @XmlElement(required = true)
    protected String host;
    protected Integer port;
    @XmlElement(required = true)
    protected String repositoryName;
    protected String user;
    protected String password;

    public String getHost() {
        return host;
    }

    public void setHost(String value) {
        this.host = value;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer value) {
        this.port = value;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String value) {
        this.repositoryName = value;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String value) {
        this.user = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

}
