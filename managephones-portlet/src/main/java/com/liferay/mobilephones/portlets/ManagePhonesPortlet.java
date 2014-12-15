package com.liferay.mobilephones.portlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletModeException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.mobilephones.model.MBMobilePhone;
import com.liferay.mobilephones.model.MBMobilePhoneClp;
import com.liferay.mobilephones.service.MBMobilePhoneLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ManagePhonesPortlet
 */
public class ManagePhonesPortlet extends MVCPortlet {

	public void deleteMobilePhone(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws Exception {
		long mobilePhoneId = ParamUtil.getLong(actionRequest, "id");
		MBMobilePhoneLocalServiceUtil.deleteMBMobilePhone(mobilePhoneId);
		sendRedirect(actionRequest, actionResponse);
	}

	public void addMobilePhone(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		try {
			saveOrUpdateMobilePhone(actionRequest);
			sendRedirect(actionRequest, actionResponse);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void updateMobilePhone(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		try {
			saveOrUpdateMobilePhone(actionRequest);
			sendRedirect(actionRequest, actionResponse);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private MBMobilePhone saveOrUpdateMobilePhone(ActionRequest request)
			throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {

		long mobilePhoneId = (ParamUtil.getLong(request, "id"));
		String name = (ParamUtil.getString(request, "name"));
		String description = (ParamUtil.getString(request, "description"));
		String brand = (ParamUtil.getString(request, "brand"));
		Date releaseDate = (ParamUtil.getDate(request, "releaseDate",
				DateFormat.getInstance()));
		double price = (ParamUtil.getDouble(request, "price"));

		MBMobilePhone mobilePhone = null;
		if (mobilePhoneId <= 0) {
			mobilePhoneId = CounterLocalServiceUtil.increment();
			mobilePhone = MBMobilePhoneLocalServiceUtil.createMBMobilePhone(mobilePhoneId);
			mobilePhone.setName(name);
			mobilePhone.setBrand(brand);
			mobilePhone.setDescription(description);
			mobilePhone.setReleaseDate(releaseDate);
			mobilePhone.setPrice(price);
			
			mobilePhone = MBMobilePhoneLocalServiceUtil.addMBMobilePhone(mobilePhone);
		} else {
			mobilePhone = MBMobilePhoneLocalServiceUtil.getMBMobilePhone(mobilePhoneId);
			mobilePhone.setName(name);
			mobilePhone.setBrand(brand);
			mobilePhone.setDescription(description);
			mobilePhone.setReleaseDate(releaseDate);
			mobilePhone.setPrice(price);

			mobilePhone = MBMobilePhoneLocalServiceUtil.updateMBMobilePhone(mobilePhone);
		}

		return mobilePhone;
	}
}
