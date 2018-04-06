package com.logistics.module.dto;

import java.io.Serializable;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月6日 下午3:46:17
* 
*/
public class UserRoleDTO implements Serializable{
    /**
     * 用户id
     */
    private Integer cUserId;

    /**
     * 角色id
     */
    private Integer cRoleId;

    private static final long serialVersionUID = 1L;

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }

    public Integer getcRoleId() {
        return cRoleId;
    }

    public void setcRoleId(Integer cRoleId) {
        this.cRoleId = cRoleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cUserId=").append(cUserId);
        sb.append(", cRoleId=").append(cRoleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
