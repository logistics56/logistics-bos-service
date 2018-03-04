package com.logistics.module.model;

import java.io.Serializable;

public class TRoleMenuKey implements Serializable {
    private Integer cRoleId;

    private Integer cMenuId;

    private static final long serialVersionUID = 1L;

    public Integer getcRoleId() {
        return cRoleId;
    }

    public void setcRoleId(Integer cRoleId) {
        this.cRoleId = cRoleId;
    }

    public Integer getcMenuId() {
        return cMenuId;
    }

    public void setcMenuId(Integer cMenuId) {
        this.cMenuId = cMenuId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cRoleId=").append(cRoleId);
        sb.append(", cMenuId=").append(cMenuId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}