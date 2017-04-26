package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.eviware.soapui.impl.wsdl.teststeps.RestTestRequestStep;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlDataSourceLoopTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestRequest;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestRequestStep;
import com.eviware.soapui.model.iface.Request;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestStep;
import com.gmail.a2vplugin.plugins.soapui.api.ExUtil;

public class CacheTool {

    public TstTool tstTool = null;
    public EnvTool envTool = null;
    public Map<String, List<DataBankBean>> databankMap = new HashMap<String, List<DataBankBean>>();
    public Map<String, String> datasourceMap = new HashMap<String, String>();
    public Map<String, String> dataloopMap = new HashMap<String, String>();

    public void collectDataBank(TestCase tCase) {
        databankMap = new HashMap<String, List<DataBankBean>>();
        for (TestStep tStep : tCase.getTestStepList()) {

            if (tStep instanceof RestTestRequestStep) {
                Request request = ((RestTestRequestStep) tStep).getRestMethod().getRequestAt(0);
                Set<String> exlist = ExUtil.getExpressionList(request.getRequestContent());

                continue;
            }

            if (tStep instanceof WsdlTestRequestStep) {
                WsdlTestRequest request = ((WsdlTestRequestStep) tStep).getTestRequest();
                Set<String> exlist = ExUtil.getExpressionList(request.getRequestContent());

                continue;
            }
        }
    }

    public void collectDataSource(TestCase tCase) {
        List<WsdlDataSourceLoopTestStep> list = tCase.getTestStepsOfType(WsdlDataSourceLoopTestStep.class);
        if (list == null || list.size() == 0) {
            return;
        }
        for (WsdlDataSourceLoopTestStep step : list) {
            String key = step.targetStep;
            String value = step.dataSourceStep;
            datasourceMap.put(key, value);
            dataloopMap.put(step.getName(), key);
        }
    }
}

class DataBankBean {
    String xpath = null;
    String columnName = null;

    public String getXpath() {
        return xpath;
    }

    public void setXpath(String xpath) {
        this.xpath = xpath;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}