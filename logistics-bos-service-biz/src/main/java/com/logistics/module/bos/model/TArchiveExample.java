package com.logistics.module.bos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TArchiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TArchiveExample() {
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

        public Criteria andCArchiveNameIsNull() {
            addCriterion("C_ARCHIVE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameIsNotNull() {
            addCriterion("C_ARCHIVE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameEqualTo(String value) {
            addCriterion("C_ARCHIVE_NAME =", value, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameNotEqualTo(String value) {
            addCriterion("C_ARCHIVE_NAME <>", value, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameGreaterThan(String value) {
            addCriterion("C_ARCHIVE_NAME >", value, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ARCHIVE_NAME >=", value, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameLessThan(String value) {
            addCriterion("C_ARCHIVE_NAME <", value, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameLessThanOrEqualTo(String value) {
            addCriterion("C_ARCHIVE_NAME <=", value, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameLike(String value) {
            addCriterion("C_ARCHIVE_NAME like", value, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameNotLike(String value) {
            addCriterion("C_ARCHIVE_NAME not like", value, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameIn(List<String> values) {
            addCriterion("C_ARCHIVE_NAME in", values, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameNotIn(List<String> values) {
            addCriterion("C_ARCHIVE_NAME not in", values, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameBetween(String value1, String value2) {
            addCriterion("C_ARCHIVE_NAME between", value1, value2, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNameNotBetween(String value1, String value2) {
            addCriterion("C_ARCHIVE_NAME not between", value1, value2, "cArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumIsNull() {
            addCriterion("C_ARCHIVE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumIsNotNull() {
            addCriterion("C_ARCHIVE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumEqualTo(String value) {
            addCriterion("C_ARCHIVE_NUM =", value, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumNotEqualTo(String value) {
            addCriterion("C_ARCHIVE_NUM <>", value, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumGreaterThan(String value) {
            addCriterion("C_ARCHIVE_NUM >", value, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_ARCHIVE_NUM >=", value, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumLessThan(String value) {
            addCriterion("C_ARCHIVE_NUM <", value, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumLessThanOrEqualTo(String value) {
            addCriterion("C_ARCHIVE_NUM <=", value, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumLike(String value) {
            addCriterion("C_ARCHIVE_NUM like", value, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumNotLike(String value) {
            addCriterion("C_ARCHIVE_NUM not like", value, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumIn(List<String> values) {
            addCriterion("C_ARCHIVE_NUM in", values, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumNotIn(List<String> values) {
            addCriterion("C_ARCHIVE_NUM not in", values, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumBetween(String value1, String value2) {
            addCriterion("C_ARCHIVE_NUM between", value1, value2, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCArchiveNumNotBetween(String value1, String value2) {
            addCriterion("C_ARCHIVE_NUM not between", value1, value2, "cArchiveNum");
            return (Criteria) this;
        }

        public Criteria andCHaschildIsNull() {
            addCriterion("C_HASCHILD is null");
            return (Criteria) this;
        }

        public Criteria andCHaschildIsNotNull() {
            addCriterion("C_HASCHILD is not null");
            return (Criteria) this;
        }

        public Criteria andCHaschildEqualTo(Integer value) {
            addCriterion("C_HASCHILD =", value, "cHaschild");
            return (Criteria) this;
        }

        public Criteria andCHaschildNotEqualTo(Integer value) {
            addCriterion("C_HASCHILD <>", value, "cHaschild");
            return (Criteria) this;
        }

        public Criteria andCHaschildGreaterThan(Integer value) {
            addCriterion("C_HASCHILD >", value, "cHaschild");
            return (Criteria) this;
        }

        public Criteria andCHaschildGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_HASCHILD >=", value, "cHaschild");
            return (Criteria) this;
        }

        public Criteria andCHaschildLessThan(Integer value) {
            addCriterion("C_HASCHILD <", value, "cHaschild");
            return (Criteria) this;
        }

        public Criteria andCHaschildLessThanOrEqualTo(Integer value) {
            addCriterion("C_HASCHILD <=", value, "cHaschild");
            return (Criteria) this;
        }

        public Criteria andCHaschildIn(List<Integer> values) {
            addCriterion("C_HASCHILD in", values, "cHaschild");
            return (Criteria) this;
        }

        public Criteria andCHaschildNotIn(List<Integer> values) {
            addCriterion("C_HASCHILD not in", values, "cHaschild");
            return (Criteria) this;
        }

        public Criteria andCHaschildBetween(Integer value1, Integer value2) {
            addCriterion("C_HASCHILD between", value1, value2, "cHaschild");
            return (Criteria) this;
        }

        public Criteria andCHaschildNotBetween(Integer value1, Integer value2) {
            addCriterion("C_HASCHILD not between", value1, value2, "cHaschild");
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