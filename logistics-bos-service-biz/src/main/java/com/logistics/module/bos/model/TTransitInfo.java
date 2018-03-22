package com.logistics.module.bos.model;

import java.io.Serializable;

public class TTransitInfo implements Serializable {
    private Integer cId;

    private String cOutletAddress;

    private String cStatus;

    private Integer cDeliveryInfoId;

    private Integer cSignInfoId;

    private Integer cWaybillId;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcOutletAddress() {
        return cOutletAddress;
    }

    public void setcOutletAddress(String cOutletAddress) {
        this.cOutletAddress = cOutletAddress;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public Integer getcDeliveryInfoId() {
        return cDeliveryInfoId;
    }

    public void setcDeliveryInfoId(Integer cDeliveryInfoId) {
        this.cDeliveryInfoId = cDeliveryInfoId;
    }

    public Integer getcSignInfoId() {
        return cSignInfoId;
    }

    public void setcSignInfoId(Integer cSignInfoId) {
        this.cSignInfoId = cSignInfoId;
    }

    public Integer getcWaybillId() {
        return cWaybillId;
    }

    public void setcWaybillId(Integer cWaybillId) {
        this.cWaybillId = cWaybillId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cOutletAddress=").append(cOutletAddress);
        sb.append(", cStatus=").append(cStatus);
        sb.append(", cDeliveryInfoId=").append(cDeliveryInfoId);
        sb.append(", cSignInfoId=").append(cSignInfoId);
        sb.append(", cWaybillId=").append(cWaybillId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}