package com.liferay.mobilephones.service.messaging;

import com.liferay.mobilephones.service.ClpSerializer;
import com.liferay.mobilephones.service.MBMobilePhoneLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            MBMobilePhoneLocalServiceUtil.clearService();
        }
    }
}
