package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.eviware.soapui.impl.wsdl.teststeps.WsdlPropertiesTestStep;
import com.eviware.soapui.model.testsuite.TestProperty;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.environments.messages.Environment;
import com.gmail.a2vplugin.api.environments.messages.EnvironmentsRequest;
import com.gmail.a2vplugin.api.environments.messages.EnvironmentsResponse;
import com.gmail.a2vplugin.api.environments.messages.ObjectFactory;
import com.gmail.a2vplugin.api.environments.messages.Variable;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class EnvTool extends AbstractTool {
    private final String path = "/parasoftapi/v1/environments";

    List<Variable> variables = new ArrayList<Variable>();

    public EnvTool(AbstractTool parent) {
        super(parent);
    }

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void add(String name, String value) {
        ObjectFactory factory = new ObjectFactory();
        Variable v = factory.createVariable();
        v.setName(name + "#" + value);
        v.setValue(value);
        variables.add(v);
    }

    public void add(WsdlPropertiesTestStep prop) {
        getMonitor().setProgress(1, prop.getName());
        ObjectFactory factory = new ObjectFactory();

        for (TestProperty testProp : prop.getPropertyList()) {
            Variable v = factory.createVariable();
            v.setName(prop.getName() + "#" + testProp.getName());
            v.setValue(testProp.getValue());
            variables.add(v);
        }
    }

    public void add(String[] endpoints) {
        ObjectFactory factory = new ObjectFactory();
        for (int i = variables.size(); i < endpoints.length; i++) {

            Variable v = factory.createVariable();

            if (i == 0) {
                v.setName("ENDPOINT");
            } else {
                v.setName("ENDPOINT" + i);
            }
            v.setValue(endpoints[i]);
            variables.add(v);
        }
    }

    public String getVariableNameByValue(String value) {
        for (Variable v : variables) {
            if (v.getValue().equals(value)) {
                return "${" + v.getName() + "}";
            }
        }
        int i = variables.size();
        ObjectFactory factory = new ObjectFactory();
        Variable v = factory.createVariable();
        String name = null;
        if (i == 0) {
            name = "ENDPOINT";
        } else {
            name = "ENDPOINT" + i;
        }
        v.setName(name);
        v.setValue(value);
        variables.add(v);
        return "${" + name + "}";
    }

    public void create() throws ResponseException {
        if (variables.size() == 0) {
            return;
        }
        ObjectFactory factory = new ObjectFactory();

        EnvironmentsRequest environmentRequest = factory.createEnvironmentsRequest();
        {
            Parent parent = new Parent();
            environmentRequest.setParent(parent);
            {
                parent.setId(getParentId());
            }
            Environment environment = factory.createEnvironment();
            environmentRequest.setLocal(environment);
            {
                environment.setName("default");
                environment.setActive(true);
                environment.setVariables(variables);
            }

        }

        EnvironmentsResponse response = null;
        try {
            response = getResponse(environmentRequest, EnvironmentsResponse.class);
        } catch (ClientProtocolException e) {
            LogUtil.warn("EnvTool ClientProtocolException from response!");
        } catch (ResponseException e) {
            throw new ResponseException("EnvTool" + e.getMessage());
        } catch (IOException e) {
            LogUtil.warn("EnvTool ClientProtocolException from response!");
        }
        setId(response.getId());
        LogUtil.info(response.getId() + " << Environment Created");
    }

}
