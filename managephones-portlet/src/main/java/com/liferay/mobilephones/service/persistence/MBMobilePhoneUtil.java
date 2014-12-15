package com.liferay.mobilephones.service.persistence;

import com.liferay.mobilephones.model.MBMobilePhone;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the m b mobile phone service. This utility wraps {@link MBMobilePhonePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Leonardo Ribeiro
 * @see MBMobilePhonePersistence
 * @see MBMobilePhonePersistenceImpl
 * @generated
 */
public class MBMobilePhoneUtil {
    private static MBMobilePhonePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(MBMobilePhone mbMobilePhone) {
        getPersistence().clearCache(mbMobilePhone);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<MBMobilePhone> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<MBMobilePhone> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<MBMobilePhone> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static MBMobilePhone update(MBMobilePhone mbMobilePhone,
        boolean merge) throws SystemException {
        return getPersistence().update(mbMobilePhone, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static MBMobilePhone update(MBMobilePhone mbMobilePhone,
        boolean merge, ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(mbMobilePhone, merge, serviceContext);
    }

    /**
    * Caches the m b mobile phone in the entity cache if it is enabled.
    *
    * @param mbMobilePhone the m b mobile phone
    */
    public static void cacheResult(
        com.liferay.mobilephones.model.MBMobilePhone mbMobilePhone) {
        getPersistence().cacheResult(mbMobilePhone);
    }

    /**
    * Caches the m b mobile phones in the entity cache if it is enabled.
    *
    * @param mbMobilePhones the m b mobile phones
    */
    public static void cacheResult(
        java.util.List<com.liferay.mobilephones.model.MBMobilePhone> mbMobilePhones) {
        getPersistence().cacheResult(mbMobilePhones);
    }

    /**
    * Creates a new m b mobile phone with the primary key. Does not add the m b mobile phone to the database.
    *
    * @param id the primary key for the new m b mobile phone
    * @return the new m b mobile phone
    */
    public static com.liferay.mobilephones.model.MBMobilePhone create(long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the m b mobile phone with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the m b mobile phone
    * @return the m b mobile phone that was removed
    * @throws com.liferay.mobilephones.NoSuchMobilePhoneException if a m b mobile phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.mobilephones.model.MBMobilePhone remove(long id)
        throws com.liferay.mobilephones.NoSuchMobilePhoneException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.liferay.mobilephones.model.MBMobilePhone updateImpl(
        com.liferay.mobilephones.model.MBMobilePhone mbMobilePhone,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(mbMobilePhone, merge);
    }

    /**
    * Returns the m b mobile phone with the primary key or throws a {@link com.liferay.mobilephones.NoSuchMobilePhoneException} if it could not be found.
    *
    * @param id the primary key of the m b mobile phone
    * @return the m b mobile phone
    * @throws com.liferay.mobilephones.NoSuchMobilePhoneException if a m b mobile phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.mobilephones.model.MBMobilePhone findByPrimaryKey(
        long id)
        throws com.liferay.mobilephones.NoSuchMobilePhoneException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the m b mobile phone with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the m b mobile phone
    * @return the m b mobile phone, or <code>null</code> if a m b mobile phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.mobilephones.model.MBMobilePhone fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the m b mobile phones.
    *
    * @return the m b mobile phones
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.mobilephones.model.MBMobilePhone> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.liferay.mobilephones.model.MBMobilePhone> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the m b mobile phones.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of m b mobile phones
    * @param end the upper bound of the range of m b mobile phones (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of m b mobile phones
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.mobilephones.model.MBMobilePhone> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the m b mobile phones from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of m b mobile phones.
    *
    * @return the number of m b mobile phones
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static MBMobilePhonePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MBMobilePhonePersistence) PortletBeanLocatorUtil.locate(com.liferay.mobilephones.service.ClpSerializer.getServletContextName(),
                    MBMobilePhonePersistence.class.getName());

            ReferenceRegistry.registerReference(MBMobilePhoneUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(MBMobilePhonePersistence persistence) {
    }
}
