package com.logistics.module.model;

import java.util.ArrayList;
import java.util.List;

public class TFixedareaCourierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFixedareaCourierExample() {
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

        public Criteria andCFixedAreaIdIsNull() {
            addCriterion("C_FIXED_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdIsNotNull() {
            addCriterion("C_FIXED_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdEqualTo(String value) {
            addCriterion("C_FIXED_AREA_ID =", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdNotEqualTo(String value) {
            addCriterion("C_FIXED_AREA_ID <>", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdGreaterThan(String value) {
            addCriterion("C_FIXED_AREA_ID >", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_FIXED_AREA_ID >=", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdLessThan(String value) {
            addCriterion("C_FIXED_AREA_ID <", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdLessThanOrEqualTo(String value) {
            addCriterion("C_FIXED_AREA_ID <=", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdLike(String value) {
            addCriterion("C_FIXED_AREA_ID like", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdNotLike(String value) {
            addCriterion("C_FIXED_AREA_ID not like", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdIn(List<String> values) {
            addCriterion("C_FIXED_AREA_ID in", values, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdNotIn(List<String> values) {
            addCriterion("C_FIXED_AREA_ID not in", values, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdBetween(String value1, String value2) {
            addCriterion("C_FIXED_AREA_ID between", value1, value2, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdNotBetween(String value1, String value2) {
            addCriterion("C_FIXED_AREA_ID not between", value1, value2, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdIsNull() {
            addCriterion("C_COURIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCourierIdIsNotNull() {
            addCriterion("C_COURIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCourierIdEqualTo(Integer value) {
            addCriterion("C_COURIER_ID =", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdNotEqualTo(Integer value) {
            addCriterion("C_COURIER_ID <>", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdGreaterThan(Integer value) {
            addCriterion("C_COURIER_ID >", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_COURIER_ID >=", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdLessThan(Integer value) {
            addCriterion("C_COURIER_ID <", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_COURIER_ID <=", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdIn(List<Integer> values) {
            addCriterion("C_COURIER_ID in", values, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdNotIn(List<Integer> values) {
            addCriterion("C_COURIER_ID not in", values, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdBetween(Integer value1, Integer value2) {
            addCriterion("C_COURIER_ID between", value1, value2, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_COURIER_ID not between", value1, value2, "cCourierId");
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