package com.logistics.module.bos.model;

import java.io.Serializable;

public class TInOutStorageInfo implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 仓库、网点 地址
     */
    private String cAddress;

    /**
     * 描述
     */
    private String cDescription;

    /**
     * 操作类型 ： 入库、出库、到达网点
     */
    private String cOperation;

    /**
     * 运输配送信息表id
     */
    private Integer cTransitInfoId;

    /**
     * 排序
     */
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