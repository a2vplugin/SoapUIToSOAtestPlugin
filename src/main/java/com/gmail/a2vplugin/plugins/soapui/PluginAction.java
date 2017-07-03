package com.gmail.a2vplugin.plugins.soapui;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.propertyexpansion.PropertyExpansionUtils;
import com.eviware.soapui.plugins.ActionConfiguration;
import com.eviware.soapui.support.UISupport;
import com.eviware.soapui.support.action.support.AbstractSoapUIAction;
import com.eviware.soapui.support.components.ProgressDialog;
import com.eviware.x.dialogs.Worker;
import com.eviware.x.dialogs.XProgressMonitor;
import com.gmail.a2vplugin.plugins.exceptions.URLException;
import com.gmail.a2vplugin.plugins.soapui.api.LogUtil;
import com.gmail.a2vplugin.plugins.soapui.api.SoatestToolUtil;

@ActionConfiguration(actionGroup = "EnabledWsdlProjectActions")
public class PluginAction extends AbstractSoapUIAction<WsdlProject> {

    String url;

    public PluginAction() {
        super("Convert to SOAtest", "SOAtest Convertor Plugin");
    }

    public void perform(final WsdlProject project, Object o) {
        url = PropertyExpansionUtils.getGlobalProperty("soatest.api.url");
        try {
            url = checkURL(url);
        } catch (URLException e1) {
            LogUtil.error("URLException" + e1.getMessage());
        }

        final ProgressDialog dialog = new ProgressDialog(PluginMessages.DIALOG_CREATE_TITLE,
                PluginMessages.DIALOG_CREATE_LABEL, 1, "......", true);

        dialog.run(new Worker() {
            Thread current;
            boolean running = true;

            public Object construct(XProgressMonitor monitor) {
                current = Thread.currentThread();
                if(running) {
                    LogUtil.info("start to convert...");
//                LogUtil.getLogger(PluginAction.class).info("start to convert printed by logger...");
                    SoatestToolUtil.create(url, monitor, project);
                    LogUtil.info("converting stoped.");
                }
                return null;
            }

            public void finished() {
                LogUtil.info("monitor finished");
            }

            public boolean onCancel() {
                running = false;
                if (current != null) {
                    LogUtil.warn("work intterupted");
                    current.interrupt();
                    dialog.dispose();
                }
                LogUtil.info("monitor canceled");
                return true;
            }

        });
    }

    private String checkURL(String gurl) throws URLException {
        if (gurl == null || gurl.equals("")) {
            gurl = UISupport.prompt(PluginMessages.TOKEN_URL_QUESTION, PluginMessages.TOKEN_URL_TITLE,
                    PluginMessages.TOKEN_URL_VALUE);
        }
        if (gurl == null || gurl.equals("")) {
            UISupport.showErrorMessage(PluginMessages.ERROR_URL_INVALID);
            throw new URLException("the URL is empty!");
        }
        return gurl;
    }
}