package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.eviware.soapui.impl.rest.RestMethod;
import com.eviware.soapui.impl.rest.RestRequest;
import com.eviware.soapui.impl.rest.RestRequestInterface.HttpMethod;
import com.eviware.soapui.support.types.StringToStringsMap;
import com.gmail.a2vplugin.api.common.messages.AuthenticationSettings;
import com.gmail.a2vplugin.api.common.messages.AuthenticationType;
import com.gmail.a2vplugin.api.common.messages.AuthenticationTypeType;
import com.gmail.a2vplugin.api.common.messages.Basic;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFP;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFPS;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFPSType;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFPType;
import com.gmail.a2vplugin.api.common.messages.FixedElement;
import com.gmail.a2vplugin.api.common.messages.HttpAuthentication;
import com.gmail.a2vplugin.api.common.messages.HttpHeaders;
import com.gmail.a2vplugin.api.common.messages.HttpHeadersTable;
import com.gmail.a2vplugin.api.common.messages.HttpHeadersType;
import com.gmail.a2vplugin.api.common.messages.Literal;
import com.gmail.a2vplugin.api.common.messages.NameComplexValue;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.common.messages.PerformAuthentication;
import com.gmail.a2vplugin.api.tools.restclients.messages.Header;
import com.gmail.a2vplugin.api.tools.restclients.messages.Http11;
import com.gmail.a2vplugin.api.tools.restclients.messages.HttpOptions;
import com.gmail.a2vplugin.api.tools.restclients.messages.Input;
import com.gmail.a2vplugin.api.tools.restclients.messages.InputMode;
import com.gmail.a2vplugin.api.tools.restclients.messages.Method;
import com.gmail.a2vplugin.api.tools.restclients.messages.MethodType;
import com.gmail.a2vplugin.api.tools.restclients.messages.ObjectFactory;
import com.gmail.a2vplugin.api.tools.restclients.messages.Payload;
import com.gmail.a2vplugin.api.tools.restclients.messages.Resource;
import com.gmail.a2vplugin.api.tools.restclients.messages.ResourceType;
import com.gmail.a2vplugin.api.tools.restclients.messages.RestClientsRequest;
import com.gmail.a2vplugin.api.tools.restclients.messages.RestClientsResponse;
import com.gmail.a2vplugin.api.tools.restclients.messages.Security;
import com.gmail.a2vplugin.api.tools.restclients.messages.Transport;
import com.gmail.a2vplugin.api.tools.restclients.messages.TransportType;
import com.gmail.a2vplugin.plugins.exceptions.ResponseException;
import com.gmail.a2vplugin.plugins.soapui.api.ExUtil;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class RestTool extends AbstractTool {
    private final String path = "/parasoftapi/v1/tools/restClients";

    public RestTool(AbstractTool parent) {
        super(parent);
    }

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void create(RestRequest restRequest, EnvTool envTool, String stepName) throws ResponseException {
        getMonitor().setProgress(1, restRequest.getName());
        ObjectFactory factory = new ObjectFactory();

        RestClientsRequest request = factory.createRestClientsRequest();

        request.setDataSource(getDatasource());

        HttpOptions httpOptions = factory.createHttpOptions();
        request.setHttpOptions(httpOptions);
        {

            Transport transport = factory.createTransport();
            httpOptions.setTransport(transport);
            {
                transport.setType(TransportType.http11);
                Http11 http11 = factory.createHttp11();
                transport.setHttp11(http11);
                {
                    setHeader(http11, restRequest);
                    if ("Preemptive,Global HTTP Settings,NTLM,SPNEGO/Kerberos"
                            .indexOf(restRequest.getAuthType()) != -1) {
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
                                            if ("Preemptive".equals(restRequest.getAuthType()) ||
                                                    "Global HTTP Settings".equals(restRequest.getAuthType())) {
                                                authType.setType(AuthenticationTypeType.basic);
                                            } else if ("NTLM".equals(restRequest.getAuthType())) {
                                                authType.setType(AuthenticationTypeType.NTLM);
                                            } else if ("SPNEGO/Kerberos".equals(restRequest.getAuthType())) {
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
                                                    username.setFixed(restRequest.getUsername());
                                                }
                                                ComplexValueFP password = new ComplexValueFP();
                                                basic.setPassword(password);
                                                {
                                                    password.setType(ComplexValueFPType.fixed);
                                                    password.setFixed(restRequest.getPassword());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if ("No Authorization".indexOf(restRequest.getAuthType()) != -1) {
                        LogUtil.warn("unsupport auth type:" + restRequest.getAuthType());
                    }
                }
            }
        }

        if (stepName != null) {
            request.setName(stepName);
        } else {
            request.setName(restRequest.getName());
        }

        Resource resource = factory.createResource();
        request.setResource(resource);
        {
            resource.setType(ResourceType.literalText);
            FixedElement literal = new FixedElement();
            resource.setLiteralText(literal);
            {
                String sepr = "&";
                StringBuffer sb = new StringBuffer();
                for (String name : restRequest.getPropertyNames()) {
                    sb.append(sepr);
                    sb.append(name);
                    sb.append("=");
                    sb.append(restRequest.getPropertyValue(name));
                }
                String varName = envTool.getVariableNameByValue(restRequest.getEndpoint());
                if (sb.length() > 0) {
                    sb.replace(0, 1, "?");
                    literal.setFixed(varName + restRequest.getPath() + sb.toString());
                } else {
                    literal.setFixed(varName + restRequest.getPath());
                }
            }
        }

        Payload payload = factory.createPayload();
        request.setPayload(payload);
        {
            payload.setInputMode(InputMode.literal);
            payload.setContentType(restRequest.getMediaType());
            Input input = factory.createInput();
            payload.setInput(input);
            {
                Literal literal = new Literal();
                input.setLiteral(literal);
                {
                    literal.setText(ExUtil.filterDataSource(restRequest.getRequestContent(), getDatasource()));
                }
            }
        }

        Parent parent = new Parent();
        request.setParent(parent);
        {

            parent.setId(getParentId());
        }

        Header header = factory.createHeader();
        request.setHeader(header);
        {
            Method method = factory.createMethod();
            header.setMethod(method);
            {
                RestMethod restmethod = restRequest.getRestMethod();
                HttpMethod httpmethod = restmethod.getMethod();
                String methodName = httpmethod.toString();
                if ("GET,POST,OPTIONS,HEAD,PUT,DELETE,TRACE".indexOf(methodName) != -1) {
                    method.setMethodType(MethodType.fromValue(httpmethod.toString()));
                } else {
                    method.setMethodType(MethodType.fromValue("CUSTOM"));
                    method.setValue(httpmethod.toString());
                }
            }
        }

        RestClientsResponse response = null;
        try {
            response = getResponse(request, RestClientsResponse.class);
            setId(response.getId());

        } catch (ClientProtocolException e) {

            e.printStackTrace();
        } catch (ResponseException e) {
            throw new ResponseException("RestTool:" + e.getMessage());
        } catch (IOException e) {

            e.printStackTrace();
        }
        LogUtil.info(response.getId() + " << Rest Client Created");
    }

    private void setHeader(Http11 http11, RestRequest request) {
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
