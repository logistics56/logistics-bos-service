package com.logistics.module.bos.model;

import java.io.Serializable;

public class TDeliveryInfo implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 配送员姓名
     */
    private String cCourierName;

    /**
     * 配送员工号
     */
    private String cCourierNum;

    /**
     * 描述
     */
    private String cDescription;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcCourierName() {
        return cCourierName;
    }

    public void setcCourierName(String cCourierName) {
        this.cCourierName = cCourierName;
    }

    public String getcCourierNum() {
        return cCourierNum;
    }

    public void setcCourierNum(String cCourierNum) {
        this.cCourierNum = cCourierNum;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cCourierName=").append(cCourierName);
        sb.append(", cCourierNum=").append(cCourierNum);
        sb.append(", cDescription=").append(cDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}