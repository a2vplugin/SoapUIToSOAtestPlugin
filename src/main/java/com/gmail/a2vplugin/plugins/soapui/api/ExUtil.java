package com.gmail.a2vplugin.plugins.soapui.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExUtil {

    public static void addToResponseMap(Map<String, List<String[]>> responseMap, Set<String> list) {
        for (String ex : list) {
            if (ex.startsWith("=")) {
                continue;
            }
            String[] sAry = ex.split("#");
            if (sAry != null && sAry.length == 3 && "response".equalsIgnoreCase(sAry[1])) {
                List<String[]> value = null;
                String key = sAry[0];
                if (responseMap.containsKey(key)) {
                    value = responseMap.get(key);
                } else {
                    value = new ArrayList<String[]>();
                    responseMap.put(key, value);
                }
                String[] data = new String[] { ex, filterXpath(sAry[2]) };
                if (!value.contains(data)) {
                    value.add(data);
                }
            }
        }
    }

    public static Set<String> getExpressionList(String s) {
        Set<String> list = new HashSet<String>();
        int start = s.indexOf("${");
        while (start != -1) {
            int end = s.indexOf("}", start);
            if (end > start + 2) {
                String expresion = s.substring(start + 2, end);
                list.add(expresion);
            }
            start = s.indexOf("${", end);
        }
        return list;
    }

    private static String filterXpath(String s) {
        if (!s.endsWith("/text()")) {
            s = s + "/text()";
        }
        String namespace = null;
        if (s.startsWith("declare namespace ") && s.indexOf(";") != -1) {
            String ts = s.substring(0, s.indexOf(";") + 1);
            String[] ary = ts.split("=");
            if (ary.length != 2) {
                return s;
            }
            ary = ary[0].split(" ");
            if (ary.length != 3) {
                return s;
            }
            s = s.substring(s.indexOf(";") + 1, s.length());
            namespace = ary[2];
        }
        if (namespace != null && s.contains(":")) {
            return s.replace(namespace + ":", "*:");
        }
        if (s.contains(":")) {
            int endIndex = s.indexOf(":");
            int beginIndex = s.lastIndexOf("/", endIndex);
            if (endIndex != -1) {
                return s.replace(s.substring(beginIndex + 1, endIndex + 1), "*:");
            }
        }
        return s;
    }

    public static String filterDataSource(String content, String datasource) {
        if (datasource == null || datasource.length() == 0) {
            return content;
        }
        String s = "${" + datasource + "#";
        content = content.replace(s, "${");
        return content;
    }

}
