
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "text", propOrder = { "regressionControl", "ignoredTextDifferences", "textOptions" })
public class Text {

    protected RegressionControl regressionControl;
    protected IgnoredTextDifferences ignoredTextDifferences;
    protected TextOptions textOptions;

    public RegressionControl getRegressionControl() {
        return regressionControl;
    }

    public void setRegressionControl(RegressionControl value) {
        this.regressionControl = value;
    }

    public IgnoredTextDifferences getIgnoredTextDifferences() {
        return ignoredTextDifferences;
    }

    public void setIgnoredTextDifferences(IgnoredTextDifferences value) {
        this.ignoredTextDifferences = value;
    }

    public TextOptions getTextOptions() {
        return textOptions;
    }

    public void setTextOptions(TextOptions value) {
        this.textOptions = value;
    }

}
