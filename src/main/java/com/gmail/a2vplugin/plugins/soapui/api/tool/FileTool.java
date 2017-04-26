package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.files.messages.FileType;
import com.gmail.a2vplugin.api.files.messages.FilesRequest;
import com.gmail.a2vplugin.api.files.messages.FilesResponse;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class FileTool extends AbstractTool {

    public FileTool(AbstractTool parent) {
        super(parent);
    }

    private final String path = "/parasoftapi/v1/files";

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void createTempFile(String filePath, String fileName) throws ResponseException {
        ChildrenTool childTool = new ChildrenTool(this);
        if (childTool.existFile(filePath, fileName)) {
            return;
        }
        FilesRequest request = new FilesRequest();
        request.setType(FileType.file);
        Parent parent = new Parent();
        request.setParent(parent);
        {
            parent.setId(filePath);
        }
        request.setName(fileName);

        FilesResponse response = null;
        try {
            response = getResponse(request, FilesResponse.class);
        } catch (ClientProtocolException e) {
            LogUtil.warn("FileTool ClientProtocolException" + e.getMessage());
        } catch (ResponseException e) {
            throw new ResponseException("FileTool Exception" + e.getMessage());
        } catch (IOException e) {
            LogUtil.warn("FileTool IOException" + e.getMessage());
        }
        setId(response.getId());
        LogUtil.info(response.getId() + " << Temp File Created");
    }

}
