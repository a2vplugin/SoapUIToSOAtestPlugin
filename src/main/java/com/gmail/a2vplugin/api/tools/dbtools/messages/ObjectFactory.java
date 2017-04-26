
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _DbToolsPUTRequest_QNAME = new QName(
            "http://www.parasoft.com/api/tools/dbTools/messages", "dbToolsPUTRequest");
    private final static QName _DbToolsRequest_QNAME = new QName("http://www.parasoft.com/api/tools/dbTools/messages",
            "dbToolsRequest");
    private final static QName _DbToolsResponse_QNAME = new QName("http://www.parasoft.com/api/tools/dbTools/messages",
            "dbToolsResponse");

    public ObjectFactory() {
    }

    public DbToolsPUTRequest createDbToolsPUTRequest() {
        return new DbToolsPUTRequest();
    }

    public DbToolsRequest createDbToolsRequest() {
        return new DbToolsRequest();
    }

    public DbToolsResponse createDbToolsResponse() {
        return new DbToolsResponse();
    }

    public ToolSettings createToolSettings() {
        return new ToolSettings();
    }

    public Connection createConnection() {
        return new Connection();
    }

    public Local createLocal() {
        return new Local();
    }

    public File createFile() {
        return new File();
    }

    public SqlQuery createSqlQuery() {
        return new SqlQuery();
    }

    public QueryOptions createQueryOptions() {
        return new QueryOptions();
    }

    public Options createOptions() {
        return new Options();
    }

    public RuntimeSettings createRuntimeSettings() {
        return new RuntimeSettings();
    }

    public XmlOutput createXmlOutput() {
        return new XmlOutput();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/dbTools/messages", name = "dbToolsPUTRequest")
    public JAXBElement<DbToolsPUTRequest> createDbToolsPUTRequest(DbToolsPUTRequest value) {
        return new JAXBElement<DbToolsPUTRequest>(_DbToolsPUTRequest_QNAME, DbToolsPUTRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/dbTools/messages", name = "dbToolsRequest")
    public JAXBElement<DbToolsRequest> createDbToolsRequest(DbToolsRequest value) {
        return new JAXBElement<DbToolsRequest>(_DbToolsRequest_QNAME, DbToolsRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/tools/dbTools/messages", name = "dbToolsResponse")
    public JAXBElement<DbToolsResponse> createDbToolsResponse(DbToolsResponse value) {
        return new JAXBElement<DbToolsResponse>(_DbToolsResponse_QNAME, DbToolsResponse.class, null, value);
    }

}
