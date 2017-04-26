
package com.gmail.a2vplugin.api.tools.difftools.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ignoredTextDifferences", propOrder = { "diffArray" })
public class IgnoredTextDifferences {

    protected IgnoredTextDifferences.DiffArray diffArray;

    public IgnoredTextDifferences.DiffArray getDiffArray() {
        return diffArray;
    }

    public void setDiffArray(IgnoredTextDifferences.DiffArray value) {
        this.diffArray = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "diff" })
    public static class DiffArray {

        protected List<DiffArraytext> diff;

        public List<DiffArraytext> getDiff() {
            if (diff == null) {
                diff = new ArrayList<DiffArraytext>();
            }
            return this.diff;
        }

    }

}
