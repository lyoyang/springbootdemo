package com.lyoyang.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ChannelFeeConfig implements Serializable {
    private Long id;

    private String channelId;

    private String spMid;

    private String subMchId;

    private String transType;

    private String feeMode;

    private BigDecimal ratioValue;

    private BigDecimal feeValue;

    private BigDecimal rateMaxValue;

    private BigDecimal rateMinValue;

    private String merRefundFee;

    private String monthType;

    private String status;

    private Date beginDate;

    private String deviceId;

    private String remark;

    private String routerTypeId;

    private String cardType;

    private String cardBrand;

    private String dccMode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getSpMid() {
        return spMid;
    }

    public void setSpMid(String spMid) {
        this.spMid = spMid;
    }

    public String getSubMchId() {
        return subMchId;
    }

    public void setSubMchId(String subMchId) {
        this.subMchId = subMchId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getFeeMode() {
        return feeMode;
    }

    public void setFeeMode(String feeMode) {
        this.feeMode = feeMode;
    }

    public BigDecimal getRatioValue() {
        return ratioValue;
    }

    public void setRatioValue(BigDecimal ratioValue) {
        this.ratioValue = ratioValue;
    }

    public BigDecimal getFeeValue() {
        return feeValue;
    }

    public void setFeeValue(BigDecimal feeValue) {
        this.feeValue = feeValue;
    }

    public BigDecimal getRateMaxValue() {
        return rateMaxValue;
    }

    public void setRateMaxValue(BigDecimal rateMaxValue) {
        this.rateMaxValue = rateMaxValue;
    }

    public BigDecimal getRateMinValue() {
        return rateMinValue;
    }

    public void setRateMinValue(BigDecimal rateMinValue) {
        this.rateMinValue = rateMinValue;
    }

    public String getMerRefundFee() {
        return merRefundFee;
    }

    public void setMerRefundFee(String merRefundFee) {
        this.merRefundFee = merRefundFee;
    }

    public String getMonthType() {
        return monthType;
    }

    public void setMonthType(String monthType) {
        this.monthType = monthType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRouterTypeId() {
        return routerTypeId;
    }

    public void setRouterTypeId(String routerTypeId) {
        this.routerTypeId = routerTypeId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getDccMode() {
        return dccMode;
    }

    public void setDccMode(String dccMode) {
        this.dccMode = dccMode;
    }
}