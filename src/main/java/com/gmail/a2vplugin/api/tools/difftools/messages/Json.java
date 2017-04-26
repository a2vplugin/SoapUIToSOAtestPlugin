
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "json", propOrder = { "ignoredJSONDifferences", "jsonOptions", "regressionControl" })
public class Json {

    protected IgnoredJSONDifferences ignoredJSONDifferences;
    protected JsonOptions jsonOptions;
    protected RegressionControl regressionControl;

    public IgnoredJSONDifferences getIgnoredJSONDifferences() {
        return ignoredJSONDifferences;
    }

    public void setIgnoredJSONDifferences(IgnoredJSONDifferences value) {
        this.ignoredJSONDifferences = value;
    }

    public JsonOptions getJsonOptions() {
        return jsonOptions;
    }

    public void setJsonOptions(JsonOptions value) {
        this.jsonOptions = value;
    }

    public RegressionControl getRegressionControl() {
        return regressionControl;
    }

    public void setRegressionControl(RegressionControl value) {
        this.regressionControl = value;
    }

}
