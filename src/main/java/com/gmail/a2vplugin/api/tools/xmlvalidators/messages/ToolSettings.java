
package com.gmail.a2vplugin.api.tools.xmlvalidators.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toolSettings", propOrder = { "mode", "resolveExternalDtds", "schemaValidationOptions" })
public class ToolSettings {

    @XmlSchemaType(name = "string")
    protected Mode mode;
    protected boolean resolveExternalDtds;
    protected SchemaValidationOptions schemaValidationOptions;

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode value) {
        this.mode = value;
    }

    public boolean isResolveExternalDtds() {
        return resolveExternalDtds;
    }

    public void setResolveExternalDtds(boolean value) {
        this.resolveExternalDtds = value;
    }

    public SchemaValidationOptions getSchemaValidationOptions() {
        return schemaValidationOptions;
    }

    public void setSchemaValidationOptions(SchemaValidationOptions value) {
        this.schemaValidationOptions = value;
    }

}
