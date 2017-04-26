
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "binary", propOrder = { "regressionControl" })
public class Binary {

    protected RegressionControl regressionControl;

    public RegressionControl getRegressionControl() {
        return regressionControl;
    }

    public void setRegressionControl(RegressionControl value) {
        this.regressionControl = value;
    }

}
