
package com.gmail.a2vplugin.api.status.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusResponse", propOrder = { "apiUser", "server" })
public class StatusResponse {

    @XmlElement(required = true)
    protected ApiUser apiUser;
    @XmlElement(required = true)
    protected ServerSettings server;

    public ApiUser getApiUser() {
        return apiUser;
    }

    public void setApiUser(ApiUser value) {
        this.apiUser = value;
    }

    public ServerSettings getServer() {
        return server;
    }

    public void setServer(ServerSettings value) {
        this.server = value;
    }

}
