package com.logistics.module.dto;

import java.io.Serializable;
import java.util.Date;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月10日 上午11:18:24
* 
*/
public class StandardDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer cId;

    private Integer cMaxLength;

    private Integer cMaxWeight;

    private Integer cMinLength;

    private Integer cMinWeight;

    private String cName;

    private String cOperatingCompany;

    private Date cOperatingTime;

    private String cOperator;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcMaxLength() {
        return cMaxLength;
    }

    public void setcMaxLength(Integer cMaxLength) {
        this.cMaxLength = cMaxLength;
    }

    public Integer getcMaxWeight() {
        return cMaxWeight;
    }

    public void setcMaxWeight(Integer cMaxWeight) {
        this.cMaxWeight = cMaxWeight;
    }

    public Integer getcMinLength() {
        return cMinLength;
    }

    public void setcMinLength(Integer cMinLength) {
        this.cMinLength = cMinLength;
    }

    public Integer getcMinWeight() {
        return cMinWeight;
    }

    public void setcMinWeight(Integer cMinWeight) {
        this.cMinWeight = cMinWeight;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcOperatingCompany() {
        return cOperatingCompany;
    }

    public void setcOperatingCompany(String cOperatingCompany) {
        this.cOperatingCompany = cOperatingCompany;
    }

    public Date getcOperatingTime() {
        return cOperatingTime;
    }

    public void setcOperatingTime(Date cOperatingTime) {
        this.cOperatingTime = cOperatingTime;
    }

    public String getcOperator() {
        return cOperator;
    }

    public void setcOperator(String cOperator) {
        this.cOperator = cOperator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cMaxLength=").append(cMaxLength);
        sb.append(", cMaxWeight=").append(cMaxWeight);
        sb.append(", cMinLength=").append(cMinLength);
        sb.append(", cMinWeight=").append(cMinWeight);
        sb.append(", cName=").append(cName);
        sb.append(", cOperatingCompany=").append(cOperatingCompany);
        sb.append(", cOperatingTime=").append(cOperatingTime);
        sb.append(", cOperator=").append(cOperator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}
