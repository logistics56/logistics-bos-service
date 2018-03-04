package com.logistics.module.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSubArchiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSubArchiveExample() {
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

        public Criteria andCMnemonicCodeIsNull() {
            addCriterion("C_MNEMONIC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeIsNotNull() {
            addCriterion("C_MNEMONIC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeEqualTo(String value) {
            addCriterion("C_MNEMONIC_CODE =", value, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeNotEqualTo(String value) {
            addCriterion("C_MNEMONIC_CODE <>", value, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeGreaterThan(String value) {
            addCriterion("C_MNEMONIC_CODE >", value, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_MNEMONIC_CODE >=", value, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeLessThan(String value) {
            addCriterion("C_MNEMONIC_CODE <", value, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeLessThanOrEqualTo(String value) {
            addCriterion("C_MNEMONIC_CODE <=", value, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeLike(String value) {
            addCriterion("C_MNEMONIC_CODE like", value, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeNotLike(String value) {
            addCriterion("C_MNEMONIC_CODE not like", value, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeIn(List<String> values) {
            addCriterion("C_MNEMONIC_CODE in", values, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeNotIn(List<String> values) {
            addCriterion("C_MNEMONIC_CODE not in", values, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeBetween(String value1, String value2) {
            addCriterion("C_MNEMONIC_CODE between", value1, value2, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMnemonicCodeNotBetween(String value1, String value2) {
            addCriterion("C_MNEMONIC_CODE not between", value1, value2, "cMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andCMothballedIsNull() {
            addCriterion("C_MOTHBALLED is null");
            return (Criteria) this;
        }

        public Criteria andCMothballedIsNotNull() {
            addCriterion("C_MOTHBALLED is not null");
            return (Criteria) this;
        }

        public Criteria andCMothballedEqualTo(String value) {
            addCriterion("C_MOTHBALLED =", value, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedNotEqualTo(String value) {
            addCriterion("C_MOTHBALLED <>", value, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedGreaterThan(String value) {
            addCriterion("C_MOTHBALLED >", value, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedGreaterThanOrEqualTo(String value) {
            addCriterion("C_MOTHBALLED >=", value, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedLessThan(String value) {
            addCriterion("C_MOTHBALLED <", value, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedLessThanOrEqualTo(String value) {
            addCriterion("C_MOTHBALLED <=", value, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedLike(String value) {
            addCriterion("C_MOTHBALLED like", value, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedNotLike(String value) {
            addCriterion("C_MOTHBALLED not like", value, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedIn(List<String> values) {
            addCriterion("C_MOTHBALLED in", values, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedNotIn(List<String> values) {
            addCriterion("C_MOTHBALLED not in", values, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedBetween(String value1, String value2) {
            addCriterion("C_MOTHBALLED between", value1, value2, "cMothballed");
            return (Criteria) this;
        }

        public Criteria andCMothballedNotBetween(String value1, String value2) {
            addCriterion("C_MOTHBALLED not between", value1, value2, "cMothballed");
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

        public Criteria andCSubArchiveNameIsNull() {
            addCriterion("C_SUB_ARCHIVE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameIsNotNull() {
            addCriterion("C_SUB_ARCHIVE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameEqualTo(String value) {
            addCriterion("C_SUB_ARCHIVE_NAME =", value, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameNotEqualTo(String value) {
            addCriterion("C_SUB_ARCHIVE_NAME <>", value, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameGreaterThan(String value) {
            addCriterion("C_SUB_ARCHIVE_NAME >", value, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_SUB_ARCHIVE_NAME >=", value, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameLessThan(String value) {
            addCriterion("C_SUB_ARCHIVE_NAME <", value, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameLessThanOrEqualTo(String value) {
            addCriterion("C_SUB_ARCHIVE_NAME <=", value, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameLike(String value) {
            addCriterion("C_SUB_ARCHIVE_NAME like", value, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameNotLike(String value) {
            addCriterion("C_SUB_ARCHIVE_NAME not like", value, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameIn(List<String> values) {
            addCriterion("C_SUB_ARCHIVE_NAME in", values, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameNotIn(List<String> values) {
            addCriterion("C_SUB_ARCHIVE_NAME not in", values, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameBetween(String value1, String value2) {
            addCriterion("C_SUB_ARCHIVE_NAME between", value1, value2, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCSubArchiveNameNotBetween(String value1, String value2) {
            addCriterion("C_SUB_ARCHIVE_NAME not between", value1, value2, "cSubArchiveName");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdIsNull() {
            addCriterion("C_ARCHIVE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdIsNotNull() {
            addCriterion("C_ARCHIVE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdEqualTo(Integer value) {
            addCriterion("C_ARCHIVE_ID =", value, "cArchiveId");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdNotEqualTo(Integer value) {
            addCriterion("C_ARCHIVE_ID <>", value, "cArchiveId");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdGreaterThan(Integer value) {
            addCriterion("C_ARCHIVE_ID >", value, "cArchiveId");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ARCHIVE_ID >=", value, "cArchiveId");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdLessThan(Integer value) {
            addCriterion("C_ARCHIVE_ID <", value, "cArchiveId");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ARCHIVE_ID <=", value, "cArchiveId");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdIn(List<Integer> values) {
            addCriterion("C_ARCHIVE_ID in", values, "cArchiveId");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdNotIn(List<Integer> values) {
            addCriterion("C_ARCHIVE_ID not in", values, "cArchiveId");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ARCHIVE_ID between", value1, value2, "cArchiveId");
            return (Criteria) this;
        }

        public Criteria andCArchiveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ARCHIVE_ID not between", value1, value2, "cArchiveId");
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