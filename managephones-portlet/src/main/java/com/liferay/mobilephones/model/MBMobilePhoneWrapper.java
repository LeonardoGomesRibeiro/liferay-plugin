package com.liferay.mobilephones.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MBMobilePhone}.
 * </p>
 *
 * @author    Leonardo Ribeiro
 * @see       MBMobilePhone
 * @generated
 */
public class MBMobilePhoneWrapper implements MBMobilePhone,
    ModelWrapper<MBMobilePhone> {
    private MBMobilePhone _mbMobilePhone;

    public MBMobilePhoneWrapper(MBMobilePhone mbMobilePhone) {
        _mbMobilePhone = mbMobilePhone;
    }

    public Class<?> getModelClass() {
        return MBMobilePhone.class;
    }

    public String getModelClassName() {
        return MBMobilePhone.class.getName();
    }

    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name", getName());
        attributes.put("brand", getBrand());
        attributes.put("description", getDescription());
        attributes.put("releaseDate", getReleaseDate());
        attributes.put("price", getPrice());

        return attributes;
    }

    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String brand = (String) attributes.get("brand");

        if (brand != null) {
            setBrand(brand);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        Date releaseDate = (Date) attributes.get("releaseDate");

        if (releaseDate != null) {
            setReleaseDate(releaseDate);
        }

        Double price = (Double) attributes.get("price");

        if (price != null) {
            setPrice(price);
        }
    }

    /**
    * Returns the primary key of this m b mobile phone.
    *
    * @return the primary key of this m b mobile phone
    */
    public long getPrimaryKey() {
        return _mbMobilePhone.getPrimaryKey();
    }

    /**
    * Sets the primary key of this m b mobile phone.
    *
    * @param primaryKey the primary key of this m b mobile phone
    */
    public void setPrimaryKey(long primaryKey) {
        _mbMobilePhone.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this m b mobile phone.
    *
    * @return the ID of this m b mobile phone
    */
    public long getId() {
        return _mbMobilePhone.getId();
    }

    /**
    * Sets the ID of this m b mobile phone.
    *
    * @param id the ID of this m b mobile phone
    */
    public void setId(long id) {
        _mbMobilePhone.setId(id);
    }

    /**
    * Returns the name of this m b mobile phone.
    *
    * @return the name of this m b mobile phone
    */
    public java.lang.String getName() {
        return _mbMobilePhone.getName();
    }

    /**
    * Sets the name of this m b mobile phone.
    *
    * @param name the name of this m b mobile phone
    */
    public void setName(java.lang.String name) {
        _mbMobilePhone.setName(name);
    }

    /**
    * Returns the brand of this m b mobile phone.
    *
    * @return the brand of this m b mobile phone
    */
    public java.lang.String getBrand() {
        return _mbMobilePhone.getBrand();
    }

    /**
    * Sets the brand of this m b mobile phone.
    *
    * @param brand the brand of this m b mobile phone
    */
    public void setBrand(java.lang.String brand) {
        _mbMobilePhone.setBrand(brand);
    }

    /**
    * Returns the description of this m b mobile phone.
    *
    * @return the description of this m b mobile phone
    */
    public java.lang.String getDescription() {
        return _mbMobilePhone.getDescription();
    }

    /**
    * Sets the description of this m b mobile phone.
    *
    * @param description the description of this m b mobile phone
    */
    public void setDescription(java.lang.String description) {
        _mbMobilePhone.setDescription(description);
    }

    /**
    * Returns the release date of this m b mobile phone.
    *
    * @return the release date of this m b mobile phone
    */
    public java.util.Date getReleaseDate() {
        return _mbMobilePhone.getReleaseDate();
    }

    /**
    * Sets the release date of this m b mobile phone.
    *
    * @param releaseDate the release date of this m b mobile phone
    */
    public void setReleaseDate(java.util.Date releaseDate) {
        _mbMobilePhone.setReleaseDate(releaseDate);
    }

    /**
    * Returns the price of this m b mobile phone.
    *
    * @return the price of this m b mobile phone
    */
    public double getPrice() {
        return _mbMobilePhone.getPrice();
    }

    /**
    * Sets the price of this m b mobile phone.
    *
    * @param price the price of this m b mobile phone
    */
    public void setPrice(double price) {
        _mbMobilePhone.setPrice(price);
    }

    public boolean isNew() {
        return _mbMobilePhone.isNew();
    }

    public void setNew(boolean n) {
        _mbMobilePhone.setNew(n);
    }

    public boolean isCachedModel() {
        return _mbMobilePhone.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _mbMobilePhone.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _mbMobilePhone.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _mbMobilePhone.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _mbMobilePhone.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _mbMobilePhone.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _mbMobilePhone.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new MBMobilePhoneWrapper((MBMobilePhone) _mbMobilePhone.clone());
    }

    public int compareTo(
        com.liferay.mobilephones.model.MBMobilePhone mbMobilePhone) {
        return _mbMobilePhone.compareTo(mbMobilePhone);
    }

    @Override
    public int hashCode() {
        return _mbMobilePhone.hashCode();
    }

    public com.liferay.portal.model.CacheModel<com.liferay.mobilephones.model.MBMobilePhone> toCacheModel() {
        return _mbMobilePhone.toCacheModel();
    }

    public com.liferay.mobilephones.model.MBMobilePhone toEscapedModel() {
        return new MBMobilePhoneWrapper(_mbMobilePhone.toEscapedModel());
    }

    public com.liferay.mobilephones.model.MBMobilePhone toUnescapedModel() {
        return new MBMobilePhoneWrapper(_mbMobilePhone.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _mbMobilePhone.toString();
    }

    public java.lang.String toXmlString() {
        return _mbMobilePhone.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _mbMobilePhone.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MBMobilePhoneWrapper)) {
            return false;
        }

        MBMobilePhoneWrapper mbMobilePhoneWrapper = (MBMobilePhoneWrapper) obj;

        if (Validator.equals(_mbMobilePhone, mbMobilePhoneWrapper._mbMobilePhone)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public MBMobilePhone getWrappedMBMobilePhone() {
        return _mbMobilePhone;
    }

    public MBMobilePhone getWrappedModel() {
        return _mbMobilePhone;
    }

    public void resetOriginalValues() {
        _mbMobilePhone.resetOriginalValues();
    }
}
