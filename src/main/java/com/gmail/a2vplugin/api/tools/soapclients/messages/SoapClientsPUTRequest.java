
package com.gmail.a2vplugin.api.tools.soapclients.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapClientsPUTRequest", propOrder = { "dataSource", "misc", "name", "request", "transport" })
public class SoapClientsPUTRequest {

    protected String dataSource;
    protected Misc misc;
    protected String name;
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
