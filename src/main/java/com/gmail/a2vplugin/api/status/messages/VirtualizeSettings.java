
package com.gmail.a2vplugin.api.status.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "virtualizeSettings", propOrder = { "version", "licensed", "features" })
public class VirtualizeSettings {

    @XmlElement(required = true)
    protected Version version;
    protected boolean licensed;
    @XmlElement(required = true)
    protected VirtualizeSettings.Features features;

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version value) {
        this.version = value;
    }

    public boolean isLicensed() {
        return licensed;
    }

    public void setLicensed(boolean value) {
        this.licensed = value;
    }

    public VirtualizeSettings.Features getFeatures() {
        return features;
    }

    public void setFeatures(VirtualizeSettings.Features value) {
        this.features = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "feature" })
    public static class Features {

        protected List<LicenseFeature> feature;

        public List<LicenseFeature> getFeature() {
            if (feature == null) {
                feature = new ArrayList<LicenseFeature>();
            }
            return this.feature;
        }

    }

}
