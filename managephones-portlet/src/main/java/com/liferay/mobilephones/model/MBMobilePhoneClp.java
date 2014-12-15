package com.liferay.mobilephones.model;

import com.liferay.mobilephones.service.ClpSerializer;
import com.liferay.mobilephones.service.MBMobilePhoneLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MBMobilePhoneClp extends BaseModelImpl<MBMobilePhone>
    implements MBMobilePhone {
    private long _id;
    private String _name;
    private String _brand;
    private String _description;
    private Date _releaseDate;
    private double _price;
    private BaseModel<?> _mbMobilePhoneRemoteModel;

    public MBMobilePhoneClp() {
    }

    public Class<?> getModelClass() {
        return MBMobilePhone.class;
    }

    public String getModelClassName() {
        return MBMobilePhone.class.getName();
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
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

    @Override
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

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;

        if (_mbMobilePhoneRemoteModel != null) {
            try {
                Class<?> clazz = _mbMobilePhoneRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_mbMobilePhoneRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;

        if (_mbMobilePhoneRemoteModel != null) {
            try {
                Class<?> clazz = _mbMobilePhoneRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_mbMobilePhoneRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getBrand() {
        return _brand;
    }

    public void setBrand(String brand) {
        _brand = brand;

        if (_mbMobilePhoneRemoteModel != null) {
            try {
                Class<?> clazz = _mbMobilePhoneRemoteModel.getClass();

                Method method = clazz.getMethod("setBrand", String.class);

                method.invoke(_mbMobilePhoneRemoteModel, brand);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;

        if (_mbMobilePhoneRemoteModel != null) {
            try {
                Class<?> clazz = _mbMobilePhoneRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_mbMobilePhoneRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public Date getReleaseDate() {
        return _releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        _releaseDate = releaseDate;

        if (_mbMobilePhoneRemoteModel != null) {
            try {
                Class<?> clazz = _mbMobilePhoneRemoteModel.getClass();

                Method method = clazz.getMethod("setReleaseDate", Date.class);

                method.invoke(_mbMobilePhoneRemoteModel, releaseDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;

        if (_mbMobilePhoneRemoteModel != null) {
            try {
                Class<?> clazz = _mbMobilePhoneRemoteModel.getClass();

                Method method = clazz.getMethod("setPrice", double.class);

                method.invoke(_mbMobilePhoneRemoteModel, price);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getMBMobilePhoneRemoteModel() {
        return _mbMobilePhoneRemoteModel;
    }

    public void setMBMobilePhoneRemoteModel(
        BaseModel<?> mbMobilePhoneRemoteModel) {
        _mbMobilePhoneRemoteModel = mbMobilePhoneRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _mbMobilePhoneRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_mbMobilePhoneRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            MBMobilePhoneLocalServiceUtil.addMBMobilePhone(this);
        } else {
            MBMobilePhoneLocalServiceUtil.updateMBMobilePhone(this);
        }
    }

    @Override
    public MBMobilePhone toEscapedModel() {
        return (MBMobilePhone) ProxyUtil.newProxyInstance(MBMobilePhone.class.getClassLoader(),
            new Class[] { MBMobilePhone.class }, new AutoEscapeBeanHandler(this));
    }

    public MBMobilePhone toUnescapedModel() {
        return this;
    }

    @Override
    public Object clone() {
        MBMobilePhoneClp clone = new MBMobilePhoneClp();

        clone.setId(getId());
        clone.setName(getName());
        clone.setBrand(getBrand());
        clone.setDescription(getDescription());
        clone.setReleaseDate(getReleaseDate());
        clone.setPrice(getPrice());

        return clone;
    }

    public int compareTo(MBMobilePhone mbMobilePhone) {
        long primaryKey = mbMobilePhone.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MBMobilePhoneClp)) {
            return false;
        }

        MBMobilePhoneClp mbMobilePhone = (MBMobilePhoneClp) obj;

        long primaryKey = mbMobilePhone.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", brand=");
        sb.append(getBrand());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", releaseDate=");
        sb.append(getReleaseDate());
        sb.append(", price=");
        sb.append(getPrice());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.liferay.mobilephones.model.MBMobilePhone");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>brand</column-name><column-value><![CDATA[");
        sb.append(getBrand());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>releaseDate</column-name><column-value><![CDATA[");
        sb.append(getReleaseDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>price</column-name><column-value><![CDATA[");
        sb.append(getPrice());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
