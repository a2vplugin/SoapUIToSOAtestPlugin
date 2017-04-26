
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textOptions", propOrder = { "ignoreWhitespace", "outputResultsAsUNIXStyleDiff", "regularExpression" })
public class TextOptions {

    protected boolean ignoreWhitespace;
    protected boolean outputResultsAsUNIXStyleDiff;
    protected boolean regularExpression;

    public boolean isIgnoreWhitespace() {
        return ignoreWhitespace;
    }

    public void setIgnoreWhitespace(boolean value) {
        this.ignoreWhitespace = value;
    }

    public boolean isOutputResultsAsUNIXStyleDiff() {
        return outputResultsAsUNIXStyleDiff;
    }

    public void setOutputResultsAsUNIXStyleDiff(boolean value) {
        this.outputResultsAsUNIXStyleDiff = value;
    }

    public boolean isRegularExpression() {
        return regularExpression;
    }

    public void setRegularExpression(boolean value) {
        this.regularExpression = value;
    }

}
