package com.gmail.a2vplugin.plugins.soapui.api.tool;

import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.tools.extensiontools.messages.ExtensionToolsRequest;
import com.gmail.a2vplugin.api.tools.extensiontools.messages.ExtensionToolsResponse;
import com.gmail.a2vplugin.api.tools.extensiontools.messages.Method;
import com.gmail.a2vplugin.api.tools.extensiontools.messages.ObjectFactory;
import com.gmail.a2vplugin.api.tools.extensiontools.messages.ToolSettings;
import com.gmail.a2vplugin.api.tools.extensiontools.messages.Value;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class ExtensionTool extends AbstractTool {
    private final String path = "/parasoftapi/v1/tools/extensionTools";

    public ExtensionTool(AbstractTool parent) {
        super(parent);
    }

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void createByScript(String name, String value) throws Exception {
        ObjectFactory factory = new ObjectFactory();
        ExtensionToolsRequest request = new ExtensionToolsRequest();
        request.setDataSource(getDatasource());
        ToolSettings toolSettings = factory.createToolSettings();
        request.setToolSettings(toolSettings);
        {
            Value v = factory.createValue();
            toolSettings.setValue(v);
            {
                v.setText(getScript(value));
            }
            Method method = factory.createMethod();
            toolSettings.setMethod(method);
            {
                method.setName("getValue");
            }
            toolSettings.setLanguage("Groovy");
            toolSettings.setUseDataSource(false);
            toolSettings.setExitCodeIndicatesSuccess(false);
        }

        request.setName("Prop " + name);

        Parent parent = new Parent();
        request.setParent(parent);
        {
            parent.setId(getParentId());
        }

        ExtensionToolsResponse response = getResponse(request, ExtensionToolsResponse.class);
        setId(response.getId());
        LogUtil.info(response.getId() + " << Extension Tool Created");
    }

    private String getScript(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append("String getValue(){\r\n");
        sb.append("\treturn \"<value>\"");
        while (s.contains("${=")) {
            int start = s.indexOf("${=");
            if (start != 0) {
                String pre = s.substring(0, start);
                sb.append(" + \"");
                sb.append(pre);
                sb.append("\"");
                s = s.substring(start);
            } else {
                int end = s.indexOf("}", start);
                String expresion = s.substring(start + 3, end);
                sb.append(" + ");
                sb.append(expresion);
                s = s.substring(end + 1);
            }
        }
        if (s.length() > 0) {
            sb.append(" + \"");
            sb.append(s);
            sb.append("\"");
        }
        sb.append(" + \"");
        sb.append("</value>\"\r\n");
        sb.append("}");
        return sb.toString();
    }

}
