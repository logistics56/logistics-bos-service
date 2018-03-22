package com.logistics.module.bos.model;

import java.util.ArrayList;
import java.util.List;

public class TTransitInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTransitInfoExample() {
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

        public Criteria andCOutletAddressIsNull() {
            addCriterion("C_OUTLET_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressIsNotNull() {
            addCriterion("C_OUTLET_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressEqualTo(String value) {
            addCriterion("C_OUTLET_ADDRESS =", value, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressNotEqualTo(String value) {
            addCriterion("C_OUTLET_ADDRESS <>", value, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressGreaterThan(String value) {
            addCriterion("C_OUTLET_ADDRESS >", value, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_OUTLET_ADDRESS >=", value, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressLessThan(String value) {
            addCriterion("C_OUTLET_ADDRESS <", value, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressLessThanOrEqualTo(String value) {
            addCriterion("C_OUTLET_ADDRESS <=", value, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressLike(String value) {
            addCriterion("C_OUTLET_ADDRESS like", value, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressNotLike(String value) {
            addCriterion("C_OUTLET_ADDRESS not like", value, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressIn(List<String> values) {
            addCriterion("C_OUTLET_ADDRESS in", values, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressNotIn(List<String> values) {
            addCriterion("C_OUTLET_ADDRESS not in", values, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressBetween(String value1, String value2) {
            addCriterion("C_OUTLET_ADDRESS between", value1, value2, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCOutletAddressNotBetween(String value1, String value2) {
            addCriterion("C_OUTLET_ADDRESS not between", value1, value2, "cOutletAddress");
            return (Criteria) this;
        }

        public Criteria andCStatusIsNull() {
            addCriterion("C_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCStatusIsNotNull() {
            addCriterion("C_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCStatusEqualTo(String value) {
            addCriterion("C_STATUS =", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotEqualTo(String value) {
            addCriterion("C_STATUS <>", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusGreaterThan(String value) {
            addCriterion("C_STATUS >", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusGreaterThanOrEqualTo(String value) {
            addCriterion("C_STATUS >=", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLessThan(String value) {
            addCriterion("C_STATUS <", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLessThanOrEqualTo(String value) {
            addCriterion("C_STATUS <=", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLike(String value) {
            addCriterion("C_STATUS like", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotLike(String value) {
            addCriterion("C_STATUS not like", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusIn(List<String> values) {
            addCriterion("C_STATUS in", values, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotIn(List<String> values) {
            addCriterion("C_STATUS not in", values, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusBetween(String value1, String value2) {
            addCriterion("C_STATUS between", value1, value2, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotBetween(String value1, String value2) {
            addCriterion("C_STATUS not between", value1, value2, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdIsNull() {
            addCriterion("C_DELIVERY_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdIsNotNull() {
            addCriterion("C_DELIVERY_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdEqualTo(Integer value) {
            addCriterion("C_DELIVERY_INFO_ID =", value, "cDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdNotEqualTo(Integer value) {
            addCriterion("C_DELIVERY_INFO_ID <>", value, "cDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdGreaterThan(Integer value) {
            addCriterion("C_DELIVERY_INFO_ID >", value, "cDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_DELIVERY_INFO_ID >=", value, "cDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdLessThan(Integer value) {
            addCriterion("C_DELIVERY_INFO_ID <", value, "cDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_DELIVERY_INFO_ID <=", value, "cDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdIn(List<Integer> values) {
            addCriterion("C_DELIVERY_INFO_ID in", values, "cDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdNotIn(List<Integer> values) {
            addCriterion("C_DELIVERY_INFO_ID not in", values, "cDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("C_DELIVERY_INFO_ID between", value1, value2, "cDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andCDeliveryInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_DELIVERY_INFO_ID not between", value1, value2, "cDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdIsNull() {
            addCriterion("C_SIGN_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdIsNotNull() {
            addCriterion("C_SIGN_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdEqualTo(Integer value) {
            addCriterion("C_SIGN_INFO_ID =", value, "cSignInfoId");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdNotEqualTo(Integer value) {
            addCriterion("C_SIGN_INFO_ID <>", value, "cSignInfoId");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdGreaterThan(Integer value) {
            addCriterion("C_SIGN_INFO_ID >", value, "cSignInfoId");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_SIGN_INFO_ID >=", value, "cSignInfoId");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdLessThan(Integer value) {
            addCriterion("C_SIGN_INFO_ID <", value, "cSignInfoId");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_SIGN_INFO_ID <=", value, "cSignInfoId");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdIn(List<Integer> values) {
            addCriterion("C_SIGN_INFO_ID in", values, "cSignInfoId");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdNotIn(List<Integer> values) {
            addCriterion("C_SIGN_INFO_ID not in", values, "cSignInfoId");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("C_SIGN_INFO_ID between", value1, value2, "cSignInfoId");
            return (Criteria) this;
        }

        public Criteria andCSignInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_SIGN_INFO_ID not between", value1, value2, "cSignInfoId");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdIsNull() {
            addCriterion("C_WAYBILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdIsNotNull() {
            addCriterion("C_WAYBILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdEqualTo(Integer value) {
            addCriterion("C_WAYBILL_ID =", value, "cWaybillId");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdNotEqualTo(Integer value) {
            addCriterion("C_WAYBILL_ID <>", value, "cWaybillId");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdGreaterThan(Integer value) {
            addCriterion("C_WAYBILL_ID >", value, "cWaybillId");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_WAYBILL_ID >=", value, "cWaybillId");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdLessThan(Integer value) {
            addCriterion("C_WAYBILL_ID <", value, "cWaybillId");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_WAYBILL_ID <=", value, "cWaybillId");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdIn(List<Integer> values) {
            addCriterion("C_WAYBILL_ID in", values, "cWaybillId");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdNotIn(List<Integer> values) {
            addCriterion("C_WAYBILL_ID not in", values, "cWaybillId");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdBetween(Integer value1, Integer value2) {
            addCriterion("C_WAYBILL_ID between", value1, value2, "cWaybillId");
            return (Criteria) this;
        }

        public Criteria andCWaybillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_WAYBILL_ID not between", value1, value2, "cWaybillId");
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