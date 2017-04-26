package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.eviware.soapui.impl.wsdl.teststeps.WsdlDataSourceTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.datasource.ExcelDataSource;
import com.gmail.a2vplugin.api.common.messages.FileLocation;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.datasources.messages.ExcelDataSourcesRequest;
import com.gmail.a2vplugin.api.datasources.messages.ExcelDataSourcesResponse;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class ExcelDataSourceTool extends AbstractTool {

    public ExcelDataSourceTool(AbstractTool parent) {
        super(parent);
    }

    private static final String path = "/parasoftapi/v1/datasources/excel";

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void createInstead(WsdlDataSourceTestStep dsTestStep) throws ResponseException {

        String filepath = "/" + dsTestStep.getProject().getName();
        FileTool fileTool = new FileTool(this);
        fileTool.createTempFile(filepath, "temp.xlsx");

        ExcelDataSourcesRequest request = new ExcelDataSourcesRequest();

        FileLocation fileLocation = new FileLocation();
        request.setLocation(fileLocation);
        {
            fileLocation.setId(filepath + "/temp.xlsx");
        }

        request.setStopAtTheFirstEmptyRow(false);

        request.setSheet("sheet1");

        request.setName(dsTestStep.getName());

        Parent parent = new Parent();
        request.setParent(parent);
        {
            parent.setId(getParentId());
        }

        ExcelDataSourcesResponse response = null;
        try {
            response = getResponse(request, ExcelDataSourcesResponse.class);
        } catch (ClientProtocolException e) {
            LogUtil.warn("ExcelData ClientProtocolException" + e.getMessage());
        } catch (ResponseException e) {
            throw new ResponseException("ExcelData Exception" + e.getMessage());
        } catch (IOException e) {
            LogUtil.warn("ExcelData IOException" + e.getMessage());
        }
        setId(response.getId());
        LogUtil.debug(response.getId());
        LogUtil.info(response.getId() + " << Excel Data Source Created");
    }

    public void create(WsdlDataSourceTestStep dsTestStep, ExcelDataSource ds, CacheTool cacheTool,
            FileUploadTool fileTool) throws ResponseException {
        ExcelDataSourcesRequest request = new ExcelDataSourcesRequest();

        FileLocation fileLocation = new FileLocation();
        request.setLocation(fileLocation);
        {
            fileLocation.setId(fileTool.getId());
        }

        request.setStopAtTheFirstEmptyRow(ds.getIgnoreEmpty());

        request.setSheet(ds.getWorksheet());

        request.setName(dsTestStep.getName());

        Parent parent = new Parent();
        request.setParent(parent);
        {
            parent.setId(getParentId());
        }

        ExcelDataSourcesResponse response = null;
        try {
            response = getResponse(request, ExcelDataSourcesResponse.class);
        } catch (ClientProtocolException e) {
            LogUtil.warn("ExcelData ClientProtocolException!");
        } catch (ResponseException e) {
            throw new ResponseException("ExcelData:" + e.getMessage());
        } catch (IOException e) {

            e.printStackTrace();
        }
        setId(response.getId());
        LogUtil.debug(response.getId());
        LogUtil.info(response.getId() + " << Excel Data Source Created");
    }

}
