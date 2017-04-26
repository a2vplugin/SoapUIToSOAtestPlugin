
package com.gmail.a2vplugin.api.tools.responders.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.NameValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "urlParameters", propOrder = { "enabled", "parameters" })
public class UrlParameters {

    protected boolean enabled;
    protected List<NameValue> parameters;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    public List<NameValue> getParameters() {
        return parameters;
    }

    public void setParameters(List<NameValue> value) {
        this.parameters = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "parameter" })
    public static class Parameters {

        protected List<NameValue> parameter;

        public List<NameValue> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<NameValue>();
            }
            return this.parameter;
        }

    }

}
