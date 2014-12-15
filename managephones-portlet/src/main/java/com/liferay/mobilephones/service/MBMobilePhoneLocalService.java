package com.liferay.mobilephones.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the m b mobile phone local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Leonardo Ribeiro
 * @see MBMobilePhoneLocalServiceUtil
 * @see com.liferay.mobilephones.service.base.MBMobilePhoneLocalServiceBaseImpl
 * @see com.liferay.mobilephones.service.impl.MBMobilePhoneLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface MBMobilePhoneLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MBMobilePhoneLocalServiceUtil} to access the m b mobile phone local service. Add custom service methods to {@link com.liferay.mobilephones.service.impl.MBMobilePhoneLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the m b mobile phone to the database. Also notifies the appropriate model listeners.
    *
    * @param mbMobilePhone the m b mobile phone
    * @return the m b mobile phone that was added
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mobilephones.model.MBMobilePhone addMBMobilePhone(
        com.liferay.mobilephones.model.MBMobilePhone mbMobilePhone)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new m b mobile phone with the primary key. Does not add the m b mobile phone to the database.
    *
    * @param id the primary key for the new m b mobile phone
    * @return the new m b mobile phone
    */
    public com.liferay.mobilephones.model.MBMobilePhone createMBMobilePhone(
        long id);

    /**
    * Deletes the m b mobile phone with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the m b mobile phone
    * @return the m b mobile phone that was removed
    * @throws PortalException if a m b mobile phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mobilephones.model.MBMobilePhone deleteMBMobilePhone(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the m b mobile phone from the database. Also notifies the appropriate model listeners.
    *
    * @param mbMobilePhone the m b mobile phone
    * @return the m b mobile phone that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mobilephones.model.MBMobilePhone deleteMBMobilePhone(
        com.liferay.mobilephones.model.MBMobilePhone mbMobilePhone)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.mobilephones.model.MBMobilePhone fetchMBMobilePhone(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the m b mobile phone with the primary key.
    *
    * @param id the primary key of the m b mobile phone
    * @return the m b mobile phone
    * @throws PortalException if a m b mobile phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.mobilephones.model.MBMobilePhone getMBMobilePhone(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the m b mobile phones.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of m b mobile phones
    * @param end the upper bound of the range of m b mobile phones (not inclusive)
    * @return the range of m b mobile phones
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.mobilephones.model.MBMobilePhone> getMBMobilePhones(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of m b mobile phones.
    *
    * @return the number of m b mobile phones
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getMBMobilePhonesCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the m b mobile phone in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param mbMobilePhone the m b mobile phone
    * @return the m b mobile phone that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mobilephones.model.MBMobilePhone updateMBMobilePhone(
        com.liferay.mobilephones.model.MBMobilePhone mbMobilePhone)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the m b mobile phone in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param mbMobilePhone the m b mobile phone
    * @param merge whether to merge the m b mobile phone with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the m b mobile phone that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mobilephones.model.MBMobilePhone updateMBMobilePhone(
        com.liferay.mobilephones.model.MBMobilePhone mbMobilePhone,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;
}
