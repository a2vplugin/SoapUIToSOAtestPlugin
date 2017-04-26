
package com.gmail.a2vplugin.api.testexecutions.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testExecutionsRequest", propOrder = { "general", "scopeOptions", "soatestOptions" })
public class TestExecutionsRequest {

    @XmlElement(required = true)
    protected General general;
    protected ScopeOptions scopeOptions;
    protected SoatestOptions soatestOptions;

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General value) {
        this.general = value;
    }

    public ScopeOptions getScopeOptions() {
        return scopeOptions;
    }

    public void setScopeOptions(ScopeOptions value) {
        this.scopeOptions = value;
    }

    public SoatestOptions getSoatestOptions() {
        return soatestOptions;
    }

    public void setSoatestOptions(SoatestOptions value) {
        this.soatestOptions = value;
    }

}
