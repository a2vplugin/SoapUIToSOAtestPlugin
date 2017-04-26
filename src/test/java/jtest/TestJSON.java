package jtest;

import com.gmail.a2vplugin.api.children.messages.ChildrenQueryResponse;

import net.sf.json.JSONObject;

public class TestJSON {

    public static void main(String[] args) {
        StringBuffer msg = new StringBuffer();

        msg = new StringBuffer();
        msg.append(
                "{\"children\":[{\"id\":\"/Sample SOAP Project Pro cdai/Expanded TestSuite/XML DataSource.tst\",\"name\":\"XML DataSource.tst\",\"hasChildren\":true,\"url\":\"http://127.0.0.1s:7788/parasoftapi/v1/files?id=/Sample+SOAP+Project+Pro+cdai/Expanded+TestSuite/XML+DataSource.tst\",\"type\":\"tst\"},{\"id\":\"/Sample SOAP Project Pro cdai/Expanded TestSuite/XML DataSource.tst.bak\",\"name\":\"XML DataSource.tst.bak\",\"hasChildren\":false,\"url\":\"http://192.168.24.28:9080/parasoftapi/v1/files?id=/Sample+SOAP+Project+Pro+cdai/Expanded+TestSuite/XML+DataSource.tst.bak\",\"type\":\"file\"}]}");
        ChildrenQueryResponse resp = (ChildrenQueryResponse) JSONObject.toBean(JSONObject.fromObject(msg.toString()),
                ChildrenQueryResponse.class);
        System.out.println(resp.getChildren().size());
    }

}
