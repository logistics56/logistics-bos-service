package com.logistics.module.dto;

import java.io.Serializable;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午5:22:06
* 
*/
public class MenuDTO implements Serializable{
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 描述
     */
    private String cDescription;

    /**
     * 菜单名称
     */
    private String cName;

    /**
     * 访问路径
     */
    private String cPage;

    /**
     * 优先级
     */
    private Integer cPriority;

    /**
     * 父菜单id
     */
    private Integer cPid;

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

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcPage() {
        return cPage;
    }

    public void setcPage(String cPage) {
        this.cPage = cPage;
    }

    public Integer getcPriority() {
        return cPriority;
    }

    public void setcPriority(Integer cPriority) {
        this.cPriority = cPriority;
    }

    public Integer getcPid() {
        return cPid;
    }

    public void setcPid(Integer cPid) {
        this.cPid = cPid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cDescription=").append(cDescription);
        sb.append(", cName=").append(cName);
        sb.append(", cPage=").append(cPage);
        sb.append(", cPriority=").append(cPriority);
        sb.append(", cPid=").append(cPid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
