package com.logistics.module.bos.model;

import java.util.ArrayList;
import java.util.List;

public class TWayBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWayBillExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("C_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCActlweitIsNull() {
            addCriterion("C_ACTLWEIT is null");
            return (Criteria) this;
        }

        public Criteria andCActlweitIsNotNull() {
            addCriterion("C_ACTLWEIT is not null");
            return (Criteria) this;
        }

        public Criteria andCActlweitEqualTo(Double value) {
            addCriterion("C_ACTLWEIT =", value, "cActlweit");
            return (Criteria) this;
        }

        public Criteria andCActlweitNotEqualTo(Double value) {
            addCriterion("C_ACTLWEIT <>", value, "cActlweit");
            return (Criteria) this;
        }

        public Criteria andCActlweitGreaterThan(Double value) {
            addCriterion("C_ACTLWEIT >", value, "cActlweit");
            return (Criteria) this;
        }

        public Criteria andCActlweitGreaterThanOrEqualTo(Double value) {
            addCriterion("C_ACTLWEIT >=", value, "cActlweit");
            return (Criteria) this;
        }

        public Criteria andCActlweitLessThan(Double value) {
            addCriterion("C_ACTLWEIT <", value, "cActlweit");
            return (Criteria) this;
        }

        public Criteria andCActlweitLessThanOrEqualTo(Double value) {
            addCriterion("C_ACTLWEIT <=", value, "cActlweit");
            return (Criteria) this;
        }

        public Criteria andCActlweitIn(List<Double> values) {
            addCriterion("C_ACTLWEIT in", values, "cActlweit");
            return (Criteria) this;
        }

        public Criteria andCActlweitNotIn(List<Double> values) {
            addCriterion("C_ACTLWEIT not in", values, "cActlweit");
            return (Criteria) this;
        }

        public Criteria andCActlweitBetween(Double value1, Double value2) {
            addCriterion("C_ACTLWEIT between", value1, value2, "cActlweit");
            return (Criteria) this;
        }

        public Criteria andCActlweitNotBetween(Double value1, Double value2) {
            addCriterion("C_ACTLWEIT not between", value1, value2, "cActlweit");
            return (Criteria) this;
        }

        public Criteria andCArriveCityIsNull() {
            addCriterion("C_ARRIVE_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCArriveCityIsNotNull() {
            addCriterion("C_ARRIVE_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCArriveCityEqualTo(String value) {
            addCriterion("C_ARRIVE_CITY =", value, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityNotEqualTo(String value) {
            addCriterion("C_ARRIVE_CITY <>", value, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityGreaterThan(String value) {
            addCriterion("C_ARRIVE_CITY >", value, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityGreaterThanOrEqualTo(String value) {
            addCriterion("C_ARRIVE_CITY >=", value, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityLessThan(String value) {
            addCriterion("C_ARRIVE_CITY <", value, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityLessThanOrEqualTo(String value) {
            addCriterion("C_ARRIVE_CITY <=", value, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityLike(String value) {
            addCriterion("C_ARRIVE_CITY like", value, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityNotLike(String value) {
            addCriterion("C_ARRIVE_CITY not like", value, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityIn(List<String> values) {
            addCriterion("C_ARRIVE_CITY in", values, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityNotIn(List<String> values) {
            addCriterion("C_ARRIVE_CITY not in", values, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityBetween(String value1, String value2) {
            addCriterion("C_ARRIVE_CITY between", value1, value2, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCArriveCityNotBetween(String value1, String value2) {
            addCriterion("C_ARRIVE_CITY not between", value1, value2, "cArriveCity");
            return (Criteria) this;
        }

        public Criteria andCDeltagIsNull() {
            addCriterion("C_DELTAG is null");
            return (Criteria) this;
        }

        public Criteria andCDeltagIsNotNull() {
            addCriterion("C_DELTAG is not null");
            return (Criteria) this;
        }

        public Criteria andCDeltagEqualTo(String value) {
            addCriterion("C_DELTAG =", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagNotEqualTo(String value) {
            addCriterion("C_DELTAG <>", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagGreaterThan(String value) {
            addCriterion("C_DELTAG >", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagGreaterThanOrEqualTo(String value) {
            addCriterion("C_DELTAG >=", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagLessThan(String value) {
            addCriterion("C_DELTAG <", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagLessThanOrEqualTo(String value) {
            addCriterion("C_DELTAG <=", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagLike(String value) {
            addCriterion("C_DELTAG like", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagNotLike(String value) {
            addCriterion("C_DELTAG not like", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagIn(List<String> values) {
            addCriterion("C_DELTAG in", values, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagNotIn(List<String> values) {
            addCriterion("C_DELTAG not in", values, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagBetween(String value1, String value2) {
            addCriterion("C_DELTAG between", value1, value2, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagNotBetween(String value1, String value2) {
            addCriterion("C_DELTAG not between", value1, value2, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumIsNull() {
            addCriterion("C_FEEITEMNUM is null");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumIsNotNull() {
            addCriterion("C_FEEITEMNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumEqualTo(Integer value) {
            addCriterion("C_FEEITEMNUM =", value, "cFeeitemnum");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumNotEqualTo(Integer value) {
            addCriterion("C_FEEITEMNUM <>", value, "cFeeitemnum");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumGreaterThan(Integer value) {
            addCriterion("C_FEEITEMNUM >", value, "cFeeitemnum");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_FEEITEMNUM >=", value, "cFeeitemnum");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumLessThan(Integer value) {
            addCriterion("C_FEEITEMNUM <", value, "cFeeitemnum");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumLessThanOrEqualTo(Integer value) {
            addCriterion("C_FEEITEMNUM <=", value, "cFeeitemnum");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumIn(List<Integer> values) {
            addCriterion("C_FEEITEMNUM in", values, "cFeeitemnum");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumNotIn(List<Integer> values) {
            addCriterion("C_FEEITEMNUM not in", values, "cFeeitemnum");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumBetween(Integer value1, Integer value2) {
            addCriterion("C_FEEITEMNUM between", value1, value2, "cFeeitemnum");
            return (Criteria) this;
        }

        public Criteria andCFeeitemnumNotBetween(Integer value1, Integer value2) {
            addCriterion("C_FEEITEMNUM not between", value1, value2, "cFeeitemnum");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrIsNull() {
            addCriterion("C_FLOADREQR is null");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrIsNotNull() {
            addCriterion("C_FLOADREQR is not null");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrEqualTo(String value) {
            addCriterion("C_FLOADREQR =", value, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrNotEqualTo(String value) {
            addCriterion("C_FLOADREQR <>", value, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrGreaterThan(String value) {
            addCriterion("C_FLOADREQR >", value, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrGreaterThanOrEqualTo(String value) {
            addCriterion("C_FLOADREQR >=", value, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrLessThan(String value) {
            addCriterion("C_FLOADREQR <", value, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrLessThanOrEqualTo(String value) {
            addCriterion("C_FLOADREQR <=", value, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrLike(String value) {
            addCriterion("C_FLOADREQR like", value, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrNotLike(String value) {
            addCriterion("C_FLOADREQR not like", value, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrIn(List<String> values) {
            addCriterion("C_FLOADREQR in", values, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrNotIn(List<String> values) {
            addCriterion("C_FLOADREQR not in", values, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrBetween(String value1, String value2) {
            addCriterion("C_FLOADREQR between", value1, value2, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCFloadreqrNotBetween(String value1, String value2) {
            addCriterion("C_FLOADREQR not between", value1, value2, "cFloadreqr");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIsNull() {
            addCriterion("C_GOODS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIsNotNull() {
            addCriterion("C_GOODS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeEqualTo(String value) {
            addCriterion("C_GOODS_TYPE =", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeNotEqualTo(String value) {
            addCriterion("C_GOODS_TYPE <>", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeGreaterThan(String value) {
            addCriterion("C_GOODS_TYPE >", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_TYPE >=", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeLessThan(String value) {
            addCriterion("C_GOODS_TYPE <", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_TYPE <=", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeLike(String value) {
            addCriterion("C_GOODS_TYPE like", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeNotLike(String value) {
            addCriterion("C_GOODS_TYPE not like", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIn(List<String> values) {
            addCriterion("C_GOODS_TYPE in", values, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeNotIn(List<String> values) {
            addCriterion("C_GOODS_TYPE not in", values, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeBetween(String value1, String value2) {
            addCriterion("C_GOODS_TYPE between", value1, value2, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_TYPE not between", value1, value2, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCNumIsNull() {
            addCriterion("C_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCNumIsNotNull() {
            addCriterion("C_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCNumEqualTo(Integer value) {
            addCriterion("C_NUM =", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotEqualTo(Integer value) {
            addCriterion("C_NUM <>", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumGreaterThan(Integer value) {
            addCriterion("C_NUM >", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_NUM >=", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumLessThan(Integer value) {
            addCriterion("C_NUM <", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumLessThanOrEqualTo(Integer value) {
            addCriterion("C_NUM <=", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumIn(List<Integer> values) {
            addCriterion("C_NUM in", values, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotIn(List<Integer> values) {
            addCriterion("C_NUM not in", values, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumBetween(Integer value1, Integer value2) {
            addCriterion("C_NUM between", value1, value2, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotBetween(Integer value1, Integer value2) {
            addCriterion("C_NUM not between", value1, value2, "cNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumIsNull() {
            addCriterion("C_PAY_TYPE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumIsNotNull() {
            addCriterion("C_PAY_TYPE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumEqualTo(String value) {
            addCriterion("C_PAY_TYPE_NUM =", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumNotEqualTo(String value) {
            addCriterion("C_PAY_TYPE_NUM <>", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumGreaterThan(String value) {
            addCriterion("C_PAY_TYPE_NUM >", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_PAY_TYPE_NUM >=", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumLessThan(String value) {
            addCriterion("C_PAY_TYPE_NUM <", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumLessThanOrEqualTo(String value) {
            addCriterion("C_PAY_TYPE_NUM <=", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumLike(String value) {
            addCriterion("C_PAY_TYPE_NUM like", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumNotLike(String value) {
            addCriterion("C_PAY_TYPE_NUM not like", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumIn(List<String> values) {
            addCriterion("C_PAY_TYPE_NUM in", values, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumNotIn(List<String> values) {
            addCriterion("C_PAY_TYPE_NUM not in", values, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumBetween(String value1, String value2) {
            addCriterion("C_PAY_TYPE_NUM between", value1, value2, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumNotBetween(String value1, String value2) {
            addCriterion("C_PAY_TYPE_NUM not between", value1, value2, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCRecAddressIsNull() {
            addCriterion("C_REC_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCRecAddressIsNotNull() {
            addCriterion("C_REC_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCRecAddressEqualTo(String value) {
            addCriterion("C_REC_ADDRESS =", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressNotEqualTo(String value) {
            addCriterion("C_REC_ADDRESS <>", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressGreaterThan(String value) {
            addCriterion("C_REC_ADDRESS >", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_REC_ADDRESS >=", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressLessThan(String value) {
            addCriterion("C_REC_ADDRESS <", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressLessThanOrEqualTo(String value) {
            addCriterion("C_REC_ADDRESS <=", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressLike(String value) {
            addCriterion("C_REC_ADDRESS like", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressNotLike(String value) {
            addCriterion("C_REC_ADDRESS not like", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressIn(List<String> values) {
            addCriterion("C_REC_ADDRESS in", values, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressNotIn(List<String> values) {
            addCriterion("C_REC_ADDRESS not in", values, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressBetween(String value1, String value2) {
            addCriterion("C_REC_ADDRESS between", value1, value2, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressNotBetween(String value1, String value2) {
            addCriterion("C_REC_ADDRESS not between", value1, value2, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyIsNull() {
            addCriterion("C_REC_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyIsNotNull() {
            addCriterion("C_REC_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyEqualTo(String value) {
            addCriterion("C_REC_COMPANY =", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyNotEqualTo(String value) {
            addCriterion("C_REC_COMPANY <>", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyGreaterThan(String value) {
            addCriterion("C_REC_COMPANY >", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("C_REC_COMPANY >=", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyLessThan(String value) {
            addCriterion("C_REC_COMPANY <", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyLessThanOrEqualTo(String value) {
            addCriterion("C_REC_COMPANY <=", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyLike(String value) {
            addCriterion("C_REC_COMPANY like", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyNotLike(String value) {
            addCriterion("C_REC_COMPANY not like", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyIn(List<String> values) {
            addCriterion("C_REC_COMPANY in", values, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyNotIn(List<String> values) {
            addCriterion("C_REC_COMPANY not in", values, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyBetween(String value1, String value2) {
            addCriterion("C_REC_COMPANY between", value1, value2, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyNotBetween(String value1, String value2) {
            addCriterion("C_REC_COMPANY not between", value1, value2, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecMobileIsNull() {
            addCriterion("C_REC_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andCRecMobileIsNotNull() {
            addCriterion("C_REC_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andCRecMobileEqualTo(String value) {
            addCriterion("C_REC_MOBILE =", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileNotEqualTo(String value) {
            addCriterion("C_REC_MOBILE <>", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileGreaterThan(String value) {
            addCriterion("C_REC_MOBILE >", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileGreaterThanOrEqualTo(String value) {
            addCriterion("C_REC_MOBILE >=", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileLessThan(String value) {
            addCriterion("C_REC_MOBILE <", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileLessThanOrEqualTo(String value) {
            addCriterion("C_REC_MOBILE <=", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileLike(String value) {
            addCriterion("C_REC_MOBILE like", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileNotLike(String value) {
            addCriterion("C_REC_MOBILE not like", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileIn(List<String> values) {
            addCriterion("C_REC_MOBILE in", values, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileNotIn(List<String> values) {
            addCriterion("C_REC_MOBILE not in", values, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileBetween(String value1, String value2) {
            addCriterion("C_REC_MOBILE between", value1, value2, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileNotBetween(String value1, String value2) {
            addCriterion("C_REC_MOBILE not between", value1, value2, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecNameIsNull() {
            addCriterion("C_REC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCRecNameIsNotNull() {
            addCriterion("C_REC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCRecNameEqualTo(String value) {
            addCriterion("C_REC_NAME =", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameNotEqualTo(String value) {
            addCriterion("C_REC_NAME <>", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameGreaterThan(String value) {
            addCriterion("C_REC_NAME >", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_REC_NAME >=", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameLessThan(String value) {
            addCriterion("C_REC_NAME <", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameLessThanOrEqualTo(String value) {
            addCriterion("C_REC_NAME <=", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameLike(String value) {
            addCriterion("C_REC_NAME like", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameNotLike(String value) {
            addCriterion("C_REC_NAME not like", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameIn(List<String> values) {
            addCriterion("C_REC_NAME in", values, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameNotIn(List<String> values) {
            addCriterion("C_REC_NAME not in", values, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameBetween(String value1, String value2) {
            addCriterion("C_REC_NAME between", value1, value2, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameNotBetween(String value1, String value2) {
            addCriterion("C_REC_NAME not between", value1, value2, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRemarkIsNull() {
            addCriterion("C_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCRemarkIsNotNull() {
            addCriterion("C_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCRemarkEqualTo(String value) {
            addCriterion("C_REMARK =", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotEqualTo(String value) {
            addCriterion("C_REMARK <>", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkGreaterThan(String value) {
            addCriterion("C_REMARK >", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("C_REMARK >=", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkLessThan(String value) {
            addCriterion("C_REMARK <", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkLessThanOrEqualTo(String value) {
            addCriterion("C_REMARK <=", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkLike(String value) {
            addCriterion("C_REMARK like", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotLike(String value) {
            addCriterion("C_REMARK not like", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkIn(List<String> values) {
            addCriterion("C_REMARK in", values, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotIn(List<String> values) {
            addCriterion("C_REMARK not in", values, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkBetween(String value1, String value2) {
            addCriterion("C_REMARK between", value1, value2, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotBetween(String value1, String value2) {
            addCriterion("C_REMARK not between", value1, value2, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCSendAddressIsNull() {
            addCriterion("C_SEND_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCSendAddressIsNotNull() {
            addCriterion("C_SEND_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCSendAddressEqualTo(String value) {
            addCriterion("C_SEND_ADDRESS =", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressNotEqualTo(String value) {
            addCriterion("C_SEND_ADDRESS <>", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressGreaterThan(String value) {
            addCriterion("C_SEND_ADDRESS >", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_ADDRESS >=", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressLessThan(String value) {
            addCriterion("C_SEND_ADDRESS <", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_ADDRESS <=", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressLike(String value) {
            addCriterion("C_SEND_ADDRESS like", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressNotLike(String value) {
            addCriterion("C_SEND_ADDRESS not like", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressIn(List<String> values) {
            addCriterion("C_SEND_ADDRESS in", values, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressNotIn(List<String> values) {
            addCriterion("C_SEND_ADDRESS not in", values, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressBetween(String value1, String value2) {
            addCriterion("C_SEND_ADDRESS between", value1, value2, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressNotBetween(String value1, String value2) {
            addCriterion("C_SEND_ADDRESS not between", value1, value2, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyIsNull() {
            addCriterion("C_SEND_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyIsNotNull() {
            addCriterion("C_SEND_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyEqualTo(String value) {
            addCriterion("C_SEND_COMPANY =", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyNotEqualTo(String value) {
            addCriterion("C_SEND_COMPANY <>", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyGreaterThan(String value) {
            addCriterion("C_SEND_COMPANY >", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_COMPANY >=", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyLessThan(String value) {
            addCriterion("C_SEND_COMPANY <", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_COMPANY <=", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyLike(String value) {
            addCriterion("C_SEND_COMPANY like", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyNotLike(String value) {
            addCriterion("C_SEND_COMPANY not like", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyIn(List<String> values) {
            addCriterion("C_SEND_COMPANY in", values, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyNotIn(List<String> values) {
            addCriterion("C_SEND_COMPANY not in", values, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyBetween(String value1, String value2) {
            addCriterion("C_SEND_COMPANY between", value1, value2, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyNotBetween(String value1, String value2) {
            addCriterion("C_SEND_COMPANY not between", value1, value2, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendMobileIsNull() {
            addCriterion("C_SEND_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andCSendMobileIsNotNull() {
            addCriterion("C_SEND_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andCSendMobileEqualTo(String value) {
            addCriterion("C_SEND_MOBILE =", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileNotEqualTo(String value) {
            addCriterion("C_SEND_MOBILE <>", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileGreaterThan(String value) {
            addCriterion("C_SEND_MOBILE >", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_MOBILE >=", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileLessThan(String value) {
            addCriterion("C_SEND_MOBILE <", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_MOBILE <=", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileLike(String value) {
            addCriterion("C_SEND_MOBILE like", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileNotLike(String value) {
            addCriterion("C_SEND_MOBILE not like", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileIn(List<String> values) {
            addCriterion("C_SEND_MOBILE in", values, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileNotIn(List<String> values) {
            addCriterion("C_SEND_MOBILE not in", values, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileBetween(String value1, String value2) {
            addCriterion("C_SEND_MOBILE between", value1, value2, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileNotBetween(String value1, String value2) {
            addCriterion("C_SEND_MOBILE not between", value1, value2, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendNameIsNull() {
            addCriterion("C_SEND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCSendNameIsNotNull() {
            addCriterion("C_SEND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCSendNameEqualTo(String value) {
            addCriterion("C_SEND_NAME =", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameNotEqualTo(String value) {
            addCriterion("C_SEND_NAME <>", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameGreaterThan(String value) {
            addCriterion("C_SEND_NAME >", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_NAME >=", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameLessThan(String value) {
            addCriterion("C_SEND_NAME <", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_NAME <=", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameLike(String value) {
            addCriterion("C_SEND_NAME like", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameNotLike(String value) {
            addCriterion("C_SEND_NAME not like", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameIn(List<String> values) {
            addCriterion("C_SEND_NAME in", values, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameNotIn(List<String> values) {
            addCriterion("C_SEND_NAME not in", values, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameBetween(String value1, String value2) {
            addCriterion("C_SEND_NAME between", value1, value2, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameNotBetween(String value1, String value2) {
            addCriterion("C_SEND_NAME not between", value1, value2, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendProNumIsNull() {
            addCriterion("C_SEND_PRO_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCSendProNumIsNotNull() {
            addCriterion("C_SEND_PRO_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCSendProNumEqualTo(String value) {
            addCriterion("C_SEND_PRO_NUM =", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumNotEqualTo(String value) {
            addCriterion("C_SEND_PRO_NUM <>", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumGreaterThan(String value) {
            addCriterion("C_SEND_PRO_NUM >", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_PRO_NUM >=", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumLessThan(String value) {
            addCriterion("C_SEND_PRO_NUM <", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_PRO_NUM <=", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumLike(String value) {
            addCriterion("C_SEND_PRO_NUM like", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumNotLike(String value) {
            addCriterion("C_SEND_PRO_NUM not like", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumIn(List<String> values) {
            addCriterion("C_SEND_PRO_NUM in", values, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumNotIn(List<String> values) {
            addCriterion("C_SEND_PRO_NUM not in", values, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumBetween(String value1, String value2) {
            addCriterion("C_SEND_PRO_NUM between", value1, value2, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumNotBetween(String value1, String value2) {
            addCriterion("C_SEND_PRO_NUM not between", value1, value2, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSignStatusIsNull() {
            addCriterion("C_SIGN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCSignStatusIsNotNull() {
            addCriterion("C_SIGN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCSignStatusEqualTo(Integer value) {
            addCriterion("C_SIGN_STATUS =", value, "cSignStatus");
            return (Criteria) this;
        }

        public Criteria andCSignStatusNotEqualTo(Integer value) {
            addCriterion("C_SIGN_STATUS <>", value, "cSignStatus");
            return (Criteria) this;
        }

        public Criteria andCSignStatusGreaterThan(Integer value) {
            addCriterion("C_SIGN_STATUS >", value, "cSignStatus");
            return (Criteria) this;
        }

        public Criteria andCSignStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_SIGN_STATUS >=", value, "cSignStatus");
            return (Criteria) this;
        }

        public Criteria andCSignStatusLessThan(Integer value) {
            addCriterion("C_SIGN_STATUS <", value, "cSignStatus");
            return (Criteria) this;
        }

        public Criteria andCSignStatusLessThanOrEqualTo(Integer value) {
            addCriterion("C_SIGN_STATUS <=", value, "cSignStatus");
            return (Criteria) this;
        }

        public Criteria andCSignStatusIn(List<Integer> values) {
            addCriterion("C_SIGN_STATUS in", values, "cSignStatus");
            return (Criteria) this;
        }

        public Criteria andCSignStatusNotIn(List<Integer> values) {
            addCriterion("C_SIGN_STATUS not in", values, "cSignStatus");
            return (Criteria) this;
        }

        public Criteria andCSignStatusBetween(Integer value1, Integer value2) {
            addCriterion("C_SIGN_STATUS between", value1, value2, "cSignStatus");
            return (Criteria) this;
        }

        public Criteria andCSignStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("C_SIGN_STATUS not between", value1, value2, "cSignStatus");
            return (Criteria) this;
        }

        public Criteria andCVolIsNull() {
            addCriterion("C_VOL is null");
            return (Criteria) this;
        }

        public Criteria andCVolIsNotNull() {
            addCriterion("C_VOL is not null");
            return (Criteria) this;
        }

        public Criteria andCVolEqualTo(String value) {
            addCriterion("C_VOL =", value, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolNotEqualTo(String value) {
            addCriterion("C_VOL <>", value, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolGreaterThan(String value) {
            addCriterion("C_VOL >", value, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolGreaterThanOrEqualTo(String value) {
            addCriterion("C_VOL >=", value, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolLessThan(String value) {
            addCriterion("C_VOL <", value, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolLessThanOrEqualTo(String value) {
            addCriterion("C_VOL <=", value, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolLike(String value) {
            addCriterion("C_VOL like", value, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolNotLike(String value) {
            addCriterion("C_VOL not like", value, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolIn(List<String> values) {
            addCriterion("C_VOL in", values, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolNotIn(List<String> values) {
            addCriterion("C_VOL not in", values, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolBetween(String value1, String value2) {
            addCriterion("C_VOL between", value1, value2, "cVol");
            return (Criteria) this;
        }

        public Criteria andCVolNotBetween(String value1, String value2) {
            addCriterion("C_VOL not between", value1, value2, "cVol");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumIsNull() {
            addCriterion("C_WAY_BILL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumIsNotNull() {
            addCriterion("C_WAY_BILL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumEqualTo(String value) {
            addCriterion("C_WAY_BILL_NUM =", value, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumNotEqualTo(String value) {
            addCriterion("C_WAY_BILL_NUM <>", value, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumGreaterThan(String value) {
            addCriterion("C_WAY_BILL_NUM >", value, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_WAY_BILL_NUM >=", value, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumLessThan(String value) {
            addCriterion("C_WAY_BILL_NUM <", value, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumLessThanOrEqualTo(String value) {
            addCriterion("C_WAY_BILL_NUM <=", value, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumLike(String value) {
            addCriterion("C_WAY_BILL_NUM like", value, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumNotLike(String value) {
            addCriterion("C_WAY_BILL_NUM not like", value, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumIn(List<String> values) {
            addCriterion("C_WAY_BILL_NUM in", values, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumNotIn(List<String> values) {
            addCriterion("C_WAY_BILL_NUM not in", values, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumBetween(String value1, String value2) {
            addCriterion("C_WAY_BILL_NUM between", value1, value2, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillNumNotBetween(String value1, String value2) {
            addCriterion("C_WAY_BILL_NUM not between", value1, value2, "cWayBillNum");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeIsNull() {
            addCriterion("C_WAY_BILL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeIsNotNull() {
            addCriterion("C_WAY_BILL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeEqualTo(String value) {
            addCriterion("C_WAY_BILL_TYPE =", value, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeNotEqualTo(String value) {
            addCriterion("C_WAY_BILL_TYPE <>", value, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeGreaterThan(String value) {
            addCriterion("C_WAY_BILL_TYPE >", value, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_WAY_BILL_TYPE >=", value, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeLessThan(String value) {
            addCriterion("C_WAY_BILL_TYPE <", value, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeLessThanOrEqualTo(String value) {
            addCriterion("C_WAY_BILL_TYPE <=", value, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeLike(String value) {
            addCriterion("C_WAY_BILL_TYPE like", value, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeNotLike(String value) {
            addCriterion("C_WAY_BILL_TYPE not like", value, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeIn(List<String> values) {
            addCriterion("C_WAY_BILL_TYPE in", values, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeNotIn(List<String> values) {
            addCriterion("C_WAY_BILL_TYPE not in", values, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeBetween(String value1, String value2) {
            addCriterion("C_WAY_BILL_TYPE between", value1, value2, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWayBillTypeNotBetween(String value1, String value2) {
            addCriterion("C_WAY_BILL_TYPE not between", value1, value2, "cWayBillType");
            return (Criteria) this;
        }

        public Criteria andCWeightIsNull() {
            addCriterion("C_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andCWeightIsNotNull() {
            addCriterion("C_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andCWeightEqualTo(Double value) {
            addCriterion("C_WEIGHT =", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightNotEqualTo(Double value) {
            addCriterion("C_WEIGHT <>", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightGreaterThan(Double value) {
            addCriterion("C_WEIGHT >", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("C_WEIGHT >=", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightLessThan(Double value) {
            addCriterion("C_WEIGHT <", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightLessThanOrEqualTo(Double value) {
            addCriterion("C_WEIGHT <=", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightIn(List<Double> values) {
            addCriterion("C_WEIGHT in", values, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightNotIn(List<Double> values) {
            addCriterion("C_WEIGHT not in", values, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightBetween(Double value1, Double value2) {
            addCriterion("C_WEIGHT between", value1, value2, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightNotBetween(Double value1, Double value2) {
            addCriterion("C_WEIGHT not between", value1, value2, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIsNull() {
            addCriterion("C_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIsNotNull() {
            addCriterion("C_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderIdEqualTo(Integer value) {
            addCriterion("C_ORDER_ID =", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotEqualTo(Integer value) {
            addCriterion("C_ORDER_ID <>", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdGreaterThan(Integer value) {
            addCriterion("C_ORDER_ID >", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ORDER_ID >=", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdLessThan(Integer value) {
            addCriterion("C_ORDER_ID <", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ORDER_ID <=", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIn(List<Integer> values) {
            addCriterion("C_ORDER_ID in", values, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotIn(List<Integer> values) {
            addCriterion("C_ORDER_ID not in", values, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ORDER_ID between", value1, value2, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ORDER_ID not between", value1, value2, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdIsNull() {
            addCriterion("C_REC_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdIsNotNull() {
            addCriterion("C_REC_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdEqualTo(String value) {
            addCriterion("C_REC_AREA_ID =", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdNotEqualTo(String value) {
            addCriterion("C_REC_AREA_ID <>", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdGreaterThan(String value) {
            addCriterion("C_REC_AREA_ID >", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_REC_AREA_ID >=", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdLessThan(String value) {
            addCriterion("C_REC_AREA_ID <", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdLessThanOrEqualTo(String value) {
            addCriterion("C_REC_AREA_ID <=", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdLike(String value) {
            addCriterion("C_REC_AREA_ID like", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdNotLike(String value) {
            addCriterion("C_REC_AREA_ID not like", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdIn(List<String> values) {
            addCriterion("C_REC_AREA_ID in", values, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdNotIn(List<String> values) {
            addCriterion("C_REC_AREA_ID not in", values, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdBetween(String value1, String value2) {
            addCriterion("C_REC_AREA_ID between", value1, value2, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdNotBetween(String value1, String value2) {
            addCriterion("C_REC_AREA_ID not between", value1, value2, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdIsNull() {
            addCriterion("C_SEND_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdIsNotNull() {
            addCriterion("C_SEND_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdEqualTo(String value) {
            addCriterion("C_SEND_AREA_ID =", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdNotEqualTo(String value) {
            addCriterion("C_SEND_AREA_ID <>", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdGreaterThan(String value) {
            addCriterion("C_SEND_AREA_ID >", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_AREA_ID >=", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdLessThan(String value) {
            addCriterion("C_SEND_AREA_ID <", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_AREA_ID <=", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdLike(String value) {
            addCriterion("C_SEND_AREA_ID like", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdNotLike(String value) {
            addCriterion("C_SEND_AREA_ID not like", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdIn(List<String> values) {
            addCriterion("C_SEND_AREA_ID in", values, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdNotIn(List<String> values) {
            addCriterion("C_SEND_AREA_ID not in", values, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdBetween(String value1, String value2) {
            addCriterion("C_SEND_AREA_ID between", value1, value2, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdNotBetween(String value1, String value2) {
            addCriterion("C_SEND_AREA_ID not between", value1, value2, "cSendAreaId");
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