package com.logistics.module.crm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomerExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCBrithdayIsNull() {
            addCriterion("C_BRITHDAY is null");
            return (Criteria) this;
        }

        public Criteria andCBrithdayIsNotNull() {
            addCriterion("C_BRITHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andCBrithdayEqualTo(Date value) {
            addCriterionForJDBCDate("C_BRITHDAY =", value, "cBrithday");
            return (Criteria) this;
        }

        public Criteria andCBrithdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_BRITHDAY <>", value, "cBrithday");
            return (Criteria) this;
        }

        public Criteria andCBrithdayGreaterThan(Date value) {
            addCriterionForJDBCDate("C_BRITHDAY >", value, "cBrithday");
            return (Criteria) this;
        }

        public Criteria andCBrithdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_BRITHDAY >=", value, "cBrithday");
            return (Criteria) this;
        }

        public Criteria andCBrithdayLessThan(Date value) {
            addCriterionForJDBCDate("C_BRITHDAY <", value, "cBrithday");
            return (Criteria) this;
        }

        public Criteria andCBrithdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_BRITHDAY <=", value, "cBrithday");
            return (Criteria) this;
        }

        public Criteria andCBrithdayIn(List<Date> values) {
            addCriterionForJDBCDate("C_BRITHDAY in", values, "cBrithday");
            return (Criteria) this;
        }

        public Criteria andCBrithdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_BRITHDAY not in", values, "cBrithday");
            return (Criteria) this;
        }

        public Criteria andCBrithdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_BRITHDAY between", value1, value2, "cBrithday");
            return (Criteria) this;
        }

        public Criteria andCBrithdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_BRITHDAY not between", value1, value2, "cBrithday");
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

        public Criteria andCDepartmentIsNull() {
            addCriterion("C_DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIsNotNull() {
            addCriterion("C_DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCDepartmentEqualTo(String value) {
            addCriterion("C_DEPARTMENT =", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentNotEqualTo(String value) {
            addCriterion("C_DEPARTMENT <>", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentGreaterThan(String value) {
            addCriterion("C_DEPARTMENT >", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("C_DEPARTMENT >=", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentLessThan(String value) {
            addCriterion("C_DEPARTMENT <", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentLessThanOrEqualTo(String value) {
            addCriterion("C_DEPARTMENT <=", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentLike(String value) {
            addCriterion("C_DEPARTMENT like", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentNotLike(String value) {
            addCriterion("C_DEPARTMENT not like", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIn(List<String> values) {
            addCriterion("C_DEPARTMENT in", values, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentNotIn(List<String> values) {
            addCriterion("C_DEPARTMENT not in", values, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentBetween(String value1, String value2) {
            addCriterion("C_DEPARTMENT between", value1, value2, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentNotBetween(String value1, String value2) {
            addCriterion("C_DEPARTMENT not between", value1, value2, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNull() {
            addCriterion("C_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNotNull() {
            addCriterion("C_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCEmailEqualTo(String value) {
            addCriterion("C_EMAIL =", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotEqualTo(String value) {
            addCriterion("C_EMAIL <>", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThan(String value) {
            addCriterion("C_EMAIL >", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThanOrEqualTo(String value) {
            addCriterion("C_EMAIL >=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThan(String value) {
            addCriterion("C_EMAIL <", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThanOrEqualTo(String value) {
            addCriterion("C_EMAIL <=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLike(String value) {
            addCriterion("C_EMAIL like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotLike(String value) {
            addCriterion("C_EMAIL not like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailIn(List<String> values) {
            addCriterion("C_EMAIL in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotIn(List<String> values) {
            addCriterion("C_EMAIL not in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailBetween(String value1, String value2) {
            addCriterion("C_EMAIL between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotBetween(String value1, String value2) {
            addCriterion("C_EMAIL not between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdIsNull() {
            addCriterion("C_Fixed_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdIsNotNull() {
            addCriterion("C_Fixed_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdEqualTo(String value) {
            addCriterion("C_Fixed_AREA_ID =", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdNotEqualTo(String value) {
            addCriterion("C_Fixed_AREA_ID <>", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdGreaterThan(String value) {
            addCriterion("C_Fixed_AREA_ID >", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_Fixed_AREA_ID >=", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdLessThan(String value) {
            addCriterion("C_Fixed_AREA_ID <", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdLessThanOrEqualTo(String value) {
            addCriterion("C_Fixed_AREA_ID <=", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdLike(String value) {
            addCriterion("C_Fixed_AREA_ID like", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdNotLike(String value) {
            addCriterion("C_Fixed_AREA_ID not like", value, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdIn(List<String> values) {
            addCriterion("C_Fixed_AREA_ID in", values, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdNotIn(List<String> values) {
            addCriterion("C_Fixed_AREA_ID not in", values, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdBetween(String value1, String value2) {
            addCriterion("C_Fixed_AREA_ID between", value1, value2, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedAreaIdNotBetween(String value1, String value2) {
            addCriterion("C_Fixed_AREA_ID not between", value1, value2, "cFixedAreaId");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneIsNull() {
            addCriterion("C_MOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneIsNotNull() {
            addCriterion("C_MOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneEqualTo(String value) {
            addCriterion("C_MOBILEPHONE =", value, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneNotEqualTo(String value) {
            addCriterion("C_MOBILEPHONE <>", value, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneGreaterThan(String value) {
            addCriterion("C_MOBILEPHONE >", value, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("C_MOBILEPHONE >=", value, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneLessThan(String value) {
            addCriterion("C_MOBILEPHONE <", value, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("C_MOBILEPHONE <=", value, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneLike(String value) {
            addCriterion("C_MOBILEPHONE like", value, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneNotLike(String value) {
            addCriterion("C_MOBILEPHONE not like", value, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneIn(List<String> values) {
            addCriterion("C_MOBILEPHONE in", values, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneNotIn(List<String> values) {
            addCriterion("C_MOBILEPHONE not in", values, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneBetween(String value1, String value2) {
            addCriterion("C_MOBILEPHONE between", value1, value2, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCMobilephoneNotBetween(String value1, String value2) {
            addCriterion("C_MOBILEPHONE not between", value1, value2, "cMobilephone");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNull() {
            addCriterion("C_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNotNull() {
            addCriterion("C_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCPasswordEqualTo(String value) {
            addCriterion("C_PASSWORD =", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotEqualTo(String value) {
            addCriterion("C_PASSWORD <>", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThan(String value) {
            addCriterion("C_PASSWORD >", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("C_PASSWORD >=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThan(String value) {
            addCriterion("C_PASSWORD <", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThanOrEqualTo(String value) {
            addCriterion("C_PASSWORD <=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLike(String value) {
            addCriterion("C_PASSWORD like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotLike(String value) {
            addCriterion("C_PASSWORD not like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordIn(List<String> values) {
            addCriterion("C_PASSWORD in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotIn(List<String> values) {
            addCriterion("C_PASSWORD not in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordBetween(String value1, String value2) {
            addCriterion("C_PASSWORD between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotBetween(String value1, String value2) {
            addCriterion("C_PASSWORD not between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPositionIsNull() {
            addCriterion("C_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andCPositionIsNotNull() {
            addCriterion("C_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andCPositionEqualTo(String value) {
            addCriterion("C_POSITION =", value, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionNotEqualTo(String value) {
            addCriterion("C_POSITION <>", value, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionGreaterThan(String value) {
            addCriterion("C_POSITION >", value, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionGreaterThanOrEqualTo(String value) {
            addCriterion("C_POSITION >=", value, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionLessThan(String value) {
            addCriterion("C_POSITION <", value, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionLessThanOrEqualTo(String value) {
            addCriterion("C_POSITION <=", value, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionLike(String value) {
            addCriterion("C_POSITION like", value, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionNotLike(String value) {
            addCriterion("C_POSITION not like", value, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionIn(List<String> values) {
            addCriterion("C_POSITION in", values, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionNotIn(List<String> values) {
            addCriterion("C_POSITION not in", values, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionBetween(String value1, String value2) {
            addCriterion("C_POSITION between", value1, value2, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCPositionNotBetween(String value1, String value2) {
            addCriterion("C_POSITION not between", value1, value2, "cPosition");
            return (Criteria) this;
        }

        public Criteria andCSexIsNull() {
            addCriterion("C_SEX is null");
            return (Criteria) this;
        }

        public Criteria andCSexIsNotNull() {
            addCriterion("C_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andCSexEqualTo(Integer value) {
            addCriterion("C_SEX =", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotEqualTo(Integer value) {
            addCriterion("C_SEX <>", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThan(Integer value) {
            addCriterion("C_SEX >", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_SEX >=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThan(Integer value) {
            addCriterion("C_SEX <", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThanOrEqualTo(Integer value) {
            addCriterion("C_SEX <=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexIn(List<Integer> values) {
            addCriterion("C_SEX in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotIn(List<Integer> values) {
            addCriterion("C_SEX not in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexBetween(Integer value1, Integer value2) {
            addCriterion("C_SEX between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotBetween(Integer value1, Integer value2) {
            addCriterion("C_SEX not between", value1, value2, "cSex");
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

        public Criteria andCTypeIsNull() {
            addCriterion("C_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNotNull() {
            addCriterion("C_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeEqualTo(Integer value) {
            addCriterion("C_TYPE =", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotEqualTo(Integer value) {
            addCriterion("C_TYPE <>", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThan(Integer value) {
            addCriterion("C_TYPE >", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_TYPE >=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThan(Integer value) {
            addCriterion("C_TYPE <", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThanOrEqualTo(Integer value) {
            addCriterion("C_TYPE <=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeIn(List<Integer> values) {
            addCriterion("C_TYPE in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotIn(List<Integer> values) {
            addCriterion("C_TYPE not in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeBetween(Integer value1, Integer value2) {
            addCriterion("C_TYPE between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("C_TYPE not between", value1, value2, "cType");
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

        public Criteria andCImgIsNull() {
            addCriterion("C_IMG is null");
            return (Criteria) this;
        }

        public Criteria andCImgIsNotNull() {
            addCriterion("C_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andCImgEqualTo(String value) {
            addCriterion("C_IMG =", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgNotEqualTo(String value) {
            addCriterion("C_IMG <>", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgGreaterThan(String value) {
            addCriterion("C_IMG >", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgGreaterThanOrEqualTo(String value) {
            addCriterion("C_IMG >=", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgLessThan(String value) {
            addCriterion("C_IMG <", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgLessThanOrEqualTo(String value) {
            addCriterion("C_IMG <=", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgLike(String value) {
            addCriterion("C_IMG like", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgNotLike(String value) {
            addCriterion("C_IMG not like", value, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgIn(List<String> values) {
            addCriterion("C_IMG in", values, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgNotIn(List<String> values) {
            addCriterion("C_IMG not in", values, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgBetween(String value1, String value2) {
            addCriterion("C_IMG between", value1, value2, "cImg");
            return (Criteria) this;
        }

        public Criteria andCImgNotBetween(String value1, String value2) {
            addCriterion("C_IMG not between", value1, value2, "cImg");
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