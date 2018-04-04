package com.logistics.module.bos.model;

import java.io.Serializable;
import java.util.Date;

public class TSignInfo implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 描述
     */
    private String cDescription;

    /**
     * 错误备注
     */
    private String cErrorRemark;

    /**
     * 签收人姓名
     */
    private String cSignName;

    /**
     * 签收时间
     */
    private Date cSignTime;

    /**
     * 正常  返单  转发签收  异常
     */
    private String cSignType;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    public String getcErrorRemark() {
        return cErrorRemark;
    }

    public void setcErrorRemark(String cErrorRemark) {
        this.cErrorRemark = cErrorRemark;
    }

    public String getcSignName() {
        return cSignName;
    }

    public void setcSignName(String cSignName) {
        this.cSignName = cSignName;
    }

    public Date getcSignTime() {
        return cSignTime;
    }

    public void setcSignTime(Date cSignTime) {
        this.cSignTime = cSignTime;
    }

    public String getcSignType() {
        return cSignType;
    }

    public void setcSignType(String cSignType) {
        this.cSignType = cSignType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cDescription=").append(cDescription);
        sb.append(", cErrorRemark=").append(cErrorRemark);
        sb.append(", cSignName=").append(cSignName);
        sb.append(", cSignTime=").append(cSignTime);
        sb.append(", cSignType=").append(cSignType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}