
package com.gmail.a2vplugin.api.testexecutions.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testExecutionsStatusResponse", propOrder = { "isRunning", "percent" })
public class TestExecutionsStatusResponse {

    protected boolean isRunning;
    protected long percent;

    public boolean isIsRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean value) {
        this.isRunning = value;
    }

    public long getPercent() {
        return percent;
    }

    public void setPercent(long value) {
        this.percent = value;
    }

}
