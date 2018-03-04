package com.logistics.module.model;

import java.io.Serializable;

public class TWayBill implements Serializable {
    private Integer cId;

    private Double cActlweit;

    private String cArriveCity;

    private String cDeltag;

    private Integer cFeeitemnum;

    private String cFloadreqr;

    private String cGoodsType;

    private Integer cNum;

    private String cPayTypeNum;

    private String cRecAddress;

    private String cRecCompany;

    private String cRecMobile;

    private String cRecName;

    private String cRemark;

    private String cSendAddress;

    private String cSendCompany;

    private String cSendMobile;

    private String cSendName;

    private String cSendProNum;

    private Integer cSignStatus;

    private String cVol;

    private String cWayBillNum;

    private String cWayBillType;

    private Double cWeight;

    private Integer cOrderId;

    private String cRecAreaId;

    private String cSendAreaId;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Double getcActlweit() {
        return cActlweit;
    }

    public void setcActlweit(Double cActlweit) {
        this.cActlweit = cActlweit;
    }

    public String getcArriveCity() {
        return cArriveCity;
    }

    public void setcArriveCity(String cArriveCity) {
        this.cArriveCity = cArriveCity;
    }

    public String getcDeltag() {
        return cDeltag;
    }

    public void setcDeltag(String cDeltag) {
        this.cDeltag = cDeltag;
    }

    public Integer getcFeeitemnum() {
        return cFeeitemnum;
    }

    public void setcFeeitemnum(Integer cFeeitemnum) {
        this.cFeeitemnum = cFeeitemnum;
    }

    public String getcFloadreqr() {
        return cFloadreqr;
    }

    public void setcFloadreqr(String cFloadreqr) {
        this.cFloadreqr = cFloadreqr;
    }

    public String getcGoodsType() {
        return cGoodsType;
    }

    public void setcGoodsType(String cGoodsType) {
        this.cGoodsType = cGoodsType;
    }

    public Integer getcNum() {
        return cNum;
    }

    public void setcNum(Integer cNum) {
        this.cNum = cNum;
    }

    public String getcPayTypeNum() {
        return cPayTypeNum;
    }

    public void setcPayTypeNum(String cPayTypeNum) {
        this.cPayTypeNum = cPayTypeNum;
    }

    public String getcRecAddress() {
        return cRecAddress;
    }

    public void setcRecAddress(String cRecAddress) {
        this.cRecAddress = cRecAddress;
    }

    public String getcRecCompany() {
        return cRecCompany;
    }

    public void setcRecCompany(String cRecCompany) {
        this.cRecCompany = cRecCompany;
    }

    public String getcRecMobile() {
        return cRecMobile;
    }

    public void setcRecMobile(String cRecMobile) {
        this.cRecMobile = cRecMobile;
    }

    public String getcRecName() {
        return cRecName;
    }

    public void setcRecName(String cRecName) {
        this.cRecName = cRecName;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark;
    }

    public String getcSendAddress() {
        return cSendAddress;
    }

    public void setcSendAddress(String cSendAddress) {
        this.cSendAddress = cSendAddress;
    }

    public String getcSendCompany() {
        return cSendCompany;
    }

    public void setcSendCompany(String cSendCompany) {
        this.cSendCompany = cSendCompany;
    }

    public String getcSendMobile() {
        return cSendMobile;
    }

    public void setcSendMobile(String cSendMobile) {
        this.cSendMobile = cSendMobile;
    }

    public String getcSendName() {
        return cSendName;
    }

    public void setcSendName(String cSendName) {
        this.cSendName = cSendName;
    }

    public String getcSendProNum() {
        return cSendProNum;
    }

    public void setcSendProNum(String cSendProNum) {
        this.cSendProNum = cSendProNum;
    }

    public Integer getcSignStatus() {
        return cSignStatus;
    }

    public void setcSignStatus(Integer cSignStatus) {
        this.cSignStatus = cSignStatus;
    }

    public String getcVol() {
        return cVol;
    }

    public void setcVol(String cVol) {
        this.cVol = cVol;
    }

    public String getcWayBillNum() {
        return cWayBillNum;
    }

    public void setcWayBillNum(String cWayBillNum) {
        this.cWayBillNum = cWayBillNum;
    }

    public String getcWayBillType() {
        return cWayBillType;
    }

    public void setcWayBillType(String cWayBillType) {
        this.cWayBillType = cWayBillType;
    }

    public Double getcWeight() {
        return cWeight;
    }

    public void setcWeight(Double cWeight) {
        this.cWeight = cWeight;
    }

    public Integer getcOrderId() {
        return cOrderId;
    }

    public void setcOrderId(Integer cOrderId) {
        this.cOrderId = cOrderId;
    }

    public String getcRecAreaId() {
        return cRecAreaId;
    }

    public void setcRecAreaId(String cRecAreaId) {
        this.cRecAreaId = cRecAreaId;
    }

    public String getcSendAreaId() {
        return cSendAreaId;
    }

    public void setcSendAreaId(String cSendAreaId) {
        this.cSendAreaId = cSendAreaId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cActlweit=").append(cActlweit);
        sb.append(", cArriveCity=").append(cArriveCity);
        sb.append(", cDeltag=").append(cDeltag);
        sb.append(", cFeeitemnum=").append(cFeeitemnum);
        sb.append(", cFloadreqr=").append(cFloadreqr);
        sb.append(", cGoodsType=").append(cGoodsType);
        sb.append(", cNum=").append(cNum);
        sb.append(", cPayTypeNum=").append(cPayTypeNum);
        sb.append(", cRecAddress=").append(cRecAddress);
        sb.append(", cRecCompany=").append(cRecCompany);
        sb.append(", cRecMobile=").append(cRecMobile);
        sb.append(", cRecName=").append(cRecName);
        sb.append(", cRemark=").append(cRemark);
        sb.append(", cSendAddress=").append(cSendAddress);
        sb.append(", cSendCompany=").append(cSendCompany);
        sb.append(", cSendMobile=").append(cSendMobile);
        sb.append(", cSendName=").append(cSendName);
        sb.append(", cSendProNum=").append(cSendProNum);
        sb.append(", cSignStatus=").append(cSignStatus);
        sb.append(", cVol=").append(cVol);
        sb.append(", cWayBillNum=").append(cWayBillNum);
        sb.append(", cWayBillType=").append(cWayBillType);
        sb.append(", cWeight=").append(cWeight);
        sb.append(", cOrderId=").append(cOrderId);
        sb.append(", cRecAreaId=").append(cRecAreaId);
        sb.append(", cSendAreaId=").append(cSendAreaId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}