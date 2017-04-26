
package com.gmail.a2vplugin.api.status.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _StatusResponse_QNAME = new QName("http://www.parasoft.com/api/status/messages",
            "statusResponse");

    public ObjectFactory() {
    }

    public VirtualizeSettings createVirtualizeSettings() {
        return new VirtualizeSettings();
    }

    public SoatestSettings createSoatestSettings() {
        return new SoatestSettings();
    }

    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    public ApiUser createApiUser() {
        return new ApiUser();
    }

    public ServerSettings createServerSettings() {
        return new ServerSettings();
    }

    public TestSettings createTestSettings() {
        return new TestSettings();
    }

    public Version createVersion() {
        return new Version();
    }

    public LicenseFeature createLicenseFeature() {
        return new LicenseFeature();
    }

    public VirtualizeSettings.Features createVirtualizeSettingsFeatures() {
        return new VirtualizeSettings.Features();
    }

    public SoatestSettings.Features createSoatestSettingsFeatures() {
        return new SoatestSettings.Features();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/status/messages", name = "statusResponse")
    public JAXBElement<StatusResponse> createStatusResponse(StatusResponse value) {
        return new JAXBElement<StatusResponse>(_StatusResponse_QNAME, StatusResponse.class, null, value);
    }

}
