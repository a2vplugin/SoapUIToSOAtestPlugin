package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.model.propertyexpansion.PropertyExpansionUtils;
import com.eviware.x.dialogs.XProgressMonitor;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

import net.sf.json.JSONObject;

public abstract class AbstractTool {
    private String url = null;
    private String parentId = null;
    private XProgressMonitor monitor = null;
    private String id = null;
    private String datasource = "";

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    private AbstractTool parent = null;

    public AbstractTool getParent() {
        return parent;
    }

    public void setParent(AbstractTool parent) {
        this.parent = parent;
    }

    public abstract String getPostPath();

    public AbstractTool(String url, String parentId, XProgressMonitor monitor) {
        this.url = url;
        this.parentId = parentId;
        this.monitor = monitor;
    }

    public AbstractTool(AbstractTool parent) {
        this.parent = parent;
        this.datasource = parent.getDatasource();
        this.url = parent.getUrl();
        if (parent instanceof TstTool) {
            this.parentId = parent.getId() + "/Test Suite";
        } else if (parent instanceof SoapTool) {
            this.parentId = parent.getId() + "/Response SOAP Envelope";
        } else if (parent instanceof RestTool) {
            this.parentId = parent.getId() + "/Response Traffic";
        } else if (parent instanceof ExtensionTool) {
            this.parentId = parent.getId() + "/Return Value";
        } else {
            this.parentId = parent.getId();
        }
        this.monitor = parent.getMonitor();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public XProgressMonitor getMonitor() {
        return monitor;
    }

    public void setMonitor(XProgressMonitor monitor) {
        this.monitor = monitor;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @SuppressWarnings("unchecked")
    public <T, K> K getResponse(T request, Class<K> resp)
            throws ResponseException, ClientProtocolException, IOException {

        DefaultHttpClient httpClient = null;

        httpClient = new DefaultHttpClient();
        String username = PropertyExpansionUtils.getGlobalProperty("soatest.api.username");
        String password = PropertyExpansionUtils.getGlobalProperty("soatest.api.password");
        if (username != null && username.length() > 0) {
            httpClient.getCredentialsProvider().setCredentials(AuthScope.ANY,
                    new UsernamePasswordCredentials(username, password));
        }

        HttpPost postRequest = new HttpPost(this.getPostPath());
        JSONObject json = JSONObject.fromObject(request);
        String content = json.toString();

        if (this instanceof SoapTool) {
            content = content.replace("\"parameterized\":null,", "");
        } else if (this instanceof RestTool) {
            content = content.replace("\"parameterized\":null,", "");
        } else if (this instanceof MessageResponderTool) {
            content = content.replace("\"parameterized\":null,", "");
        } else if (this instanceof AssertorTool) {
            content = content.replace(",\"parameterized\":null", "");
            content = content.replace(",\"valueAssertion\":null", "");
            content = content.replace(",\"valueOccurrenceAssertion\":null", "");
            content = content.replace("\"hasContentAssertion\":null,", "");
        } else if (this instanceof DataBankTool) {
            content = content.replace(",\"suiteVariable\":null", "");
            content = content.replace(",\"writableDataSource\":null", "");
            content = content.replace(",\"entireElement\":null", "");
        } else if (this instanceof EnvTool) {
            content = content.replace(",\"reference\":null", "");
        } else if (this instanceof ExcelDataSourceTool) {
            content = content.replace(",\"reference\":null", "");
        } else if (this instanceof DBTool) {
            content = content.replace("\"parameterized\":null,", "");
        }

        StringEntity input;
        try {
            input = new StringEntity(content);
            input.setContentType("application/json");
            postRequest.setEntity(input);

        } catch (UnsupportedEncodingException e1) {
            SoapUI.log("UnsupportedEncodingException !");
        }

        HttpResponse response = null;
        StatusLine sl = null;
        response = httpClient.execute(postRequest);
        sl = response.getStatusLine();

        StringBuffer msg = new StringBuffer();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
            String output = null;
            while ((output = br.readLine()) != null) {
                msg.append(output);
            }

        } catch (IOException e) {
            SoapUI.log("print error'response time 's exception! not a soaui excption:" + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (sl.getStatusCode() != 200) {
            throw new ResponseException("Response error:" + msg.toString());
        } else {
            LogUtil.debug("Response:" + msg.toString());
            return ((K) JSONObject.toBean(JSONObject.fromObject(msg.toString()), resp));

        }

    }

}
