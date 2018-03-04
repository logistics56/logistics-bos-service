package com.logistics.module.model;

import java.io.Serializable;

public class TInOutStorageInfo implements Serializable {
    private Integer cId;

    private String cAddress;

    private String cDescription;

    private String cOperation;

    private Integer cTransitInfoId;

    private Integer cInOutIndex;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    public String getcOperation() {
        return cOperation;
    }

    public void setcOperation(String cOperation) {
        this.cOperation = cOperation;
    }

    public Integer getcTransitInfoId() {
        return cTransitInfoId;
    }

    public void setcTransitInfoId(Integer cTransitInfoId) {
        this.cTransitInfoId = cTransitInfoId;
    }

    public Integer getcInOutIndex() {
        return cInOutIndex;
    }

    public void setcInOutIndex(Integer cInOutIndex) {
        this.cInOutIndex = cInOutIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cAddress=").append(cAddress);
        sb.append(", cDescription=").append(cDescription);
        sb.append(", cOperation=").append(cOperation);
        sb.append(", cTransitInfoId=").append(cTransitInfoId);
        sb.append(", cInOutIndex=").append(cInOutIndex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}