package com.logistics.module.crm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSmsSignupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSmsSignupExample() {
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

        public Criteria andCCheckcodeIsNull() {
            addCriterion("C_CHECKCODE is null");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeIsNotNull() {
            addCriterion("C_CHECKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeEqualTo(String value) {
            addCriterion("C_CHECKCODE =", value, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeNotEqualTo(String value) {
            addCriterion("C_CHECKCODE <>", value, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeGreaterThan(String value) {
            addCriterion("C_CHECKCODE >", value, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHECKCODE >=", value, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeLessThan(String value) {
            addCriterion("C_CHECKCODE <", value, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeLessThanOrEqualTo(String value) {
            addCriterion("C_CHECKCODE <=", value, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeLike(String value) {
            addCriterion("C_CHECKCODE like", value, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeNotLike(String value) {
            addCriterion("C_CHECKCODE not like", value, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeIn(List<String> values) {
            addCriterion("C_CHECKCODE in", values, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeNotIn(List<String> values) {
            addCriterion("C_CHECKCODE not in", values, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeBetween(String value1, String value2) {
            addCriterion("C_CHECKCODE between", value1, value2, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCCheckcodeNotBetween(String value1, String value2) {
            addCriterion("C_CHECKCODE not between", value1, value2, "cCheckcode");
            return (Criteria) this;
        }

        public Criteria andCSourceIsNull() {
            addCriterion("C_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andCSourceIsNotNull() {
            addCriterion("C_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andCSourceEqualTo(Integer value) {
            addCriterion("C_SOURCE =", value, "cSource");
            return (Criteria) this;
        }

        public Criteria andCSourceNotEqualTo(Integer value) {
            addCriterion("C_SOURCE <>", value, "cSource");
            return (Criteria) this;
        }

        public Criteria andCSourceGreaterThan(Integer value) {
            addCriterion("C_SOURCE >", value, "cSource");
            return (Criteria) this;
        }

        public Criteria andCSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_SOURCE >=", value, "cSource");
            return (Criteria) this;
        }

        public Criteria andCSourceLessThan(Integer value) {
            addCriterion("C_SOURCE <", value, "cSource");
            return (Criteria) this;
        }

        public Criteria andCSourceLessThanOrEqualTo(Integer value) {
            addCriterion("C_SOURCE <=", value, "cSource");
            return (Criteria) this;
        }

        public Criteria andCSourceIn(List<Integer> values) {
            addCriterion("C_SOURCE in", values, "cSource");
            return (Criteria) this;
        }

        public Criteria andCSourceNotIn(List<Integer> values) {
            addCriterion("C_SOURCE not in", values, "cSource");
            return (Criteria) this;
        }

        public Criteria andCSourceBetween(Integer value1, Integer value2) {
            addCriterion("C_SOURCE between", value1, value2, "cSource");
            return (Criteria) this;
        }

        public Criteria andCSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("C_SOURCE not between", value1, value2, "cSource");
            return (Criteria) this;
        }

        public Criteria andCUsernameIsNull() {
            addCriterion("C_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCUsernameIsNotNull() {
            addCriterion("C_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCUsernameEqualTo(String value) {
            addCriterion("C_USERNAME =", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotEqualTo(String value) {
            addCriterion("C_USERNAME <>", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThan(String value) {
            addCriterion("C_USERNAME >", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("C_USERNAME >=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThan(String value) {
            addCriterion("C_USERNAME <", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThanOrEqualTo(String value) {
            addCriterion("C_USERNAME <=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLike(String value) {
            addCriterion("C_USERNAME like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotLike(String value) {
            addCriterion("C_USERNAME not like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameIn(List<String> values) {
            addCriterion("C_USERNAME in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotIn(List<String> values) {
            addCriterion("C_USERNAME not in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameBetween(String value1, String value2) {
            addCriterion("C_USERNAME between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotBetween(String value1, String value2) {
            addCriterion("C_USERNAME not between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIsNull() {
            addCriterion("C_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIsNotNull() {
            addCriterion("C_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeEqualTo(Date value) {
            addCriterion("C_CREATETIME =", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotEqualTo(Date value) {
            addCriterion("C_CREATETIME <>", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeGreaterThan(Date value) {
            addCriterion("C_CREATETIME >", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_CREATETIME >=", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLessThan(Date value) {
            addCriterion("C_CREATETIME <", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("C_CREATETIME <=", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIn(List<Date> values) {
            addCriterion("C_CREATETIME in", values, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotIn(List<Date> values) {
            addCriterion("C_CREATETIME not in", values, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeBetween(Date value1, Date value2) {
            addCriterion("C_CREATETIME between", value1, value2, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("C_CREATETIME not between", value1, value2, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeIsNull() {
            addCriterion("C_UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeIsNotNull() {
            addCriterion("C_UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeEqualTo(Date value) {
            addCriterion("C_UPDATETIME =", value, "cUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeNotEqualTo(Date value) {
            addCriterion("C_UPDATETIME <>", value, "cUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeGreaterThan(Date value) {
            addCriterion("C_UPDATETIME >", value, "cUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_UPDATETIME >=", value, "cUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeLessThan(Date value) {
            addCriterion("C_UPDATETIME <", value, "cUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("C_UPDATETIME <=", value, "cUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeIn(List<Date> values) {
            addCriterion("C_UPDATETIME in", values, "cUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeNotIn(List<Date> values) {
            addCriterion("C_UPDATETIME not in", values, "cUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("C_UPDATETIME between", value1, value2, "cUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("C_UPDATETIME not between", value1, value2, "cUpdatetime");
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