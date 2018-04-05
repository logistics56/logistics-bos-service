package com.logistics.module.dto;

import java.io.Serializable;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午7:57:26
* 
*/
public class RolePermissionDTO implements Serializable{

    /**
     * 角色表id
     */
    private Integer cRoleId;

    /**
     * 权限表id
     */
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
