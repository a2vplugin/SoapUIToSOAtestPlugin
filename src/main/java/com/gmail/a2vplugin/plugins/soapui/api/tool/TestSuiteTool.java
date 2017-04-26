package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.model.ModelItem;
import com.gmail.a2vplugin.api.common.messages.ObjectFactory;
import com.gmail.a2vplugin.api.suites.messages.RequirementsAndNotes;
import com.gmail.a2vplugin.api.suites.tests.messages.TestSuitesRequest;
import com.gmail.a2vplugin.api.suites.tests.messages.TestSuitesResponse;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class TestSuiteTool extends AbstractTool {

    private final String path = "/parasoftapi/v1/suites/testSuites";

    public TestSuiteTool(AbstractTool tool) {
        super(tool);
    }

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void create(String name, String desc) throws ResponseException {

        getMonitor().setProgress(1, name);

        ObjectFactory factory = new ObjectFactory();
        TestSuitesRequest request = new TestSuitesRequest();
        request.setParent(factory.createParent());

        request.getParent().setId(this.getParentId());
        request.setName(name);

        request.setRequirementsAndNotes(new RequirementsAndNotes());
        request.getRequirementsAndNotes().setNotes(desc);

        TestSuitesResponse response = null;
        try {
            response = getResponse(request, TestSuitesResponse.class);
        } catch (ClientProtocolException e) {
            LogUtil.warn("TestSuite ClientProtocolException" + e.getMessage());
        } catch (ResponseException e) {
            throw new ResponseException("TestSuiteException" + e.getMessage());
        } catch (IOException e) {
            LogUtil.warn("TestSuite IOException" + e.getMessage());
        }

        setId(response.getId());
        LogUtil.info(response.getId() + " << Test Suite Created");
    }

    public void create(ModelItem model) throws ResponseException {
        String reqName = model.getName();
        reqName = turnName(reqName);
        create(reqName, model.getDescription());
    }

    public String turnName(String reqName) {
        if (ValidateName.validate(reqName)) {
            SoapUI.log(reqName + "testsuit's name  catains / ,change to + ! ");
            reqName = ValidateName.changeName(reqName);
            SoapUI.log(reqName);
        }
        return reqName;
    }
}
