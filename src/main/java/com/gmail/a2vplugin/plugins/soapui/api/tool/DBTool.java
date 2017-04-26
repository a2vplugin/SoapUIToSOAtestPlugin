package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.eviware.soapui.impl.wsdl.teststeps.ProJdbcRequestTestStep;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFPType;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.tools.dbtools.messages.Connection;
import com.gmail.a2vplugin.api.tools.dbtools.messages.DbToolsRequest;
import com.gmail.a2vplugin.api.tools.dbtools.messages.DbToolsResponse;
import com.gmail.a2vplugin.api.tools.dbtools.messages.Local;
import com.gmail.a2vplugin.api.tools.dbtools.messages.SqlQuery;
import com.gmail.a2vplugin.api.tools.dbtools.messages.ToolSettings;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class DBTool extends AbstractTool {
    private final String path = "/parasoftapi/v1/tools/dbTools";

    public DBTool(AbstractTool parent) {
        super(parent);
    }

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void create(ProJdbcRequestTestStep step) throws ResponseException {
        getMonitor().setProgress(1, step.getName());

        DbToolsRequest request = new DbToolsRequest();

        request.setDataSource(getDatasource());

        request.setName(step.getName());

        Parent parent = new Parent();
        request.setParent(parent);
        {

            parent.setId(getParentId());
        }

        ToolSettings set = new ToolSettings();
        request.setToolSettings(set);
        {

            SqlQuery query = new SqlQuery();
            set.setSqlQuery(query);
            {
                ComplexValueFP value = new ComplexValueFP();
                query.setValue(value);
                {
                    value.setType(ComplexValueFPType.fixed);
                    value.setFixed(step.getQuery());
                }
            }

            Connection conn = new Connection();
            set.setConnection(conn);
            {
                Local local = new Local();
                conn.setLocal(local);
                {
                    local.setUsername(handleUserName(step));
                    local.setPassword(step.getPassword());
                    local.setDriver(step.getDriver());
                    local.setUrl(handleUrl(step));
                }
            }
        }

        DbToolsResponse response = null;
        try {
            response = getResponse(request, DbToolsResponse.class);
        } catch (ClientProtocolException e) {
            LogUtil.warn("DBTool ClientProtocolException" + e.getMessage());
        } catch (ResponseException e) {
            throw new ResponseException("DBTool Exception" + e.getMessage());
        } catch (IOException e) {
            LogUtil.warn("DBTool IOException" + e.getMessage());
        }
        setId(response.getId());
        LogUtil.info(response.getId() + " << DB Tool Created");
    }

    private String handleUrl(ProJdbcRequestTestStep step) {
        String s = step.getConnectionString();
        if (s.indexOf("?") != -1) {
            s = s.substring(0, s.indexOf("?"));
        }
        return s;
    }

    private String handleUserName(ProJdbcRequestTestStep step) {
        String s = step.getConnectionString();
        if (s.indexOf("?") == -1) {
            return "";
        }
        s = s.substring(s.indexOf("?") + 1);
        if (s.length() == 0) {
            return "";
        }
        String[] arg = s.split("&");
        if (arg == null || arg.length != 2) {
            return "";
        }
        String[] username = arg[0].split("=");
        if (username == null || username.length != 2) {
            return "";
        }
        if (!"user".equals(username[0])) {
            return "";
        }
        return username[1];
    }

}
