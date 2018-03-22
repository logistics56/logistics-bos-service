package com.logistics.module.bos.model;

import java.io.Serializable;
import java.util.Date;

public class TFixedArea implements Serializable {
    private String cId;

    private String cCompany;

    private String cFixedAreaLeader;

    private String cFixedAreaName;

    private String cOperatingCompany;

    private Date cOperatingTime;

    private String cOperator;

    private String cTelephone;

    private static final long serialVersionUID = 1L;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcCompany() {
        return cCompany;
    }

    public void setcCompany(String cCompany) {
        this.cCompany = cCompany;
    }

    public String getcFixedAreaLeader() {
        return cFixedAreaLeader;
    }

    public void setcFixedAreaLeader(String cFixedAreaLeader) {
        this.cFixedAreaLeader = cFixedAreaLeader;
    }

    public String getcFixedAreaName() {
        return cFixedAreaName;
    }

    public void setcFixedAreaName(String cFixedAreaName) {
        this.cFixedAreaName = cFixedAreaName;
    }

    public String getcOperatingCompany() {
        return cOperatingCompany;
    }

    public void setcOperatingCompany(String cOperatingCompany) {
        this.cOperatingCompany = cOperatingCompany;
    }

    public Date getcOperatingTime() {
        return cOperatingTime;
    }

    public void setcOperatingTime(Date cOperatingTime) {
        this.cOperatingTime = cOperatingTime;
    }

    public String getcOperator() {
        return cOperator;
    }

    public void setcOperator(String cOperator) {
        this.cOperator = cOperator;
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cCompany=").append(cCompany);
        sb.append(", cFixedAreaLeader=").append(cFixedAreaLeader);
        sb.append(", cFixedAreaName=").append(cFixedAreaName);
        sb.append(", cOperatingCompany=").append(cOperatingCompany);
        sb.append(", cOperatingTime=").append(cOperatingTime);
        sb.append(", cOperator=").append(cOperator);
        sb.append(", cTelephone=").append(cTelephone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}