
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connection", propOrder = { "local", "file" })
public class Connection {

    protected Local local;
    protected File file;

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local value) {
        this.local = value;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File value) {
        this.file = value;
    }

}
