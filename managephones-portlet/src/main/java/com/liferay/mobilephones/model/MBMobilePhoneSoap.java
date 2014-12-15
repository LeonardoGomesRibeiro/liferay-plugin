package com.liferay.mobilephones.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Leonardo Ribeiro
 * @generated
 */
public class MBMobilePhoneSoap implements Serializable {
    private long _id;
    private String _name;
    private String _brand;
    private String _description;
    private Date _releaseDate;
    private double _price;

    public MBMobilePhoneSoap() {
    }

    public static MBMobilePhoneSoap toSoapModel(MBMobilePhone model) {
        MBMobilePhoneSoap soapModel = new MBMobilePhoneSoap();

        soapModel.setId(model.getId());
        soapModel.setName(model.getName());
        soapModel.setBrand(model.getBrand());
        soapModel.setDescription(model.getDescription());
        soapModel.setReleaseDate(model.getReleaseDate());
        soapModel.setPrice(model.getPrice());

        return soapModel;
    }

    public static MBMobilePhoneSoap[] toSoapModels(MBMobilePhone[] models) {
        MBMobilePhoneSoap[] soapModels = new MBMobilePhoneSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MBMobilePhoneSoap[][] toSoapModels(MBMobilePhone[][] models) {
        MBMobilePhoneSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MBMobilePhoneSoap[models.length][models[0].length];
        } else {
            soapModels = new MBMobilePhoneSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MBMobilePhoneSoap[] toSoapModels(List<MBMobilePhone> models) {
        List<MBMobilePhoneSoap> soapModels = new ArrayList<MBMobilePhoneSoap>(models.size());

        for (MBMobilePhone model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MBMobilePhoneSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getBrand() {
        return _brand;
    }

    public void setBrand(String brand) {
        _brand = brand;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public Date getReleaseDate() {
        return _releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        _releaseDate = releaseDate;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }
}
