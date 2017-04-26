
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericSettings", propOrder = { "closeConnection", "database", "host", "password", "port", "user" })
public class GenericSettings {

    protected boolean closeConnection;
    protected String database;
    protected String host;
    protected String password;
    protected String port;
    protected String user;

    public boolean isCloseConnection() {
        return closeConnection;
    }

    public void setCloseConnection(boolean value) {
        this.closeConnection = value;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String value) {
        this.database = value;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String value) {
        this.host = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String value) {
        this.port = value;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String value) {
        this.user = value;
    }

}
