package com.gmail.a2vplugin.plugins.soapui.api.tool;

import com.eviware.soapui.model.ModelItem;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.suites.messages.RequirementsAndNotes;
import com.gmail.a2vplugin.api.suites.responders.messages.ResponderSuitesRequest;
import com.gmail.a2vplugin.api.suites.responders.messages.ResponderSuitesResponse;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class ResponderSuiteTool extends AbstractTool {

    private final String path = "/parasoftapi/v1/suites/responderSuites";

    public ResponderSuiteTool(AbstractTool tool) {
        super(tool);
    }

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void create(String name, String desc) throws Exception {
        getMonitor().setProgress(1, name);

        ResponderSuitesRequest request = new ResponderSuitesRequest();
        request.setParent(new Parent());
        request.getParent().setId(this.getParentId());
        request.setName(name);
        request.setRequirementsAndNotes(new RequirementsAndNotes());
        request.getRequirementsAndNotes().setNotes(desc);

        ResponderSuitesResponse response = getResponse(request, ResponderSuitesResponse.class);
        setId(response.getId());
        LogUtil.info(response.getId() + " << Responder Suite Created");
    }

    public void create(ModelItem model) throws Exception {
        create(model.getName(), model.getDescription());
    }

}
