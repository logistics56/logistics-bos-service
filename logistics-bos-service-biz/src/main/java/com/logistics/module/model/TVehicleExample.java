package com.logistics.module.model;

import java.util.ArrayList;
import java.util.List;

public class TVehicleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TVehicleExample() {
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

        public Criteria andCDriverIsNull() {
            addCriterion("C_DRIVER is null");
            return (Criteria) this;
        }

        public Criteria andCDriverIsNotNull() {
            addCriterion("C_DRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andCDriverEqualTo(String value) {
            addCriterion("C_DRIVER =", value, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverNotEqualTo(String value) {
            addCriterion("C_DRIVER <>", value, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverGreaterThan(String value) {
            addCriterion("C_DRIVER >", value, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverGreaterThanOrEqualTo(String value) {
            addCriterion("C_DRIVER >=", value, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverLessThan(String value) {
            addCriterion("C_DRIVER <", value, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverLessThanOrEqualTo(String value) {
            addCriterion("C_DRIVER <=", value, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverLike(String value) {
            addCriterion("C_DRIVER like", value, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverNotLike(String value) {
            addCriterion("C_DRIVER not like", value, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverIn(List<String> values) {
            addCriterion("C_DRIVER in", values, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverNotIn(List<String> values) {
            addCriterion("C_DRIVER not in", values, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverBetween(String value1, String value2) {
            addCriterion("C_DRIVER between", value1, value2, "cDriver");
            return (Criteria) this;
        }

        public Criteria andCDriverNotBetween(String value1, String value2) {
            addCriterion("C_DRIVER not between", value1, value2, "cDriver");
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

        public Criteria andCRouteNameIsNull() {
            addCriterion("C_ROUTE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCRouteNameIsNotNull() {
            addCriterion("C_ROUTE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCRouteNameEqualTo(String value) {
            addCriterion("C_ROUTE_NAME =", value, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameNotEqualTo(String value) {
            addCriterion("C_ROUTE_NAME <>", value, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameGreaterThan(String value) {
            addCriterion("C_ROUTE_NAME >", value, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ROUTE_NAME >=", value, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameLessThan(String value) {
            addCriterion("C_ROUTE_NAME <", value, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameLessThanOrEqualTo(String value) {
            addCriterion("C_ROUTE_NAME <=", value, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameLike(String value) {
            addCriterion("C_ROUTE_NAME like", value, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameNotLike(String value) {
            addCriterion("C_ROUTE_NAME not like", value, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameIn(List<String> values) {
            addCriterion("C_ROUTE_NAME in", values, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameNotIn(List<String> values) {
            addCriterion("C_ROUTE_NAME not in", values, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameBetween(String value1, String value2) {
            addCriterion("C_ROUTE_NAME between", value1, value2, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteNameNotBetween(String value1, String value2) {
            addCriterion("C_ROUTE_NAME not between", value1, value2, "cRouteName");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeIsNull() {
            addCriterion("C_ROUTE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeIsNotNull() {
            addCriterion("C_ROUTE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeEqualTo(String value) {
            addCriterion("C_ROUTE_TYPE =", value, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeNotEqualTo(String value) {
            addCriterion("C_ROUTE_TYPE <>", value, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeGreaterThan(String value) {
            addCriterion("C_ROUTE_TYPE >", value, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_ROUTE_TYPE >=", value, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeLessThan(String value) {
            addCriterion("C_ROUTE_TYPE <", value, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeLessThanOrEqualTo(String value) {
            addCriterion("C_ROUTE_TYPE <=", value, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeLike(String value) {
            addCriterion("C_ROUTE_TYPE like", value, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeNotLike(String value) {
            addCriterion("C_ROUTE_TYPE not like", value, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeIn(List<String> values) {
            addCriterion("C_ROUTE_TYPE in", values, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeNotIn(List<String> values) {
            addCriterion("C_ROUTE_TYPE not in", values, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeBetween(String value1, String value2) {
            addCriterion("C_ROUTE_TYPE between", value1, value2, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCRouteTypeNotBetween(String value1, String value2) {
            addCriterion("C_ROUTE_TYPE not between", value1, value2, "cRouteType");
            return (Criteria) this;
        }

        public Criteria andCSnipperIsNull() {
            addCriterion("C_SNIPPER is null");
            return (Criteria) this;
        }

        public Criteria andCSnipperIsNotNull() {
            addCriterion("C_SNIPPER is not null");
            return (Criteria) this;
        }

        public Criteria andCSnipperEqualTo(String value) {
            addCriterion("C_SNIPPER =", value, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperNotEqualTo(String value) {
            addCriterion("C_SNIPPER <>", value, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperGreaterThan(String value) {
            addCriterion("C_SNIPPER >", value, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperGreaterThanOrEqualTo(String value) {
            addCriterion("C_SNIPPER >=", value, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperLessThan(String value) {
            addCriterion("C_SNIPPER <", value, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperLessThanOrEqualTo(String value) {
            addCriterion("C_SNIPPER <=", value, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperLike(String value) {
            addCriterion("C_SNIPPER like", value, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperNotLike(String value) {
            addCriterion("C_SNIPPER not like", value, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperIn(List<String> values) {
            addCriterion("C_SNIPPER in", values, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperNotIn(List<String> values) {
            addCriterion("C_SNIPPER not in", values, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperBetween(String value1, String value2) {
            addCriterion("C_SNIPPER between", value1, value2, "cSnipper");
            return (Criteria) this;
        }

        public Criteria andCSnipperNotBetween(String value1, String value2) {
            addCriterion("C_SNIPPER not between", value1, value2, "cSnipper");
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

        public Criteria andCTonIsNull() {
            addCriterion("C_TON is null");
            return (Criteria) this;
        }

        public Criteria andCTonIsNotNull() {
            addCriterion("C_TON is not null");
            return (Criteria) this;
        }

        public Criteria andCTonEqualTo(Integer value) {
            addCriterion("C_TON =", value, "cTon");
            return (Criteria) this;
        }

        public Criteria andCTonNotEqualTo(Integer value) {
            addCriterion("C_TON <>", value, "cTon");
            return (Criteria) this;
        }

        public Criteria andCTonGreaterThan(Integer value) {
            addCriterion("C_TON >", value, "cTon");
            return (Criteria) this;
        }

        public Criteria andCTonGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_TON >=", value, "cTon");
            return (Criteria) this;
        }

        public Criteria andCTonLessThan(Integer value) {
            addCriterion("C_TON <", value, "cTon");
            return (Criteria) this;
        }

        public Criteria andCTonLessThanOrEqualTo(Integer value) {
            addCriterion("C_TON <=", value, "cTon");
            return (Criteria) this;
        }

        public Criteria andCTonIn(List<Integer> values) {
            addCriterion("C_TON in", values, "cTon");
            return (Criteria) this;
        }

        public Criteria andCTonNotIn(List<Integer> values) {
            addCriterion("C_TON not in", values, "cTon");
            return (Criteria) this;
        }

        public Criteria andCTonBetween(Integer value1, Integer value2) {
            addCriterion("C_TON between", value1, value2, "cTon");
            return (Criteria) this;
        }

        public Criteria andCTonNotBetween(Integer value1, Integer value2) {
            addCriterion("C_TON not between", value1, value2, "cTon");
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