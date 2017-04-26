
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.Parent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapClientsRequest", propOrder = { "dataSource", "misc", "name", "parent", "request", "transport" })
public class SoapClientsRequest {

    protected String dataSource;
    protected Misc misc;
    protected String name;
    @XmlElement(required = true)
    protected Parent parent;
    protected Request request;
    protected Transport transport;

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String value) {
        this.dataSource = value;
    }

    public Misc getMisc() {
        return misc;
    }

    public void setMisc(Misc value) {
        this.misc = value;
    }

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

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request value) {
        this.request = value;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport value) {
        this.transport = value;
    }

}
