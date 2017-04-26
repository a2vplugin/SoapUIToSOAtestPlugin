
package com.gmail.a2vplugin.api.tools.xmldatabanks.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectedXpath", propOrder = { "dataSourceColumn", "selectedElement" })
public class SelectedXpath {

    @XmlElement(required = true)
    protected DataSourceColumn dataSourceColumn;
    @XmlElement(required = true)
    protected SelectedElement selectedElement;

    public DataSourceColumn getDataSourceColumn() {
        return dataSourceColumn;
    }

    public void setDataSourceColumn(DataSourceColumn value) {
        this.dataSourceColumn = value;
    }

    public SelectedElement getSelectedElement() {
        return selectedElement;
    }

    public void setSelectedElement(SelectedElement value) {
        this.selectedElement = value;
    }

}
