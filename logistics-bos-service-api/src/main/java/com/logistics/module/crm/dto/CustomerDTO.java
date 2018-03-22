package com.logistics.module.crm.dto;

import java.io.Serializable;
import java.util.Date;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月22日 下午11:15:07
* 
*/
public class CustomerDTO implements Serializable{
    private Integer cId;

    private String cAddress;

    private Date cBrithday;

    private String cCompany;

    private String cDepartment;

    private String cEmail;

    private String cFixedAreaId;

    private String cMobilephone;

    private String cPassword;

    private String cPosition;

    private Integer cSex;

    private String cTelephone;

    private Integer cType;

    private String cUsername;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public Date getcBrithday() {
        return cBrithday;
    }

    public void setcBrithday(Date cBrithday) {
        this.cBrithday = cBrithday;
    }

    public String getcCompany() {
        return cCompany;
    }

    public void setcCompany(String cCompany) {
        this.cCompany = cCompany;
    }

    public String getcDepartment() {
        return cDepartment;
    }

    public void setcDepartment(String cDepartment) {
        this.cDepartment = cDepartment;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getcFixedAreaId() {
        return cFixedAreaId;
    }

    public void setcFixedAreaId(String cFixedAreaId) {
        this.cFixedAreaId = cFixedAreaId;
    }

    public String getcMobilephone() {
        return cMobilephone;
    }

    public void setcMobilephone(String cMobilephone) {
        this.cMobilephone = cMobilephone;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getcPosition() {
        return cPosition;
    }

    public void setcPosition(String cPosition) {
        this.cPosition = cPosition;
    }

    public Integer getcSex() {
        return cSex;
    }

    public void setcSex(Integer cSex) {
        this.cSex = cSex;
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone;
    }

    public Integer getcType() {
        return cType;
    }

    public void setcType(Integer cType) {
        this.cType = cType;
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
        sb.append(", cAddress=").append(cAddress);
        sb.append(", cBrithday=").append(cBrithday);
        sb.append(", cCompany=").append(cCompany);
        sb.append(", cDepartment=").append(cDepartment);
        sb.append(", cEmail=").append(cEmail);
        sb.append(", cFixedAreaId=").append(cFixedAreaId);
        sb.append(", cMobilephone=").append(cMobilephone);
        sb.append(", cPassword=").append(cPassword);
        sb.append(", cPosition=").append(cPosition);
        sb.append(", cSex=").append(cSex);
        sb.append(", cTelephone=").append(cTelephone);
        sb.append(", cType=").append(cType);
        sb.append(", cUsername=").append(cUsername);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
