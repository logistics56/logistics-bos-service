package com.logistics.module.bos.model;

import java.io.Serializable;

public class TSubArea implements Serializable {
    /**
     * 主键
     */
    private String cId;

    /**
     * 辅助关键字
     */
    private String cAssistKeyWords;

    /**
     * 终止号
     */
    private String cEndnum;

    /**
     * 关键字
     */
    private String cKeyWords;

    /**
     * 单双号
     */
    private String cSingle;

    /**
     * 起始号
     */
    private String cStartNum;

    /**
     * 区域
     */
    private String cAreaId;

    /**
     * 定区
     */
    private String cFixedareaId;

    private static final long serialVersionUID = 1L;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcAssistKeyWords() {
        return cAssistKeyWords;
    }

    public void setcAssistKeyWords(String cAssistKeyWords) {
        this.cAssistKeyWords = cAssistKeyWords;
    }

    public String getcEndnum() {
        return cEndnum;
    }

    public void setcEndnum(String cEndnum) {
        this.cEndnum = cEndnum;
    }

    public String getcKeyWords() {
        return cKeyWords;
    }

    public void setcKeyWords(String cKeyWords) {
        this.cKeyWords = cKeyWords;
    }

    public String getcSingle() {
        return cSingle;
    }

    public void setcSingle(String cSingle) {
        this.cSingle = cSingle;
    }

    public String getcStartNum() {
        return cStartNum;
    }

    public void setcStartNum(String cStartNum) {
        this.cStartNum = cStartNum;
    }

    public String getcAreaId() {
        return cAreaId;
    }

    public void setcAreaId(String cAreaId) {
        this.cAreaId = cAreaId;
    }

    public String getcFixedareaId() {
        return cFixedareaId;
    }

    public void setcFixedareaId(String cFixedareaId) {
        this.cFixedareaId = cFixedareaId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cAssistKeyWords=").append(cAssistKeyWords);
        sb.append(", cEndnum=").append(cEndnum);
        sb.append(", cKeyWords=").append(cKeyWords);
        sb.append(", cSingle=").append(cSingle);
        sb.append(", cStartNum=").append(cStartNum);
        sb.append(", cAreaId=").append(cAreaId);
        sb.append(", cFixedareaId=").append(cFixedareaId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}