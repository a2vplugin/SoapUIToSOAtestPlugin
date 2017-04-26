
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sqlQuery", propOrder = { "value", "queryOptions" })
public class SqlQuery {

    protected ComplexValueFP value;
    protected QueryOptions queryOptions;

    public ComplexValueFP getValue() {
        return value;
    }

    public void setValue(ComplexValueFP value) {
        this.value = value;
    }

    public QueryOptions getQueryOptions() {
        return queryOptions;
    }

    public void setQueryOptions(QueryOptions value) {
        this.queryOptions = value;
    }

}
