
package com.gmail.a2vplugin.api.datasources.messages.database;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public Custom createCustom() {
        return new Custom();
    }

    public CustomSettings createCustomSettings() {
        return new CustomSettings();
    }

    public Db2 createDb2() {
        return new Db2();
    }

    public Db2Settings createDb2Settings() {
        return new Db2Settings();
    }

    public MySQL createMySQL() {
        return new MySQL();
    }

    public GenericSettings createGenericSettings() {
        return new GenericSettings();
    }

    public Odbc createOdbc() {
        return new Odbc();
    }

    public OdbcSettings createOdbcSettings() {
        return new OdbcSettings();
    }

    public Oracle createOracle() {
        return new Oracle();
    }

    public OracleSettings createOracleSettings() {
        return new OracleSettings();
    }

    public PostgreSQL createPostgreSQL() {
        return new PostgreSQL();
    }

    public SqlServer createSqlServer() {
        return new SqlServer();
    }

    public SqlServer2005 createSqlServer2005() {
        return new SqlServer2005();
    }

    public Sybase createSybase() {
        return new Sybase();
    }

    public InputFile createInputFile() {
        return new InputFile();
    }

    public InputFileSettings createInputFileSettings() {
        return new InputFileSettings();
    }

}
