package com.logistics.module.crm.dto;

import java.io.Serializable;
import java.util.Date;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月25日 下午5:36:12
* 
*/
public class SmsSignupDTO implements Serializable{
    private Integer cId;

    private String cTelephone;

    private String cCheckcode;

    private Integer cSource;

    private String cUsername;

    private Date cCreatetime;

    private Date cUpdatetime;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone;
    }

    public String getcCheckcode() {
        return cCheckcode;
    }

    public void setcCheckcode(String cCheckcode) {
        this.cCheckcode = cCheckcode;
    }

    public Integer getcSource() {
        return cSource;
    }

    public void setcSource(Integer cSource) {
        this.cSource = cSource;
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername;
    }

    public Date getcCreatetime() {
        return cCreatetime;
    }

    public void setcCreatetime(Date cCreatetime) {
        this.cCreatetime = cCreatetime;
    }

    public Date getcUpdatetime() {
        return cUpdatetime;
    }

    public void setcUpdatetime(Date cUpdatetime) {
        this.cUpdatetime = cUpdatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cTelephone=").append(cTelephone);
        sb.append(", cCheckcode=").append(cCheckcode);
        sb.append(", cSource=").append(cSource);
        sb.append(", cUsername=").append(cUsername);
        sb.append(", cCreatetime=").append(cCreatetime);
        sb.append(", cUpdatetime=").append(cUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
