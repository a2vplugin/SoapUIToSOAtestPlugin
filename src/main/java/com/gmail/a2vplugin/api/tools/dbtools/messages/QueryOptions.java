
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryOptions", propOrder = { "statementSeparator", "separateStatementsByMagicToken",
        "jdbcOutParameterTypes" })
public class QueryOptions {

    @XmlElement(required = true, defaultValue = "semicolon")
    @XmlSchemaType(name = "string")
    protected StatementSeparator statementSeparator;
    protected ComplexValueFP separateStatementsByMagicToken;
    protected ComplexValueFP jdbcOutParameterTypes;

    public StatementSeparator getStatementSeparator() {
        return statementSeparator;
    }

    public void setStatementSeparator(StatementSeparator value) {
        this.statementSeparator = value;
    }

    public ComplexValueFP getSeparateStatementsByMagicToken() {
        return separateStatementsByMagicToken;
    }

    public void setSeparateStatementsByMagicToken(ComplexValueFP value) {
        this.separateStatementsByMagicToken = value;
    }

    public ComplexValueFP getJdbcOutParameterTypes() {
        return jdbcOutParameterTypes;
    }

    public void setJdbcOutParameterTypes(ComplexValueFP value) {
        this.jdbcOutParameterTypes = value;
    }

}
