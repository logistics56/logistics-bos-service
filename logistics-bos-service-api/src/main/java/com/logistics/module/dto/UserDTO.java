package com.logistics.module.dto;

import java.io.Serializable;
import java.util.Date;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午10:30:21
* 
*/
public class UserDTO implements Serializable{
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 生日
     */
    private Date cBirthday;

    /**
     * 性别
     */
    private String cGender;

    /**
     * 真实姓名
     */
    private String cNickname;

    /**
     * 密码
     */
    private String cPassword;

    /**
     * 备注
     */
    private String cRemark;

    /**
     * 状态
     */
    private String cStation;

    /**
     * 联系电话
     */
    private String cTelephone;

    /**
     * 登陆用户名
     */
    private String cUsername;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Date getcBirthday() {
        return cBirthday;
    }

    public void setcBirthday(Date cBirthday) {
        this.cBirthday = cBirthday;
    }

    public String getcGender() {
        return cGender;
    }

    public void setcGender(String cGender) {
        this.cGender = cGender;
    }

    public String getcNickname() {
        return cNickname;
    }

    public void setcNickname(String cNickname) {
        this.cNickname = cNickname;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark;
    }

    public String getcStation() {
        return cStation;
    }

    public void setcStation(String cStation) {
        this.cStation = cStation;
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone;
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cBirthday=").append(cBirthday);
        sb.append(", cGender=").append(cGender);
        sb.append(", cNickname=").append(cNickname);
        sb.append(", cPassword=").append(cPassword);
        sb.append(", cRemark=").append(cRemark);
        sb.append(", cStation=").append(cStation);
        sb.append(", cTelephone=").append(cTelephone);
        sb.append(", cUsername=").append(cUsername);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
