package com.logistics.module.bos.model;

import java.io.Serializable;

public class TPermission implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 描述
     */
    private String cDescription;

    /**
     * 权限关键字，用于权限控制
     */
    private String cKeyword;

    /**
     * 权限名称
     */
    private String cName;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    public String getcKeyword() {
        return cKeyword;
    }

    public void setcKeyword(String cKeyword) {
        this.cKeyword = cKeyword;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cDescription=").append(cDescription);
        sb.append(", cKeyword=").append(cKeyword);
        sb.append(", cName=").append(cName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}