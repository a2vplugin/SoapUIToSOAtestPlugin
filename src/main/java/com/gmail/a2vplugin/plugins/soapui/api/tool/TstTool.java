package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.model.ModelItem;
import com.eviware.x.dialogs.XProgressMonitor;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.files.tsts.messages.ObjectFactory;
import com.gmail.a2vplugin.api.files.tsts.messages.TstsRequest;
import com.gmail.a2vplugin.api.files.tsts.messages.TstsResponse;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class TstTool extends AbstractTool {

    public TstTool(String url, String parentId, XProgressMonitor monitor) {
        super(url, parentId, monitor);
    }

    private final String path = "/parasoftapi/v1/files/tsts";

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void create(ModelItem model) throws ResponseException {

        String reqName = model.getName();

        reqName = turnName(reqName);
        this.getMonitor().setProgress(1, reqName);
        ObjectFactory factory = new ObjectFactory();
        TstsRequest request = factory.createTstsRequest();
        Parent parent = new Parent();
        request.setParent(parent);
        parent.setId(this.getParentId());
        request.setName(reqName);
        TstsResponse response = null;

        try {
            response = getResponse(request, TstsResponse.class);
        } catch (ClientProtocolException e) {
            LogUtil.warn("TstTool ClientProtocolException!");
        } catch (ResponseException e) {
            throw new ResponseException("TstTool:" + e.getMessage());
        } catch (IOException e) {
            LogUtil.warn("TstTool IOException!");
        }

        this.setId(response.getId());
        LogUtil.info(response.getId() + " << Tst File Created");
    }

    public String turnName(String reqName) {
        if (ValidateName.validate(reqName)) {
            SoapUI.log(reqName + "tst's name  catains / ,change to & ! ......");
            reqName = ValidateName.changeName(reqName);
            SoapUI.log(reqName);
        }
        return reqName;
    }
}
