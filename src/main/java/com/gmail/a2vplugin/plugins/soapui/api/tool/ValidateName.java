package com.gmail.a2vplugin.plugins.soapui.api.tool;

public class ValidateName {

    public static boolean validate(String name) {
        int index1 = -1, index2 = -1, index3 = -1;
        index1 = name.indexOf("/");
        index2 = name.indexOf(":");
        index3 = name.indexOf(".");

        if (index1 >= 0 || index2 >= 0 || index3 >= 0) {
            return true;
        }
        return false;
    }

    public static String changeName(String name) {
        StringBuffer sbf = new StringBuffer();

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '/') {
                sbf.append('&');
            } else if (name.charAt(i) == ':') {
                sbf.append('$');
            } else if (name.charAt(i) == '.') {
                sbf.append('#');
            } else {
                sbf.append(name.charAt(i));
            }
        }
        return sbf.toString();
    }

}
