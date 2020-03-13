package com.lyoyang.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CalculationUnStatistical {
    private String transId;

    private Date transDate;

    private String mchId;

    private String deviceId;

    private String channelId;

    private String transType;

    private BigDecimal amount;

    private BigDecimal fee;

    private BigDecimal settleAmount;

    private BigDecimal ipaynowAmount;

    private BigDecimal spFee;

    private String settleFlag;

    private String accDate;

    private String settleDate;

    private String dayCountStatus;

    private String spMid;

    private String subMchId;

    private String isTransfered;

    private Date createDate;

    private String transStatus;

    private String remark;

    private String routerTypeId;

    private String channelTransId;

    private String isSendRsmq;

    private BigDecimal ipaynowRebateMch;

    private BigDecimal bankRebateIpaynow;

    private BigDecimal bankProfit;

    private BigDecimal bankCost;

    private BigDecimal settleAmountChannel;

    private BigDecimal feeChannel;

    private BigDecimal feeRatio;

    private String feeSettleDate;

    private String feeMode;

    private String feeStrategy;

    private String subTransType;

    private String cardType;

    private String cardBrand;

    private String dccMode;

    private String storeId;

    private String originalTransId;

    private Date originalTransDate;

    private String mhtSubMchId;

    private BigDecimal originalAmount;

    private BigDecimal bankRebateMch;

    private BigDecimal chRealDiscountAmount;

    private BigDecimal chMchDiscountAmount;

    private BigDecimal chDiscountAmount;

    private String isProfitShare;

    private String synShareFlag;

    private String subDeviceId;

    private String createTime;

    private String chAccDate;

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(BigDecimal settleAmount) {
        this.settleAmount = settleAmount;
    }

    public BigDecimal getIpaynowAmount() {
        return ipaynowAmount;
    }

    public void setIpaynowAmount(BigDecimal ipaynowAmount) {
        this.ipaynowAmount = ipaynowAmount;
    }

    public BigDecimal getSpFee() {
        return spFee;
    }

    public void setSpFee(BigDecimal spFee) {
        this.spFee = spFee;
    }

    public String getSettleFlag() {
        return settleFlag;
    }

    public void setSettleFlag(String settleFlag) {
        this.settleFlag = settleFlag;
    }

    public String getAccDate() {
        return accDate;
    }

    public void setAccDate(String accDate) {
        this.accDate = accDate;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getDayCountStatus() {
        return dayCountStatus;
    }

    public void setDayCountStatus(String dayCountStatus) {
        this.dayCountStatus = dayCountStatus;
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

    public String getIsTransfered() {
        return isTransfered;
    }

    public void setIsTransfered(String isTransfered) {
        this.isTransfered = isTransfered;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus;
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

    public String getChannelTransId() {
        return channelTransId;
    }

    public void setChannelTransId(String channelTransId) {
        this.channelTransId = channelTransId;
    }

    public String getIsSendRsmq() {
        return isSendRsmq;
    }

    public void setIsSendRsmq(String isSendRsmq) {
        this.isSendRsmq = isSendRsmq;
    }

    public BigDecimal getIpaynowRebateMch() {
        return ipaynowRebateMch;
    }

    public void setIpaynowRebateMch(BigDecimal ipaynowRebateMch) {
        this.ipaynowRebateMch = ipaynowRebateMch;
    }

    public BigDecimal getBankRebateIpaynow() {
        return bankRebateIpaynow;
    }

    public void setBankRebateIpaynow(BigDecimal bankRebateIpaynow) {
        this.bankRebateIpaynow = bankRebateIpaynow;
    }

    public BigDecimal getBankProfit() {
        return bankProfit;
    }

    public void setBankProfit(BigDecimal bankProfit) {
        this.bankProfit = bankProfit;
    }

    public BigDecimal getBankCost() {
        return bankCost;
    }

    public void setBankCost(BigDecimal bankCost) {
        this.bankCost = bankCost;
    }

    public BigDecimal getSettleAmountChannel() {
        return settleAmountChannel;
    }

    public void setSettleAmountChannel(BigDecimal settleAmountChannel) {
        this.settleAmountChannel = settleAmountChannel;
    }

    public BigDecimal getFeeChannel() {
        return feeChannel;
    }

    public void setFeeChannel(BigDecimal feeChannel) {
        this.feeChannel = feeChannel;
    }

    public BigDecimal getFeeRatio() {
        return feeRatio;
    }

    public void setFeeRatio(BigDecimal feeRatio) {
        this.feeRatio = feeRatio;
    }

    public String getFeeSettleDate() {
        return feeSettleDate;
    }

    public void setFeeSettleDate(String feeSettleDate) {
        this.feeSettleDate = feeSettleDate;
    }

    public String getFeeMode() {
        return feeMode;
    }

    public void setFeeMode(String feeMode) {
        this.feeMode = feeMode;
    }

    public String getFeeStrategy() {
        return feeStrategy;
    }

    public void setFeeStrategy(String feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public String getSubTransType() {
        return subTransType;
    }

    public void setSubTransType(String subTransType) {
        this.subTransType = subTransType;
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

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getOriginalTransId() {
        return originalTransId;
    }

    public void setOriginalTransId(String originalTransId) {
        this.originalTransId = originalTransId;
    }

    public Date getOriginalTransDate() {
        return originalTransDate;
    }

    public void setOriginalTransDate(Date originalTransDate) {
        this.originalTransDate = originalTransDate;
    }

    public String getMhtSubMchId() {
        return mhtSubMchId;
    }

    public void setMhtSubMchId(String mhtSubMchId) {
        this.mhtSubMchId = mhtSubMchId;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public BigDecimal getBankRebateMch() {
        return bankRebateMch;
    }

    public void setBankRebateMch(BigDecimal bankRebateMch) {
        this.bankRebateMch = bankRebateMch;
    }

    public BigDecimal getChRealDiscountAmount() {
        return chRealDiscountAmount;
    }

    public void setChRealDiscountAmount(BigDecimal chRealDiscountAmount) {
        this.chRealDiscountAmount = chRealDiscountAmount;
    }

    public BigDecimal getChMchDiscountAmount() {
        return chMchDiscountAmount;
    }

    public void setChMchDiscountAmount(BigDecimal chMchDiscountAmount) {
        this.chMchDiscountAmount = chMchDiscountAmount;
    }

    public BigDecimal getChDiscountAmount() {
        return chDiscountAmount;
    }

    public void setChDiscountAmount(BigDecimal chDiscountAmount) {
        this.chDiscountAmount = chDiscountAmount;
    }

    public String getIsProfitShare() {
        return isProfitShare;
    }

    public void setIsProfitShare(String isProfitShare) {
        this.isProfitShare = isProfitShare;
    }

    public String getSynShareFlag() {
        return synShareFlag;
    }

    public void setSynShareFlag(String synShareFlag) {
        this.synShareFlag = synShareFlag;
    }

    public String getSubDeviceId() {
        return subDeviceId;
    }

    public void setSubDeviceId(String subDeviceId) {
        this.subDeviceId = subDeviceId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getChAccDate() {
        return chAccDate;
    }

    public void setChAccDate(String chAccDate) {
        this.chAccDate = chAccDate;
    }
}