package com.logistics.module.bos.model;

import java.io.Serializable;

public class TWayBill implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 实际重量
     */
    private Double cActlweit;

    /**
     * 到达地
     */
    private String cArriveCity;

    /**
     * 1、新增修改单据状态为“否” 2、作废时需将状态置为“是” 3、取消作废时需要将状态置为“否”
     */
    private String cDeltag;

    /**
     * 实际件数
     */
    private Integer cFeeitemnum;

    /**
     * 配载要求 (比如录入1=无，2=禁航，4=禁航空铁路)
     */
    private String cFloadreqr;

    /**
     * 托寄物类型：文件、衣服 、食品、电子商品
     */
    private String cGoodsType;

    /**
     * 原件数
     */
    private Integer cNum;

    /**
     * 支付类型编号：寄付日结、寄付月结、到付
     */
    private String cPayTypeNum;

    /**
     * 收件人详细地址信息
     */
    private String cRecAddress;

    /**
     * 收件人公司
     */
    private String cRecCompany;

    /**
     * 收件人电话
     */
    private String cRecMobile;

    /**
     * 收件人姓名
     */
    private String cRecName;

    /**
     * 寄件人详细地址信息
     */
    private String cSendAddress;

    /**
     * 寄件人公司
     */
    private String cSendCompany;

    /**
     * 寄件人电话
     */
    private String cSendMobile;

    /**
     * 寄件人姓名
     */
    private String cSendName;

    /**
     * 快递产品类型编号：駃达当日、駃达次日、駃达隔日
     */
    private String cSendProNum;

    /**
     * 运单状态： 1 待发货、 2 派送中、3 已签收、4 异常
     */
    private Integer cSignStatus;

    /**
     * 体积 输入格式为1*1*1*1，表示长*宽*高*数量
     */
    private String cVol;

    /**
     * 运单编号
     */
    private String cWayBillNum;

    /**
     * 运单类型（类型包括：正常单据、异单、调单）
     */
    private String cWayBillType;

    /**
     * 托寄物重量
     */
    private Double cWeight;

    /**
     * 订单信息
     */
    private Integer cOrderId;

    /**
     * 收件人省市区信息
     */
    private String cRecAreaId;

    /**
     * 寄件人省市区信息
     */
    private String cSendAreaId;

    /**
     * 备注
     */
    private String cRemark;

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

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark;
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
        sb.append(", cRemark=").append(cRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}