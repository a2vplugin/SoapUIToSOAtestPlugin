package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;

import com.eviware.soapui.model.propertyexpansion.PropertyExpansionUtils;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.files.messages.FileUploadRequest;
import com.gmail.a2vplugin.api.files.messages.FilesResponse;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

import net.sf.json.JSONObject;

public class FileUploadTool extends AbstractTool {

    public FileUploadTool(AbstractTool parent) {
        super(parent);
    }

    private static final String path = "/parasoftapi/v1/files/upload";

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void create(String filePath) throws ResponseException {
        File file = new File(filePath);

        ChildrenTool childrenTool = new ChildrenTool(this);
        if (childrenTool.existFile(this.getParent().getParentId(), file.getName())) {
            setId(getParent().getParentId() + "/" + file.getName());
            return;
        }

        FileUploadRequest request = new FileUploadRequest();
        Parent parent = new Parent();
        request.setParent(parent);
        {

            parent.setId(getParent().getParentId());
        }

        FilesResponse response = null;
        try {
            try {
                response = getResponse(request, file);
            } catch (ResponseException e) {
                throw new ResponseException("File UploadTool: " + e.getMessage());
            }
        } catch (ClientProtocolException e) {
            LogUtil.warn("FileUploadTool ClientProtocolException");
        } catch (IOException e) {
            LogUtil.warn("FileUploadTool IOException");
        }
        setId(response.getId());
        LogUtil.debug(response.getId());
        LogUtil.info(response.getId() + " << File Uploaded");
    }

    private FilesResponse getResponse(FileUploadRequest request, File file)
            throws ClientProtocolException, IOException, ResponseException {
        DefaultHttpClient httpClient = null;

        httpClient = new DefaultHttpClient();
        String username = PropertyExpansionUtils.getGlobalProperty("soatest.api.username");
        String password = PropertyExpansionUtils.getGlobalProperty("soatest.api.password");
        if (username != null && username.length() > 0) {
            httpClient.getCredentialsProvider().setCredentials(AuthScope.ANY,
                    new UsernamePasswordCredentials(username, password));
        }

        HttpPost postRequest = new HttpPost(getPostPath());
        JSONObject json = JSONObject.fromObject(request);
        LogUtil.debug("Request:" + json.toString());
        MultipartEntity input = new MultipartEntity();
        try {
            input.addPart("data", new StringBody(json.toString(), "application/json", null));
        } catch (UnsupportedEncodingException e) {
            LogUtil.warn("FilesResponse UnsupportedEncodingException!");
        }
        input.addPart("file", new FileBody(file));
        postRequest.setEntity(input);

        HttpResponse response = httpClient.execute(postRequest);

        StatusLine sl = response.getStatusLine();
        if (sl.getStatusCode() != 200) {
            BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
            String output = null;
            StringBuffer msg = new StringBuffer();
            while ((output = br.readLine()) != null) {
                msg.append(output);
            }
            br.close();
            throw new ResponseException(msg.toString());
        } else {
            BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
            String output = null;
            StringBuffer msg = new StringBuffer();
            while ((output = br.readLine()) != null) {
                msg.append(output);
            }
            br.close();
            LogUtil.debug("Response:" + msg.toString());
            return (FilesResponse) JSONObject.toBean(JSONObject.fromObject(msg.toString()), FilesResponse.class);
        }
    }
}
