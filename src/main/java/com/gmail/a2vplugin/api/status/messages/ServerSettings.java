
package com.gmail.a2vplugin.api.status.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverSettings", propOrder = { "test", "soatest", "virtualize" })
public class ServerSettings {

    @XmlElement(required = true)
    protected TestSettings test;
    @XmlElement(required = true)
    protected SoatestSettings soatest;
    @XmlElement(required = true)
    protected VirtualizeSettings virtualize;

    public TestSettings getTest() {
        return test;
    }

    public void setTest(TestSettings value) {
        this.test = value;
    }

    public SoatestSettings getSoatest() {
        return soatest;
    }

    public void setSoatest(SoatestSettings value) {
        this.soatest = value;
    }

    public VirtualizeSettings getVirtualize() {
        return virtualize;
    }

    public void setVirtualize(VirtualizeSettings value) {
        this.virtualize = value;
    }

}
