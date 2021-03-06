package com.logistics.module.dto;

import java.io.Serializable;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 下午11:07:04
* 
*/
public class VehicleDTO implements Serializable{
    private Integer cId;

    private String cDriver;

    private String cRemark;

    private String cRouteName;

    private String cRouteType;

    private String cSnipper;

    private String cTelephone;

    private Integer cTon;

    private String cVehicleNum;

    private String cVehicleType;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcDriver() {
        return cDriver;
    }

    public void setcDriver(String cDriver) {
        this.cDriver = cDriver;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark;
    }

    public String getcRouteName() {
        return cRouteName;
    }

    public void setcRouteName(String cRouteName) {
        this.cRouteName = cRouteName;
    }

    public String getcRouteType() {
        return cRouteType;
    }

    public void setcRouteType(String cRouteType) {
        this.cRouteType = cRouteType;
    }

    public String getcSnipper() {
        return cSnipper;
    }

    public void setcSnipper(String cSnipper) {
        this.cSnipper = cSnipper;
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone;
    }

    public Integer getcTon() {
        return cTon;
    }

    public void setcTon(Integer cTon) {
        this.cTon = cTon;
    }

    public String getcVehicleNum() {
        return cVehicleNum;
    }

    public void setcVehicleNum(String cVehicleNum) {
        this.cVehicleNum = cVehicleNum;
    }

    public String getcVehicleType() {
        return cVehicleType;
    }

    public void setcVehicleType(String cVehicleType) {
        this.cVehicleType = cVehicleType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cDriver=").append(cDriver);
        sb.append(", cRemark=").append(cRemark);
        sb.append(", cRouteName=").append(cRouteName);
        sb.append(", cRouteType=").append(cRouteType);
        sb.append(", cSnipper=").append(cSnipper);
        sb.append(", cTelephone=").append(cTelephone);
        sb.append(", cTon=").append(cTon);
        sb.append(", cVehicleNum=").append(cVehicleNum);
        sb.append(", cVehicleType=").append(cVehicleType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
