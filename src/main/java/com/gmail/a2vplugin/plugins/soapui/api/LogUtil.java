package com.gmail.a2vplugin.plugins.soapui.api;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.model.propertyexpansion.PropertyExpansionUtils;

public class LogUtil {

    private static int level = 2;

    private static void reset() {
        String lvl = PropertyExpansionUtils.getGlobalProperty("soatest.api.log.level");
        if (lvl == null) {

        } else if (lvl.equals("error")) {
            level = 0;
        } else if (lvl.equals("warn")) {
            level = 1;
        } else if (lvl.equals("info")) {
            level = 2;
        } else if (lvl.equals("debug")) {
            level = 3;
        } else {
            level = 2;
        }
    }

    public static void error(String s) {
        reset();
        SoapUI.logError(new Exception(), s);
    }

    public static void warn(String s) {
        reset();
        if (level >= 1) {
            SoapUI.log("[WARN] " + s);
        }
    }

    public static void info(String s) {
        reset();
        if (level >= 2) {
            SoapUI.log(s);
        }
    }

    public static void debug(String s) {
        reset();
        if (level >= 3) {
            SoapUI.log(">>>" + s);
        }
    }
}
