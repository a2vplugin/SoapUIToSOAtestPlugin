package com.gmail.a2vplugin.plugins.soapui.api.tool;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.model.propertyexpansion.PropertyExpansionUtils;
import com.eviware.x.dialogs.XProgressMonitor;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;
import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public abstract class AbstractTool {
    private String url = null;
    private String parentId = null;
    private XProgressMonitor monitor = null;
    private String id = null;
    private String datasource = "";
    public static String languageSet=null;

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

//    private static final Logger LOGGER = SoapUICustomPluginLogger.getLogger(AbstractTool.class);

    public AbstractTool(String url, String parentId, XProgressMonitor monitor) {
        this.url = url;
        this.parentId = parentId;
        this.monitor = monitor;
    }

    /**
     * @param parent
     */
    public AbstractTool(AbstractTool parent) {
        this.parent = parent;
        this.datasource = parent.getDatasource();
        this.url = parent.getUrl();

        String languageProperty = PropertyExpansionUtils.getGlobalProperty("soatest.api.language");
        languageSet = getLanguageSet(languageProperty);
        if (languageSet == null) {
            LogUtil.error("language is null....");
        }

        if (parent instanceof TstTool) {
            this.parentId = parent.getId() + languageSet;
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

    public String getLanguageSet(String language) {
        switch (language) {
            case "English":
                return "/Test Suite";
            case "Chinese":
                return "/测试套件";
            case "Japanese":
                return "/テスト スイート";
            default:
        //        LogUtil.info("default is English, need to set the correct language property!!");
                return "/Test Suite";
        }
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
//        LOGGER.info("postRequest: "+postRequest);
//        LogUtil.info("request in " + Thread.currentThread().getStackTrace() + request);
        JSONObject json = JSONObject.fromObject(request);
        String content = json.toString();//this place change the utf-8 format and re-encode

//        LOGGER.info("json content before replace: "+content);

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

        LogUtil.debug("content msg: " + content);
//        LOGGER.info("content after replace: " + content);

        StringEntity input;
        try {
//            input = new StringEntity(content,"utf-8");
//            LogUtil.info("String Entity: "+input.getContent())
            //this StringEntity encoding must be set as utf-8
            input = new StringEntity(content, "utf-8");
            input.setContentType("application/json");
            postRequest.setEntity(input);


        } catch (UnsupportedEncodingException e1) {
            SoapUI.log("UnsupportedEncodingException !");
        }

        HttpResponse response = null;
        StatusLine sl = null;

        response = httpClient.execute(postRequest);
        sl = response.getStatusLine();

//        LOGGER.info("executed response: " + response +"\t"  + sl);

        StringBuffer msg = new StringBuffer();
        BufferedReader br = null;
        try {
            //the bufferReader must set correct encoding as UTF-8
            br = new BufferedReader(new InputStreamReader((response.getEntity().getContent()), "utf-8"));
            String output = null;
            while ((output = br.readLine()) != null) {
                msg.append(output);
            }
            LogUtil.debug("response msg: " + msg.toString());

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
