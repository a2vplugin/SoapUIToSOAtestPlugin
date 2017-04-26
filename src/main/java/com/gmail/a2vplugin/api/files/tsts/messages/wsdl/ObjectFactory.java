
package com.gmail.a2vplugin.api.files.tsts.messages.wsdl;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public CreateEnvironment createCreateEnvironment() {
        return new CreateEnvironment();
    }

    public Value createValue() {
        return new Value();
    }

    public EnvironmentSource createEnvironmentSource() {
        return new EnvironmentSource();
    }

    public AddNewEnvironment createAddNewEnvironment() {
        return new AddNewEnvironment();
    }

    public ReferenceExistingEnvironment createReferenceExistingEnvironment() {
        return new ReferenceExistingEnvironment();
    }

}
