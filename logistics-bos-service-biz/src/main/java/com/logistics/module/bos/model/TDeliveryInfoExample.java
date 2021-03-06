package com.logistics.module.bos.model;

import java.util.ArrayList;
import java.util.List;

public class TDeliveryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDeliveryInfoExample() {
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

        public Criteria andCCourierNameIsNull() {
            addCriterion("C_COURIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCCourierNameIsNotNull() {
            addCriterion("C_COURIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCCourierNameEqualTo(String value) {
            addCriterion("C_COURIER_NAME =", value, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameNotEqualTo(String value) {
            addCriterion("C_COURIER_NAME <>", value, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameGreaterThan(String value) {
            addCriterion("C_COURIER_NAME >", value, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_COURIER_NAME >=", value, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameLessThan(String value) {
            addCriterion("C_COURIER_NAME <", value, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameLessThanOrEqualTo(String value) {
            addCriterion("C_COURIER_NAME <=", value, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameLike(String value) {
            addCriterion("C_COURIER_NAME like", value, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameNotLike(String value) {
            addCriterion("C_COURIER_NAME not like", value, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameIn(List<String> values) {
            addCriterion("C_COURIER_NAME in", values, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameNotIn(List<String> values) {
            addCriterion("C_COURIER_NAME not in", values, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameBetween(String value1, String value2) {
            addCriterion("C_COURIER_NAME between", value1, value2, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNameNotBetween(String value1, String value2) {
            addCriterion("C_COURIER_NAME not between", value1, value2, "cCourierName");
            return (Criteria) this;
        }

        public Criteria andCCourierNumIsNull() {
            addCriterion("C_COURIER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCCourierNumIsNotNull() {
            addCriterion("C_COURIER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCCourierNumEqualTo(String value) {
            addCriterion("C_COURIER_NUM =", value, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumNotEqualTo(String value) {
            addCriterion("C_COURIER_NUM <>", value, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumGreaterThan(String value) {
            addCriterion("C_COURIER_NUM >", value, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_COURIER_NUM >=", value, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumLessThan(String value) {
            addCriterion("C_COURIER_NUM <", value, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumLessThanOrEqualTo(String value) {
            addCriterion("C_COURIER_NUM <=", value, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumLike(String value) {
            addCriterion("C_COURIER_NUM like", value, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumNotLike(String value) {
            addCriterion("C_COURIER_NUM not like", value, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumIn(List<String> values) {
            addCriterion("C_COURIER_NUM in", values, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumNotIn(List<String> values) {
            addCriterion("C_COURIER_NUM not in", values, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumBetween(String value1, String value2) {
            addCriterion("C_COURIER_NUM between", value1, value2, "cCourierNum");
            return (Criteria) this;
        }

        public Criteria andCCourierNumNotBetween(String value1, String value2) {
            addCriterion("C_COURIER_NUM not between", value1, value2, "cCourierNum");
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