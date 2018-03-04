package com.logistics.module.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TTakeTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTakeTimeExample() {
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

        public Criteria andCNormalDutyTimeIsNull() {
            addCriterion("C_NORMAL_DUTY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeIsNotNull() {
            addCriterion("C_NORMAL_DUTY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeEqualTo(String value) {
            addCriterion("C_NORMAL_DUTY_TIME =", value, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeNotEqualTo(String value) {
            addCriterion("C_NORMAL_DUTY_TIME <>", value, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeGreaterThan(String value) {
            addCriterion("C_NORMAL_DUTY_TIME >", value, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("C_NORMAL_DUTY_TIME >=", value, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeLessThan(String value) {
            addCriterion("C_NORMAL_DUTY_TIME <", value, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeLessThanOrEqualTo(String value) {
            addCriterion("C_NORMAL_DUTY_TIME <=", value, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeLike(String value) {
            addCriterion("C_NORMAL_DUTY_TIME like", value, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeNotLike(String value) {
            addCriterion("C_NORMAL_DUTY_TIME not like", value, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeIn(List<String> values) {
            addCriterion("C_NORMAL_DUTY_TIME in", values, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeNotIn(List<String> values) {
            addCriterion("C_NORMAL_DUTY_TIME not in", values, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeBetween(String value1, String value2) {
            addCriterion("C_NORMAL_DUTY_TIME between", value1, value2, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalDutyTimeNotBetween(String value1, String value2) {
            addCriterion("C_NORMAL_DUTY_TIME not between", value1, value2, "cNormalDutyTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeIsNull() {
            addCriterion("C_NORMAL_WORK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeIsNotNull() {
            addCriterion("C_NORMAL_WORK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeEqualTo(String value) {
            addCriterion("C_NORMAL_WORK_TIME =", value, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeNotEqualTo(String value) {
            addCriterion("C_NORMAL_WORK_TIME <>", value, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeGreaterThan(String value) {
            addCriterion("C_NORMAL_WORK_TIME >", value, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("C_NORMAL_WORK_TIME >=", value, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeLessThan(String value) {
            addCriterion("C_NORMAL_WORK_TIME <", value, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("C_NORMAL_WORK_TIME <=", value, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeLike(String value) {
            addCriterion("C_NORMAL_WORK_TIME like", value, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeNotLike(String value) {
            addCriterion("C_NORMAL_WORK_TIME not like", value, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeIn(List<String> values) {
            addCriterion("C_NORMAL_WORK_TIME in", values, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeNotIn(List<String> values) {
            addCriterion("C_NORMAL_WORK_TIME not in", values, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeBetween(String value1, String value2) {
            addCriterion("C_NORMAL_WORK_TIME between", value1, value2, "cNormalWorkTime");
            return (Criteria) this;
        }

        public Criteria andCNormalWorkTimeNotBetween(String value1, String value2) {
            addCriterion("C_NORMAL_WORK_TIME not between", value1, value2, "cNormalWorkTime");
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

        public Criteria andCSatDutyTimeIsNull() {
            addCriterion("C_SAT_DUTY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeIsNotNull() {
            addCriterion("C_SAT_DUTY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeEqualTo(String value) {
            addCriterion("C_SAT_DUTY_TIME =", value, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeNotEqualTo(String value) {
            addCriterion("C_SAT_DUTY_TIME <>", value, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeGreaterThan(String value) {
            addCriterion("C_SAT_DUTY_TIME >", value, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("C_SAT_DUTY_TIME >=", value, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeLessThan(String value) {
            addCriterion("C_SAT_DUTY_TIME <", value, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeLessThanOrEqualTo(String value) {
            addCriterion("C_SAT_DUTY_TIME <=", value, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeLike(String value) {
            addCriterion("C_SAT_DUTY_TIME like", value, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeNotLike(String value) {
            addCriterion("C_SAT_DUTY_TIME not like", value, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeIn(List<String> values) {
            addCriterion("C_SAT_DUTY_TIME in", values, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeNotIn(List<String> values) {
            addCriterion("C_SAT_DUTY_TIME not in", values, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeBetween(String value1, String value2) {
            addCriterion("C_SAT_DUTY_TIME between", value1, value2, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatDutyTimeNotBetween(String value1, String value2) {
            addCriterion("C_SAT_DUTY_TIME not between", value1, value2, "cSatDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeIsNull() {
            addCriterion("C_SAT_WORK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeIsNotNull() {
            addCriterion("C_SAT_WORK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeEqualTo(String value) {
            addCriterion("C_SAT_WORK_TIME =", value, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeNotEqualTo(String value) {
            addCriterion("C_SAT_WORK_TIME <>", value, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeGreaterThan(String value) {
            addCriterion("C_SAT_WORK_TIME >", value, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("C_SAT_WORK_TIME >=", value, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeLessThan(String value) {
            addCriterion("C_SAT_WORK_TIME <", value, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("C_SAT_WORK_TIME <=", value, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeLike(String value) {
            addCriterion("C_SAT_WORK_TIME like", value, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeNotLike(String value) {
            addCriterion("C_SAT_WORK_TIME not like", value, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeIn(List<String> values) {
            addCriterion("C_SAT_WORK_TIME in", values, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeNotIn(List<String> values) {
            addCriterion("C_SAT_WORK_TIME not in", values, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeBetween(String value1, String value2) {
            addCriterion("C_SAT_WORK_TIME between", value1, value2, "cSatWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSatWorkTimeNotBetween(String value1, String value2) {
            addCriterion("C_SAT_WORK_TIME not between", value1, value2, "cSatWorkTime");
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

        public Criteria andCSunDutyTimeIsNull() {
            addCriterion("C_SUN_DUTY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeIsNotNull() {
            addCriterion("C_SUN_DUTY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeEqualTo(String value) {
            addCriterion("C_SUN_DUTY_TIME =", value, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeNotEqualTo(String value) {
            addCriterion("C_SUN_DUTY_TIME <>", value, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeGreaterThan(String value) {
            addCriterion("C_SUN_DUTY_TIME >", value, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("C_SUN_DUTY_TIME >=", value, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeLessThan(String value) {
            addCriterion("C_SUN_DUTY_TIME <", value, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeLessThanOrEqualTo(String value) {
            addCriterion("C_SUN_DUTY_TIME <=", value, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeLike(String value) {
            addCriterion("C_SUN_DUTY_TIME like", value, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeNotLike(String value) {
            addCriterion("C_SUN_DUTY_TIME not like", value, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeIn(List<String> values) {
            addCriterion("C_SUN_DUTY_TIME in", values, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeNotIn(List<String> values) {
            addCriterion("C_SUN_DUTY_TIME not in", values, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeBetween(String value1, String value2) {
            addCriterion("C_SUN_DUTY_TIME between", value1, value2, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunDutyTimeNotBetween(String value1, String value2) {
            addCriterion("C_SUN_DUTY_TIME not between", value1, value2, "cSunDutyTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeIsNull() {
            addCriterion("C_SUN_WORK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeIsNotNull() {
            addCriterion("C_SUN_WORK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeEqualTo(String value) {
            addCriterion("C_SUN_WORK_TIME =", value, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeNotEqualTo(String value) {
            addCriterion("C_SUN_WORK_TIME <>", value, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeGreaterThan(String value) {
            addCriterion("C_SUN_WORK_TIME >", value, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("C_SUN_WORK_TIME >=", value, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeLessThan(String value) {
            addCriterion("C_SUN_WORK_TIME <", value, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("C_SUN_WORK_TIME <=", value, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeLike(String value) {
            addCriterion("C_SUN_WORK_TIME like", value, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeNotLike(String value) {
            addCriterion("C_SUN_WORK_TIME not like", value, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeIn(List<String> values) {
            addCriterion("C_SUN_WORK_TIME in", values, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeNotIn(List<String> values) {
            addCriterion("C_SUN_WORK_TIME not in", values, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeBetween(String value1, String value2) {
            addCriterion("C_SUN_WORK_TIME between", value1, value2, "cSunWorkTime");
            return (Criteria) this;
        }

        public Criteria andCSunWorkTimeNotBetween(String value1, String value2) {
            addCriterion("C_SUN_WORK_TIME not between", value1, value2, "cSunWorkTime");
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