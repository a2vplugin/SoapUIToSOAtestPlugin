package jtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestString {

    public static void main(String[] args) {
        System.out.println(do5());
    }

    public static String do5() {
        String s = "jdbc:mysql://127.0.0.1:3306/grs?user=admin111&password=PASS_VALUE";
        if (s.indexOf("?") == -1) {
            return "a";
        }
        s = s.substring(s.indexOf("?") + 1);
        if (s.length() == 0) {
            return "";
        }
        String[] arg = s.split("&");
        if (arg == null || arg.length != 2) {
            return "b";
        }
        String[] username = arg[0].split("=");
        if (username == null || username.length != 2) {
            return "c";
        }
        if (!"user".equals(username[0])) {
            return "d";
        }
        return username[1];
    }

    public static void do4() {
        String s = "asdfasdfasdfasdfasdf";
        if (s.indexOf("?") != -1) {
            s = s.substring(0, s.indexOf("?"));
        }
        System.out.println(s);
    }

    public static String do3() {
        String s = "${=String.value()}asdfasdf${=String.value()}aaaa";
        StringBuffer sb = new StringBuffer();
        sb.append("String getValue(input,context){\r\n");
        sb.append("\treturn \"<value>\"");
        do {
            int start = s.indexOf("${=");
            if (start != 0) {
                String pre = s.substring(0, start);
                sb.append(" + \"");
                sb.append(pre);
                sb.append("\"");
                s = s.substring(start);
            } else {
                int end = s.indexOf("}", start);
                String expresion = s.substring(start + 3, end);
                sb.append(" + ");
                sb.append(expresion);
                s = s.substring(end + 1);
            }
        } while (s.contains("${="));
        if (s.length() > 0) {
            sb.append(" + \"");
            sb.append(s);
            sb.append("\"");
        }
        sb.append(" + \"");
        sb.append("<\\value>\"\r\n");
        sb.append("}");
        return sb.toString();
    }

    public static String do2() {
        String s = "declare namespace sam=asdfasdfasdf;//sam:ttt/ssa";
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
            return s.replace(namespace + ":", "");
        }
        return s;
    }

    public static void do1() {
        String s = "${Test Request - login#Response#//sam:loginResponse/sessionid}";

        List<String> list = new ArrayList<String>();
        int start = s.indexOf("${");
        while (start != -1) {
            int end = s.indexOf("}", start);
            if (end > start + 2) {
                String expresion = s.substring(start + 2, end);
                list.add(expresion);
            }
            start = s.indexOf("${", end);
        }

        Map<String, String[]> responseMap = new HashMap<String, String[]>();

        for (String ex : list) {
            if (ex.startsWith("=")) {
                continue;
            }
            String[] sAry = ex.split("#");
            if (sAry != null && sAry.length == 3 && "response".equalsIgnoreCase(sAry[1])) {
                if (responseMap.containsKey(sAry[0])) {
                    continue;
                }
                String[] value = new String[] { ex, sAry[2] };
                responseMap.put(sAry[0], value);
            }
        }

        for (Entry<String, String[]> entry : responseMap.entrySet()) {
            System.out.println("key:" + entry.getKey());
            System.out.println("value:");
            String[] value = entry.getValue();
            for (String ss : value) {
                System.out.println("\t" + ss);
            }
        }
    }
}
