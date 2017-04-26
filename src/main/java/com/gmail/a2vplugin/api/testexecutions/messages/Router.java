
package com.gmail.a2vplugin.api.testexecutions.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "router", propOrder = { "matchWhole", "replaceUri", "searchUri" })
public class Router {

    protected Boolean matchWhole;
    @XmlElement(required = true)
    protected String replaceUri;
    @XmlElement(required = true)
    protected String searchUri;

    public Boolean isMatchWhole() {
        return matchWhole;
    }

    public void setMatchWhole(Boolean value) {
        this.matchWhole = value;
    }

    public String getReplaceUri() {
        return replaceUri;
    }

    public void setReplaceUri(String value) {
        this.replaceUri = value;
    }

    public String getSearchUri() {
        return searchUri;
    }

    public void setSearchUri(String value) {
        this.searchUri = value;
    }

}
