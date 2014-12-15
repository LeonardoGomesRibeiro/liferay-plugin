package com.liferay.mobilephones.service.persistence;

import com.liferay.mobilephones.model.MBMobilePhone;
import com.liferay.mobilephones.service.MBMobilePhoneLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Leonardo Ribeiro
 * @generated
 */
public abstract class MBMobilePhoneActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MBMobilePhoneActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MBMobilePhoneLocalServiceUtil.getService());
        setClass(MBMobilePhone.class);

        setClassLoader(com.liferay.mobilephones.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
