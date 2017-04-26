
package com.gmail.a2vplugin.api.tools.responders.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.NameValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transport", propOrder = { "enabled", "headers" })
public class Transport {

    protected boolean enabled;
    protected List<NameValue> headers;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    public List<NameValue> getHeaders() {
        return headers;
    }

    public void setHeaders(List<NameValue> value) {
        this.headers = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "header" })
    public static class Headers {

        protected List<NameValue> header;

        public List<NameValue> getHeader() {
            if (header == null) {
                header = new ArrayList<NameValue>();
            }
            return this.header;
        }

    }

}
