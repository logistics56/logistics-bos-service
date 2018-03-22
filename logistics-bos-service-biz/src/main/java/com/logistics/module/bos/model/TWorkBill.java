package com.logistics.module.bos.model;

import java.io.Serializable;
import java.util.Date;

public class TWorkBill implements Serializable {
    private Integer cId;

    private Integer cAttachbilltimes;

    private Date cBuildtime;

    private String cPickstate;

    private String cRemark;

    private String cSmsnumber;

    private String cType;

    private Integer cCourier;

    private Integer cOrderId;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcAttachbilltimes() {
        return cAttachbilltimes;
    }

    public void setcAttachbilltimes(Integer cAttachbilltimes) {
        this.cAttachbilltimes = cAttachbilltimes;
    }

    public Date getcBuildtime() {
        return cBuildtime;
    }

    public void setcBuildtime(Date cBuildtime) {
        this.cBuildtime = cBuildtime;
    }

    public String getcPickstate() {
        return cPickstate;
    }

    public void setcPickstate(String cPickstate) {
        this.cPickstate = cPickstate;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark;
    }

    public String getcSmsnumber() {
        return cSmsnumber;
    }

    public void setcSmsnumber(String cSmsnumber) {
        this.cSmsnumber = cSmsnumber;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public Integer getcCourier() {
        return cCourier;
    }

    public void setcCourier(Integer cCourier) {
        this.cCourier = cCourier;
    }

    public Integer getcOrderId() {
        return cOrderId;
    }

    public void setcOrderId(Integer cOrderId) {
        this.cOrderId = cOrderId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cAttachbilltimes=").append(cAttachbilltimes);
        sb.append(", cBuildtime=").append(cBuildtime);
        sb.append(", cPickstate=").append(cPickstate);
        sb.append(", cRemark=").append(cRemark);
        sb.append(", cSmsnumber=").append(cSmsnumber);
        sb.append(", cType=").append(cType);
        sb.append(", cCourier=").append(cCourier);
        sb.append(", cOrderId=").append(cOrderId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}