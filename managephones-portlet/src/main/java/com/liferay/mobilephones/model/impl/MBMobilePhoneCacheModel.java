package com.liferay.mobilephones.model.impl;

import com.liferay.mobilephones.model.MBMobilePhone;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing MBMobilePhone in entity cache.
 *
 * @author Leonardo Ribeiro
 * @see MBMobilePhone
 * @generated
 */
public class MBMobilePhoneCacheModel implements CacheModel<MBMobilePhone>,
    Serializable {
    public long id;
    public String name;
    public String brand;
    public String description;
    public long releaseDate;
    public double price;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name=");
        sb.append(name);
        sb.append(", brand=");
        sb.append(brand);
        sb.append(", description=");
        sb.append(description);
        sb.append(", releaseDate=");
        sb.append(releaseDate);
        sb.append(", price=");
        sb.append(price);
        sb.append("}");

        return sb.toString();
    }

    public MBMobilePhone toEntityModel() {
        MBMobilePhoneImpl mbMobilePhoneImpl = new MBMobilePhoneImpl();

        mbMobilePhoneImpl.setId(id);

        if (name == null) {
            mbMobilePhoneImpl.setName(StringPool.BLANK);
        } else {
            mbMobilePhoneImpl.setName(name);
        }

        if (brand == null) {
            mbMobilePhoneImpl.setBrand(StringPool.BLANK);
        } else {
            mbMobilePhoneImpl.setBrand(brand);
        }

        if (description == null) {
            mbMobilePhoneImpl.setDescription(StringPool.BLANK);
        } else {
            mbMobilePhoneImpl.setDescription(description);
        }

        if (releaseDate == Long.MIN_VALUE) {
            mbMobilePhoneImpl.setReleaseDate(null);
        } else {
            mbMobilePhoneImpl.setReleaseDate(new Date(releaseDate));
        }

        mbMobilePhoneImpl.setPrice(price);

        mbMobilePhoneImpl.resetOriginalValues();

        return mbMobilePhoneImpl;
    }
}
