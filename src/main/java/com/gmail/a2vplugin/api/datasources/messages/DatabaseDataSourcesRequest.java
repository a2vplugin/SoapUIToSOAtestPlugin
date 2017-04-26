
package com.gmail.a2vplugin.api.datasources.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.datasources.messages.database.Custom;
import com.gmail.a2vplugin.api.datasources.messages.database.Db2;
import com.gmail.a2vplugin.api.datasources.messages.database.InputFile;
import com.gmail.a2vplugin.api.datasources.messages.database.MySQL;
import com.gmail.a2vplugin.api.datasources.messages.database.Odbc;
import com.gmail.a2vplugin.api.datasources.messages.database.Oracle;
import com.gmail.a2vplugin.api.datasources.messages.database.PostgreSQL;
import com.gmail.a2vplugin.api.datasources.messages.database.SqlServer;
import com.gmail.a2vplugin.api.datasources.messages.database.SqlServer2005;
import com.gmail.a2vplugin.api.datasources.messages.database.Sybase;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "databaseDataSourcesRequest", propOrder = { "name", "parent", "custom", "db2", "mySQL", "odbc",
        "oracle", "postgreSQL", "sqlServer", "sqlServer2005", "sybase", "inputFile", "sqlQuery", "rows" })
public class DatabaseDataSourcesRequest {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;
    protected Custom custom;
    protected Db2 db2;
    protected MySQL mySQL;
    protected Odbc odbc;
    protected Oracle oracle;
    protected PostgreSQL postgreSQL;
    protected SqlServer sqlServer;
    protected SqlServer2005 sqlServer2005;
    protected Sybase sybase;
    protected InputFile inputFile;
    protected String sqlQuery;
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

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom value) {
        this.custom = value;
    }

    public Db2 getDb2() {
        return db2;
    }

    public void setDb2(Db2 value) {
        this.db2 = value;
    }

    public MySQL getMySQL() {
        return mySQL;
    }

    public void setMySQL(MySQL value) {
        this.mySQL = value;
    }

    public Odbc getOdbc() {
        return odbc;
    }

    public void setOdbc(Odbc value) {
        this.odbc = value;
    }

    public Oracle getOracle() {
        return oracle;
    }

    public void setOracle(Oracle value) {
        this.oracle = value;
    }

    public PostgreSQL getPostgreSQL() {
        return postgreSQL;
    }

    public void setPostgreSQL(PostgreSQL value) {
        this.postgreSQL = value;
    }

    public SqlServer getSqlServer() {
        return sqlServer;
    }

    public void setSqlServer(SqlServer value) {
        this.sqlServer = value;
    }

    public SqlServer2005 getSqlServer2005() {
        return sqlServer2005;
    }

    public void setSqlServer2005(SqlServer2005 value) {
        this.sqlServer2005 = value;
    }

    public Sybase getSybase() {
        return sybase;
    }

    public void setSybase(Sybase value) {
        this.sybase = value;
    }

    public InputFile getInputFile() {
        return inputFile;
    }

    public void setInputFile(InputFile value) {
        this.inputFile = value;
    }

    public String getSqlQuery() {
        return sqlQuery;
    }

    public void setSqlQuery(String value) {
        this.sqlQuery = value;
    }

    public Rows getRows() {
        return rows;
    }

    public void setRows(Rows value) {
        this.rows = value;
    }

}
