package com.logistics.module.bos.model;

import java.io.Serializable;

public class TCourier implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 查台密码
     */
    private String cCheckPwd;

    /**
     * 单位
     */
    private String cCompany;

    /**
     * 快递员工号
     */
    private String cCourierNum;

    /**
     * 作废标志 1 为标记作废
     */
    private String cDeltag;

    /**
     * 快递员姓名
     */
    private String cName;

    /**
     * PDA号
     */
    private String cPda;

    /**
     * 快递员联系电话
     */
    private String cTelephone;

    /**
     * 取件员类型
     */
    private String cType;

    /**
     * 车牌号
     */
    private String cVehicleNum;

    /**
     * 车辆类型
     */
    private String cVehicleType;

    /**
     * 取派标准id
     */
    private Integer cStandardId;

    /**
     * 收派时间id
     */
    private Integer cTaketimeId;

    /**
     * 定区编码id
     */
    private String cFixedAreaId;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcCheckPwd() {
        return cCheckPwd;
    }

    public void setcCheckPwd(String cCheckPwd) {
        this.cCheckPwd = cCheckPwd;
    }

    public String getcCompany() {
        return cCompany;
    }

    public void setcCompany(String cCompany) {
        this.cCompany = cCompany;
    }

    public String getcCourierNum() {
        return cCourierNum;
    }

    public void setcCourierNum(String cCourierNum) {
        this.cCourierNum = cCourierNum;
    }

    public String getcDeltag() {
        return cDeltag;
    }

    public void setcDeltag(String cDeltag) {
        this.cDeltag = cDeltag;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcPda() {
        return cPda;
    }

    public void setcPda(String cPda) {
        this.cPda = cPda;
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
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

    public Integer getcStandardId() {
        return cStandardId;
    }

    public void setcStandardId(Integer cStandardId) {
        this.cStandardId = cStandardId;
    }

    public Integer getcTaketimeId() {
        return cTaketimeId;
    }

    public void setcTaketimeId(Integer cTaketimeId) {
        this.cTaketimeId = cTaketimeId;
    }

    public String getcFixedAreaId() {
        return cFixedAreaId;
    }

    public void setcFixedAreaId(String cFixedAreaId) {
        this.cFixedAreaId = cFixedAreaId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cCheckPwd=").append(cCheckPwd);
        sb.append(", cCompany=").append(cCompany);
        sb.append(", cCourierNum=").append(cCourierNum);
        sb.append(", cDeltag=").append(cDeltag);
        sb.append(", cName=").append(cName);
        sb.append(", cPda=").append(cPda);
        sb.append(", cTelephone=").append(cTelephone);
        sb.append(", cType=").append(cType);
        sb.append(", cVehicleNum=").append(cVehicleNum);
        sb.append(", cVehicleType=").append(cVehicleType);
        sb.append(", cStandardId=").append(cStandardId);
        sb.append(", cTaketimeId=").append(cTaketimeId);
        sb.append(", cFixedAreaId=").append(cFixedAreaId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}