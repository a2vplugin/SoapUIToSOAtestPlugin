package jtest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gmail.a2vplugin.plugins.soapui.api.ExUtil;

public class TestExUtil {
    public static void main(String[] args) {
        String s = "<sessionid>${Test Request - login#Response#//sam:loginResponse[1]/sessionid[1]}</sessionid>";
        Set<String> list = ExUtil.getExpressionList(s);

        Map<String, List<String[]>> responseMap = new HashMap<String, List<String[]>>();
        ExUtil.addToResponseMap(responseMap, list);

        System.out.println(responseMap.size());
        for (Entry<String, List<String[]>> entry : responseMap.entrySet()) {
            System.out.println("key:" + entry.getKey());
            System.out.println("value:");
            List<String[]> value = entry.getValue();
            for (String[] ss : value) {
                System.out.println("\t" + ss[0] + "\t" + ss[1]);
            }
        }
    }
}
