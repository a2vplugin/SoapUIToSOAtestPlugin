
package com.gmail.a2vplugin.api.datasources.messages.respository;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "dataType")
@XmlEnum
public enum DataType {

    @XmlEnumValue("dataSet")
    DATA_SET("dataSet"), @XmlEnumValue("sqlDataSet")
    SQL_DATA_SET("sqlDataSet");
    private final String value;

    DataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataType fromValue(String v) {
        for (DataType c : DataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
