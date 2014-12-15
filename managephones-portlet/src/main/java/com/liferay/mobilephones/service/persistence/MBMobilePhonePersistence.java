package com.liferay.mobilephones.service.persistence;

import com.liferay.mobilephones.model.MBMobilePhone;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the m b mobile phone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Leonardo Ribeiro
 * @see MBMobilePhonePersistenceImpl
 * @see MBMobilePhoneUtil
 * @generated
 */
public interface MBMobilePhonePersistence extends BasePersistence<MBMobilePhone> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MBMobilePhoneUtil} to access the m b mobile phone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the m b mobile phone in the entity cache if it is enabled.
    *
    * @param mbMobilePhone the m b mobile phone
    */
    public void cacheResult(
        com.liferay.mobilephones.model.MBMobilePhone mbMobilePhone);

    /**
    * Caches the m b mobile phones in the entity cache if it is enabled.
    *
    * @param mbMobilePhones the m b mobile phones
    */
    public void cacheResult(
        java.util.List<com.liferay.mobilephones.model.MBMobilePhone> mbMobilePhones);

    /**
    * Creates a new m b mobile phone with the primary key. Does not add the m b mobile phone to the database.
    *
    * @param id the primary key for the new m b mobile phone
    * @return the new m b mobile phone
    */
    public com.liferay.mobilephones.model.MBMobilePhone create(long id);

    /**
    * Removes the m b mobile phone with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the m b mobile phone
    * @return the m b mobile phone that was removed
    * @throws com.liferay.mobilephones.NoSuchMobilePhoneException if a m b mobile phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mobilephones.model.MBMobilePhone remove(long id)
        throws com.liferay.mobilephones.NoSuchMobilePhoneException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.mobilephones.model.MBMobilePhone updateImpl(
        com.liferay.mobilephones.model.MBMobilePhone mbMobilePhone,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the m b mobile phone with the primary key or throws a {@link com.liferay.mobilephones.NoSuchMobilePhoneException} if it could not be found.
    *
    * @param id the primary key of the m b mobile phone
    * @return the m b mobile phone
    * @throws com.liferay.mobilephones.NoSuchMobilePhoneException if a m b mobile phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mobilephones.model.MBMobilePhone findByPrimaryKey(
        long id)
        throws com.liferay.mobilephones.NoSuchMobilePhoneException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the m b mobile phone with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the m b mobile phone
    * @return the m b mobile phone, or <code>null</code> if a m b mobile phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mobilephones.model.MBMobilePhone fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the m b mobile phones.
    *
    * @return the m b mobile phones
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.mobilephones.model.MBMobilePhone> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.mobilephones.model.MBMobilePhone> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.mobilephones.model.MBMobilePhone> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the m b mobile phones from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of m b mobile phones.
    *
    * @return the number of m b mobile phones
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
