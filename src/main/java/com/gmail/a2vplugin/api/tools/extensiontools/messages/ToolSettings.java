
package com.gmail.a2vplugin.api.tools.extensiontools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toolSettings", propOrder = { "exitCodeIndicatesSuccess", "language", "method", "useDataSource",
        "value" })
public class ToolSettings {

    protected boolean exitCodeIndicatesSuccess;
    protected String language;
    protected Method method;
    protected boolean useDataSource;
    protected Value value;

    public boolean isExitCodeIndicatesSuccess() {
        return exitCodeIndicatesSuccess;
    }

    public void setExitCodeIndicatesSuccess(boolean value) {
        this.exitCodeIndicatesSuccess = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method value) {
        this.method = value;
    }

    public boolean isUseDataSource() {
        return useDataSource;
    }

    public void setUseDataSource(boolean value) {
        this.useDataSource = value;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

}
