
package com.gmail.a2vplugin.api.files.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _CopyFilesRequest_QNAME = new QName("http://www.parasoft.com/api/files/messages",
            "copyFilesRequest");
    private final static QName _CopyFilesResponse_QNAME = new QName("http://www.parasoft.com/api/files/messages",
            "copyFilesResponse");
    private final static QName _FileUploadRequest_QNAME = new QName("http://www.parasoft.com/api/files/messages",
            "fileUploadRequest");
    private final static QName _FilesPUTRequest_QNAME = new QName("http://www.parasoft.com/api/files/messages",
            "filesPUTRequest");
    private final static QName _FilesRequest_QNAME = new QName("http://www.parasoft.com/api/files/messages",
            "filesRequest");
    private final static QName _FilesResponse_QNAME = new QName("http://www.parasoft.com/api/files/messages",
            "filesResponse");

    public ObjectFactory() {
    }

    public CopyFilesRequest createCopyFilesRequest() {
        return new CopyFilesRequest();
    }

    public CopyFilesResponse createCopyFilesResponse() {
        return new CopyFilesResponse();
    }

    public FileUploadRequest createFileUploadRequest() {
        return new FileUploadRequest();
    }

    public FilesPUTRequest createFilesPUTRequest() {
        return new FilesPUTRequest();
    }

    public FilesRequest createFilesRequest() {
        return new FilesRequest();
    }

    public FilesResponse createFilesResponse() {
        return new FilesResponse();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/messages", name = "copyFilesRequest")
    public JAXBElement<CopyFilesRequest> createCopyFilesRequest(CopyFilesRequest value) {
        return new JAXBElement<CopyFilesRequest>(_CopyFilesRequest_QNAME, CopyFilesRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/messages", name = "copyFilesResponse")
    public JAXBElement<CopyFilesResponse> createCopyFilesResponse(CopyFilesResponse value) {
        return new JAXBElement<CopyFilesResponse>(_CopyFilesResponse_QNAME, CopyFilesResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/messages", name = "fileUploadRequest")
    public JAXBElement<FileUploadRequest> createFileUploadRequest(FileUploadRequest value) {
        return new JAXBElement<FileUploadRequest>(_FileUploadRequest_QNAME, FileUploadRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/messages", name = "filesPUTRequest")
    public JAXBElement<FilesPUTRequest> createFilesPUTRequest(FilesPUTRequest value) {
        return new JAXBElement<FilesPUTRequest>(_FilesPUTRequest_QNAME, FilesPUTRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/messages", name = "filesRequest")
    public JAXBElement<FilesRequest> createFilesRequest(FilesRequest value) {
        return new JAXBElement<FilesRequest>(_FilesRequest_QNAME, FilesRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/files/messages", name = "filesResponse")
    public JAXBElement<FilesResponse> createFilesResponse(FilesResponse value) {
        return new JAXBElement<FilesResponse>(_FilesResponse_QNAME, FilesResponse.class, null, value);
    }

}
