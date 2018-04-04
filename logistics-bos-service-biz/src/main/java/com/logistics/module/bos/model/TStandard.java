package com.logistics.module.bos.model;

import java.io.Serializable;
import java.util.Date;

public class TStandard implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 最大长度
     */
    private Integer cMaxLength;

    /**
     * 最大重量
     */
    private Integer cMaxWeight;

    /**
     * 最小长度
     */
    private Integer cMinLength;

    /**
     * 最小重量
     */
    private Integer cMinWeight;

    /**
     * 标准名称
     */
    private String cName;

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

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcMaxLength() {
        return cMaxLength;
    }

    public void setcMaxLength(Integer cMaxLength) {
        this.cMaxLength = cMaxLength;
    }

    public Integer getcMaxWeight() {
        return cMaxWeight;
    }

    public void setcMaxWeight(Integer cMaxWeight) {
        this.cMaxWeight = cMaxWeight;
    }

    public Integer getcMinLength() {
        return cMinLength;
    }

    public void setcMinLength(Integer cMinLength) {
        this.cMinLength = cMinLength;
    }

    public Integer getcMinWeight() {
        return cMinWeight;
    }

    public void setcMinWeight(Integer cMinWeight) {
        this.cMinWeight = cMinWeight;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cMaxLength=").append(cMaxLength);
        sb.append(", cMaxWeight=").append(cMaxWeight);
        sb.append(", cMinLength=").append(cMinLength);
        sb.append(", cMinWeight=").append(cMinWeight);
        sb.append(", cName=").append(cName);
        sb.append(", cOperatingCompany=").append(cOperatingCompany);
        sb.append(", cOperatingTime=").append(cOperatingTime);
        sb.append(", cOperator=").append(cOperator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}