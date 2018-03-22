package com.logistics.module.bos.model;

import java.io.Serializable;

public class TFixedareaCourierKey implements Serializable {
    private String cFixedAreaId;

    private Integer cCourierId;

    private static final long serialVersionUID = 1L;

    public String getcFixedAreaId() {
        return cFixedAreaId;
    }

    public void setcFixedAreaId(String cFixedAreaId) {
        this.cFixedAreaId = cFixedAreaId;
    }

    public Integer getcCourierId() {
        return cCourierId;
    }

    public void setcCourierId(Integer cCourierId) {
        this.cCourierId = cCourierId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cFixedAreaId=").append(cFixedAreaId);
        sb.append(", cCourierId=").append(cCourierId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}