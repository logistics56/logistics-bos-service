package com.logistics.module.bos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TInOutStorageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInOutStorageInfoExample() {
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

        public Criteria andCAddressIsNull() {
            addCriterion("C_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNotNull() {
            addCriterion("C_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCAddressEqualTo(String value) {
            addCriterion("C_ADDRESS =", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotEqualTo(String value) {
            addCriterion("C_ADDRESS <>", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThan(String value) {
            addCriterion("C_ADDRESS >", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_ADDRESS >=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThan(String value) {
            addCriterion("C_ADDRESS <", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThanOrEqualTo(String value) {
            addCriterion("C_ADDRESS <=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLike(String value) {
            addCriterion("C_ADDRESS like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotLike(String value) {
            addCriterion("C_ADDRESS not like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressIn(List<String> values) {
            addCriterion("C_ADDRESS in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotIn(List<String> values) {
            addCriterion("C_ADDRESS not in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressBetween(String value1, String value2) {
            addCriterion("C_ADDRESS between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotBetween(String value1, String value2) {
            addCriterion("C_ADDRESS not between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIsNull() {
            addCriterion("C_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIsNotNull() {
            addCriterion("C_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andCDescriptionEqualTo(String value) {
            addCriterion("C_DESCRIPTION =", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotEqualTo(String value) {
            addCriterion("C_DESCRIPTION <>", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionGreaterThan(String value) {
            addCriterion("C_DESCRIPTION >", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("C_DESCRIPTION >=", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLessThan(String value) {
            addCriterion("C_DESCRIPTION <", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLessThanOrEqualTo(String value) {
            addCriterion("C_DESCRIPTION <=", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLike(String value) {
            addCriterion("C_DESCRIPTION like", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotLike(String value) {
            addCriterion("C_DESCRIPTION not like", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIn(List<String> values) {
            addCriterion("C_DESCRIPTION in", values, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotIn(List<String> values) {
            addCriterion("C_DESCRIPTION not in", values, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionBetween(String value1, String value2) {
            addCriterion("C_DESCRIPTION between", value1, value2, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotBetween(String value1, String value2) {
            addCriterion("C_DESCRIPTION not between", value1, value2, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCOperationIsNull() {
            addCriterion("C_OPERATION is null");
            return (Criteria) this;
        }

        public Criteria andCOperationIsNotNull() {
            addCriterion("C_OPERATION is not null");
            return (Criteria) this;
        }

        public Criteria andCOperationEqualTo(String value) {
            addCriterion("C_OPERATION =", value, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationNotEqualTo(String value) {
            addCriterion("C_OPERATION <>", value, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationGreaterThan(String value) {
            addCriterion("C_OPERATION >", value, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationGreaterThanOrEqualTo(String value) {
            addCriterion("C_OPERATION >=", value, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationLessThan(String value) {
            addCriterion("C_OPERATION <", value, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationLessThanOrEqualTo(String value) {
            addCriterion("C_OPERATION <=", value, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationLike(String value) {
            addCriterion("C_OPERATION like", value, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationNotLike(String value) {
            addCriterion("C_OPERATION not like", value, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationIn(List<String> values) {
            addCriterion("C_OPERATION in", values, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationNotIn(List<String> values) {
            addCriterion("C_OPERATION not in", values, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationBetween(String value1, String value2) {
            addCriterion("C_OPERATION between", value1, value2, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCOperationNotBetween(String value1, String value2) {
            addCriterion("C_OPERATION not between", value1, value2, "cOperation");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdIsNull() {
            addCriterion("C_TRANSIT_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdIsNotNull() {
            addCriterion("C_TRANSIT_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdEqualTo(Integer value) {
            addCriterion("C_TRANSIT_INFO_ID =", value, "cTransitInfoId");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdNotEqualTo(Integer value) {
            addCriterion("C_TRANSIT_INFO_ID <>", value, "cTransitInfoId");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdGreaterThan(Integer value) {
            addCriterion("C_TRANSIT_INFO_ID >", value, "cTransitInfoId");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_TRANSIT_INFO_ID >=", value, "cTransitInfoId");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdLessThan(Integer value) {
            addCriterion("C_TRANSIT_INFO_ID <", value, "cTransitInfoId");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_TRANSIT_INFO_ID <=", value, "cTransitInfoId");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdIn(List<Integer> values) {
            addCriterion("C_TRANSIT_INFO_ID in", values, "cTransitInfoId");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdNotIn(List<Integer> values) {
            addCriterion("C_TRANSIT_INFO_ID not in", values, "cTransitInfoId");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("C_TRANSIT_INFO_ID between", value1, value2, "cTransitInfoId");
            return (Criteria) this;
        }

        public Criteria andCTransitInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_TRANSIT_INFO_ID not between", value1, value2, "cTransitInfoId");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexIsNull() {
            addCriterion("C_IN_OUT_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexIsNotNull() {
            addCriterion("C_IN_OUT_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexEqualTo(Integer value) {
            addCriterion("C_IN_OUT_INDEX =", value, "cInOutIndex");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexNotEqualTo(Integer value) {
            addCriterion("C_IN_OUT_INDEX <>", value, "cInOutIndex");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexGreaterThan(Integer value) {
            addCriterion("C_IN_OUT_INDEX >", value, "cInOutIndex");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_IN_OUT_INDEX >=", value, "cInOutIndex");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexLessThan(Integer value) {
            addCriterion("C_IN_OUT_INDEX <", value, "cInOutIndex");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexLessThanOrEqualTo(Integer value) {
            addCriterion("C_IN_OUT_INDEX <=", value, "cInOutIndex");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexIn(List<Integer> values) {
            addCriterion("C_IN_OUT_INDEX in", values, "cInOutIndex");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexNotIn(List<Integer> values) {
            addCriterion("C_IN_OUT_INDEX not in", values, "cInOutIndex");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexBetween(Integer value1, Integer value2) {
            addCriterion("C_IN_OUT_INDEX between", value1, value2, "cInOutIndex");
            return (Criteria) this;
        }

        public Criteria andCInOutIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("C_IN_OUT_INDEX not between", value1, value2, "cInOutIndex");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNull() {
            addCriterion("C_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNotNull() {
            addCriterion("C_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeEqualTo(Date value) {
            addCriterion("C_CREATE_TIME =", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotEqualTo(Date value) {
            addCriterion("C_CREATE_TIME <>", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThan(Date value) {
            addCriterion("C_CREATE_TIME >", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_CREATE_TIME >=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThan(Date value) {
            addCriterion("C_CREATE_TIME <", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("C_CREATE_TIME <=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIn(List<Date> values) {
            addCriterion("C_CREATE_TIME in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotIn(List<Date> values) {
            addCriterion("C_CREATE_TIME not in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeBetween(Date value1, Date value2) {
            addCriterion("C_CREATE_TIME between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("C_CREATE_TIME not between", value1, value2, "cCreateTime");
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