package com.logistics.module.bos.model;

import java.io.Serializable;

public class TVehicle implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 司机
     */
    private String cDriver;

    /**
     * 备注
     */
    private String cRemark;

    /**
     * 线路名称
     */
    private String cRouteName;

    /**
     * 线路类型
     */
    private String cRouteType;

    /**
     * 承运商
     */
    private String cSnipper;

    /**
     * 电话
     */
    private String cTelephone;

    /**
     * 吨控
     */
    private Integer cTon;

    /**
     * 车牌号
     */
    private String cVehicleNum;

    /**
     * 车型
     */
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