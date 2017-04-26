
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeData", propOrder = { "environmentsTypeData" })
public class TypeData {

    protected EnvironmentsTypeData environmentsTypeData;

    public EnvironmentsTypeData getEnvironmentsTypeData() {
        return environmentsTypeData;
    }

    public void setEnvironmentsTypeData(EnvironmentsTypeData value) {
        this.environmentsTypeData = value;
    }

}
