
package com.gmail.a2vplugin.api.datasources.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Relationships;
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
@XmlType(name = "databaseDataSourcesResponse", propOrder = { "id", "url", "referenced", "name", "custom", "db2",
        "mySQL", "odbc", "oracle", "postgreSQL", "sqlServer", "sqlServer2005", "sybase", "inputFile", "sqlQuery",
        "rows", "relationships" })
public class DatabaseDataSourcesResponse {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String url;
    protected Boolean referenced;
    @XmlElement(required = true)
    protected String name;
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

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

}
