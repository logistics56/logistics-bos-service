package com.logistics.module.model;

import java.io.Serializable;
import java.util.Date;

public class TPromotion implements Serializable {
    private Integer cId;

    private String cActiveScope;

    private String cDescription;

    private Date cEndDate;

    private Date cStartDate;

    private String cStatus;

    private String cTitle;

    private String cTitleImg;

    private Date cUpdateTime;

    private String cUpdateUnit;

    private String cUpdateUser;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcActiveScope() {
        return cActiveScope;
    }

    public void setcActiveScope(String cActiveScope) {
        this.cActiveScope = cActiveScope;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    public Date getcEndDate() {
        return cEndDate;
    }

    public void setcEndDate(Date cEndDate) {
        this.cEndDate = cEndDate;
    }

    public Date getcStartDate() {
        return cStartDate;
    }

    public void setcStartDate(Date cStartDate) {
        this.cStartDate = cStartDate;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public String getcTitle() {
        return cTitle;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle;
    }

    public String getcTitleImg() {
        return cTitleImg;
    }

    public void setcTitleImg(String cTitleImg) {
        this.cTitleImg = cTitleImg;
    }

    public Date getcUpdateTime() {
        return cUpdateTime;
    }

    public void setcUpdateTime(Date cUpdateTime) {
        this.cUpdateTime = cUpdateTime;
    }

    public String getcUpdateUnit() {
        return cUpdateUnit;
    }

    public void setcUpdateUnit(String cUpdateUnit) {
        this.cUpdateUnit = cUpdateUnit;
    }

    public String getcUpdateUser() {
        return cUpdateUser;
    }

    public void setcUpdateUser(String cUpdateUser) {
        this.cUpdateUser = cUpdateUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cActiveScope=").append(cActiveScope);
        sb.append(", cDescription=").append(cDescription);
        sb.append(", cEndDate=").append(cEndDate);
        sb.append(", cStartDate=").append(cStartDate);
        sb.append(", cStatus=").append(cStatus);
        sb.append(", cTitle=").append(cTitle);
        sb.append(", cTitleImg=").append(cTitleImg);
        sb.append(", cUpdateTime=").append(cUpdateTime);
        sb.append(", cUpdateUnit=").append(cUpdateUnit);
        sb.append(", cUpdateUser=").append(cUpdateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}