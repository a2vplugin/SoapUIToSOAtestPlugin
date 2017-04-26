
package com.gmail.a2vplugin.api.files.tsts.messages.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentSource", propOrder = { "addNewEnvironment", "referenceExistingEnvironment" })
public class EnvironmentSource {

    protected AddNewEnvironment addNewEnvironment;
    protected ReferenceExistingEnvironment referenceExistingEnvironment;

    public AddNewEnvironment getAddNewEnvironment() {
        return addNewEnvironment;
    }

    public void setAddNewEnvironment(AddNewEnvironment value) {
        this.addNewEnvironment = value;
    }

    public ReferenceExistingEnvironment getReferenceExistingEnvironment() {
        return referenceExistingEnvironment;
    }

    public void setReferenceExistingEnvironment(ReferenceExistingEnvironment value) {
        this.referenceExistingEnvironment = value;
    }

}
