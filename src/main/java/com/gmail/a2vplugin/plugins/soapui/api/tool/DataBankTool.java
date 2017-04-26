package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.tools.xmldatabanks.messages.ContentOnly;
import com.gmail.a2vplugin.api.tools.xmldatabanks.messages.CustomColumn;
import com.gmail.a2vplugin.api.tools.xmldatabanks.messages.DataSourceColumn;
import com.gmail.a2vplugin.api.tools.xmldatabanks.messages.ObjectFactory;
import com.gmail.a2vplugin.api.tools.xmldatabanks.messages.SelectedElement;
import com.gmail.a2vplugin.api.tools.xmldatabanks.messages.SelectedElementOptions;
import com.gmail.a2vplugin.api.tools.xmldatabanks.messages.SelectedXpath;
import com.gmail.a2vplugin.api.tools.xmldatabanks.messages.ToolSettings;
import com.gmail.a2vplugin.api.tools.xmldatabanks.messages.XmlDataBanksRequest;
import com.gmail.a2vplugin.api.tools.xmldatabanks.messages.XmlDataBanksResponse;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class DataBankTool extends AbstractTool {

    public DataBankTool(AbstractTool parent) {
        super(parent);
    }

    private static final String path = "/parasoftapi/v1/tools/xmlDataBanks";

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void create(List<String[]> args) throws ResponseException {
        ObjectFactory factory = new ObjectFactory();

        XmlDataBanksRequest request = factory.createXmlDataBanksRequest();

        request.setDataSource(getDatasource());

        ToolSettings toolSettings = factory.createToolSettings();
        request.setToolSettings(toolSettings);
        {
            List<SelectedXpath> selectedElements = new ArrayList<SelectedXpath>();
            toolSettings.setSelectedElements(selectedElements);
            {
                for (String[] arg : args) {
                    if (arg.length < 2) {
                        LogUtil.error("ArrayIndexOutOfBounds when creating data bank");
                        continue;
                    }
                    SelectedXpath selectedXpath = factory.createSelectedXpath();
                    selectedElements.add(selectedXpath);
                    {
                        SelectedElement element = factory.createSelectedElement();
                        selectedXpath.setSelectedElement(element);
                        {
                            element.setXpath(arg[1]);
                            SelectedElementOptions options = factory.createSelectedElementOptions();
                            element.setOptions(options);
                            {
                                options.setContentOnly(ContentOnly.textContent);
                            }
                        }
                        DataSourceColumn column = factory.createDataSourceColumn();
                        selectedXpath.setDataSourceColumn(column);
                        {
                            CustomColumn custom = factory.createCustomColumn();
                            column.setCustomColumn(custom);
                            {
                                custom.setCustomColumnName(arg[0]);
                            }
                        }
                    }
                }
            }

        }

        request.setName("XML data bank");

        Parent parent = new Parent();
        request.setParent(parent);
        {

            parent.setId(getParentId());
        }

        XmlDataBanksResponse response = null;
        try {
            response = getResponse(request, XmlDataBanksResponse.class);
        } catch (ClientProtocolException e) {
            LogUtil.warn("DatabankTool ClientProtocolException!");
        } catch (ResponseException e) {
            throw new ResponseException("DataBnakTool:" + e.getMessage());
        } catch (IOException e) {
            LogUtil.warn("DatabankTool IOException!");
        }
        setId(response.getId());
        LogUtil.info(response.getId() + " << XmlDataBank Created");
    }

}
