
package com.gmail.a2vplugin.api.tools.difftools.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ignoredXPathDifferences", propOrder = { "diffArray" })
public class IgnoredXPathDifferences {

    protected IgnoredXPathDifferences.DiffArray diffArray;

    public IgnoredXPathDifferences.DiffArray getDiffArray() {
        return diffArray;
    }

    public void setDiffArray(IgnoredXPathDifferences.DiffArray value) {
        this.diffArray = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "diff" })
    public static class DiffArray {

        protected List<DiffArrayxml> diff;

        public List<DiffArrayxml> getDiff() {
            if (diff == null) {
                diff = new ArrayList<DiffArrayxml>();
            }
            return this.diff;
        }

    }

}
