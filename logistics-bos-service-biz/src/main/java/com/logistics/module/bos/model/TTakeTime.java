package com.logistics.module.bos.model;

import java.io.Serializable;
import java.util.Date;

public class TTakeTime implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 所属公司
     */
    private String cCompany;

    /**
     * 收派时间名称
     */
    private String cName;

    /**
     * 平常下班时间
     */
    private String cNormalDutyTime;

    /**
     * 平常上班时间
     */
    private String cNormalWorkTime;

    /**
     * 操作单位
     */
    private String cOperatingCompany;

    /**
     * 操作时间
     */
    private Date cOperatingTime;

    /**
     * 操作员
     */
    private String cOperator;

    /**
     * 周六下班时间
     */
    private String cSatDutyTime;

    /**
     * 周六上班时间
     */
    private String cSatWorkTime;

    /**
     * 状态
     */
    private String cStatus;

    /**
     * 周日下班时间
     */
    private String cSunDutyTime;

    /**
     * 周日上班时间
     */
    private String cSunWorkTime;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcCompany() {
        return cCompany;
    }

    public void setcCompany(String cCompany) {
        this.cCompany = cCompany;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcNormalDutyTime() {
        return cNormalDutyTime;
    }

    public void setcNormalDutyTime(String cNormalDutyTime) {
        this.cNormalDutyTime = cNormalDutyTime;
    }

    public String getcNormalWorkTime() {
        return cNormalWorkTime;
    }

    public void setcNormalWorkTime(String cNormalWorkTime) {
        this.cNormalWorkTime = cNormalWorkTime;
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

    public String getcSatDutyTime() {
        return cSatDutyTime;
    }

    public void setcSatDutyTime(String cSatDutyTime) {
        this.cSatDutyTime = cSatDutyTime;
    }

    public String getcSatWorkTime() {
        return cSatWorkTime;
    }

    public void setcSatWorkTime(String cSatWorkTime) {
        this.cSatWorkTime = cSatWorkTime;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public String getcSunDutyTime() {
        return cSunDutyTime;
    }

    public void setcSunDutyTime(String cSunDutyTime) {
        this.cSunDutyTime = cSunDutyTime;
    }

    public String getcSunWorkTime() {
        return cSunWorkTime;
    }

    public void setcSunWorkTime(String cSunWorkTime) {
        this.cSunWorkTime = cSunWorkTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cCompany=").append(cCompany);
        sb.append(", cName=").append(cName);
        sb.append(", cNormalDutyTime=").append(cNormalDutyTime);
        sb.append(", cNormalWorkTime=").append(cNormalWorkTime);
        sb.append(", cOperatingCompany=").append(cOperatingCompany);
        sb.append(", cOperatingTime=").append(cOperatingTime);
        sb.append(", cOperator=").append(cOperator);
        sb.append(", cSatDutyTime=").append(cSatDutyTime);
        sb.append(", cSatWorkTime=").append(cSatWorkTime);
        sb.append(", cStatus=").append(cStatus);
        sb.append(", cSunDutyTime=").append(cSunDutyTime);
        sb.append(", cSunWorkTime=").append(cSunWorkTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}