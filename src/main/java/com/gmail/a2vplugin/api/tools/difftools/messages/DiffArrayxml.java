
package com.gmail.a2vplugin.api.tools.difftools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diffArrayxml", propOrder = { "attribute", "elementSubtree", "elementSubtreeOptions",
        "nameAndNamespace", "recursive", "textContent", "textContentOptions", "xpath" })
public class DiffArrayxml {

    protected Attribute attribute;
    protected boolean elementSubtree;
    protected ElementSubtreeOptions elementSubtreeOptions;
    protected boolean nameAndNamespace;
    protected boolean recursive;
    protected boolean textContent;
    protected TextContentOptions textContentOptions;
    protected String xpath;

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute value) {
        this.attribute = value;
    }

    public boolean isElementSubtree() {
        return elementSubtree;
    }

    public void setElementSubtree(boolean value) {
        this.elementSubtree = value;
    }

    public ElementSubtreeOptions getElementSubtreeOptions() {
        return elementSubtreeOptions;
    }

    public void setElementSubtreeOptions(ElementSubtreeOptions value) {
        this.elementSubtreeOptions = value;
    }

    public boolean isNameAndNamespace() {
        return nameAndNamespace;
    }

    public void setNameAndNamespace(boolean value) {
        this.nameAndNamespace = value;
    }

    public boolean isRecursive() {
        return recursive;
    }

    public void setRecursive(boolean value) {
        this.recursive = value;
    }

    public boolean isTextContent() {
        return textContent;
    }

    public void setTextContent(boolean value) {
        this.textContent = value;
    }

    public TextContentOptions getTextContentOptions() {
        return textContentOptions;
    }

    public void setTextContentOptions(TextContentOptions value) {
        this.textContentOptions = value;
    }

    public String getXpath() {
        return xpath;
    }

    public void setXpath(String value) {
        this.xpath = value;
    }

}
