package com.logistics.module.bos.model;

import java.io.Serializable;

public class TRolePermissionKey implements Serializable {
    private Integer cRoleId;

    private Integer cPermissionId;

    private static final long serialVersionUID = 1L;

    public Integer getcRoleId() {
        return cRoleId;
    }

    public void setcRoleId(Integer cRoleId) {
        this.cRoleId = cRoleId;
    }

    public Integer getcPermissionId() {
        return cPermissionId;
    }

    public void setcPermissionId(Integer cPermissionId) {
        this.cPermissionId = cPermissionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cRoleId=").append(cRoleId);
        sb.append(", cPermissionId=").append(cPermissionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}