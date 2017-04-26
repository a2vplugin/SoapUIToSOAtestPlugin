package com.gmail.a2vplugin.plugins.soapui.api.tool;

import com.eviware.soapui.model.ModelItem;
import com.eviware.x.dialogs.XProgressMonitor;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.files.pvas.messages.ObjectFactory;
import com.gmail.a2vplugin.api.files.pvas.messages.PvasRequest;
import com.gmail.a2vplugin.api.files.pvas.messages.PvasResponse;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class PvaTool extends AbstractTool {

    public PvaTool(String url, String parentId, XProgressMonitor monitor) {
        super(url, parentId, monitor);
    }

    private final String path = "/parasoftapi/v1/files/pvas";

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void create(ModelItem model) throws Exception {
        getMonitor().setProgress(1, model.getName());
        ObjectFactory factory = new ObjectFactory();

        PvasRequest request = factory.createPvasRequest();
        Parent parent = new Parent();
        request.setParent(parent);
        {
            parent.setId(getParentId());
        }
        request.setName(model.getName());

        PvasResponse response = getResponse(request, PvasResponse.class);
        setId(response.getId());
        LogUtil.info(response.getId() + " << Pva File Created");
    }

}
