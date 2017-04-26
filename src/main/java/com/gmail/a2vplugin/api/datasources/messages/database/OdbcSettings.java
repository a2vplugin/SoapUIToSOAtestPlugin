
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odbcSettings", propOrder = { "closeConnection", "dsn", "password", "user" })
public class OdbcSettings {

    protected boolean closeConnection;
    protected String dsn;
    protected String password;
    protected String user;

    public boolean isCloseConnection() {
        return closeConnection;
    }

    public void setCloseConnection(boolean value) {
        this.closeConnection = value;
    }

    public String getDsn() {
        return dsn;
    }

    public void setDsn(String value) {
        this.dsn = value;
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
