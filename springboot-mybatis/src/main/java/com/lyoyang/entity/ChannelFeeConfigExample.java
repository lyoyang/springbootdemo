package com.lyoyang.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChannelFeeConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelFeeConfigExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andRatioValueIsNull() {
            addCriterion("RATIO_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andRatioValueIsNotNull() {
            addCriterion("RATIO_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRatioValueEqualTo(BigDecimal value) {
            addCriterion("RATIO_VALUE =", value, "ratioValue");
            return (Criteria) this;
        }

        public Criteria andRatioValueNotEqualTo(BigDecimal value) {
            addCriterion("RATIO_VALUE <>", value, "ratioValue");
            return (Criteria) this;
        }

        public Criteria andRatioValueGreaterThan(BigDecimal value) {
            addCriterion("RATIO_VALUE >", value, "ratioValue");
            return (Criteria) this;
        }

        public Criteria andRatioValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATIO_VALUE >=", value, "ratioValue");
            return (Criteria) this;
        }

        public Criteria andRatioValueLessThan(BigDecimal value) {
            addCriterion("RATIO_VALUE <", value, "ratioValue");
            return (Criteria) this;
        }

        public Criteria andRatioValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATIO_VALUE <=", value, "ratioValue");
            return (Criteria) this;
        }

        public Criteria andRatioValueIn(List<BigDecimal> values) {
            addCriterion("RATIO_VALUE in", values, "ratioValue");
            return (Criteria) this;
        }

        public Criteria andRatioValueNotIn(List<BigDecimal> values) {
            addCriterion("RATIO_VALUE not in", values, "ratioValue");
            return (Criteria) this;
        }

        public Criteria andRatioValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATIO_VALUE between", value1, value2, "ratioValue");
            return (Criteria) this;
        }

        public Criteria andRatioValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATIO_VALUE not between", value1, value2, "ratioValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueIsNull() {
            addCriterion("FEE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andFeeValueIsNotNull() {
            addCriterion("FEE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeValueEqualTo(BigDecimal value) {
            addCriterion("FEE_VALUE =", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueNotEqualTo(BigDecimal value) {
            addCriterion("FEE_VALUE <>", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueGreaterThan(BigDecimal value) {
            addCriterion("FEE_VALUE >", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_VALUE >=", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueLessThan(BigDecimal value) {
            addCriterion("FEE_VALUE <", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_VALUE <=", value, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueIn(List<BigDecimal> values) {
            addCriterion("FEE_VALUE in", values, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueNotIn(List<BigDecimal> values) {
            addCriterion("FEE_VALUE not in", values, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_VALUE between", value1, value2, "feeValue");
            return (Criteria) this;
        }

        public Criteria andFeeValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_VALUE not between", value1, value2, "feeValue");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueIsNull() {
            addCriterion("RATE_MAX_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueIsNotNull() {
            addCriterion("RATE_MAX_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueEqualTo(BigDecimal value) {
            addCriterion("RATE_MAX_VALUE =", value, "rateMaxValue");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueNotEqualTo(BigDecimal value) {
            addCriterion("RATE_MAX_VALUE <>", value, "rateMaxValue");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueGreaterThan(BigDecimal value) {
            addCriterion("RATE_MAX_VALUE >", value, "rateMaxValue");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE_MAX_VALUE >=", value, "rateMaxValue");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueLessThan(BigDecimal value) {
            addCriterion("RATE_MAX_VALUE <", value, "rateMaxValue");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE_MAX_VALUE <=", value, "rateMaxValue");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueIn(List<BigDecimal> values) {
            addCriterion("RATE_MAX_VALUE in", values, "rateMaxValue");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueNotIn(List<BigDecimal> values) {
            addCriterion("RATE_MAX_VALUE not in", values, "rateMaxValue");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE_MAX_VALUE between", value1, value2, "rateMaxValue");
            return (Criteria) this;
        }

        public Criteria andRateMaxValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE_MAX_VALUE not between", value1, value2, "rateMaxValue");
            return (Criteria) this;
        }

        public Criteria andRateMinValueIsNull() {
            addCriterion("RATE_MIN_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andRateMinValueIsNotNull() {
            addCriterion("RATE_MIN_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRateMinValueEqualTo(BigDecimal value) {
            addCriterion("RATE_MIN_VALUE =", value, "rateMinValue");
            return (Criteria) this;
        }

        public Criteria andRateMinValueNotEqualTo(BigDecimal value) {
            addCriterion("RATE_MIN_VALUE <>", value, "rateMinValue");
            return (Criteria) this;
        }

        public Criteria andRateMinValueGreaterThan(BigDecimal value) {
            addCriterion("RATE_MIN_VALUE >", value, "rateMinValue");
            return (Criteria) this;
        }

        public Criteria andRateMinValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE_MIN_VALUE >=", value, "rateMinValue");
            return (Criteria) this;
        }

        public Criteria andRateMinValueLessThan(BigDecimal value) {
            addCriterion("RATE_MIN_VALUE <", value, "rateMinValue");
            return (Criteria) this;
        }

        public Criteria andRateMinValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE_MIN_VALUE <=", value, "rateMinValue");
            return (Criteria) this;
        }

        public Criteria andRateMinValueIn(List<BigDecimal> values) {
            addCriterion("RATE_MIN_VALUE in", values, "rateMinValue");
            return (Criteria) this;
        }

        public Criteria andRateMinValueNotIn(List<BigDecimal> values) {
            addCriterion("RATE_MIN_VALUE not in", values, "rateMinValue");
            return (Criteria) this;
        }

        public Criteria andRateMinValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE_MIN_VALUE between", value1, value2, "rateMinValue");
            return (Criteria) this;
        }

        public Criteria andRateMinValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE_MIN_VALUE not between", value1, value2, "rateMinValue");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeIsNull() {
            addCriterion("MER_REFUND_FEE is null");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeIsNotNull() {
            addCriterion("MER_REFUND_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeEqualTo(String value) {
            addCriterion("MER_REFUND_FEE =", value, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeNotEqualTo(String value) {
            addCriterion("MER_REFUND_FEE <>", value, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeGreaterThan(String value) {
            addCriterion("MER_REFUND_FEE >", value, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeGreaterThanOrEqualTo(String value) {
            addCriterion("MER_REFUND_FEE >=", value, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeLessThan(String value) {
            addCriterion("MER_REFUND_FEE <", value, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeLessThanOrEqualTo(String value) {
            addCriterion("MER_REFUND_FEE <=", value, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeLike(String value) {
            addCriterion("MER_REFUND_FEE like", value, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeNotLike(String value) {
            addCriterion("MER_REFUND_FEE not like", value, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeIn(List<String> values) {
            addCriterion("MER_REFUND_FEE in", values, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeNotIn(List<String> values) {
            addCriterion("MER_REFUND_FEE not in", values, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeBetween(String value1, String value2) {
            addCriterion("MER_REFUND_FEE between", value1, value2, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMerRefundFeeNotBetween(String value1, String value2) {
            addCriterion("MER_REFUND_FEE not between", value1, value2, "merRefundFee");
            return (Criteria) this;
        }

        public Criteria andMonthTypeIsNull() {
            addCriterion("MONTH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMonthTypeIsNotNull() {
            addCriterion("MONTH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMonthTypeEqualTo(String value) {
            addCriterion("MONTH_TYPE =", value, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeNotEqualTo(String value) {
            addCriterion("MONTH_TYPE <>", value, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeGreaterThan(String value) {
            addCriterion("MONTH_TYPE >", value, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MONTH_TYPE >=", value, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeLessThan(String value) {
            addCriterion("MONTH_TYPE <", value, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeLessThanOrEqualTo(String value) {
            addCriterion("MONTH_TYPE <=", value, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeLike(String value) {
            addCriterion("MONTH_TYPE like", value, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeNotLike(String value) {
            addCriterion("MONTH_TYPE not like", value, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeIn(List<String> values) {
            addCriterion("MONTH_TYPE in", values, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeNotIn(List<String> values) {
            addCriterion("MONTH_TYPE not in", values, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeBetween(String value1, String value2) {
            addCriterion("MONTH_TYPE between", value1, value2, "monthType");
            return (Criteria) this;
        }

        public Criteria andMonthTypeNotBetween(String value1, String value2) {
            addCriterion("MONTH_TYPE not between", value1, value2, "monthType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterion("BEGIN_DATE =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterion("BEGIN_DATE <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterion("BEGIN_DATE >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGIN_DATE >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterion("BEGIN_DATE <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("BEGIN_DATE <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterion("BEGIN_DATE in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterion("BEGIN_DATE not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterion("BEGIN_DATE between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("BEGIN_DATE not between", value1, value2, "beginDate");
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