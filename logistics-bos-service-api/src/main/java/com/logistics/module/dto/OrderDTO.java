package com.logistics.module.dto;

import java.io.Serializable;
import java.util.Date;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 上午11:35:42
* 
*/
public class OrderDTO implements Serializable{
	  /**
     * 主键
     */
    private Integer cId;

    /**
     * 客户编号
     */
    private Integer cCustomerId;

    /**
     * 托寄物类型：文件、衣服 、食品、电子商品
     */
    private String cGoodsType;

    /**
     * 订单号
     */
    private String cOrderNum;

    /**
     * 下单时间
     */
    private Date cOrderTime;

    /**
     * 分单类型 1 自动分单 2 人工分单
     */
    private String cOrderType;

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
     * 备注
     */
    private String cRemark;

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
     * 给快递员捎话
     */
    private String cSendMobileMsg;

    /**
     * 寄件人姓名
     */
    private String cSendName;

    /**
     * 快递产品类型编号：駃达当日、駃达次日、駃达隔日
     */
    private String cSendProNum;

    /**
     * 订单状态 1 待取件 2 运输中 3 已签收 4 异常
     */
    private String cStatus;

    /**
     * 来电号码
     */
    private String cTelephone;

    /**
     * 托寄物重量
     */
    private Double cWeight;

    /**
     * 快递员id
     */
    private Integer cCourierId;

    /**
     * 收件人地域id
     */
    private String cRecAreaId;

    /**
     * 寄件人地域id
     */
    private String cSendAreaId;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcCustomerId() {
        return cCustomerId;
    }

    public void setcCustomerId(Integer cCustomerId) {
        this.cCustomerId = cCustomerId;
    }

    public String getcGoodsType() {
        return cGoodsType;
    }

    public void setcGoodsType(String cGoodsType) {
        this.cGoodsType = cGoodsType;
    }

    public String getcOrderNum() {
        return cOrderNum;
    }

    public void setcOrderNum(String cOrderNum) {
        this.cOrderNum = cOrderNum;
    }

    public Date getcOrderTime() {
        return cOrderTime;
    }

    public void setcOrderTime(Date cOrderTime) {
        this.cOrderTime = cOrderTime;
    }

    public String getcOrderType() {
        return cOrderType;
    }

    public void setcOrderType(String cOrderType) {
        this.cOrderType = cOrderType;
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

    public String getcSendMobileMsg() {
        return cSendMobileMsg;
    }

    public void setcSendMobileMsg(String cSendMobileMsg) {
        this.cSendMobileMsg = cSendMobileMsg;
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

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone;
    }

    public Double getcWeight() {
        return cWeight;
    }

    public void setcWeight(Double cWeight) {
        this.cWeight = cWeight;
    }

    public Integer getcCourierId() {
        return cCourierId;
    }

    public void setcCourierId(Integer cCourierId) {
        this.cCourierId = cCourierId;
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
        sb.append(", cCustomerId=").append(cCustomerId);
        sb.append(", cGoodsType=").append(cGoodsType);
        sb.append(", cOrderNum=").append(cOrderNum);
        sb.append(", cOrderTime=").append(cOrderTime);
        sb.append(", cOrderType=").append(cOrderType);
        sb.append(", cPayTypeNum=").append(cPayTypeNum);
        sb.append(", cRecAddress=").append(cRecAddress);
        sb.append(", cRecCompany=").append(cRecCompany);
        sb.append(", cRecMobile=").append(cRecMobile);
        sb.append(", cRecName=").append(cRecName);
        sb.append(", cRemark=").append(cRemark);
        sb.append(", cSendAddress=").append(cSendAddress);
        sb.append(", cSendCompany=").append(cSendCompany);
        sb.append(", cSendMobile=").append(cSendMobile);
        sb.append(", cSendMobileMsg=").append(cSendMobileMsg);
        sb.append(", cSendName=").append(cSendName);
        sb.append(", cSendProNum=").append(cSendProNum);
        sb.append(", cStatus=").append(cStatus);
        sb.append(", cTelephone=").append(cTelephone);
        sb.append(", cWeight=").append(cWeight);
        sb.append(", cCourierId=").append(cCourierId);
        sb.append(", cRecAreaId=").append(cRecAreaId);
        sb.append(", cSendAreaId=").append(cSendAreaId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
