package com.logistics.module.dto;

import java.io.Serializable;
import java.util.Date;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 下午1:06:49
* 
*/
public class WorkBillDTO implements Serializable{
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 追单次数
     */
    private Integer cAttachbilltimes;

    /**
     * 工单生成时间
     */
    private Date cBuildtime;

    /**
     * 取件状态
     */
    private String cPickstate;

    /**
     * 订单备注
     */
    private String cRemark;

    /**
     * 短信序号
     */
    private String cSmsnumber;

    /**
     * 工单类型 新,追,销(新单:没有确认货物状态的 已通知:自动下单下发短信 已确认:接到短信,回复收信确认信息 已取件:已经取件成功,发回确认信息 生成工作单已取消:销单)
     */
    private String cType;

    /**
     * 快递员
     */
    private Integer cCourier;

    /**
     * 订单
     */
    private Integer cOrderId;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcAttachbilltimes() {
        return cAttachbilltimes;
    }

    public void setcAttachbilltimes(Integer cAttachbilltimes) {
        this.cAttachbilltimes = cAttachbilltimes;
    }

    public Date getcBuildtime() {
        return cBuildtime;
    }

    public void setcBuildtime(Date cBuildtime) {
        this.cBuildtime = cBuildtime;
    }

    public String getcPickstate() {
        return cPickstate;
    }

    public void setcPickstate(String cPickstate) {
        this.cPickstate = cPickstate;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark;
    }

    public String getcSmsnumber() {
        return cSmsnumber;
    }

    public void setcSmsnumber(String cSmsnumber) {
        this.cSmsnumber = cSmsnumber;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public Integer getcCourier() {
        return cCourier;
    }

    public void setcCourier(Integer cCourier) {
        this.cCourier = cCourier;
    }

    public Integer getcOrderId() {
        return cOrderId;
    }

    public void setcOrderId(Integer cOrderId) {
        this.cOrderId = cOrderId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cAttachbilltimes=").append(cAttachbilltimes);
        sb.append(", cBuildtime=").append(cBuildtime);
        sb.append(", cPickstate=").append(cPickstate);
        sb.append(", cRemark=").append(cRemark);
        sb.append(", cSmsnumber=").append(cSmsnumber);
        sb.append(", cType=").append(cType);
        sb.append(", cCourier=").append(cCourier);
        sb.append(", cOrderId=").append(cOrderId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
