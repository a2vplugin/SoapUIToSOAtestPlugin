
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xml", propOrder = { "regressionControl", "ignoredXPathDifferences", "xmlOptions" })
public class Xml {

    protected RegressionControl regressionControl;
    protected IgnoredXPathDifferences ignoredXPathDifferences;
    protected XmlOptions xmlOptions;

    public RegressionControl getRegressionControl() {
        return regressionControl;
    }

    public void setRegressionControl(RegressionControl value) {
        this.regressionControl = value;
    }

    public IgnoredXPathDifferences getIgnoredXPathDifferences() {
        return ignoredXPathDifferences;
    }

    public void setIgnoredXPathDifferences(IgnoredXPathDifferences value) {
        this.ignoredXPathDifferences = value;
    }

    public XmlOptions getXmlOptions() {
        return xmlOptions;
    }

    public void setXmlOptions(XmlOptions value) {
        this.xmlOptions = value;
    }

}
