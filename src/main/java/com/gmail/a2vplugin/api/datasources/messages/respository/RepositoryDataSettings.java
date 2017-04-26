
package com.gmail.a2vplugin.api.datasources.messages.respository;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repositoryDataSettings", propOrder = { "dataType", "datasetName" })
public class RepositoryDataSettings {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DataType dataType;
    protected String datasetName;

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType value) {
        this.dataType = value;
    }

    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String value) {
        this.datasetName = value;
    }

}
