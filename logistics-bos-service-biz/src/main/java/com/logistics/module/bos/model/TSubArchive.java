package com.logistics.module.bos.model;

import java.io.Serializable;
import java.util.Date;

public class TSubArchive implements Serializable {
    private Integer cId;

    private String cMnemonicCode;

    private String cMothballed;

    private String cOperatingCompany;

    private Date cOperatingTime;

    private String cOperator;

    private String cRemark;

    private String cSubArchiveName;

    private Integer cArchiveId;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcMnemonicCode() {
        return cMnemonicCode;
    }

    public void setcMnemonicCode(String cMnemonicCode) {
        this.cMnemonicCode = cMnemonicCode;
    }

    public String getcMothballed() {
        return cMothballed;
    }

    public void setcMothballed(String cMothballed) {
        this.cMothballed = cMothballed;
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

    public String getcSubArchiveName() {
        return cSubArchiveName;
    }

    public void setcSubArchiveName(String cSubArchiveName) {
        this.cSubArchiveName = cSubArchiveName;
    }

    public Integer getcArchiveId() {
        return cArchiveId;
    }

    public void setcArchiveId(Integer cArchiveId) {
        this.cArchiveId = cArchiveId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cMnemonicCode=").append(cMnemonicCode);
        sb.append(", cMothballed=").append(cMothballed);
        sb.append(", cOperatingCompany=").append(cOperatingCompany);
        sb.append(", cOperatingTime=").append(cOperatingTime);
        sb.append(", cOperator=").append(cOperator);
        sb.append(", cRemark=").append(cRemark);
        sb.append(", cSubArchiveName=").append(cSubArchiveName);
        sb.append(", cArchiveId=").append(cArchiveId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}