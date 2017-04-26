
package com.gmail.a2vplugin.api.tools.xmlvalidators.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schemaValidationOptions", propOrder = { "ignoredNamespaces", "namespacesMappedToSchemaLocations",
        "useNamespaceAsLocationURI", "validateAgainstSchemasReferenced", "location" })
public class SchemaValidationOptions {

    protected SchemaValidationOptions.IgnoredNamespaces ignoredNamespaces;
    protected SchemaValidationOptions.NamespacesMappedToSchemaLocations namespacesMappedToSchemaLocations;
    protected boolean useNamespaceAsLocationURI;
    protected boolean validateAgainstSchemasReferenced;
    protected FileLocation location;

    public SchemaValidationOptions.IgnoredNamespaces getIgnoredNamespaces() {
        return ignoredNamespaces;
    }

    public void setIgnoredNamespaces(SchemaValidationOptions.IgnoredNamespaces value) {
        this.ignoredNamespaces = value;
    }

    public SchemaValidationOptions.NamespacesMappedToSchemaLocations getNamespacesMappedToSchemaLocations() {
        return namespacesMappedToSchemaLocations;
    }

    public void setNamespacesMappedToSchemaLocations(SchemaValidationOptions.NamespacesMappedToSchemaLocations value) {
        this.namespacesMappedToSchemaLocations = value;
    }

    public boolean isUseNamespaceAsLocationURI() {
        return useNamespaceAsLocationURI;
    }

    public void setUseNamespaceAsLocationURI(boolean value) {
        this.useNamespaceAsLocationURI = value;
    }

    public boolean isValidateAgainstSchemasReferenced() {
        return validateAgainstSchemasReferenced;
    }

    public void setValidateAgainstSchemasReferenced(boolean value) {
        this.validateAgainstSchemasReferenced = value;
    }

    public FileLocation getLocation() {
        return location;
    }

    public void setLocation(FileLocation value) {
        this.location = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "ignoredNamespace" })
    public static class IgnoredNamespaces {

        protected List<String> ignoredNamespace;

        public List<String> getIgnoredNamespace() {
            if (ignoredNamespace == null) {
                ignoredNamespace = new ArrayList<String>();
            }
            return this.ignoredNamespace;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "location" })
    public static class NamespacesMappedToSchemaLocations {

        protected List<FileLocation> location;

        public List<FileLocation> getLocation() {
            if (location == null) {
                location = new ArrayList<FileLocation>();
            }
            return this.location;
        }

    }

}
