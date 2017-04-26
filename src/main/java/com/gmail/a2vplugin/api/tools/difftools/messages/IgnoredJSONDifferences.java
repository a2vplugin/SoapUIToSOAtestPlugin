
package com.gmail.a2vplugin.api.tools.difftools.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ignoredJSONDifferences", propOrder = { "diffArray" })
public class IgnoredJSONDifferences {

    protected IgnoredJSONDifferences.DiffArray diffArray;

    public IgnoredJSONDifferences.DiffArray getDiffArray() {
        return diffArray;
    }

    public void setDiffArray(IgnoredJSONDifferences.DiffArray value) {
        this.diffArray = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "diff" })
    public static class DiffArray {

        protected List<DiffArrayjson> diff;

        public List<DiffArrayjson> getDiff() {
            if (diff == null) {
                diff = new ArrayList<DiffArrayjson>();
            }
            return this.diff;
        }

    }

}
