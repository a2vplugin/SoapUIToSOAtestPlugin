
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entireElement", propOrder = { "indexToExtract" })
public class EntireElement {

    protected Integer indexToExtract;

    public Integer getIndexToExtract() {
        return indexToExtract;
    }

    public void setIndexToExtract(Integer value) {
        this.indexToExtract = value;
    }

}
