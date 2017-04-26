package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import com.gmail.a2vplugin.api.children.messages.ChildrenQueryResponse;
import com.gmail.a2vplugin.api.common.messages.Child;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

import net.sf.json.JSONObject;

public class ChildrenTool extends AbstractTool {

    public ChildrenTool(AbstractTool parent) {
        super(parent);
    }

    private static final String path = "/parasoftapi/v1/children";

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    @SuppressWarnings("rawtypes")
    public boolean existFile(String filePath, String fileName) throws ResponseException {
        DefaultHttpClient httpClient = null;

        httpClient = new DefaultHttpClient();
        List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
        params.add(new BasicNameValuePair("id", filePath));
        String param = URLEncodedUtils.format(params, null);
        HttpGet getRequest = new HttpGet(getPostPath() + "?" + param);
        LogUtil.debug("Request:" + getRequest.getURI().toString());

        HttpResponse response = null;
        try {
            response = httpClient.execute(getRequest);
        } catch (ClientProtocolException e) {
            LogUtil.warn("ChildrenTool ClientProtocolException!");
        } catch (IOException e) {
            LogUtil.warn("ChildrenTool IOException!");
        }

        StatusLine sl = response.getStatusLine();
        if (sl.getStatusCode() != 200) {
            StringBuffer msg = null;
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
                String output = null;
                msg = new StringBuffer();
                while ((output = br.readLine()) != null) {
                    msg.append(output);
                }
                br.close();
            } catch (IllegalStateException e) {
                LogUtil.warn("ChildrenTool Response IllegalStateException!");
            } catch (IOException e) {
                LogUtil.warn("ChildrenTool InputStream error!");
            }
            throw new ResponseException("Response:" + msg.toString());
        } else {
            StringBuffer msg = null;
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
                String output = null;
                msg = new StringBuffer();
                while ((output = br.readLine()) != null) {
                    msg.append(output);
                }
                br.close();
            } catch (IllegalStateException e) {
                LogUtil.warn("Response IllegalStateException!");
            } catch (IOException e) {
                LogUtil.warn("InputStream error!");
            }
            LogUtil.debug("Response:" + msg.toString());
            Map<String, Class> classMap = new HashMap<String, Class>();
            classMap.put("children", Child.class);
            ChildrenQueryResponse resp = (ChildrenQueryResponse) JSONObject
                    .toBean(JSONObject.fromObject(msg.toString()), ChildrenQueryResponse.class, classMap);
            String fullFileName = "/" + fileName;
            for (Child child : resp.getChildren()) {
                LogUtil.debug(child.getName());
                if (child.getId().endsWith(fullFileName)) {
                    return true;
                }
            }
            return false;
        }
    }

}
