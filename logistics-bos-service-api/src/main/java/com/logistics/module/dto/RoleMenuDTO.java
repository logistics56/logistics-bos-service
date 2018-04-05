package com.logistics.module.dto;

import java.io.Serializable;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午8:14:40
* 
*/
public class RoleMenuDTO implements Serializable{
    /**
     * 角色表id
     */
    private Integer cRoleId;

    /**
     * 菜单表id
     */
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
