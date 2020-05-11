package com.lyoyang.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CalculationUnStatisticalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CalculationUnStatisticalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTransIdIsNull() {
            addCriterion("TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(String value) {
            addCriterion("TRANS_ID =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(String value) {
            addCriterion("TRANS_ID <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(String value) {
            addCriterion("TRANS_ID >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_ID >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(String value) {
            addCriterion("TRANS_ID <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(String value) {
            addCriterion("TRANS_ID <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLike(String value) {
            addCriterion("TRANS_ID like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotLike(String value) {
            addCriterion("TRANS_ID not like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<String> values) {
            addCriterion("TRANS_ID in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<String> values) {
            addCriterion("TRANS_ID not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(String value1, String value2) {
            addCriterion("TRANS_ID between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(String value1, String value2) {
            addCriterion("TRANS_ID not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNull() {
            addCriterion("TRANS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("TRANS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(Date value) {
            addCriterion("TRANS_DATE =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(Date value) {
            addCriterion("TRANS_DATE <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(Date value) {
            addCriterion("TRANS_DATE >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANS_DATE >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(Date value) {
            addCriterion("TRANS_DATE <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(Date value) {
            addCriterion("TRANS_DATE <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<Date> values) {
            addCriterion("TRANS_DATE in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<Date> values) {
            addCriterion("TRANS_DATE not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(Date value1, Date value2) {
            addCriterion("TRANS_DATE between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(Date value1, Date value2) {
            addCriterion("TRANS_DATE not between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNull() {
            addCriterion("MCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNotNull() {
            addCriterion("MCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMchIdEqualTo(String value) {
            addCriterion("MCH_ID =", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotEqualTo(String value) {
            addCriterion("MCH_ID <>", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThan(String value) {
            addCriterion("MCH_ID >", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThanOrEqualTo(String value) {
            addCriterion("MCH_ID >=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThan(String value) {
            addCriterion("MCH_ID <", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThanOrEqualTo(String value) {
            addCriterion("MCH_ID <=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLike(String value) {
            addCriterion("MCH_ID like", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotLike(String value) {
            addCriterion("MCH_ID not like", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdIn(List<String> values) {
            addCriterion("MCH_ID in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotIn(List<String> values) {
            addCriterion("MCH_ID not in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdBetween(String value1, String value2) {
            addCriterion("MCH_ID between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotBetween(String value1, String value2) {
            addCriterion("MCH_ID not between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("DEVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("DEVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("DEVICE_ID =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("DEVICE_ID <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("DEVICE_ID >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_ID >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("DEVICE_ID <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_ID <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("DEVICE_ID like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("DEVICE_ID not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("DEVICE_ID in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("DEVICE_ID not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("DEVICE_ID between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("DEVICE_ID not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("CHANNEL_ID like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("CHANNEL_ID not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("TRANS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("TRANS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(String value) {
            addCriterion("TRANS_TYPE =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(String value) {
            addCriterion("TRANS_TYPE <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(String value) {
            addCriterion("TRANS_TYPE >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TYPE >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(String value) {
            addCriterion("TRANS_TYPE <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TYPE <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLike(String value) {
            addCriterion("TRANS_TYPE like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotLike(String value) {
            addCriterion("TRANS_TYPE not like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<String> values) {
            addCriterion("TRANS_TYPE in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<String> values) {
            addCriterion("TRANS_TYPE not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(String value1, String value2) {
            addCriterion("TRANS_TYPE between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(String value1, String value2) {
            addCriterion("TRANS_TYPE not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("FEE is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("FEE =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("FEE <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("FEE >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("FEE <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("FEE in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("FEE not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIsNull() {
            addCriterion("SETTLE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIsNotNull() {
            addCriterion("SETTLE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT =", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT <>", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountGreaterThan(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT >", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT >=", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLessThan(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT <", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT <=", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIn(List<BigDecimal> values) {
            addCriterion("SETTLE_AMOUNT in", values, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotIn(List<BigDecimal> values) {
            addCriterion("SETTLE_AMOUNT not in", values, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLE_AMOUNT between", value1, value2, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLE_AMOUNT not between", value1, value2, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountIsNull() {
            addCriterion("IPAYNOW_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountIsNotNull() {
            addCriterion("IPAYNOW_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountEqualTo(BigDecimal value) {
            addCriterion("IPAYNOW_AMOUNT =", value, "ipaynowAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountNotEqualTo(BigDecimal value) {
            addCriterion("IPAYNOW_AMOUNT <>", value, "ipaynowAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountGreaterThan(BigDecimal value) {
            addCriterion("IPAYNOW_AMOUNT >", value, "ipaynowAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IPAYNOW_AMOUNT >=", value, "ipaynowAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountLessThan(BigDecimal value) {
            addCriterion("IPAYNOW_AMOUNT <", value, "ipaynowAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IPAYNOW_AMOUNT <=", value, "ipaynowAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountIn(List<BigDecimal> values) {
            addCriterion("IPAYNOW_AMOUNT in", values, "ipaynowAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountNotIn(List<BigDecimal> values) {
            addCriterion("IPAYNOW_AMOUNT not in", values, "ipaynowAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IPAYNOW_AMOUNT between", value1, value2, "ipaynowAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IPAYNOW_AMOUNT not between", value1, value2, "ipaynowAmount");
            return (Criteria) this;
        }

        public Criteria andSpFeeIsNull() {
            addCriterion("SP_FEE is null");
            return (Criteria) this;
        }

        public Criteria andSpFeeIsNotNull() {
            addCriterion("SP_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andSpFeeEqualTo(BigDecimal value) {
            addCriterion("SP_FEE =", value, "spFee");
            return (Criteria) this;
        }

        public Criteria andSpFeeNotEqualTo(BigDecimal value) {
            addCriterion("SP_FEE <>", value, "spFee");
            return (Criteria) this;
        }

        public Criteria andSpFeeGreaterThan(BigDecimal value) {
            addCriterion("SP_FEE >", value, "spFee");
            return (Criteria) this;
        }

        public Criteria andSpFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SP_FEE >=", value, "spFee");
            return (Criteria) this;
        }

        public Criteria andSpFeeLessThan(BigDecimal value) {
            addCriterion("SP_FEE <", value, "spFee");
            return (Criteria) this;
        }

        public Criteria andSpFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SP_FEE <=", value, "spFee");
            return (Criteria) this;
        }

        public Criteria andSpFeeIn(List<BigDecimal> values) {
            addCriterion("SP_FEE in", values, "spFee");
            return (Criteria) this;
        }

        public Criteria andSpFeeNotIn(List<BigDecimal> values) {
            addCriterion("SP_FEE not in", values, "spFee");
            return (Criteria) this;
        }

        public Criteria andSpFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SP_FEE between", value1, value2, "spFee");
            return (Criteria) this;
        }

        public Criteria andSpFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SP_FEE not between", value1, value2, "spFee");
            return (Criteria) this;
        }

        public Criteria andSettleFlagIsNull() {
            addCriterion("SETTLE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSettleFlagIsNotNull() {
            addCriterion("SETTLE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSettleFlagEqualTo(String value) {
            addCriterion("SETTLE_FLAG =", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagNotEqualTo(String value) {
            addCriterion("SETTLE_FLAG <>", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagGreaterThan(String value) {
            addCriterion("SETTLE_FLAG >", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_FLAG >=", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagLessThan(String value) {
            addCriterion("SETTLE_FLAG <", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_FLAG <=", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagLike(String value) {
            addCriterion("SETTLE_FLAG like", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagNotLike(String value) {
            addCriterion("SETTLE_FLAG not like", value, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagIn(List<String> values) {
            addCriterion("SETTLE_FLAG in", values, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagNotIn(List<String> values) {
            addCriterion("SETTLE_FLAG not in", values, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagBetween(String value1, String value2) {
            addCriterion("SETTLE_FLAG between", value1, value2, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andSettleFlagNotBetween(String value1, String value2) {
            addCriterion("SETTLE_FLAG not between", value1, value2, "settleFlag");
            return (Criteria) this;
        }

        public Criteria andAccDateIsNull() {
            addCriterion("ACC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAccDateIsNotNull() {
            addCriterion("ACC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccDateEqualTo(String value) {
            addCriterion("ACC_DATE =", value, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateNotEqualTo(String value) {
            addCriterion("ACC_DATE <>", value, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateGreaterThan(String value) {
            addCriterion("ACC_DATE >", value, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_DATE >=", value, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateLessThan(String value) {
            addCriterion("ACC_DATE <", value, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateLessThanOrEqualTo(String value) {
            addCriterion("ACC_DATE <=", value, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateLike(String value) {
            addCriterion("ACC_DATE like", value, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateNotLike(String value) {
            addCriterion("ACC_DATE not like", value, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateIn(List<String> values) {
            addCriterion("ACC_DATE in", values, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateNotIn(List<String> values) {
            addCriterion("ACC_DATE not in", values, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateBetween(String value1, String value2) {
            addCriterion("ACC_DATE between", value1, value2, "accDate");
            return (Criteria) this;
        }

        public Criteria andAccDateNotBetween(String value1, String value2) {
            addCriterion("ACC_DATE not between", value1, value2, "accDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNull() {
            addCriterion("SETTLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNotNull() {
            addCriterion("SETTLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleDateEqualTo(String value) {
            addCriterion("SETTLE_DATE =", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotEqualTo(String value) {
            addCriterion("SETTLE_DATE <>", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThan(String value) {
            addCriterion("SETTLE_DATE >", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_DATE >=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThan(String value) {
            addCriterion("SETTLE_DATE <", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_DATE <=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLike(String value) {
            addCriterion("SETTLE_DATE like", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotLike(String value) {
            addCriterion("SETTLE_DATE not like", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateIn(List<String> values) {
            addCriterion("SETTLE_DATE in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotIn(List<String> values) {
            addCriterion("SETTLE_DATE not in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateBetween(String value1, String value2) {
            addCriterion("SETTLE_DATE between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotBetween(String value1, String value2) {
            addCriterion("SETTLE_DATE not between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusIsNull() {
            addCriterion("DAY_COUNT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusIsNotNull() {
            addCriterion("DAY_COUNT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusEqualTo(String value) {
            addCriterion("DAY_COUNT_STATUS =", value, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusNotEqualTo(String value) {
            addCriterion("DAY_COUNT_STATUS <>", value, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusGreaterThan(String value) {
            addCriterion("DAY_COUNT_STATUS >", value, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DAY_COUNT_STATUS >=", value, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusLessThan(String value) {
            addCriterion("DAY_COUNT_STATUS <", value, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusLessThanOrEqualTo(String value) {
            addCriterion("DAY_COUNT_STATUS <=", value, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusLike(String value) {
            addCriterion("DAY_COUNT_STATUS like", value, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusNotLike(String value) {
            addCriterion("DAY_COUNT_STATUS not like", value, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusIn(List<String> values) {
            addCriterion("DAY_COUNT_STATUS in", values, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusNotIn(List<String> values) {
            addCriterion("DAY_COUNT_STATUS not in", values, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusBetween(String value1, String value2) {
            addCriterion("DAY_COUNT_STATUS between", value1, value2, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andDayCountStatusNotBetween(String value1, String value2) {
            addCriterion("DAY_COUNT_STATUS not between", value1, value2, "dayCountStatus");
            return (Criteria) this;
        }

        public Criteria andSpMidIsNull() {
            addCriterion("SP_MID is null");
            return (Criteria) this;
        }

        public Criteria andSpMidIsNotNull() {
            addCriterion("SP_MID is not null");
            return (Criteria) this;
        }

        public Criteria andSpMidEqualTo(String value) {
            addCriterion("SP_MID =", value, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidNotEqualTo(String value) {
            addCriterion("SP_MID <>", value, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidGreaterThan(String value) {
            addCriterion("SP_MID >", value, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidGreaterThanOrEqualTo(String value) {
            addCriterion("SP_MID >=", value, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidLessThan(String value) {
            addCriterion("SP_MID <", value, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidLessThanOrEqualTo(String value) {
            addCriterion("SP_MID <=", value, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidLike(String value) {
            addCriterion("SP_MID like", value, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidNotLike(String value) {
            addCriterion("SP_MID not like", value, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidIn(List<String> values) {
            addCriterion("SP_MID in", values, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidNotIn(List<String> values) {
            addCriterion("SP_MID not in", values, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidBetween(String value1, String value2) {
            addCriterion("SP_MID between", value1, value2, "spMid");
            return (Criteria) this;
        }

        public Criteria andSpMidNotBetween(String value1, String value2) {
            addCriterion("SP_MID not between", value1, value2, "spMid");
            return (Criteria) this;
        }

        public Criteria andSubMchIdIsNull() {
            addCriterion("SUB_MCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubMchIdIsNotNull() {
            addCriterion("SUB_MCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubMchIdEqualTo(String value) {
            addCriterion("SUB_MCH_ID =", value, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdNotEqualTo(String value) {
            addCriterion("SUB_MCH_ID <>", value, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdGreaterThan(String value) {
            addCriterion("SUB_MCH_ID >", value, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_MCH_ID >=", value, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdLessThan(String value) {
            addCriterion("SUB_MCH_ID <", value, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdLessThanOrEqualTo(String value) {
            addCriterion("SUB_MCH_ID <=", value, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdLike(String value) {
            addCriterion("SUB_MCH_ID like", value, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdNotLike(String value) {
            addCriterion("SUB_MCH_ID not like", value, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdIn(List<String> values) {
            addCriterion("SUB_MCH_ID in", values, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdNotIn(List<String> values) {
            addCriterion("SUB_MCH_ID not in", values, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdBetween(String value1, String value2) {
            addCriterion("SUB_MCH_ID between", value1, value2, "subMchId");
            return (Criteria) this;
        }

        public Criteria andSubMchIdNotBetween(String value1, String value2) {
            addCriterion("SUB_MCH_ID not between", value1, value2, "subMchId");
            return (Criteria) this;
        }

        public Criteria andIsTransferedIsNull() {
            addCriterion("IS_TRANSFERED is null");
            return (Criteria) this;
        }

        public Criteria andIsTransferedIsNotNull() {
            addCriterion("IS_TRANSFERED is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransferedEqualTo(String value) {
            addCriterion("IS_TRANSFERED =", value, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedNotEqualTo(String value) {
            addCriterion("IS_TRANSFERED <>", value, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedGreaterThan(String value) {
            addCriterion("IS_TRANSFERED >", value, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TRANSFERED >=", value, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedLessThan(String value) {
            addCriterion("IS_TRANSFERED <", value, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedLessThanOrEqualTo(String value) {
            addCriterion("IS_TRANSFERED <=", value, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedLike(String value) {
            addCriterion("IS_TRANSFERED like", value, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedNotLike(String value) {
            addCriterion("IS_TRANSFERED not like", value, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedIn(List<String> values) {
            addCriterion("IS_TRANSFERED in", values, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedNotIn(List<String> values) {
            addCriterion("IS_TRANSFERED not in", values, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedBetween(String value1, String value2) {
            addCriterion("IS_TRANSFERED between", value1, value2, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andIsTransferedNotBetween(String value1, String value2) {
            addCriterion("IS_TRANSFERED not between", value1, value2, "isTransfered");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andTransStatusIsNull() {
            addCriterion("TRANS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTransStatusIsNotNull() {
            addCriterion("TRANS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTransStatusEqualTo(String value) {
            addCriterion("TRANS_STATUS =", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotEqualTo(String value) {
            addCriterion("TRANS_STATUS <>", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusGreaterThan(String value) {
            addCriterion("TRANS_STATUS >", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_STATUS >=", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLessThan(String value) {
            addCriterion("TRANS_STATUS <", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLessThanOrEqualTo(String value) {
            addCriterion("TRANS_STATUS <=", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLike(String value) {
            addCriterion("TRANS_STATUS like", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotLike(String value) {
            addCriterion("TRANS_STATUS not like", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusIn(List<String> values) {
            addCriterion("TRANS_STATUS in", values, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotIn(List<String> values) {
            addCriterion("TRANS_STATUS not in", values, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusBetween(String value1, String value2) {
            addCriterion("TRANS_STATUS between", value1, value2, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotBetween(String value1, String value2) {
            addCriterion("TRANS_STATUS not between", value1, value2, "transStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdIsNull() {
            addCriterion("ROUTER_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdIsNotNull() {
            addCriterion("ROUTER_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdEqualTo(String value) {
            addCriterion("ROUTER_TYPE_ID =", value, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdNotEqualTo(String value) {
            addCriterion("ROUTER_TYPE_ID <>", value, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdGreaterThan(String value) {
            addCriterion("ROUTER_TYPE_ID >", value, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTER_TYPE_ID >=", value, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdLessThan(String value) {
            addCriterion("ROUTER_TYPE_ID <", value, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdLessThanOrEqualTo(String value) {
            addCriterion("ROUTER_TYPE_ID <=", value, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdLike(String value) {
            addCriterion("ROUTER_TYPE_ID like", value, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdNotLike(String value) {
            addCriterion("ROUTER_TYPE_ID not like", value, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdIn(List<String> values) {
            addCriterion("ROUTER_TYPE_ID in", values, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdNotIn(List<String> values) {
            addCriterion("ROUTER_TYPE_ID not in", values, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdBetween(String value1, String value2) {
            addCriterion("ROUTER_TYPE_ID between", value1, value2, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andRouterTypeIdNotBetween(String value1, String value2) {
            addCriterion("ROUTER_TYPE_ID not between", value1, value2, "routerTypeId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdIsNull() {
            addCriterion("CHANNEL_TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdIsNotNull() {
            addCriterion("CHANNEL_TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdEqualTo(String value) {
            addCriterion("CHANNEL_TRANS_ID =", value, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdNotEqualTo(String value) {
            addCriterion("CHANNEL_TRANS_ID <>", value, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdGreaterThan(String value) {
            addCriterion("CHANNEL_TRANS_ID >", value, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TRANS_ID >=", value, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdLessThan(String value) {
            addCriterion("CHANNEL_TRANS_ID <", value, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TRANS_ID <=", value, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdLike(String value) {
            addCriterion("CHANNEL_TRANS_ID like", value, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdNotLike(String value) {
            addCriterion("CHANNEL_TRANS_ID not like", value, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdIn(List<String> values) {
            addCriterion("CHANNEL_TRANS_ID in", values, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdNotIn(List<String> values) {
            addCriterion("CHANNEL_TRANS_ID not in", values, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_TRANS_ID between", value1, value2, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andChannelTransIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_TRANS_ID not between", value1, value2, "channelTransId");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqIsNull() {
            addCriterion("IS_SEND_RSMQ is null");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqIsNotNull() {
            addCriterion("IS_SEND_RSMQ is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqEqualTo(String value) {
            addCriterion("IS_SEND_RSMQ =", value, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqNotEqualTo(String value) {
            addCriterion("IS_SEND_RSMQ <>", value, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqGreaterThan(String value) {
            addCriterion("IS_SEND_RSMQ >", value, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SEND_RSMQ >=", value, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqLessThan(String value) {
            addCriterion("IS_SEND_RSMQ <", value, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqLessThanOrEqualTo(String value) {
            addCriterion("IS_SEND_RSMQ <=", value, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqLike(String value) {
            addCriterion("IS_SEND_RSMQ like", value, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqNotLike(String value) {
            addCriterion("IS_SEND_RSMQ not like", value, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqIn(List<String> values) {
            addCriterion("IS_SEND_RSMQ in", values, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqNotIn(List<String> values) {
            addCriterion("IS_SEND_RSMQ not in", values, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqBetween(String value1, String value2) {
            addCriterion("IS_SEND_RSMQ between", value1, value2, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIsSendRsmqNotBetween(String value1, String value2) {
            addCriterion("IS_SEND_RSMQ not between", value1, value2, "isSendRsmq");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchIsNull() {
            addCriterion("IPAYNOW_REBATE_MCH is null");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchIsNotNull() {
            addCriterion("IPAYNOW_REBATE_MCH is not null");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchEqualTo(BigDecimal value) {
            addCriterion("IPAYNOW_REBATE_MCH =", value, "ipaynowRebateMch");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchNotEqualTo(BigDecimal value) {
            addCriterion("IPAYNOW_REBATE_MCH <>", value, "ipaynowRebateMch");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchGreaterThan(BigDecimal value) {
            addCriterion("IPAYNOW_REBATE_MCH >", value, "ipaynowRebateMch");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IPAYNOW_REBATE_MCH >=", value, "ipaynowRebateMch");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchLessThan(BigDecimal value) {
            addCriterion("IPAYNOW_REBATE_MCH <", value, "ipaynowRebateMch");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IPAYNOW_REBATE_MCH <=", value, "ipaynowRebateMch");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchIn(List<BigDecimal> values) {
            addCriterion("IPAYNOW_REBATE_MCH in", values, "ipaynowRebateMch");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchNotIn(List<BigDecimal> values) {
            addCriterion("IPAYNOW_REBATE_MCH not in", values, "ipaynowRebateMch");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IPAYNOW_REBATE_MCH between", value1, value2, "ipaynowRebateMch");
            return (Criteria) this;
        }

        public Criteria andIpaynowRebateMchNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IPAYNOW_REBATE_MCH not between", value1, value2, "ipaynowRebateMch");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowIsNull() {
            addCriterion("BANK_REBATE_IPAYNOW is null");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowIsNotNull() {
            addCriterion("BANK_REBATE_IPAYNOW is not null");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowEqualTo(BigDecimal value) {
            addCriterion("BANK_REBATE_IPAYNOW =", value, "bankRebateIpaynow");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowNotEqualTo(BigDecimal value) {
            addCriterion("BANK_REBATE_IPAYNOW <>", value, "bankRebateIpaynow");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowGreaterThan(BigDecimal value) {
            addCriterion("BANK_REBATE_IPAYNOW >", value, "bankRebateIpaynow");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_REBATE_IPAYNOW >=", value, "bankRebateIpaynow");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowLessThan(BigDecimal value) {
            addCriterion("BANK_REBATE_IPAYNOW <", value, "bankRebateIpaynow");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_REBATE_IPAYNOW <=", value, "bankRebateIpaynow");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowIn(List<BigDecimal> values) {
            addCriterion("BANK_REBATE_IPAYNOW in", values, "bankRebateIpaynow");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowNotIn(List<BigDecimal> values) {
            addCriterion("BANK_REBATE_IPAYNOW not in", values, "bankRebateIpaynow");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_REBATE_IPAYNOW between", value1, value2, "bankRebateIpaynow");
            return (Criteria) this;
        }

        public Criteria andBankRebateIpaynowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_REBATE_IPAYNOW not between", value1, value2, "bankRebateIpaynow");
            return (Criteria) this;
        }

        public Criteria andBankProfitIsNull() {
            addCriterion("BANK_PROFIT is null");
            return (Criteria) this;
        }

        public Criteria andBankProfitIsNotNull() {
            addCriterion("BANK_PROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andBankProfitEqualTo(BigDecimal value) {
            addCriterion("BANK_PROFIT =", value, "bankProfit");
            return (Criteria) this;
        }

        public Criteria andBankProfitNotEqualTo(BigDecimal value) {
            addCriterion("BANK_PROFIT <>", value, "bankProfit");
            return (Criteria) this;
        }

        public Criteria andBankProfitGreaterThan(BigDecimal value) {
            addCriterion("BANK_PROFIT >", value, "bankProfit");
            return (Criteria) this;
        }

        public Criteria andBankProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_PROFIT >=", value, "bankProfit");
            return (Criteria) this;
        }

        public Criteria andBankProfitLessThan(BigDecimal value) {
            addCriterion("BANK_PROFIT <", value, "bankProfit");
            return (Criteria) this;
        }

        public Criteria andBankProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_PROFIT <=", value, "bankProfit");
            return (Criteria) this;
        }

        public Criteria andBankProfitIn(List<BigDecimal> values) {
            addCriterion("BANK_PROFIT in", values, "bankProfit");
            return (Criteria) this;
        }

        public Criteria andBankProfitNotIn(List<BigDecimal> values) {
            addCriterion("BANK_PROFIT not in", values, "bankProfit");
            return (Criteria) this;
        }

        public Criteria andBankProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_PROFIT between", value1, value2, "bankProfit");
            return (Criteria) this;
        }

        public Criteria andBankProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_PROFIT not between", value1, value2, "bankProfit");
            return (Criteria) this;
        }

        public Criteria andBankCostIsNull() {
            addCriterion("BANK_COST is null");
            return (Criteria) this;
        }

        public Criteria andBankCostIsNotNull() {
            addCriterion("BANK_COST is not null");
            return (Criteria) this;
        }

        public Criteria andBankCostEqualTo(BigDecimal value) {
            addCriterion("BANK_COST =", value, "bankCost");
            return (Criteria) this;
        }

        public Criteria andBankCostNotEqualTo(BigDecimal value) {
            addCriterion("BANK_COST <>", value, "bankCost");
            return (Criteria) this;
        }

        public Criteria andBankCostGreaterThan(BigDecimal value) {
            addCriterion("BANK_COST >", value, "bankCost");
            return (Criteria) this;
        }

        public Criteria andBankCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_COST >=", value, "bankCost");
            return (Criteria) this;
        }

        public Criteria andBankCostLessThan(BigDecimal value) {
            addCriterion("BANK_COST <", value, "bankCost");
            return (Criteria) this;
        }

        public Criteria andBankCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_COST <=", value, "bankCost");
            return (Criteria) this;
        }

        public Criteria andBankCostIn(List<BigDecimal> values) {
            addCriterion("BANK_COST in", values, "bankCost");
            return (Criteria) this;
        }

        public Criteria andBankCostNotIn(List<BigDecimal> values) {
            addCriterion("BANK_COST not in", values, "bankCost");
            return (Criteria) this;
        }

        public Criteria andBankCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_COST between", value1, value2, "bankCost");
            return (Criteria) this;
        }

        public Criteria andBankCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_COST not between", value1, value2, "bankCost");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelIsNull() {
            addCriterion("SETTLE_AMOUNT_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelIsNotNull() {
            addCriterion("SETTLE_AMOUNT_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT_CHANNEL =", value, "settleAmountChannel");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelNotEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT_CHANNEL <>", value, "settleAmountChannel");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelGreaterThan(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT_CHANNEL >", value, "settleAmountChannel");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT_CHANNEL >=", value, "settleAmountChannel");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelLessThan(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT_CHANNEL <", value, "settleAmountChannel");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMOUNT_CHANNEL <=", value, "settleAmountChannel");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelIn(List<BigDecimal> values) {
            addCriterion("SETTLE_AMOUNT_CHANNEL in", values, "settleAmountChannel");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelNotIn(List<BigDecimal> values) {
            addCriterion("SETTLE_AMOUNT_CHANNEL not in", values, "settleAmountChannel");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLE_AMOUNT_CHANNEL between", value1, value2, "settleAmountChannel");
            return (Criteria) this;
        }

        public Criteria andSettleAmountChannelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLE_AMOUNT_CHANNEL not between", value1, value2, "settleAmountChannel");
            return (Criteria) this;
        }

        public Criteria andFeeChannelIsNull() {
            addCriterion("FEE_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andFeeChannelIsNotNull() {
            addCriterion("FEE_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andFeeChannelEqualTo(BigDecimal value) {
            addCriterion("FEE_CHANNEL =", value, "feeChannel");
            return (Criteria) this;
        }

        public Criteria andFeeChannelNotEqualTo(BigDecimal value) {
            addCriterion("FEE_CHANNEL <>", value, "feeChannel");
            return (Criteria) this;
        }

        public Criteria andFeeChannelGreaterThan(BigDecimal value) {
            addCriterion("FEE_CHANNEL >", value, "feeChannel");
            return (Criteria) this;
        }

        public Criteria andFeeChannelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_CHANNEL >=", value, "feeChannel");
            return (Criteria) this;
        }

        public Criteria andFeeChannelLessThan(BigDecimal value) {
            addCriterion("FEE_CHANNEL <", value, "feeChannel");
            return (Criteria) this;
        }

        public Criteria andFeeChannelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_CHANNEL <=", value, "feeChannel");
            return (Criteria) this;
        }

        public Criteria andFeeChannelIn(List<BigDecimal> values) {
            addCriterion("FEE_CHANNEL in", values, "feeChannel");
            return (Criteria) this;
        }

        public Criteria andFeeChannelNotIn(List<BigDecimal> values) {
            addCriterion("FEE_CHANNEL not in", values, "feeChannel");
            return (Criteria) this;
        }

        public Criteria andFeeChannelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_CHANNEL between", value1, value2, "feeChannel");
            return (Criteria) this;
        }

        public Criteria andFeeChannelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_CHANNEL not between", value1, value2, "feeChannel");
            return (Criteria) this;
        }

        public Criteria andFeeRatioIsNull() {
            addCriterion("FEE_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andFeeRatioIsNotNull() {
            addCriterion("FEE_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRatioEqualTo(BigDecimal value) {
            addCriterion("FEE_RATIO =", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioNotEqualTo(BigDecimal value) {
            addCriterion("FEE_RATIO <>", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioGreaterThan(BigDecimal value) {
            addCriterion("FEE_RATIO >", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_RATIO >=", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioLessThan(BigDecimal value) {
            addCriterion("FEE_RATIO <", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_RATIO <=", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioIn(List<BigDecimal> values) {
            addCriterion("FEE_RATIO in", values, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioNotIn(List<BigDecimal> values) {
            addCriterion("FEE_RATIO not in", values, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_RATIO between", value1, value2, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_RATIO not between", value1, value2, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateIsNull() {
            addCriterion("FEE_SETTLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateIsNotNull() {
            addCriterion("FEE_SETTLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateEqualTo(String value) {
            addCriterion("FEE_SETTLE_DATE =", value, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateNotEqualTo(String value) {
            addCriterion("FEE_SETTLE_DATE <>", value, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateGreaterThan(String value) {
            addCriterion("FEE_SETTLE_DATE >", value, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_SETTLE_DATE >=", value, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateLessThan(String value) {
            addCriterion("FEE_SETTLE_DATE <", value, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateLessThanOrEqualTo(String value) {
            addCriterion("FEE_SETTLE_DATE <=", value, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateLike(String value) {
            addCriterion("FEE_SETTLE_DATE like", value, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateNotLike(String value) {
            addCriterion("FEE_SETTLE_DATE not like", value, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateIn(List<String> values) {
            addCriterion("FEE_SETTLE_DATE in", values, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateNotIn(List<String> values) {
            addCriterion("FEE_SETTLE_DATE not in", values, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateBetween(String value1, String value2) {
            addCriterion("FEE_SETTLE_DATE between", value1, value2, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeSettleDateNotBetween(String value1, String value2) {
            addCriterion("FEE_SETTLE_DATE not between", value1, value2, "feeSettleDate");
            return (Criteria) this;
        }

        public Criteria andFeeModeIsNull() {
            addCriterion("FEE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andFeeModeIsNotNull() {
            addCriterion("FEE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeModeEqualTo(String value) {
            addCriterion("FEE_MODE =", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeNotEqualTo(String value) {
            addCriterion("FEE_MODE <>", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeGreaterThan(String value) {
            addCriterion("FEE_MODE >", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_MODE >=", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeLessThan(String value) {
            addCriterion("FEE_MODE <", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeLessThanOrEqualTo(String value) {
            addCriterion("FEE_MODE <=", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeLike(String value) {
            addCriterion("FEE_MODE like", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeNotLike(String value) {
            addCriterion("FEE_MODE not like", value, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeIn(List<String> values) {
            addCriterion("FEE_MODE in", values, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeNotIn(List<String> values) {
            addCriterion("FEE_MODE not in", values, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeBetween(String value1, String value2) {
            addCriterion("FEE_MODE between", value1, value2, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeModeNotBetween(String value1, String value2) {
            addCriterion("FEE_MODE not between", value1, value2, "feeMode");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyIsNull() {
            addCriterion("FEE_STRATEGY is null");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyIsNotNull() {
            addCriterion("FEE_STRATEGY is not null");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyEqualTo(String value) {
            addCriterion("FEE_STRATEGY =", value, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyNotEqualTo(String value) {
            addCriterion("FEE_STRATEGY <>", value, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyGreaterThan(String value) {
            addCriterion("FEE_STRATEGY >", value, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_STRATEGY >=", value, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyLessThan(String value) {
            addCriterion("FEE_STRATEGY <", value, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyLessThanOrEqualTo(String value) {
            addCriterion("FEE_STRATEGY <=", value, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyLike(String value) {
            addCriterion("FEE_STRATEGY like", value, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyNotLike(String value) {
            addCriterion("FEE_STRATEGY not like", value, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyIn(List<String> values) {
            addCriterion("FEE_STRATEGY in", values, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyNotIn(List<String> values) {
            addCriterion("FEE_STRATEGY not in", values, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyBetween(String value1, String value2) {
            addCriterion("FEE_STRATEGY between", value1, value2, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andFeeStrategyNotBetween(String value1, String value2) {
            addCriterion("FEE_STRATEGY not between", value1, value2, "feeStrategy");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeIsNull() {
            addCriterion("SUB_TRANS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeIsNotNull() {
            addCriterion("SUB_TRANS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeEqualTo(String value) {
            addCriterion("SUB_TRANS_TYPE =", value, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeNotEqualTo(String value) {
            addCriterion("SUB_TRANS_TYPE <>", value, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeGreaterThan(String value) {
            addCriterion("SUB_TRANS_TYPE >", value, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_TRANS_TYPE >=", value, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeLessThan(String value) {
            addCriterion("SUB_TRANS_TYPE <", value, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeLessThanOrEqualTo(String value) {
            addCriterion("SUB_TRANS_TYPE <=", value, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeLike(String value) {
            addCriterion("SUB_TRANS_TYPE like", value, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeNotLike(String value) {
            addCriterion("SUB_TRANS_TYPE not like", value, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeIn(List<String> values) {
            addCriterion("SUB_TRANS_TYPE in", values, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeNotIn(List<String> values) {
            addCriterion("SUB_TRANS_TYPE not in", values, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeBetween(String value1, String value2) {
            addCriterion("SUB_TRANS_TYPE between", value1, value2, "subTransType");
            return (Criteria) this;
        }

        public Criteria andSubTransTypeNotBetween(String value1, String value2) {
            addCriterion("SUB_TRANS_TYPE not between", value1, value2, "subTransType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("CARD_TYPE like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("CARD_TYPE not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardBrandIsNull() {
            addCriterion("CARD_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andCardBrandIsNotNull() {
            addCriterion("CARD_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andCardBrandEqualTo(String value) {
            addCriterion("CARD_BRAND =", value, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandNotEqualTo(String value) {
            addCriterion("CARD_BRAND <>", value, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandGreaterThan(String value) {
            addCriterion("CARD_BRAND >", value, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_BRAND >=", value, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandLessThan(String value) {
            addCriterion("CARD_BRAND <", value, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandLessThanOrEqualTo(String value) {
            addCriterion("CARD_BRAND <=", value, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandLike(String value) {
            addCriterion("CARD_BRAND like", value, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandNotLike(String value) {
            addCriterion("CARD_BRAND not like", value, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandIn(List<String> values) {
            addCriterion("CARD_BRAND in", values, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandNotIn(List<String> values) {
            addCriterion("CARD_BRAND not in", values, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandBetween(String value1, String value2) {
            addCriterion("CARD_BRAND between", value1, value2, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andCardBrandNotBetween(String value1, String value2) {
            addCriterion("CARD_BRAND not between", value1, value2, "cardBrand");
            return (Criteria) this;
        }

        public Criteria andDccModeIsNull() {
            addCriterion("DCC_MODE is null");
            return (Criteria) this;
        }

        public Criteria andDccModeIsNotNull() {
            addCriterion("DCC_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andDccModeEqualTo(String value) {
            addCriterion("DCC_MODE =", value, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeNotEqualTo(String value) {
            addCriterion("DCC_MODE <>", value, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeGreaterThan(String value) {
            addCriterion("DCC_MODE >", value, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeGreaterThanOrEqualTo(String value) {
            addCriterion("DCC_MODE >=", value, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeLessThan(String value) {
            addCriterion("DCC_MODE <", value, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeLessThanOrEqualTo(String value) {
            addCriterion("DCC_MODE <=", value, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeLike(String value) {
            addCriterion("DCC_MODE like", value, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeNotLike(String value) {
            addCriterion("DCC_MODE not like", value, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeIn(List<String> values) {
            addCriterion("DCC_MODE in", values, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeNotIn(List<String> values) {
            addCriterion("DCC_MODE not in", values, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeBetween(String value1, String value2) {
            addCriterion("DCC_MODE between", value1, value2, "dccMode");
            return (Criteria) this;
        }

        public Criteria andDccModeNotBetween(String value1, String value2) {
            addCriterion("DCC_MODE not between", value1, value2, "dccMode");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("STORE_ID =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("STORE_ID <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("STORE_ID >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_ID >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("STORE_ID <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("STORE_ID <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("STORE_ID like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("STORE_ID not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("STORE_ID in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("STORE_ID not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("STORE_ID between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("STORE_ID not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdIsNull() {
            addCriterion("ORIGINAL_TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdIsNotNull() {
            addCriterion("ORIGINAL_TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdEqualTo(String value) {
            addCriterion("ORIGINAL_TRANS_ID =", value, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdNotEqualTo(String value) {
            addCriterion("ORIGINAL_TRANS_ID <>", value, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdGreaterThan(String value) {
            addCriterion("ORIGINAL_TRANS_ID >", value, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_TRANS_ID >=", value, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdLessThan(String value) {
            addCriterion("ORIGINAL_TRANS_ID <", value, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_TRANS_ID <=", value, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdLike(String value) {
            addCriterion("ORIGINAL_TRANS_ID like", value, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdNotLike(String value) {
            addCriterion("ORIGINAL_TRANS_ID not like", value, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdIn(List<String> values) {
            addCriterion("ORIGINAL_TRANS_ID in", values, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdNotIn(List<String> values) {
            addCriterion("ORIGINAL_TRANS_ID not in", values, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdBetween(String value1, String value2) {
            addCriterion("ORIGINAL_TRANS_ID between", value1, value2, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransIdNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_TRANS_ID not between", value1, value2, "originalTransId");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateIsNull() {
            addCriterion("ORIGINAL_TRANS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateIsNotNull() {
            addCriterion("ORIGINAL_TRANS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateEqualTo(Date value) {
            addCriterion("ORIGINAL_TRANS_DATE =", value, "originalTransDate");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateNotEqualTo(Date value) {
            addCriterion("ORIGINAL_TRANS_DATE <>", value, "originalTransDate");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateGreaterThan(Date value) {
            addCriterion("ORIGINAL_TRANS_DATE >", value, "originalTransDate");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORIGINAL_TRANS_DATE >=", value, "originalTransDate");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateLessThan(Date value) {
            addCriterion("ORIGINAL_TRANS_DATE <", value, "originalTransDate");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateLessThanOrEqualTo(Date value) {
            addCriterion("ORIGINAL_TRANS_DATE <=", value, "originalTransDate");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateIn(List<Date> values) {
            addCriterion("ORIGINAL_TRANS_DATE in", values, "originalTransDate");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateNotIn(List<Date> values) {
            addCriterion("ORIGINAL_TRANS_DATE not in", values, "originalTransDate");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateBetween(Date value1, Date value2) {
            addCriterion("ORIGINAL_TRANS_DATE between", value1, value2, "originalTransDate");
            return (Criteria) this;
        }

        public Criteria andOriginalTransDateNotBetween(Date value1, Date value2) {
            addCriterion("ORIGINAL_TRANS_DATE not between", value1, value2, "originalTransDate");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdIsNull() {
            addCriterion("MHT_SUB_MCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdIsNotNull() {
            addCriterion("MHT_SUB_MCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdEqualTo(String value) {
            addCriterion("MHT_SUB_MCH_ID =", value, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdNotEqualTo(String value) {
            addCriterion("MHT_SUB_MCH_ID <>", value, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdGreaterThan(String value) {
            addCriterion("MHT_SUB_MCH_ID >", value, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdGreaterThanOrEqualTo(String value) {
            addCriterion("MHT_SUB_MCH_ID >=", value, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdLessThan(String value) {
            addCriterion("MHT_SUB_MCH_ID <", value, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdLessThanOrEqualTo(String value) {
            addCriterion("MHT_SUB_MCH_ID <=", value, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdLike(String value) {
            addCriterion("MHT_SUB_MCH_ID like", value, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdNotLike(String value) {
            addCriterion("MHT_SUB_MCH_ID not like", value, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdIn(List<String> values) {
            addCriterion("MHT_SUB_MCH_ID in", values, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdNotIn(List<String> values) {
            addCriterion("MHT_SUB_MCH_ID not in", values, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdBetween(String value1, String value2) {
            addCriterion("MHT_SUB_MCH_ID between", value1, value2, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andMhtSubMchIdNotBetween(String value1, String value2) {
            addCriterion("MHT_SUB_MCH_ID not between", value1, value2, "mhtSubMchId");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIsNull() {
            addCriterion("ORIGINAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIsNotNull() {
            addCriterion("ORIGINAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_AMOUNT =", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_AMOUNT <>", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountGreaterThan(BigDecimal value) {
            addCriterion("ORIGINAL_AMOUNT >", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_AMOUNT >=", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountLessThan(BigDecimal value) {
            addCriterion("ORIGINAL_AMOUNT <", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_AMOUNT <=", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIn(List<BigDecimal> values) {
            addCriterion("ORIGINAL_AMOUNT in", values, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotIn(List<BigDecimal> values) {
            addCriterion("ORIGINAL_AMOUNT not in", values, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGINAL_AMOUNT between", value1, value2, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGINAL_AMOUNT not between", value1, value2, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchIsNull() {
            addCriterion("BANK_REBATE_MCH is null");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchIsNotNull() {
            addCriterion("BANK_REBATE_MCH is not null");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchEqualTo(BigDecimal value) {
            addCriterion("BANK_REBATE_MCH =", value, "bankRebateMch");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchNotEqualTo(BigDecimal value) {
            addCriterion("BANK_REBATE_MCH <>", value, "bankRebateMch");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchGreaterThan(BigDecimal value) {
            addCriterion("BANK_REBATE_MCH >", value, "bankRebateMch");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_REBATE_MCH >=", value, "bankRebateMch");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchLessThan(BigDecimal value) {
            addCriterion("BANK_REBATE_MCH <", value, "bankRebateMch");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_REBATE_MCH <=", value, "bankRebateMch");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchIn(List<BigDecimal> values) {
            addCriterion("BANK_REBATE_MCH in", values, "bankRebateMch");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchNotIn(List<BigDecimal> values) {
            addCriterion("BANK_REBATE_MCH not in", values, "bankRebateMch");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_REBATE_MCH between", value1, value2, "bankRebateMch");
            return (Criteria) this;
        }

        public Criteria andBankRebateMchNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_REBATE_MCH not between", value1, value2, "bankRebateMch");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountIsNull() {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountIsNotNull() {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT =", value, "chRealDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT <>", value, "chRealDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT >", value, "chRealDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT >=", value, "chRealDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountLessThan(BigDecimal value) {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT <", value, "chRealDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT <=", value, "chRealDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT in", values, "chRealDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT not in", values, "chRealDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT between", value1, value2, "chRealDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChRealDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CH_REAL_DISCOUNT_AMOUNT not between", value1, value2, "chRealDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountIsNull() {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountIsNotNull() {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT =", value, "chMchDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT <>", value, "chMchDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT >", value, "chMchDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT >=", value, "chMchDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountLessThan(BigDecimal value) {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT <", value, "chMchDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT <=", value, "chMchDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT in", values, "chMchDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT not in", values, "chMchDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT between", value1, value2, "chMchDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChMchDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CH_MCH_DISCOUNT_AMOUNT not between", value1, value2, "chMchDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountIsNull() {
            addCriterion("CH_DISCOUNT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountIsNotNull() {
            addCriterion("CH_DISCOUNT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("CH_DISCOUNT_AMOUNT =", value, "chDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("CH_DISCOUNT_AMOUNT <>", value, "chDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("CH_DISCOUNT_AMOUNT >", value, "chDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CH_DISCOUNT_AMOUNT >=", value, "chDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountLessThan(BigDecimal value) {
            addCriterion("CH_DISCOUNT_AMOUNT <", value, "chDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CH_DISCOUNT_AMOUNT <=", value, "chDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("CH_DISCOUNT_AMOUNT in", values, "chDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("CH_DISCOUNT_AMOUNT not in", values, "chDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CH_DISCOUNT_AMOUNT between", value1, value2, "chDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andChDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CH_DISCOUNT_AMOUNT not between", value1, value2, "chDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareIsNull() {
            addCriterion("IS_PROFIT_SHARE is null");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareIsNotNull() {
            addCriterion("IS_PROFIT_SHARE is not null");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareEqualTo(String value) {
            addCriterion("IS_PROFIT_SHARE =", value, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareNotEqualTo(String value) {
            addCriterion("IS_PROFIT_SHARE <>", value, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareGreaterThan(String value) {
            addCriterion("IS_PROFIT_SHARE >", value, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PROFIT_SHARE >=", value, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareLessThan(String value) {
            addCriterion("IS_PROFIT_SHARE <", value, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareLessThanOrEqualTo(String value) {
            addCriterion("IS_PROFIT_SHARE <=", value, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareLike(String value) {
            addCriterion("IS_PROFIT_SHARE like", value, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareNotLike(String value) {
            addCriterion("IS_PROFIT_SHARE not like", value, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareIn(List<String> values) {
            addCriterion("IS_PROFIT_SHARE in", values, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareNotIn(List<String> values) {
            addCriterion("IS_PROFIT_SHARE not in", values, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareBetween(String value1, String value2) {
            addCriterion("IS_PROFIT_SHARE between", value1, value2, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andIsProfitShareNotBetween(String value1, String value2) {
            addCriterion("IS_PROFIT_SHARE not between", value1, value2, "isProfitShare");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagIsNull() {
            addCriterion("SYN_SHARE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagIsNotNull() {
            addCriterion("SYN_SHARE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagEqualTo(String value) {
            addCriterion("SYN_SHARE_FLAG =", value, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagNotEqualTo(String value) {
            addCriterion("SYN_SHARE_FLAG <>", value, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagGreaterThan(String value) {
            addCriterion("SYN_SHARE_FLAG >", value, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SYN_SHARE_FLAG >=", value, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagLessThan(String value) {
            addCriterion("SYN_SHARE_FLAG <", value, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagLessThanOrEqualTo(String value) {
            addCriterion("SYN_SHARE_FLAG <=", value, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagLike(String value) {
            addCriterion("SYN_SHARE_FLAG like", value, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagNotLike(String value) {
            addCriterion("SYN_SHARE_FLAG not like", value, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagIn(List<String> values) {
            addCriterion("SYN_SHARE_FLAG in", values, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagNotIn(List<String> values) {
            addCriterion("SYN_SHARE_FLAG not in", values, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagBetween(String value1, String value2) {
            addCriterion("SYN_SHARE_FLAG between", value1, value2, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSynShareFlagNotBetween(String value1, String value2) {
            addCriterion("SYN_SHARE_FLAG not between", value1, value2, "synShareFlag");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdIsNull() {
            addCriterion("SUB_DEVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdIsNotNull() {
            addCriterion("SUB_DEVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdEqualTo(String value) {
            addCriterion("SUB_DEVICE_ID =", value, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdNotEqualTo(String value) {
            addCriterion("SUB_DEVICE_ID <>", value, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdGreaterThan(String value) {
            addCriterion("SUB_DEVICE_ID >", value, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_DEVICE_ID >=", value, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdLessThan(String value) {
            addCriterion("SUB_DEVICE_ID <", value, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("SUB_DEVICE_ID <=", value, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdLike(String value) {
            addCriterion("SUB_DEVICE_ID like", value, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdNotLike(String value) {
            addCriterion("SUB_DEVICE_ID not like", value, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdIn(List<String> values) {
            addCriterion("SUB_DEVICE_ID in", values, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdNotIn(List<String> values) {
            addCriterion("SUB_DEVICE_ID not in", values, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdBetween(String value1, String value2) {
            addCriterion("SUB_DEVICE_ID between", value1, value2, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andSubDeviceIdNotBetween(String value1, String value2) {
            addCriterion("SUB_DEVICE_ID not between", value1, value2, "subDeviceId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andChAccDateIsNull() {
            addCriterion("CH_ACC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andChAccDateIsNotNull() {
            addCriterion("CH_ACC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andChAccDateEqualTo(String value) {
            addCriterion("CH_ACC_DATE =", value, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateNotEqualTo(String value) {
            addCriterion("CH_ACC_DATE <>", value, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateGreaterThan(String value) {
            addCriterion("CH_ACC_DATE >", value, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateGreaterThanOrEqualTo(String value) {
            addCriterion("CH_ACC_DATE >=", value, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateLessThan(String value) {
            addCriterion("CH_ACC_DATE <", value, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateLessThanOrEqualTo(String value) {
            addCriterion("CH_ACC_DATE <=", value, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateLike(String value) {
            addCriterion("CH_ACC_DATE like", value, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateNotLike(String value) {
            addCriterion("CH_ACC_DATE not like", value, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateIn(List<String> values) {
            addCriterion("CH_ACC_DATE in", values, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateNotIn(List<String> values) {
            addCriterion("CH_ACC_DATE not in", values, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateBetween(String value1, String value2) {
            addCriterion("CH_ACC_DATE between", value1, value2, "chAccDate");
            return (Criteria) this;
        }

        public Criteria andChAccDateNotBetween(String value1, String value2) {
            addCriterion("CH_ACC_DATE not between", value1, value2, "chAccDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}