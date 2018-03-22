package com.logistics.module.bos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TStandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStandardExample() {
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

        public Criteria andCMaxLengthIsNull() {
            addCriterion("C_MAX_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthIsNotNull() {
            addCriterion("C_MAX_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthEqualTo(Integer value) {
            addCriterion("C_MAX_LENGTH =", value, "cMaxLength");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthNotEqualTo(Integer value) {
            addCriterion("C_MAX_LENGTH <>", value, "cMaxLength");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthGreaterThan(Integer value) {
            addCriterion("C_MAX_LENGTH >", value, "cMaxLength");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_MAX_LENGTH >=", value, "cMaxLength");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthLessThan(Integer value) {
            addCriterion("C_MAX_LENGTH <", value, "cMaxLength");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthLessThanOrEqualTo(Integer value) {
            addCriterion("C_MAX_LENGTH <=", value, "cMaxLength");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthIn(List<Integer> values) {
            addCriterion("C_MAX_LENGTH in", values, "cMaxLength");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthNotIn(List<Integer> values) {
            addCriterion("C_MAX_LENGTH not in", values, "cMaxLength");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthBetween(Integer value1, Integer value2) {
            addCriterion("C_MAX_LENGTH between", value1, value2, "cMaxLength");
            return (Criteria) this;
        }

        public Criteria andCMaxLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("C_MAX_LENGTH not between", value1, value2, "cMaxLength");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightIsNull() {
            addCriterion("C_MAX_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightIsNotNull() {
            addCriterion("C_MAX_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightEqualTo(Integer value) {
            addCriterion("C_MAX_WEIGHT =", value, "cMaxWeight");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightNotEqualTo(Integer value) {
            addCriterion("C_MAX_WEIGHT <>", value, "cMaxWeight");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightGreaterThan(Integer value) {
            addCriterion("C_MAX_WEIGHT >", value, "cMaxWeight");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_MAX_WEIGHT >=", value, "cMaxWeight");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightLessThan(Integer value) {
            addCriterion("C_MAX_WEIGHT <", value, "cMaxWeight");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightLessThanOrEqualTo(Integer value) {
            addCriterion("C_MAX_WEIGHT <=", value, "cMaxWeight");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightIn(List<Integer> values) {
            addCriterion("C_MAX_WEIGHT in", values, "cMaxWeight");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightNotIn(List<Integer> values) {
            addCriterion("C_MAX_WEIGHT not in", values, "cMaxWeight");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightBetween(Integer value1, Integer value2) {
            addCriterion("C_MAX_WEIGHT between", value1, value2, "cMaxWeight");
            return (Criteria) this;
        }

        public Criteria andCMaxWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("C_MAX_WEIGHT not between", value1, value2, "cMaxWeight");
            return (Criteria) this;
        }

        public Criteria andCMinLengthIsNull() {
            addCriterion("C_MIN_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andCMinLengthIsNotNull() {
            addCriterion("C_MIN_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andCMinLengthEqualTo(Integer value) {
            addCriterion("C_MIN_LENGTH =", value, "cMinLength");
            return (Criteria) this;
        }

        public Criteria andCMinLengthNotEqualTo(Integer value) {
            addCriterion("C_MIN_LENGTH <>", value, "cMinLength");
            return (Criteria) this;
        }

        public Criteria andCMinLengthGreaterThan(Integer value) {
            addCriterion("C_MIN_LENGTH >", value, "cMinLength");
            return (Criteria) this;
        }

        public Criteria andCMinLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_MIN_LENGTH >=", value, "cMinLength");
            return (Criteria) this;
        }

        public Criteria andCMinLengthLessThan(Integer value) {
            addCriterion("C_MIN_LENGTH <", value, "cMinLength");
            return (Criteria) this;
        }

        public Criteria andCMinLengthLessThanOrEqualTo(Integer value) {
            addCriterion("C_MIN_LENGTH <=", value, "cMinLength");
            return (Criteria) this;
        }

        public Criteria andCMinLengthIn(List<Integer> values) {
            addCriterion("C_MIN_LENGTH in", values, "cMinLength");
            return (Criteria) this;
        }

        public Criteria andCMinLengthNotIn(List<Integer> values) {
            addCriterion("C_MIN_LENGTH not in", values, "cMinLength");
            return (Criteria) this;
        }

        public Criteria andCMinLengthBetween(Integer value1, Integer value2) {
            addCriterion("C_MIN_LENGTH between", value1, value2, "cMinLength");
            return (Criteria) this;
        }

        public Criteria andCMinLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("C_MIN_LENGTH not between", value1, value2, "cMinLength");
            return (Criteria) this;
        }

        public Criteria andCMinWeightIsNull() {
            addCriterion("C_MIN_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andCMinWeightIsNotNull() {
            addCriterion("C_MIN_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andCMinWeightEqualTo(Integer value) {
            addCriterion("C_MIN_WEIGHT =", value, "cMinWeight");
            return (Criteria) this;
        }

        public Criteria andCMinWeightNotEqualTo(Integer value) {
            addCriterion("C_MIN_WEIGHT <>", value, "cMinWeight");
            return (Criteria) this;
        }

        public Criteria andCMinWeightGreaterThan(Integer value) {
            addCriterion("C_MIN_WEIGHT >", value, "cMinWeight");
            return (Criteria) this;
        }

        public Criteria andCMinWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_MIN_WEIGHT >=", value, "cMinWeight");
            return (Criteria) this;
        }

        public Criteria andCMinWeightLessThan(Integer value) {
            addCriterion("C_MIN_WEIGHT <", value, "cMinWeight");
            return (Criteria) this;
        }

        public Criteria andCMinWeightLessThanOrEqualTo(Integer value) {
            addCriterion("C_MIN_WEIGHT <=", value, "cMinWeight");
            return (Criteria) this;
        }

        public Criteria andCMinWeightIn(List<Integer> values) {
            addCriterion("C_MIN_WEIGHT in", values, "cMinWeight");
            return (Criteria) this;
        }

        public Criteria andCMinWeightNotIn(List<Integer> values) {
            addCriterion("C_MIN_WEIGHT not in", values, "cMinWeight");
            return (Criteria) this;
        }

        public Criteria andCMinWeightBetween(Integer value1, Integer value2) {
            addCriterion("C_MIN_WEIGHT between", value1, value2, "cMinWeight");
            return (Criteria) this;
        }

        public Criteria andCMinWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("C_MIN_WEIGHT not between", value1, value2, "cMinWeight");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyIsNull() {
            addCriterion("C_OPERATING_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyIsNotNull() {
            addCriterion("C_OPERATING_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyEqualTo(String value) {
            addCriterion("C_OPERATING_COMPANY =", value, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyNotEqualTo(String value) {
            addCriterion("C_OPERATING_COMPANY <>", value, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyGreaterThan(String value) {
            addCriterion("C_OPERATING_COMPANY >", value, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("C_OPERATING_COMPANY >=", value, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyLessThan(String value) {
            addCriterion("C_OPERATING_COMPANY <", value, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyLessThanOrEqualTo(String value) {
            addCriterion("C_OPERATING_COMPANY <=", value, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyLike(String value) {
            addCriterion("C_OPERATING_COMPANY like", value, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyNotLike(String value) {
            addCriterion("C_OPERATING_COMPANY not like", value, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyIn(List<String> values) {
            addCriterion("C_OPERATING_COMPANY in", values, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyNotIn(List<String> values) {
            addCriterion("C_OPERATING_COMPANY not in", values, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyBetween(String value1, String value2) {
            addCriterion("C_OPERATING_COMPANY between", value1, value2, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingCompanyNotBetween(String value1, String value2) {
            addCriterion("C_OPERATING_COMPANY not between", value1, value2, "cOperatingCompany");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeIsNull() {
            addCriterion("C_OPERATING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeIsNotNull() {
            addCriterion("C_OPERATING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeEqualTo(Date value) {
            addCriterion("C_OPERATING_TIME =", value, "cOperatingTime");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeNotEqualTo(Date value) {
            addCriterion("C_OPERATING_TIME <>", value, "cOperatingTime");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeGreaterThan(Date value) {
            addCriterion("C_OPERATING_TIME >", value, "cOperatingTime");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_OPERATING_TIME >=", value, "cOperatingTime");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeLessThan(Date value) {
            addCriterion("C_OPERATING_TIME <", value, "cOperatingTime");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeLessThanOrEqualTo(Date value) {
            addCriterion("C_OPERATING_TIME <=", value, "cOperatingTime");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeIn(List<Date> values) {
            addCriterion("C_OPERATING_TIME in", values, "cOperatingTime");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeNotIn(List<Date> values) {
            addCriterion("C_OPERATING_TIME not in", values, "cOperatingTime");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeBetween(Date value1, Date value2) {
            addCriterion("C_OPERATING_TIME between", value1, value2, "cOperatingTime");
            return (Criteria) this;
        }

        public Criteria andCOperatingTimeNotBetween(Date value1, Date value2) {
            addCriterion("C_OPERATING_TIME not between", value1, value2, "cOperatingTime");
            return (Criteria) this;
        }

        public Criteria andCOperatorIsNull() {
            addCriterion("C_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andCOperatorIsNotNull() {
            addCriterion("C_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCOperatorEqualTo(String value) {
            addCriterion("C_OPERATOR =", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorNotEqualTo(String value) {
            addCriterion("C_OPERATOR <>", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorGreaterThan(String value) {
            addCriterion("C_OPERATOR >", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("C_OPERATOR >=", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorLessThan(String value) {
            addCriterion("C_OPERATOR <", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorLessThanOrEqualTo(String value) {
            addCriterion("C_OPERATOR <=", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorLike(String value) {
            addCriterion("C_OPERATOR like", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorNotLike(String value) {
            addCriterion("C_OPERATOR not like", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorIn(List<String> values) {
            addCriterion("C_OPERATOR in", values, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorNotIn(List<String> values) {
            addCriterion("C_OPERATOR not in", values, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorBetween(String value1, String value2) {
            addCriterion("C_OPERATOR between", value1, value2, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorNotBetween(String value1, String value2) {
            addCriterion("C_OPERATOR not between", value1, value2, "cOperator");
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