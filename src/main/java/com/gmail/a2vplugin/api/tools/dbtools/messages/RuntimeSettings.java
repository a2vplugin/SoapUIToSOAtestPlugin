
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runtimeSettings", propOrder = { "failOnSqlException", "afterRunningQuery" })
public class RuntimeSettings {

    protected Boolean failOnSqlException;
    @XmlElement(required = true, defaultValue = "autoCommit")
    @XmlSchemaType(name = "string")
    protected AfterRunningQuery afterRunningQuery;

    public Boolean isFailOnSqlException() {
        return failOnSqlException;
    }

    public void setFailOnSqlException(Boolean value) {
        this.failOnSqlException = value;
    }

    public AfterRunningQuery getAfterRunningQuery() {
        return afterRunningQuery;
    }

    public void setAfterRunningQuery(AfterRunningQuery value) {
        this.afterRunningQuery = value;
    }

}
