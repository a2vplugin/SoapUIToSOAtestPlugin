
package com.gmail.a2vplugin.api.tools.responders.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestHandling", propOrder = { "allowRequestModificationBeforeCorrelation" })
public class RequestHandling {

    protected boolean allowRequestModificationBeforeCorrelation;

    public boolean isAllowRequestModificationBeforeCorrelation() {
        return allowRequestModificationBeforeCorrelation;
    }

    public void setAllowRequestModificationBeforeCorrelation(boolean value) {
        this.allowRequestModificationBeforeCorrelation = value;
    }

}
