package com.gmail.a2vplugin.plugins.soapui.api.tool;

import java.util.ArrayList;
import java.util.List;

import com.eviware.soapui.model.mock.MockResponse;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFPS;
import com.gmail.a2vplugin.api.common.messages.ComplexValueFPSType;
import com.gmail.a2vplugin.api.common.messages.HttpHeaders;
import com.gmail.a2vplugin.api.common.messages.HttpHeadersTable;
import com.gmail.a2vplugin.api.common.messages.HttpHeadersType;
import com.gmail.a2vplugin.api.common.messages.LiteralType;
import com.gmail.a2vplugin.api.common.messages.LiteralXml;
import com.gmail.a2vplugin.api.common.messages.NameComplexValue;
import com.gmail.a2vplugin.api.common.messages.Parent;
import com.gmail.a2vplugin.api.tools.responders.messages.MessageRespondersRequest;
import com.gmail.a2vplugin.api.tools.responders.messages.MessageRespondersResponse;
import com.gmail.a2vplugin.api.tools.responders.messages.Response;
import com.gmail.a2vplugin.api.tools.responders.messages.TransportHeader;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;

public class MessageResponderTool extends AbstractTool {
    private final String path = "/parasoftapi/v1/tools/messageResponders";

    public MessageResponderTool(AbstractTool parent) {
        super(parent);
    }

    @Override
    public String getPostPath() {
        return getUrl() + path;
    }

    public void create(MockResponse mockResp) throws Exception {
        getMonitor().setProgress(1, mockResp.getName());

        MessageRespondersRequest request = new MessageRespondersRequest();

        if (mockResp.getResponseHeaders().keySet().size() > 0) {
            handleHeader(request, mockResp);
        }

        Response resp = new Response();
        request.setResponse(resp);
        {
            LiteralXml liter = new LiteralXml();
            resp.setLiteral(liter);
            {
                liter.setType(LiteralType.text);
                liter.setMimeType("text/xml");
                liter.setText(mockResp.getResponseContent());
            }
        }

        request.setName(mockResp.getName());

        Parent parent = new Parent();
        request.setParent(parent);
        {

            parent.setId(getParentId());
        }

        MessageRespondersResponse response = getResponse(request, MessageRespondersResponse.class);
        setId(response.getId());
        LogUtil.info(response.getId() + " << Message Responder Created");
    }

    private void handleHeader(MessageRespondersRequest request, MockResponse mockResp) {
        TransportHeader header = new TransportHeader();
        request.setTransportHeader(header);
        {
            HttpHeaders httpHeaders = new HttpHeaders();
            header.setHttpTransportHeaders(httpHeaders);
            {
                httpHeaders.setType(HttpHeadersType.table);
                HttpHeadersTable table = new HttpHeadersTable();
                httpHeaders.setHttpHeadersTable(table);
                {
                    List<NameComplexValue> rows = new ArrayList<NameComplexValue>();
                    table.setRows(rows);
                    for (String key : mockResp.getResponseHeaders().keySet()) {
                        NameComplexValue row = new NameComplexValue();
                        rows.add(row);
                        {
                            row.setName(key);
                            ComplexValueFPS value = new ComplexValueFPS();
                            value.setType(ComplexValueFPSType.fixed);
                            value.setFixed(mockResp.getResponseHeaders().get(key, ""));
                            row.setValue(value);
                        }
                    }
                }
            }
        }

    }
}
