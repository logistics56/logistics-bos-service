package com.logistics.module.bos.model;

import java.io.Serializable;

public class TCourier implements Serializable {
    private Integer cId;

    private String cCheckPwd;

    private String cCompany;

    private String cCourierNum;

    private String cDeltag;

    private String cName;

    private String cPda;

    private String cTelephone;

    private String cType;

    private String cVehicleNum;

    private String cVehicleType;

    private Integer cStandardId;

    private Integer cTaketimeId;

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