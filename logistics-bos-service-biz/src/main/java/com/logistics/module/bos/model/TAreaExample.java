package com.logistics.module.bos.model;

import java.util.ArrayList;
import java.util.List;

public class TAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAreaExample() {
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

        public Criteria andCCityIsNull() {
            addCriterion("C_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCCityIsNotNull() {
            addCriterion("C_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCCityEqualTo(String value) {
            addCriterion("C_CITY =", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotEqualTo(String value) {
            addCriterion("C_CITY <>", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThan(String value) {
            addCriterion("C_CITY >", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThanOrEqualTo(String value) {
            addCriterion("C_CITY >=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThan(String value) {
            addCriterion("C_CITY <", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThanOrEqualTo(String value) {
            addCriterion("C_CITY <=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLike(String value) {
            addCriterion("C_CITY like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotLike(String value) {
            addCriterion("C_CITY not like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityIn(List<String> values) {
            addCriterion("C_CITY in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotIn(List<String> values) {
            addCriterion("C_CITY not in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityBetween(String value1, String value2) {
            addCriterion("C_CITY between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotBetween(String value1, String value2) {
            addCriterion("C_CITY not between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCitycodeIsNull() {
            addCriterion("C_CITYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCCitycodeIsNotNull() {
            addCriterion("C_CITYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCCitycodeEqualTo(String value) {
            addCriterion("C_CITYCODE =", value, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeNotEqualTo(String value) {
            addCriterion("C_CITYCODE <>", value, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeGreaterThan(String value) {
            addCriterion("C_CITYCODE >", value, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_CITYCODE >=", value, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeLessThan(String value) {
            addCriterion("C_CITYCODE <", value, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeLessThanOrEqualTo(String value) {
            addCriterion("C_CITYCODE <=", value, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeLike(String value) {
            addCriterion("C_CITYCODE like", value, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeNotLike(String value) {
            addCriterion("C_CITYCODE not like", value, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeIn(List<String> values) {
            addCriterion("C_CITYCODE in", values, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeNotIn(List<String> values) {
            addCriterion("C_CITYCODE not in", values, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeBetween(String value1, String value2) {
            addCriterion("C_CITYCODE between", value1, value2, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCCitycodeNotBetween(String value1, String value2) {
            addCriterion("C_CITYCODE not between", value1, value2, "cCitycode");
            return (Criteria) this;
        }

        public Criteria andCDistrictIsNull() {
            addCriterion("C_DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andCDistrictIsNotNull() {
            addCriterion("C_DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andCDistrictEqualTo(String value) {
            addCriterion("C_DISTRICT =", value, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictNotEqualTo(String value) {
            addCriterion("C_DISTRICT <>", value, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictGreaterThan(String value) {
            addCriterion("C_DISTRICT >", value, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("C_DISTRICT >=", value, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictLessThan(String value) {
            addCriterion("C_DISTRICT <", value, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictLessThanOrEqualTo(String value) {
            addCriterion("C_DISTRICT <=", value, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictLike(String value) {
            addCriterion("C_DISTRICT like", value, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictNotLike(String value) {
            addCriterion("C_DISTRICT not like", value, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictIn(List<String> values) {
            addCriterion("C_DISTRICT in", values, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictNotIn(List<String> values) {
            addCriterion("C_DISTRICT not in", values, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictBetween(String value1, String value2) {
            addCriterion("C_DISTRICT between", value1, value2, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCDistrictNotBetween(String value1, String value2) {
            addCriterion("C_DISTRICT not between", value1, value2, "cDistrict");
            return (Criteria) this;
        }

        public Criteria andCPostcodeIsNull() {
            addCriterion("C_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andCPostcodeIsNotNull() {
            addCriterion("C_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCPostcodeEqualTo(String value) {
            addCriterion("C_POSTCODE =", value, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeNotEqualTo(String value) {
            addCriterion("C_POSTCODE <>", value, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeGreaterThan(String value) {
            addCriterion("C_POSTCODE >", value, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_POSTCODE >=", value, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeLessThan(String value) {
            addCriterion("C_POSTCODE <", value, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeLessThanOrEqualTo(String value) {
            addCriterion("C_POSTCODE <=", value, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeLike(String value) {
            addCriterion("C_POSTCODE like", value, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeNotLike(String value) {
            addCriterion("C_POSTCODE not like", value, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeIn(List<String> values) {
            addCriterion("C_POSTCODE in", values, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeNotIn(List<String> values) {
            addCriterion("C_POSTCODE not in", values, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeBetween(String value1, String value2) {
            addCriterion("C_POSTCODE between", value1, value2, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCPostcodeNotBetween(String value1, String value2) {
            addCriterion("C_POSTCODE not between", value1, value2, "cPostcode");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNull() {
            addCriterion("C_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNotNull() {
            addCriterion("C_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andCProvinceEqualTo(String value) {
            addCriterion("C_PROVINCE =", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotEqualTo(String value) {
            addCriterion("C_PROVINCE <>", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThan(String value) {
            addCriterion("C_PROVINCE >", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("C_PROVINCE >=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThan(String value) {
            addCriterion("C_PROVINCE <", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThanOrEqualTo(String value) {
            addCriterion("C_PROVINCE <=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLike(String value) {
            addCriterion("C_PROVINCE like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotLike(String value) {
            addCriterion("C_PROVINCE not like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceIn(List<String> values) {
            addCriterion("C_PROVINCE in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotIn(List<String> values) {
            addCriterion("C_PROVINCE not in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceBetween(String value1, String value2) {
            addCriterion("C_PROVINCE between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotBetween(String value1, String value2) {
            addCriterion("C_PROVINCE not between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCShortcodeIsNull() {
            addCriterion("C_SHORTCODE is null");
            return (Criteria) this;
        }

        public Criteria andCShortcodeIsNotNull() {
            addCriterion("C_SHORTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCShortcodeEqualTo(String value) {
            addCriterion("C_SHORTCODE =", value, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeNotEqualTo(String value) {
            addCriterion("C_SHORTCODE <>", value, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeGreaterThan(String value) {
            addCriterion("C_SHORTCODE >", value, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_SHORTCODE >=", value, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeLessThan(String value) {
            addCriterion("C_SHORTCODE <", value, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeLessThanOrEqualTo(String value) {
            addCriterion("C_SHORTCODE <=", value, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeLike(String value) {
            addCriterion("C_SHORTCODE like", value, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeNotLike(String value) {
            addCriterion("C_SHORTCODE not like", value, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeIn(List<String> values) {
            addCriterion("C_SHORTCODE in", values, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeNotIn(List<String> values) {
            addCriterion("C_SHORTCODE not in", values, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeBetween(String value1, String value2) {
            addCriterion("C_SHORTCODE between", value1, value2, "cShortcode");
            return (Criteria) this;
        }

        public Criteria andCShortcodeNotBetween(String value1, String value2) {
            addCriterion("C_SHORTCODE not between", value1, value2, "cShortcode");
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