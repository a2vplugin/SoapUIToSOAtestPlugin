
package com.gmail.a2vplugin.api.tools.writefiletools.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.gmail.a2vplugin.api.common.messages.FileLocation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toolSettings", propOrder = { "append", "backupFileBeforeOverwriting", "beautifyXMLOutput",
        "createDirectories", "overrideDirectoryFromInput", "targetDirectory", "targetName", "useUTF8" })
public class ToolSettings {

    protected boolean append;
    protected boolean backupFileBeforeOverwriting;
    protected boolean beautifyXMLOutput;
    protected boolean createDirectories;
    protected boolean overrideDirectoryFromInput;
    @XmlElement(required = true)
    protected FileLocation targetDirectory;
    protected String targetName;
    protected boolean useUTF8;

    public boolean isAppend() {
        return append;
    }

    public void setAppend(boolean value) {
        this.append = value;
    }

    public boolean isBackupFileBeforeOverwriting() {
        return backupFileBeforeOverwriting;
    }

    public void setBackupFileBeforeOverwriting(boolean value) {
        this.backupFileBeforeOverwriting = value;
    }

    public boolean isBeautifyXMLOutput() {
        return beautifyXMLOutput;
    }

    public void setBeautifyXMLOutput(boolean value) {
        this.beautifyXMLOutput = value;
    }

    public boolean isCreateDirectories() {
        return createDirectories;
    }

    public void setCreateDirectories(boolean value) {
        this.createDirectories = value;
    }

    public boolean isOverrideDirectoryFromInput() {
        return overrideDirectoryFromInput;
    }

    public void setOverrideDirectoryFromInput(boolean value) {
        this.overrideDirectoryFromInput = value;
    }

    public FileLocation getTargetDirectory() {
        return targetDirectory;
    }

    public void setTargetDirectory(FileLocation value) {
        this.targetDirectory = value;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String value) {
        this.targetName = value;
    }

    public boolean isUseUTF8() {
        return useUTF8;
    }

    public void setUseUTF8(boolean value) {
        this.useUTF8 = value;
    }

}
