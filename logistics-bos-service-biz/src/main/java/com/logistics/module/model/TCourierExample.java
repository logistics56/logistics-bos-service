package com.logistics.module.model;

import java.util.ArrayList;
import java.util.List;

public class TCourierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCourierExample() {
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

        public Criteria andCCheckPwdIsNull() {
            addCriterion("C_CHECK_PWD is null");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdIsNotNull() {
            addCriterion("C_CHECK_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdEqualTo(String value) {
            addCriterion("C_CHECK_PWD =", value, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdNotEqualTo(String value) {
            addCriterion("C_CHECK_PWD <>", value, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdGreaterThan(String value) {
            addCriterion("C_CHECK_PWD >", value, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHECK_PWD >=", value, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdLessThan(String value) {
            addCriterion("C_CHECK_PWD <", value, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdLessThanOrEqualTo(String value) {
            addCriterion("C_CHECK_PWD <=", value, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdLike(String value) {
            addCriterion("C_CHECK_PWD like", value, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdNotLike(String value) {
            addCriterion("C_CHECK_PWD not like", value, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdIn(List<String> values) {
            addCriterion("C_CHECK_PWD in", values, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdNotIn(List<String> values) {
            addCriterion("C_CHECK_PWD not in", values, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdBetween(String value1, String value2) {
            addCriterion("C_CHECK_PWD between", value1, value2, "cCheckPwd");
            return (Criteria) this;
        }

        public Criteria andCCheckPwdNotBetween(String value1, String value2) {
            addCriterion("C_CHECK_PWD not between", value1, value2, "cCheckPwd");
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

        public Criteria andCDeltagIsNull() {
            addCriterion("C_DELTAG is null");
            return (Criteria) this;
        }

        public Criteria andCDeltagIsNotNull() {
            addCriterion("C_DELTAG is not null");
            return (Criteria) this;
        }

        public Criteria andCDeltagEqualTo(String value) {
            addCriterion("C_DELTAG =", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagNotEqualTo(String value) {
            addCriterion("C_DELTAG <>", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagGreaterThan(String value) {
            addCriterion("C_DELTAG >", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagGreaterThanOrEqualTo(String value) {
            addCriterion("C_DELTAG >=", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagLessThan(String value) {
            addCriterion("C_DELTAG <", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagLessThanOrEqualTo(String value) {
            addCriterion("C_DELTAG <=", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagLike(String value) {
            addCriterion("C_DELTAG like", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagNotLike(String value) {
            addCriterion("C_DELTAG not like", value, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagIn(List<String> values) {
            addCriterion("C_DELTAG in", values, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagNotIn(List<String> values) {
            addCriterion("C_DELTAG not in", values, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagBetween(String value1, String value2) {
            addCriterion("C_DELTAG between", value1, value2, "cDeltag");
            return (Criteria) this;
        }

        public Criteria andCDeltagNotBetween(String value1, String value2) {
            addCriterion("C_DELTAG not between", value1, value2, "cDeltag");
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

        public Criteria andCPdaIsNull() {
            addCriterion("C_PDA is null");
            return (Criteria) this;
        }

        public Criteria andCPdaIsNotNull() {
            addCriterion("C_PDA is not null");
            return (Criteria) this;
        }

        public Criteria andCPdaEqualTo(String value) {
            addCriterion("C_PDA =", value, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaNotEqualTo(String value) {
            addCriterion("C_PDA <>", value, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaGreaterThan(String value) {
            addCriterion("C_PDA >", value, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaGreaterThanOrEqualTo(String value) {
            addCriterion("C_PDA >=", value, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaLessThan(String value) {
            addCriterion("C_PDA <", value, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaLessThanOrEqualTo(String value) {
            addCriterion("C_PDA <=", value, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaLike(String value) {
            addCriterion("C_PDA like", value, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaNotLike(String value) {
            addCriterion("C_PDA not like", value, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaIn(List<String> values) {
            addCriterion("C_PDA in", values, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaNotIn(List<String> values) {
            addCriterion("C_PDA not in", values, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaBetween(String value1, String value2) {
            addCriterion("C_PDA between", value1, value2, "cPda");
            return (Criteria) this;
        }

        public Criteria andCPdaNotBetween(String value1, String value2) {
            addCriterion("C_PDA not between", value1, value2, "cPda");
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

        public Criteria andCTypeEqualTo(String value) {
            addCriterion("C_TYPE =", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotEqualTo(String value) {
            addCriterion("C_TYPE <>", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThan(String value) {
            addCriterion("C_TYPE >", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_TYPE >=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThan(String value) {
            addCriterion("C_TYPE <", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThanOrEqualTo(String value) {
            addCriterion("C_TYPE <=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLike(String value) {
            addCriterion("C_TYPE like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotLike(String value) {
            addCriterion("C_TYPE not like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeIn(List<String> values) {
            addCriterion("C_TYPE in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotIn(List<String> values) {
            addCriterion("C_TYPE not in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeBetween(String value1, String value2) {
            addCriterion("C_TYPE between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotBetween(String value1, String value2) {
            addCriterion("C_TYPE not between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumIsNull() {
            addCriterion("C_VEHICLE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumIsNotNull() {
            addCriterion("C_VEHICLE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumEqualTo(String value) {
            addCriterion("C_VEHICLE_NUM =", value, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumNotEqualTo(String value) {
            addCriterion("C_VEHICLE_NUM <>", value, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumGreaterThan(String value) {
            addCriterion("C_VEHICLE_NUM >", value, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_VEHICLE_NUM >=", value, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumLessThan(String value) {
            addCriterion("C_VEHICLE_NUM <", value, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumLessThanOrEqualTo(String value) {
            addCriterion("C_VEHICLE_NUM <=", value, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumLike(String value) {
            addCriterion("C_VEHICLE_NUM like", value, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumNotLike(String value) {
            addCriterion("C_VEHICLE_NUM not like", value, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumIn(List<String> values) {
            addCriterion("C_VEHICLE_NUM in", values, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumNotIn(List<String> values) {
            addCriterion("C_VEHICLE_NUM not in", values, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumBetween(String value1, String value2) {
            addCriterion("C_VEHICLE_NUM between", value1, value2, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleNumNotBetween(String value1, String value2) {
            addCriterion("C_VEHICLE_NUM not between", value1, value2, "cVehicleNum");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeIsNull() {
            addCriterion("C_VEHICLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeIsNotNull() {
            addCriterion("C_VEHICLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeEqualTo(String value) {
            addCriterion("C_VEHICLE_TYPE =", value, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeNotEqualTo(String value) {
            addCriterion("C_VEHICLE_TYPE <>", value, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeGreaterThan(String value) {
            addCriterion("C_VEHICLE_TYPE >", value, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_VEHICLE_TYPE >=", value, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeLessThan(String value) {
            addCriterion("C_VEHICLE_TYPE <", value, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeLessThanOrEqualTo(String value) {
            addCriterion("C_VEHICLE_TYPE <=", value, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeLike(String value) {
            addCriterion("C_VEHICLE_TYPE like", value, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeNotLike(String value) {
            addCriterion("C_VEHICLE_TYPE not like", value, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeIn(List<String> values) {
            addCriterion("C_VEHICLE_TYPE in", values, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeNotIn(List<String> values) {
            addCriterion("C_VEHICLE_TYPE not in", values, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeBetween(String value1, String value2) {
            addCriterion("C_VEHICLE_TYPE between", value1, value2, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCVehicleTypeNotBetween(String value1, String value2) {
            addCriterion("C_VEHICLE_TYPE not between", value1, value2, "cVehicleType");
            return (Criteria) this;
        }

        public Criteria andCStandardIdIsNull() {
            addCriterion("C_STANDARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStandardIdIsNotNull() {
            addCriterion("C_STANDARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStandardIdEqualTo(Integer value) {
            addCriterion("C_STANDARD_ID =", value, "cStandardId");
            return (Criteria) this;
        }

        public Criteria andCStandardIdNotEqualTo(Integer value) {
            addCriterion("C_STANDARD_ID <>", value, "cStandardId");
            return (Criteria) this;
        }

        public Criteria andCStandardIdGreaterThan(Integer value) {
            addCriterion("C_STANDARD_ID >", value, "cStandardId");
            return (Criteria) this;
        }

        public Criteria andCStandardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_STANDARD_ID >=", value, "cStandardId");
            return (Criteria) this;
        }

        public Criteria andCStandardIdLessThan(Integer value) {
            addCriterion("C_STANDARD_ID <", value, "cStandardId");
            return (Criteria) this;
        }

        public Criteria andCStandardIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_STANDARD_ID <=", value, "cStandardId");
            return (Criteria) this;
        }

        public Criteria andCStandardIdIn(List<Integer> values) {
            addCriterion("C_STANDARD_ID in", values, "cStandardId");
            return (Criteria) this;
        }

        public Criteria andCStandardIdNotIn(List<Integer> values) {
            addCriterion("C_STANDARD_ID not in", values, "cStandardId");
            return (Criteria) this;
        }

        public Criteria andCStandardIdBetween(Integer value1, Integer value2) {
            addCriterion("C_STANDARD_ID between", value1, value2, "cStandardId");
            return (Criteria) this;
        }

        public Criteria andCStandardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_STANDARD_ID not between", value1, value2, "cStandardId");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdIsNull() {
            addCriterion("C_TAKETIME_ID is null");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdIsNotNull() {
            addCriterion("C_TAKETIME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdEqualTo(Integer value) {
            addCriterion("C_TAKETIME_ID =", value, "cTaketimeId");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdNotEqualTo(Integer value) {
            addCriterion("C_TAKETIME_ID <>", value, "cTaketimeId");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdGreaterThan(Integer value) {
            addCriterion("C_TAKETIME_ID >", value, "cTaketimeId");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_TAKETIME_ID >=", value, "cTaketimeId");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdLessThan(Integer value) {
            addCriterion("C_TAKETIME_ID <", value, "cTaketimeId");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_TAKETIME_ID <=", value, "cTaketimeId");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdIn(List<Integer> values) {
            addCriterion("C_TAKETIME_ID in", values, "cTaketimeId");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdNotIn(List<Integer> values) {
            addCriterion("C_TAKETIME_ID not in", values, "cTaketimeId");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdBetween(Integer value1, Integer value2) {
            addCriterion("C_TAKETIME_ID between", value1, value2, "cTaketimeId");
            return (Criteria) this;
        }

        public Criteria andCTaketimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_TAKETIME_ID not between", value1, value2, "cTaketimeId");
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