package com.logistics.module.bos.model;

import java.io.Serializable;
import java.util.Date;

public class TArchive implements Serializable {
    /**
     *  主键
     */
    private Integer cId;

    /**
     * 档案名称
     */
    private String cArchiveName;

    /**
     * 档案编号
     */
    private String cArchiveNum;

    /**
     * 是否分级 0代表不分级 1代表分级
     */
    private Integer cHaschild;

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
     * 备注
     */
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