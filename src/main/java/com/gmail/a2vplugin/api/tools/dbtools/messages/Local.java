
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "local", propOrder = { "driver", "url", "username", "password", "closeConnection" })
public class Local {

    protected String driver;
    protected String url;
    protected String username;
    protected String password;
    protected Boolean closeConnection;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String value) {
        this.driver = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String value) {
        this.username = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public Boolean isCloseConnection() {
        return closeConnection;
    }

    public void setCloseConnection(Boolean value) {
        this.closeConnection = value;
    }

}
