package com.logistics.module.bos.model;

import java.io.Serializable;

public class TTransitInfo implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 出库地址
     */
    private String cOutletAddress;

    /**
     * 出入库中转、到达网点、开始配送、正常签收、异常
     */
    private String cStatus;

    /**
     * 关联配送信息
     */
    private Integer cDeliveryInfoId;

    /**
     * 关联签收信息
     */
    private Integer cSignInfoId;

    /**
     * 关联运单信息
     */
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