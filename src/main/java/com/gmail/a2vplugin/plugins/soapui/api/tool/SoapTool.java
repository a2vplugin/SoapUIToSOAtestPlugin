package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.eviware.soapui.impl.wsdl.WsdlRequest;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestRequest;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestRequestStep;
import com.eviware.soapui.impl.wsdl.teststeps.assertions.soap.NotSoapFaultAssertion;
import com.eviware.soapui.impl.wsdl.teststeps.assertions.soap.SoapFaultAssertion;
import com.eviware.soapui.model.testsuite.TestAssertion;
import com.eviware.soapui.support.types.StringToStringsMap;
import com.gmail.a2vplugin.api.common.messages.AuthenticationSettings;
import com.gmail.a2vplugin.api.common.messages.AuthenticationType;
import com.gmail.a2vplugin.api.common.messages.AuthenticationTypeType;
import com.gmail.a2vplugin.api.common.messages.Basic;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFPS;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFPSType;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFPType;
import com.gmail.a2vplugin.api.common.messages.HttpAuthentication;
import com.gmail.a2vplugin.api.common.messages.HttpHeaders;
import com.gmail.a2vplugin.api.common.messages.HttpHeadersTable;
import com.gmail.a2vplugin.api.common.messages.HttpHeadersType;
import com.gmail.a2vplugin.api.common.messages.LiteralType;
import com.gmail.a2vplugin.api.common.messages.LiteralXml;
import com.gmail.a2vplugin.api.common.messages.NameComplexValue;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.common.messages.PerformAuthentication;
import com.gmail.a2vplugin.api.tools.soapclients.messages.Endpoint;
import com.gmail.a2vplugin.api.tools.soapclients.messages.Http11General;
import com.gmail.a2vplugin.api.tools.soapclients.messages.Http11Transport;
import com.gmail.a2vplugin.api.tools.soapclients.messages.InputMode;
import com.gmail.a2vplugin.api.tools.soapclients.messages.ObjectFactory;
import com.gmail.a2vplugin.api.tools.soapclients.messages.Security;
import com.gmail.a2vplugin.api.tools.soapclients.messages.SoapClientsRequest;
import com.gmail.a2vplugin.api.tools.soapclients.messages.SoapClientsResponse;
import com.gmail.a2vplugin.api.tools.soapclients.messages.Transport;
import com.gmail.a2vplugin.api.tools.soapclients.messages.TransportType;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.ExUtil;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class SoapTool extends AbstractTool {
    private final String path = "/parasoftapi/v1/tools/soapClients";

    public SoapTool(AbstractTool parent) {
        super(parent);
    }

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void create(WsdlTestRequestStep step, EnvTool envTool) throws ResponseException {
        WsdlTestRequest request = step.getTestRequest();
        create(request, envTool);

        AssertorTool assertionTool = new AssertorTool(this);

        for (TestAssertion ta : step.getAssertionList()) {
            if (ta instanceof NotSoapFaultAssertion) {
                assertionTool.addNotSoapFault();
            } else if (ta instanceof SoapFaultAssertion) {
                assertionTool.addSoapFault();
            } else {
                LogUtil.debug("unsupport assertion:" + ta.getClass().getName());
            }
        }

        assertionTool.create();
    }

    public void create(WsdlRequest request, EnvTool envTool) throws ResponseException {

        this.getMonitor().setProgress(1, request.getName());
        ObjectFactory factory = new ObjectFactory();

        SoapClientsRequest soap = factory.createSoapClientsRequest();

        soap.setDataSource(this.getDatasource());

        Transport transport = factory.createTransport();
        soap.setTransport(transport);

        {
            Http11Transport http11 = factory.createHttp11Transport();

            transport.setType(TransportType.http11);

            transport.setHttp11(http11);
            {

                setHeader(http11, request);

                Http11General http11General = factory.createHttp11General();
                http11.setGeneral(http11General);
                {
                    Endpoint endpoint = factory.createEndpoint();
                    http11General.setEndpoint(endpoint);
                    {
                        endpoint.setEndpointType("custom");
                        ComplexValueFP value = new ComplexValueFP();
                        endpoint.setValue(value);
                        {
                            value.setType(ComplexValueFPType.fixed);
                            String varName = envTool.getVariableNameByValue(request.getEndpoint());
                            value.setFixed(varName);
                        }
                    }
                    ComplexValueFP action = new ComplexValueFP();
                    http11General.setSoapAction(action);
                    {
                        action.setType(ComplexValueFPType.fixed);
                        action.setFixed(request.getAction());
                    }
                }
                if ("Preemptive,Global HTTP Settings,NTLM,SPNEGO/Kerberos".indexOf(request.getAuthType()) != -1) {
                    Security sec = new Security();
                    http11.setSecurity(sec);
                    {
                        HttpAuthentication httpAuth = new HttpAuthentication();
                        sec.setHttpAuthentication(httpAuth);
                        {
                            PerformAuthentication auth = new PerformAuthentication();
                            httpAuth.setPerformAuthentication(auth);
                            {
                                auth.setEnabled(true);
                                AuthenticationSettings authSettings = new AuthenticationSettings();
                                auth.setValue(authSettings);
                                {
                                    authSettings.setUseGlobal(false);
                                    AuthenticationType authType = new AuthenticationType();
                                    authSettings.setAuthenticationType(authType);
                                    {
                                        if ("Preemptive".equals(request.getAuthType()) ||
                                                "Global HTTP Settings".equals(request.getAuthType())) {
                                            authType.setType(AuthenticationTypeType.basic);
                                        } else if ("NTLM".equals(request.getAuthType())) {
                                            authType.setType(AuthenticationTypeType.NTLM);
                                        } else if ("SPNEGO/Kerberos".equals(request.getAuthType())) {
                                            authType.setType(AuthenticationTypeType.kerberos);
                                        } else {
                                            authType.setType(AuthenticationTypeType.digest);
                                        }
                                        Basic basic = new Basic();
                                        authType.setBasic(basic);
                                        {
                                            ComplexValueFP username = new ComplexValueFP();
                                            basic.setUsername(username);
                                            {
                                                username.setType(ComplexValueFPType.fixed);
                                                username.setFixed(request.getUsername());
                                            }
                                            ComplexValueFP password = new ComplexValueFP();
                                            basic.setPassword(password);
                                            {
                                                password.setType(ComplexValueFPType.fixed);
                                                password.setFixed(request.getPassword());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if ("No Authorization".indexOf(request.getAuthType()) != -1) {
                    LogUtil.warn("unsupport auth type:" + request.getAuthType());
                }
            }
        }

        soap.setName(request.getName());

        com.gmail.a2vplugin.api.tools.soapclients.messages.Request req = factory.createRequest();
        soap.setRequest(req);
        {
            LiteralXml literal = new LiteralXml();

            req.setLiteral(literal);
            {
                literal.setType(LiteralType.text);
                literal.setText(ExUtil.filterDataSource(request.getRequestContent(), getDatasource()));
                literal.setMimeType("application/xml");
            }

            req.setInputMode(InputMode.literal);
        }

        Parent parent = new Parent();
        soap.setParent(parent);
        {

            parent.setId(getParentId());
        }

        soap.setMisc(null);

        SoapClientsResponse response = null;
        try {
            response = getResponse(soap, SoapClientsResponse.class);
        } catch (ClientProtocolException e) {
            LogUtil.warn("SoapTool ClientProtocolException" + e.getMessage());
        } catch (ResponseException e) {
            throw new ResponseException("SoapToolException" + e.getMessage());
        } catch (IOException e) {
            LogUtil.warn("SoapTool IOException" + e.getMessage());
        }
        setId(response.getId());
        LogUtil.info(response.getId() + " << Soap Client Created");
    }

    private void setHeader(Http11Transport http11, WsdlRequest request) {
        List<NameComplexValue> rows = new ArrayList<NameComplexValue>();
        StringToStringsMap map = request.getRequestHeaders();
        String[] keys = map.getKeys();
        for (String key : keys) {
            NameComplexValue v = new NameComplexValue();
            v.setName(key);
            ComplexValueFPS fps = new ComplexValueFPS();
            v.setValue(fps);
            fps.setType(ComplexValueFPSType.fixed);
            fps.setFixed(map.get(key, ""));
            rows.add(v);
        }

        if (rows.size() > 0) {
            HttpHeaders headers = new HttpHeaders();
            http11.setHttpHeaders(headers);
            {
                headers.setType(HttpHeadersType.table);
                HttpHeadersTable table = new HttpHeadersTable();
                headers.setHttpHeadersTable(table);
                {
                    table.setRows(rows);
                }
            }
        }
    }
}
