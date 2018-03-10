package com.logistics.module.model;

import java.io.Serializable;

public class TArea implements Serializable {
    private String cId;

    private String cCity;

    private String cCitycode;

    private String cDistrict;

    private String cPostcode;

    private String cProvince;

    private String cShortcode;

    private static final long serialVersionUID = 1L;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity;
    }

    public String getcCitycode() {
        return cCitycode;
    }

    public void setcCitycode(String cCitycode) {
        this.cCitycode = cCitycode;
    }

    public String getcDistrict() {
        return cDistrict;
    }

    public void setcDistrict(String cDistrict) {
        this.cDistrict = cDistrict;
    }

    public String getcPostcode() {
        return cPostcode;
    }

    public void setcPostcode(String cPostcode) {
        this.cPostcode = cPostcode;
    }

    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince;
    }

    public String getcShortcode() {
        return cShortcode;
    }

    public void setcShortcode(String cShortcode) {
        this.cShortcode = cShortcode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cCity=").append(cCity);
        sb.append(", cCitycode=").append(cCitycode);
        sb.append(", cDistrict=").append(cDistrict);
        sb.append(", cPostcode=").append(cPostcode);
        sb.append(", cProvince=").append(cProvince);
        sb.append(", cShortcode=").append(cShortcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}