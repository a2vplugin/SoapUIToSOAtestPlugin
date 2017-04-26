
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toolSettings", propOrder = { "connection", "sqlQuery", "options" })
public class ToolSettings {

    protected Connection connection;
    protected SqlQuery sqlQuery;
    protected Options options;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection value) {
        this.connection = value;
    }

    public SqlQuery getSqlQuery() {
        return sqlQuery;
    }

    public void setSqlQuery(SqlQuery value) {
        this.sqlQuery = value;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options value) {
        this.options = value;
    }

}
