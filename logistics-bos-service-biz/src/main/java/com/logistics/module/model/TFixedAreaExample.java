package com.logistics.module.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TFixedAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFixedAreaExample() {
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

        public Criteria andCIdEqualTo(String value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("C_ID like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("C_ID not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCCompanyIsNull() {
            addCriterion("C_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyIsNotNull() {
            addCriterion("C_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyEqualTo(String value) {
            addCriterion("C_COMPANY =", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyNotEqualTo(String value) {
            addCriterion("C_COMPANY <>", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyGreaterThan(String value) {
            addCriterion("C_COMPANY >", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPANY >=", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyLessThan(String value) {
            addCriterion("C_COMPANY <", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyLessThanOrEqualTo(String value) {
            addCriterion("C_COMPANY <=", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyLike(String value) {
            addCriterion("C_COMPANY like", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyNotLike(String value) {
            addCriterion("C_COMPANY not like", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyIn(List<String> values) {
            addCriterion("C_COMPANY in", values, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyNotIn(List<String> values) {
            addCriterion("C_COMPANY not in", values, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyBetween(String value1, String value2) {
            addCriterion("C_COMPANY between", value1, value2, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyNotBetween(String value1, String value2) {
            addCriterion("C_COMPANY not between", value1, value2, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderIsNull() {
            addCriterion("C_FIXED_AREA_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderIsNotNull() {
            addCriterion("C_FIXED_AREA_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderEqualTo(String value) {
            addCriterion("C_FIXED_AREA_LEADER =", value, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderNotEqualTo(String value) {
            addCriterion("C_FIXED_AREA_LEADER <>", value, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderGreaterThan(String value) {
            addCriterion("C_FIXED_AREA_LEADER >", value, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("C_FIXED_AREA_LEADER >=", value, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderLessThan(String value) {
            addCriterion("C_FIXED_AREA_LEADER <", value, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderLessThanOrEqualTo(String value) {
            addCriterion("C_FIXED_AREA_LEADER <=", value, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderLike(String value) {
            addCriterion("C_FIXED_AREA_LEADER like", value, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderNotLike(String value) {
            addCriterion("C_FIXED_AREA_LEADER not like", value, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderIn(List<String> values) {
            addCriterion("C_FIXED_AREA_LEADER in", values, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderNotIn(List<String> values) {
            addCriterion("C_FIXED_AREA_LEADER not in", values, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderBetween(String value1, String value2) {
            addCriterion("C_FIXED_AREA_LEADER between", value1, value2, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaLeaderNotBetween(String value1, String value2) {
            addCriterion("C_FIXED_AREA_LEADER not between", value1, value2, "cFixedAreaLeader");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameIsNull() {
            addCriterion("C_FIXED_AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameIsNotNull() {
            addCriterion("C_FIXED_AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameEqualTo(String value) {
            addCriterion("C_FIXED_AREA_NAME =", value, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameNotEqualTo(String value) {
            addCriterion("C_FIXED_AREA_NAME <>", value, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameGreaterThan(String value) {
            addCriterion("C_FIXED_AREA_NAME >", value, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_FIXED_AREA_NAME >=", value, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameLessThan(String value) {
            addCriterion("C_FIXED_AREA_NAME <", value, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameLessThanOrEqualTo(String value) {
            addCriterion("C_FIXED_AREA_NAME <=", value, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameLike(String value) {
            addCriterion("C_FIXED_AREA_NAME like", value, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameNotLike(String value) {
            addCriterion("C_FIXED_AREA_NAME not like", value, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameIn(List<String> values) {
            addCriterion("C_FIXED_AREA_NAME in", values, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameNotIn(List<String> values) {
            addCriterion("C_FIXED_AREA_NAME not in", values, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameBetween(String value1, String value2) {
            addCriterion("C_FIXED_AREA_NAME between", value1, value2, "cFixedAreaName");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaNameNotBetween(String value1, String value2) {
            addCriterion("C_FIXED_AREA_NAME not between", value1, value2, "cFixedAreaName");
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

        public Criteria andCTelephoneIsNull() {
            addCriterion("C_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIsNotNull() {
            addCriterion("C_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCTelephoneEqualTo(String value) {
            addCriterion("C_TELEPHONE =", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotEqualTo(String value) {
            addCriterion("C_TELEPHONE <>", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneGreaterThan(String value) {
            addCriterion("C_TELEPHONE >", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("C_TELEPHONE >=", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLessThan(String value) {
            addCriterion("C_TELEPHONE <", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLessThanOrEqualTo(String value) {
            addCriterion("C_TELEPHONE <=", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLike(String value) {
            addCriterion("C_TELEPHONE like", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotLike(String value) {
            addCriterion("C_TELEPHONE not like", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIn(List<String> values) {
            addCriterion("C_TELEPHONE in", values, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotIn(List<String> values) {
            addCriterion("C_TELEPHONE not in", values, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneBetween(String value1, String value2) {
            addCriterion("C_TELEPHONE between", value1, value2, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotBetween(String value1, String value2) {
            addCriterion("C_TELEPHONE not between", value1, value2, "cTelephone");
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