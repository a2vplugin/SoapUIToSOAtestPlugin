
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.BooleanStringPair;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "options", propOrder = { "allowAlteration", "canonicalizeXmlOutput", "extractEmptyElementsAs",
        "extractMissingElementsAs", "saveExpectedXml" })
public class Options {

    protected Boolean allowAlteration;
    protected Boolean canonicalizeXmlOutput;
    protected BooleanStringPair extractEmptyElementsAs;
    protected BooleanStringPair extractMissingElementsAs;
    protected Boolean saveExpectedXml;

    public Boolean isAllowAlteration() {
        return allowAlteration;
    }

    public void setAllowAlteration(Boolean value) {
        this.allowAlteration = value;
    }

    public Boolean isCanonicalizeXmlOutput() {
        return canonicalizeXmlOutput;
    }

    public void setCanonicalizeXmlOutput(Boolean value) {
        this.canonicalizeXmlOutput = value;
    }

    public BooleanStringPair getExtractEmptyElementsAs() {
        return extractEmptyElementsAs;
    }

    public void setExtractEmptyElementsAs(BooleanStringPair value) {
        this.extractEmptyElementsAs = value;
    }

    public BooleanStringPair getExtractMissingElementsAs() {
        return extractMissingElementsAs;
    }

    public void setExtractMissingElementsAs(BooleanStringPair value) {
        this.extractMissingElementsAs = value;
    }

    public Boolean isSaveExpectedXml() {
        return saveExpectedXml;
    }

    public void setSaveExpectedXml(Boolean value) {
        this.saveExpectedXml = value;
    }

}
