
package com.gmail.a2vplugin.api.tools.dbtools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlOutput", propOrder = { "encodeXmlCharacters", "separateColumnNamesFromValues",
        "useSingleResultFormatIfOnlyOneResult" })
public class XmlOutput {

    protected boolean encodeXmlCharacters;
    protected boolean separateColumnNamesFromValues;
    protected boolean useSingleResultFormatIfOnlyOneResult;

    public boolean isEncodeXmlCharacters() {
        return encodeXmlCharacters;
    }

    public void setEncodeXmlCharacters(boolean value) {
        this.encodeXmlCharacters = value;
    }

    public boolean isSeparateColumnNamesFromValues() {
        return separateColumnNamesFromValues;
    }

    public void setSeparateColumnNamesFromValues(boolean value) {
        this.separateColumnNamesFromValues = value;
    }

    public boolean isUseSingleResultFormatIfOnlyOneResult() {
        return useSingleResultFormatIfOnlyOneResult;
    }

    public void setUseSingleResultFormatIfOnlyOneResult(boolean value) {
        this.useSingleResultFormatIfOnlyOneResult = value;
    }

}
