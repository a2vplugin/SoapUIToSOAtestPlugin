
package com.gmail.a2vplugin.api.datasources.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _CsvDataSourcesRequest_QNAME = new QName(
            "http://www.parasoft.com/api/datasources/messages", "csvDataSourcesRequest");
    private final static QName _CsvDataSourcesResponse_QNAME = new QName(
            "http://www.parasoft.com/api/datasources/messages", "csvDataSourcesResponse");
    private final static QName _DatabaseDataSourcesRequest_QNAME = new QName(
            "http://www.parasoft.com/api/datasources/messages", "databaseDataSourcesRequest");
    private final static QName _DatabaseDataSourcesResponse_QNAME = new QName(
            "http://www.parasoft.com/api/datasources/messages", "databaseDataSourcesResponse");
    private final static QName _ExcelDataSourcesRequest_QNAME = new QName(
            "http://www.parasoft.com/api/datasources/messages", "excelDataSourcesRequest");
    private final static QName _ExcelDataSourcesResponse_QNAME = new QName(
            "http://www.parasoft.com/api/datasources/messages", "excelDataSourcesResponse");
    private final static QName _RepositoryDataSourcesRequest_QNAME = new QName(
            "http://www.parasoft.com/api/datasources/messages", "repositoryDataSourcesRequest");
    private final static QName _RepositoryDataSourcesResponse_QNAME = new QName(
            "http://www.parasoft.com/api/datasources/messages", "repositoryDataSourcesResponse");

    public ObjectFactory() {
    }

    public CsvDataSourcesRequest createCsvDataSourcesRequest() {
        return new CsvDataSourcesRequest();
    }

    public CsvDataSourcesResponse createCsvDataSourcesResponse() {
        return new CsvDataSourcesResponse();
    }

    public DatabaseDataSourcesRequest createDatabaseDataSourcesRequest() {
        return new DatabaseDataSourcesRequest();
    }

    public DatabaseDataSourcesResponse createDatabaseDataSourcesResponse() {
        return new DatabaseDataSourcesResponse();
    }

    public ExcelDataSourcesRequest createExcelDataSourcesRequest() {
        return new ExcelDataSourcesRequest();
    }

    public ExcelDataSourcesResponse createExcelDataSourcesResponse() {
        return new ExcelDataSourcesResponse();
    }

    public RepositoryDataSourcesRequest createRepositoryDataSourcesRequest() {
        return new RepositoryDataSourcesRequest();
    }

    public RepositoryDataSourcesResponse createRepositoryDataSourcesResponse() {
        return new RepositoryDataSourcesResponse();
    }

    public Rows createRows() {
        return new Rows();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/datasources/messages", name = "csvDataSourcesRequest")
    public JAXBElement<CsvDataSourcesRequest> createCsvDataSourcesRequest(CsvDataSourcesRequest value) {
        return new JAXBElement<CsvDataSourcesRequest>(_CsvDataSourcesRequest_QNAME, CsvDataSourcesRequest.class, null,
                value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/datasources/messages", name = "csvDataSourcesResponse")
    public JAXBElement<CsvDataSourcesResponse> createCsvDataSourcesResponse(CsvDataSourcesResponse value) {
        return new JAXBElement<CsvDataSourcesResponse>(_CsvDataSourcesResponse_QNAME, CsvDataSourcesResponse.class,
                null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/datasources/messages", name = "databaseDataSourcesRequest")
    public JAXBElement<DatabaseDataSourcesRequest> createDatabaseDataSourcesRequest(DatabaseDataSourcesRequest value) {
        return new JAXBElement<DatabaseDataSourcesRequest>(_DatabaseDataSourcesRequest_QNAME,
                DatabaseDataSourcesRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/datasources/messages", name = "databaseDataSourcesResponse")
    public JAXBElement<DatabaseDataSourcesResponse> createDatabaseDataSourcesResponse(
            DatabaseDataSourcesResponse value) {
        return new JAXBElement<DatabaseDataSourcesResponse>(_DatabaseDataSourcesResponse_QNAME,
                DatabaseDataSourcesResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/datasources/messages", name = "excelDataSourcesRequest")
    public JAXBElement<ExcelDataSourcesRequest> createExcelDataSourcesRequest(ExcelDataSourcesRequest value) {
        return new JAXBElement<ExcelDataSourcesRequest>(_ExcelDataSourcesRequest_QNAME, ExcelDataSourcesRequest.class,
                null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/datasources/messages", name = "excelDataSourcesResponse")
    public JAXBElement<ExcelDataSourcesResponse> createExcelDataSourcesResponse(ExcelDataSourcesResponse value) {
        return new JAXBElement<ExcelDataSourcesResponse>(_ExcelDataSourcesResponse_QNAME,
                ExcelDataSourcesResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/datasources/messages", name = "repositoryDataSourcesRequest")
    public JAXBElement<RepositoryDataSourcesRequest> createRepositoryDataSourcesRequest(
            RepositoryDataSourcesRequest value) {
        return new JAXBElement<RepositoryDataSourcesRequest>(_RepositoryDataSourcesRequest_QNAME,
                RepositoryDataSourcesRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/datasources/messages", name = "repositoryDataSourcesResponse")
    public JAXBElement<RepositoryDataSourcesResponse> createRepositoryDataSourcesResponse(
            RepositoryDataSourcesResponse value) {
        return new JAXBElement<RepositoryDataSourcesResponse>(_RepositoryDataSourcesResponse_QNAME,
                RepositoryDataSourcesResponse.class, null, value);
    }

}
