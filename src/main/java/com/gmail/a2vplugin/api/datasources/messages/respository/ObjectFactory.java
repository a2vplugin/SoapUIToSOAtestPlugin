
package com.gmail.a2vplugin.api.datasources.messages.respository;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public LocalRepositorySettings createLocalRepositorySettings() {
        return new LocalRepositorySettings();
    }

    public RepositoryDataSettings createRepositoryDataSettings() {
        return new RepositoryDataSettings();
    }

}
