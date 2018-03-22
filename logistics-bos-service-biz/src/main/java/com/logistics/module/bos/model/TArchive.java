package com.logistics.module.bos.model;

import java.io.Serializable;
import java.util.Date;

public class TArchive implements Serializable {
    private Integer cId;

    private String cArchiveName;

    private String cArchiveNum;

    private Integer cHaschild;

    private String cOperatingCompany;

    private Date cOperatingTime;

    private String cOperator;

    private String cRemark;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcArchiveName() {
        return cArchiveName;
    }

    public void setcArchiveName(String cArchiveName) {
        this.cArchiveName = cArchiveName;
    }

    public String getcArchiveNum() {
        return cArchiveNum;
    }

    public void setcArchiveNum(String cArchiveNum) {
        this.cArchiveNum = cArchiveNum;
    }

    public Integer getcHaschild() {
        return cHaschild;
    }

    public void setcHaschild(Integer cHaschild) {
        this.cHaschild = cHaschild;
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

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cArchiveName=").append(cArchiveName);
        sb.append(", cArchiveNum=").append(cArchiveNum);
        sb.append(", cHaschild=").append(cHaschild);
        sb.append(", cOperatingCompany=").append(cOperatingCompany);
        sb.append(", cOperatingTime=").append(cOperatingTime);
        sb.append(", cOperator=").append(cOperator);
        sb.append(", cRemark=").append(cRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}