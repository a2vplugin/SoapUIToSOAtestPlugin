
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customSettings", propOrder = { "closeConnection", "databaseUrl", "driverClass", "password", "user" })
public class CustomSettings {

    protected boolean closeConnection;
    protected String databaseUrl;
    protected String driverClass;
    protected String password;
    protected String user;

    public boolean isCloseConnection() {
        return closeConnection;
    }

    public void setCloseConnection(boolean value) {
        this.closeConnection = value;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String value) {
        this.databaseUrl = value;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String value) {
        this.driverClass = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String value) {
        this.user = value;
    }

}
