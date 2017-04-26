package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFPType;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.tools.xmlassertors.messages.Assertion;
import com.gmail.a2vplugin.api.tools.xmlassertors.messages.ObjectFactory;
import com.gmail.a2vplugin.api.tools.xmlassertors.messages.OccurrenceAssertion;
import com.gmail.a2vplugin.api.tools.xmlassertors.messages.OccurrenceConfiguration;
import com.gmail.a2vplugin.api.tools.xmlassertors.messages.SelectedElement;
import com.gmail.a2vplugin.api.tools.xmlassertors.messages.ToolSettings;
import com.gmail.a2vplugin.api.tools.xmlassertors.messages.XmlAssertorsRequest;
import com.gmail.a2vplugin.api.tools.xmlassertors.messages.XmlAssertorsResponse;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class AssertorTool extends AbstractTool {
    private final String path = "/parasoftapi/v1/tools/xmlAssertors";
    private List<Assertion> assertions = new ArrayList<Assertion>();

    public AssertorTool(AbstractTool parent) {
        super(parent);
    }

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void addNotSoapFault() {
        Assertion assertion = new Assertion();
        OccurrenceAssertion oAssertion = new OccurrenceAssertion();
        assertion.setOccurrenceAssertion(oAssertion);
        {
            oAssertion.setName("Not Soap Fault");
            SelectedElement element = new SelectedElement();
            oAssertion.setSelectedElement(element);
            {
                element.setXpath("/*:Envelope/*:Body/*:Fault");
            }
            OccurrenceConfiguration config = new OccurrenceConfiguration();
            oAssertion.setConfiguration(config);
            {
                config.setOperator("==");
                ComplexValueFP value = new ComplexValueFP();
                config.setExpectedValue(value);
                {
                    value.setType(ComplexValueFPType.fixed);
                    value.setFixed("0");
                }
            }
        }
    }

    public void addSoapFault() {
        Assertion assertion = new Assertion();
        assertions.add(assertion);
        OccurrenceAssertion oAssertion = new OccurrenceAssertion();
        assertion.setOccurrenceAssertion(oAssertion);
        {
            oAssertion.setName("Soap Fault");
            SelectedElement element = new SelectedElement();
            oAssertion.setSelectedElement(element);
            {
                element.setXpath("/*:Envelope/*:Body/*:Fault");
            }
            OccurrenceConfiguration config = new OccurrenceConfiguration();
            oAssertion.setConfiguration(config);
            {
                config.setOperator(">");
                ComplexValueFP value = new ComplexValueFP();
                config.setExpectedValue(value);
                {
                    value.setType(ComplexValueFPType.fixed);
                    value.setFixed("0");
                }
            }
        }
    }

    public void create() throws ResponseException {
        if (assertions.size() == 0) {
            return;
        }

        ObjectFactory factory = new ObjectFactory();
        XmlAssertorsRequest request = factory.createXmlAssertorsRequest();

        request.setDataSource(getDatasource());

        ToolSettings toolsetting = factory.createToolSettings();
        request.setToolSettings(toolsetting);
        {
            toolsetting.setAssertion(assertions);
        }

        request.setName("XML Assertion");

        Parent parent = new Parent();
        request.setParent(parent);
        {
            parent.setId(getParentId());
        }

        XmlAssertorsResponse response = null;
        try {
            response = getResponse(request, XmlAssertorsResponse.class);
        } catch (ClientProtocolException e) {
            LogUtil.warn("AssertorTool ClientProtocolException" + e.getMessage());
        } catch (ResponseException e) {
            throw new ResponseException("AssertorTool Exception" + e.getMessage());
        } catch (IOException e) {
            LogUtil.warn("AssertorTool IOException" + e.getMessage());
        }
        setId(response.getId());
        LogUtil.info("Assertion created:" + response.getId());
    }

}
