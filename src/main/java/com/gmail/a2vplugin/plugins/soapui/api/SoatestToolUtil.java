package com.gmail.a2vplugin.plugins.soapui.api;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.eviware.soapui.impl.rest.RestMethod;
import com.eviware.soapui.impl.rest.RestRequest;
import com.eviware.soapui.impl.rest.RestResource;
import com.eviware.soapui.impl.rest.RestService;
import com.eviware.soapui.impl.wsdl.WsdlInterface;
import com.eviware.soapui.impl.wsdl.WsdlRequest;
import com.eviware.soapui.impl.wsdl.teststeps.ProJdbcRequestTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.RestTestRequestStep;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlDataSourceTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlPropertiesTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestRequest;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestRequestStep;
import com.eviware.soapui.impl.wsdl.teststeps.datasource.ExcelDataSource;
import com.eviware.soapui.model.ModelItem;
import com.eviware.soapui.model.iface.Interface;
import com.eviware.soapui.model.iface.Operation;
import com.eviware.soapui.model.iface.Request;
import com.eviware.soapui.model.project.Project;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestProperty;
import com.eviware.soapui.model.testsuite.TestStep;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.x.dialogs.XProgressMonitor;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.tool.AbstractTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.CacheTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.DBTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.DataBankTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.EnvTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.ExcelDataSourceTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.ExtensionTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.FileUploadTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.RestTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.SoapTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.TestSuiteTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.TstTool;
import com.gmail.a2vplugin.plugins.soapui.api.tool.ValidateName;

public class SoatestToolUtil {

    public static void create(String url, XProgressMonitor monitor, Project project) {

        String projectName = project.getName();
        if (ValidateName.validate(projectName)) {
            LogUtil.info(projectName + ":Project's name  catains / ,change to & ;  :  to $ ");
            projectName = ValidateName.changeName(projectName);
            LogUtil.info(projectName);
        }
        String parentId = "/" + projectName;
        ArrayList<Interface> infs = (ArrayList<Interface>) project.getInterfaceList();
        LogUtil.info("------------------------------------------------" + infs.size());

        TstTool tstTool = new TstTool(url, parentId, monitor);
        for (int i = 0; i < infs.size(); i++) {

            Interface inf = infs.get(i);
            createBy(inf, tstTool);
        }

        for (TestSuite tSuite : project.getTestSuiteList()) {
            LogUtil.info("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTtestSuite's size" + tSuite.getTestCaseList().size());
            String tsuName = tSuite.getName();
            if (ValidateName.validate(tsuName)) {
                LogUtil.info(tsuName + " tSuiteName contains / change to +! ");
                tsuName = ValidateName.changeName(tsuName);
                LogUtil.info(tsuName);
            }
            String subParentId = parentId + "/" + tsuName;
            CacheTool cacheTool = new CacheTool();
            cacheTool.tstTool = new TstTool(url, subParentId, monitor);

            for (int i = 0; i < tSuite.getTestCaseList().size(); i++) {
                TestCase tCase = tSuite.getTestCaseList().get(i);
                cacheTool.envTool = new EnvTool(cacheTool.tstTool);
                cacheTool.collectDataSource(tCase);
                try {
                    cacheTool.tstTool.create(tCase);
                } catch (ResponseException e) {
                    LogUtil.info("TestCase-tstException1 : " + e.getMessage());
                }
                createBy(tCase, cacheTool);

            }
        }

    }

    private static void createBy(Interface inf, TstTool tstTool) {

        try {
            tstTool.create(inf);
        } catch (ResponseException e) {
            LogUtil.info("TstException1 :" + e.getMessage());
        }

        if ("wsdl".equals(inf.getInterfaceType())) {
            WsdlInterface wsdlInf = (WsdlInterface) inf;

            EnvTool envTool = new EnvTool(tstTool);
            String[] endpoints = wsdlInf.getEndpoints();
            if (endpoints.length > 0) {
                envTool.add(endpoints);
            }
            try {
                envTool.create();
            } catch (ResponseException e) {
                LogUtil.info("EnvToolException1 :" + e.getMessage());
            }

            for (Operation oper : wsdlInf.getAllOperations()) {
                TestSuiteTool operTestSuiteTool = new TestSuiteTool(tstTool);
                try {
                    operTestSuiteTool.create(oper);
                } catch (ResponseException e) {
                    LogUtil.info("TestSuiteException1 :" + e.getMessage());
                }
                SoapTool soapTool = new SoapTool(operTestSuiteTool);
                for (Request req : oper.getRequestList()) {
                    try {
                        soapTool.create((WsdlRequest) req, envTool);
                    } catch (ResponseException e) {
                        LogUtil.info("SoapToolException1 :" + e.getMessage());
                    }
                }
            }

        } else if ("rest".equals(inf.getInterfaceType())) {
            RestService restInf = (RestService) inf;

            EnvTool envTool = new EnvTool(tstTool);
            String[] endpoints = restInf.getEndpoints();
            if (endpoints.length > 0) {
                envTool.add(endpoints);
            }

            for (ModelItem src : restInf.getChildren()) {
                if (!(src instanceof RestResource)) {
                    continue;
                }
                TestSuiteTool restResourceSuiteTool = new TestSuiteTool(tstTool);
                try {
                    restResourceSuiteTool.create(src);
                    handleRestResource((RestResource) src, restResourceSuiteTool, envTool);
                } catch (Exception e) {

                    e.printStackTrace();
                }

            }
            try {
                envTool.create();
            } catch (Exception e) {

                e.printStackTrace();
            }
        } else {
            LogUtil.warn("unsupport interface type:" + inf.getInterfaceType().getClass().getName());
        }
    }

    private static void handleRestResource(RestResource restResource, TestSuiteTool testSuiteTool, EnvTool envTool) {
        for (RestMethod restMethod : restResource.getRestMethodList()) {

            TestSuiteTool suite = new TestSuiteTool(testSuiteTool);
            try {
                suite.create(restMethod);
            } catch (ResponseException e) {
                LogUtil.warn("RestResource Step" + e.getMessage());
            }
            for (RestRequest restReq : restMethod.getRequestList()) {

                RestTool rest = new RestTool(suite);
                try {
                    rest.create(restReq, envTool, null);
                } catch (ResponseException e) {
                    LogUtil.warn("RestResourceReq Step" + e.getMessage());
                }
            }
        }
        for (ModelItem childRestResource : restResource.getChildren()) {
            if (!(childRestResource instanceof RestResource)) {
                continue;
            }
            TestSuiteTool subTestSuiteTool = new TestSuiteTool(testSuiteTool);
            try {
                subTestSuiteTool.create(childRestResource);
            } catch (ResponseException e) {
                LogUtil.warn("RestResourceTestSuite Step" + e.getMessage());
            }

            handleRestResource((RestResource) childRestResource, subTestSuiteTool, envTool);
        }
    }

    private static void createBy(TestCase tCase, CacheTool cacheTool) {
        TstTool tstTool = cacheTool.tstTool;
        EnvTool envTool = cacheTool.envTool;

        Map<String, List<String[]>> responseMap = getResponseMap(tCase);

        AbstractTool parent = tstTool;
        for (TestStep tStep : tCase.getTestStepList()) {

            if (cacheTool.datasourceMap.containsKey(tStep.getName())) {

                String datasourceStepName = cacheTool.datasourceMap.get(tStep.getName());

                TestSuiteTool suiteTool = new TestSuiteTool(parent);
                try {
                    suiteTool.create("data loop", "");
                } catch (ResponseException e) {
                    LogUtil.warn("SoaTool:" + e.getMessage());
                }
                suiteTool.setDatasource(datasourceStepName);

                parent = suiteTool;

                TestStep testStep = tCase.getTestStepByName(datasourceStepName);
                if (!(testStep instanceof WsdlDataSourceTestStep)) {
                    LogUtil.warn("datasource create fail:" + datasourceStepName);
                    return;
                }
                WsdlDataSourceTestStep dsTestStep = (WsdlDataSourceTestStep) testStep;
                if (dsTestStep.getDataSource() instanceof ExcelDataSource) {
                    ExcelDataSource ds = (ExcelDataSource) dsTestStep.getDataSource();

                    if (new File(ds.getFileName()).exists()) {
                        FileUploadTool fileTool = new FileUploadTool(cacheTool.tstTool);
                        try {
                            fileTool.create(ds.getFileName());
                        } catch (ResponseException e) {
                            LogUtil.warn("ExcelFile Create1 " + e.getMessage());
                        }
                        ExcelDataSourceTool excelTool = new ExcelDataSourceTool(parent);
                        try {
                            excelTool.create(dsTestStep, ds, cacheTool, fileTool);
                        } catch (ResponseException e) {
                            LogUtil.warn("ExcelFile Create2 " + e.getMessage());
                        }
                    } else {

                        ExcelDataSourceTool excelTool = new ExcelDataSourceTool(parent);
                        try {
                            excelTool.createInstead(dsTestStep);
                        } catch (ResponseException e) {
                            LogUtil.warn("ExcelFile Create3" + e.getMessage());
                        }
                    }
                } else {
                    LogUtil.warn("unsupport datasource:" + dsTestStep.getDataSource());

                    ExcelDataSourceTool excelTool = new ExcelDataSourceTool(parent);
                    try {
                        excelTool.createInstead(dsTestStep);
                    } catch (ResponseException e) {
                        LogUtil.warn("ExcelFile Create4" + e.getMessage());
                    }
                }
            }

            if (cacheTool.dataloopMap.containsKey(tStep.getName())) {

                if (parent != cacheTool.tstTool) {
                    parent = parent.getParent();
                }
            }

            if (tStep instanceof RestTestRequestStep) {
                RestRequest restReq = ((RestTestRequestStep) tStep).getRestMethod().getRequestAt(0);
                RestTool restTool = new RestTool(parent);
                try {
                    restTool.create(restReq, envTool, tStep.getName());
                } catch (ResponseException e) {
                    LogUtil.warn("Rest Step1" + e.getMessage());
                }

                if (responseMap.containsKey(restReq.getName())) {
                    DataBankTool bankTool = new DataBankTool(restTool);
                    try {
                        bankTool.create(responseMap.get(restReq.getName()));
                    } catch (ResponseException e) {
                        LogUtil.warn("Rest Step2" + e.getMessage());
                    }
                }

            }

            else if (tStep instanceof WsdlTestRequestStep) {
                SoapTool soapTool = new SoapTool(parent);
                WsdlTestRequestStep wsdlStep = (WsdlTestRequestStep) tStep;
                try {
                    soapTool.create((WsdlTestRequestStep) tStep, envTool);
                } catch (ResponseException e) {
                    LogUtil.warn("Soap Step1" + e.getMessage());
                }

                if (responseMap.containsKey(wsdlStep.getName())) {
                    DataBankTool bankTool = new DataBankTool(soapTool);
                    try {
                        bankTool.create(responseMap.get(wsdlStep.getName()));
                    } catch (ResponseException e) {
                        LogUtil.warn("Soap Step2" + e.getMessage());
                    }
                }

            }

            else if (tStep instanceof WsdlPropertiesTestStep) {
                try {
                    handleWsdlPropertiesTestStep((WsdlPropertiesTestStep) tStep, parent, envTool);
                } catch (Exception e) {
                    LogUtil.warn("property Step" + e.getMessage());
                }
            }

            else if (tStep instanceof ProJdbcRequestTestStep) {
                ProJdbcRequestTestStep jdbc = (ProJdbcRequestTestStep) tStep;
                DBTool dbTool = new DBTool(parent);
                try {
                    dbTool.create(jdbc);
                } catch (ResponseException e) {
                    LogUtil.warn("JDBC Step" + e.getMessage());
                }
            } else {
                LogUtil.debug("nosupport type of teststep:" + tStep.getClass().getName());
            }
        }
        try {
            envTool.create();
        } catch (ResponseException e) {
            LogUtil.warn("JDBC Step" + e.getMessage());
        }
    }

    private static void handleWsdlPropertiesTestStep(WsdlPropertiesTestStep prop, AbstractTool pTool, EnvTool envTool)
            throws Exception {
        for (TestProperty testProp : prop.getPropertyList()) {

            ExtensionTool extensionTool = new ExtensionTool(pTool);
            extensionTool.createByScript(testProp.getName(), testProp.getValue());

            DataBankTool bankTool = new DataBankTool(extensionTool);
            List<String[]> list = new ArrayList<String[]>();
            String[] s = new String[] { prop.getName() + "#" + testProp.getName(), "/value" };
            list.add(s);
            bankTool.create(list);

        }
    }

    private static Map<String, List<String[]>> getResponseMap(TestCase tCase) {
        Map<String, List<String[]>> responseMap = new HashMap<String, List<String[]>>();
        Set<String> all = new HashSet<String>();
        for (TestStep tStep : tCase.getTestStepList()) {

            if (tStep instanceof RestTestRequestStep) {
                Request request = ((RestTestRequestStep) tStep).getRestMethod().getRequestAt(0);
                Set<String> exlist = ExUtil.getExpressionList(request.getRequestContent());
                all.addAll(exlist);
                continue;
            }

            if (tStep instanceof WsdlTestRequestStep) {
                WsdlTestRequest request = ((WsdlTestRequestStep) tStep).getTestRequest();
                Set<String> exlist = ExUtil.getExpressionList(request.getRequestContent());
                all.addAll(exlist);
                continue;
            }
        }
        ExUtil.addToResponseMap(responseMap, all);
        return responseMap;
    }
}
