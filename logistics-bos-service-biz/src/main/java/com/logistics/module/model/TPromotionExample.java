package com.logistics.module.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPromotionExample() {
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

        public Criteria andCActiveScopeIsNull() {
            addCriterion("C_ACTIVE_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeIsNotNull() {
            addCriterion("C_ACTIVE_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeEqualTo(String value) {
            addCriterion("C_ACTIVE_SCOPE =", value, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeNotEqualTo(String value) {
            addCriterion("C_ACTIVE_SCOPE <>", value, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeGreaterThan(String value) {
            addCriterion("C_ACTIVE_SCOPE >", value, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeGreaterThanOrEqualTo(String value) {
            addCriterion("C_ACTIVE_SCOPE >=", value, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeLessThan(String value) {
            addCriterion("C_ACTIVE_SCOPE <", value, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeLessThanOrEqualTo(String value) {
            addCriterion("C_ACTIVE_SCOPE <=", value, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeLike(String value) {
            addCriterion("C_ACTIVE_SCOPE like", value, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeNotLike(String value) {
            addCriterion("C_ACTIVE_SCOPE not like", value, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeIn(List<String> values) {
            addCriterion("C_ACTIVE_SCOPE in", values, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeNotIn(List<String> values) {
            addCriterion("C_ACTIVE_SCOPE not in", values, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeBetween(String value1, String value2) {
            addCriterion("C_ACTIVE_SCOPE between", value1, value2, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCActiveScopeNotBetween(String value1, String value2) {
            addCriterion("C_ACTIVE_SCOPE not between", value1, value2, "cActiveScope");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIsNull() {
            addCriterion("C_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIsNotNull() {
            addCriterion("C_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andCDescriptionEqualTo(String value) {
            addCriterion("C_DESCRIPTION =", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotEqualTo(String value) {
            addCriterion("C_DESCRIPTION <>", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionGreaterThan(String value) {
            addCriterion("C_DESCRIPTION >", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("C_DESCRIPTION >=", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLessThan(String value) {
            addCriterion("C_DESCRIPTION <", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLessThanOrEqualTo(String value) {
            addCriterion("C_DESCRIPTION <=", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLike(String value) {
            addCriterion("C_DESCRIPTION like", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotLike(String value) {
            addCriterion("C_DESCRIPTION not like", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIn(List<String> values) {
            addCriterion("C_DESCRIPTION in", values, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotIn(List<String> values) {
            addCriterion("C_DESCRIPTION not in", values, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionBetween(String value1, String value2) {
            addCriterion("C_DESCRIPTION between", value1, value2, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotBetween(String value1, String value2) {
            addCriterion("C_DESCRIPTION not between", value1, value2, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCEndDateIsNull() {
            addCriterion("C_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCEndDateIsNotNull() {
            addCriterion("C_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCEndDateEqualTo(Date value) {
            addCriterion("C_END_DATE =", value, "cEndDate");
            return (Criteria) this;
        }

        public Criteria andCEndDateNotEqualTo(Date value) {
            addCriterion("C_END_DATE <>", value, "cEndDate");
            return (Criteria) this;
        }

        public Criteria andCEndDateGreaterThan(Date value) {
            addCriterion("C_END_DATE >", value, "cEndDate");
            return (Criteria) this;
        }

        public Criteria andCEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("C_END_DATE >=", value, "cEndDate");
            return (Criteria) this;
        }

        public Criteria andCEndDateLessThan(Date value) {
            addCriterion("C_END_DATE <", value, "cEndDate");
            return (Criteria) this;
        }

        public Criteria andCEndDateLessThanOrEqualTo(Date value) {
            addCriterion("C_END_DATE <=", value, "cEndDate");
            return (Criteria) this;
        }

        public Criteria andCEndDateIn(List<Date> values) {
            addCriterion("C_END_DATE in", values, "cEndDate");
            return (Criteria) this;
        }

        public Criteria andCEndDateNotIn(List<Date> values) {
            addCriterion("C_END_DATE not in", values, "cEndDate");
            return (Criteria) this;
        }

        public Criteria andCEndDateBetween(Date value1, Date value2) {
            addCriterion("C_END_DATE between", value1, value2, "cEndDate");
            return (Criteria) this;
        }

        public Criteria andCEndDateNotBetween(Date value1, Date value2) {
            addCriterion("C_END_DATE not between", value1, value2, "cEndDate");
            return (Criteria) this;
        }

        public Criteria andCStartDateIsNull() {
            addCriterion("C_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCStartDateIsNotNull() {
            addCriterion("C_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCStartDateEqualTo(Date value) {
            addCriterion("C_START_DATE =", value, "cStartDate");
            return (Criteria) this;
        }

        public Criteria andCStartDateNotEqualTo(Date value) {
            addCriterion("C_START_DATE <>", value, "cStartDate");
            return (Criteria) this;
        }

        public Criteria andCStartDateGreaterThan(Date value) {
            addCriterion("C_START_DATE >", value, "cStartDate");
            return (Criteria) this;
        }

        public Criteria andCStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("C_START_DATE >=", value, "cStartDate");
            return (Criteria) this;
        }

        public Criteria andCStartDateLessThan(Date value) {
            addCriterion("C_START_DATE <", value, "cStartDate");
            return (Criteria) this;
        }

        public Criteria andCStartDateLessThanOrEqualTo(Date value) {
            addCriterion("C_START_DATE <=", value, "cStartDate");
            return (Criteria) this;
        }

        public Criteria andCStartDateIn(List<Date> values) {
            addCriterion("C_START_DATE in", values, "cStartDate");
            return (Criteria) this;
        }

        public Criteria andCStartDateNotIn(List<Date> values) {
            addCriterion("C_START_DATE not in", values, "cStartDate");
            return (Criteria) this;
        }

        public Criteria andCStartDateBetween(Date value1, Date value2) {
            addCriterion("C_START_DATE between", value1, value2, "cStartDate");
            return (Criteria) this;
        }

        public Criteria andCStartDateNotBetween(Date value1, Date value2) {
            addCriterion("C_START_DATE not between", value1, value2, "cStartDate");
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

        public Criteria andCTitleIsNull() {
            addCriterion("C_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCTitleIsNotNull() {
            addCriterion("C_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCTitleEqualTo(String value) {
            addCriterion("C_TITLE =", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotEqualTo(String value) {
            addCriterion("C_TITLE <>", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleGreaterThan(String value) {
            addCriterion("C_TITLE >", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleGreaterThanOrEqualTo(String value) {
            addCriterion("C_TITLE >=", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLessThan(String value) {
            addCriterion("C_TITLE <", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLessThanOrEqualTo(String value) {
            addCriterion("C_TITLE <=", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLike(String value) {
            addCriterion("C_TITLE like", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotLike(String value) {
            addCriterion("C_TITLE not like", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleIn(List<String> values) {
            addCriterion("C_TITLE in", values, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotIn(List<String> values) {
            addCriterion("C_TITLE not in", values, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleBetween(String value1, String value2) {
            addCriterion("C_TITLE between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotBetween(String value1, String value2) {
            addCriterion("C_TITLE not between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleImgIsNull() {
            addCriterion("C_TITLE_IMG is null");
            return (Criteria) this;
        }

        public Criteria andCTitleImgIsNotNull() {
            addCriterion("C_TITLE_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andCTitleImgEqualTo(String value) {
            addCriterion("C_TITLE_IMG =", value, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgNotEqualTo(String value) {
            addCriterion("C_TITLE_IMG <>", value, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgGreaterThan(String value) {
            addCriterion("C_TITLE_IMG >", value, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgGreaterThanOrEqualTo(String value) {
            addCriterion("C_TITLE_IMG >=", value, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgLessThan(String value) {
            addCriterion("C_TITLE_IMG <", value, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgLessThanOrEqualTo(String value) {
            addCriterion("C_TITLE_IMG <=", value, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgLike(String value) {
            addCriterion("C_TITLE_IMG like", value, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgNotLike(String value) {
            addCriterion("C_TITLE_IMG not like", value, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgIn(List<String> values) {
            addCriterion("C_TITLE_IMG in", values, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgNotIn(List<String> values) {
            addCriterion("C_TITLE_IMG not in", values, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgBetween(String value1, String value2) {
            addCriterion("C_TITLE_IMG between", value1, value2, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCTitleImgNotBetween(String value1, String value2) {
            addCriterion("C_TITLE_IMG not between", value1, value2, "cTitleImg");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeIsNull() {
            addCriterion("C_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeIsNotNull() {
            addCriterion("C_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeEqualTo(Date value) {
            addCriterion("C_UPDATE_TIME =", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeNotEqualTo(Date value) {
            addCriterion("C_UPDATE_TIME <>", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeGreaterThan(Date value) {
            addCriterion("C_UPDATE_TIME >", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_UPDATE_TIME >=", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeLessThan(Date value) {
            addCriterion("C_UPDATE_TIME <", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("C_UPDATE_TIME <=", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeIn(List<Date> values) {
            addCriterion("C_UPDATE_TIME in", values, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeNotIn(List<Date> values) {
            addCriterion("C_UPDATE_TIME not in", values, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("C_UPDATE_TIME between", value1, value2, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("C_UPDATE_TIME not between", value1, value2, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitIsNull() {
            addCriterion("C_UPDATE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitIsNotNull() {
            addCriterion("C_UPDATE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitEqualTo(String value) {
            addCriterion("C_UPDATE_UNIT =", value, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitNotEqualTo(String value) {
            addCriterion("C_UPDATE_UNIT <>", value, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitGreaterThan(String value) {
            addCriterion("C_UPDATE_UNIT >", value, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitGreaterThanOrEqualTo(String value) {
            addCriterion("C_UPDATE_UNIT >=", value, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitLessThan(String value) {
            addCriterion("C_UPDATE_UNIT <", value, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitLessThanOrEqualTo(String value) {
            addCriterion("C_UPDATE_UNIT <=", value, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitLike(String value) {
            addCriterion("C_UPDATE_UNIT like", value, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitNotLike(String value) {
            addCriterion("C_UPDATE_UNIT not like", value, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitIn(List<String> values) {
            addCriterion("C_UPDATE_UNIT in", values, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitNotIn(List<String> values) {
            addCriterion("C_UPDATE_UNIT not in", values, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitBetween(String value1, String value2) {
            addCriterion("C_UPDATE_UNIT between", value1, value2, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUnitNotBetween(String value1, String value2) {
            addCriterion("C_UPDATE_UNIT not between", value1, value2, "cUpdateUnit");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserIsNull() {
            addCriterion("C_UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserIsNotNull() {
            addCriterion("C_UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserEqualTo(String value) {
            addCriterion("C_UPDATE_USER =", value, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserNotEqualTo(String value) {
            addCriterion("C_UPDATE_USER <>", value, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserGreaterThan(String value) {
            addCriterion("C_UPDATE_USER >", value, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("C_UPDATE_USER >=", value, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserLessThan(String value) {
            addCriterion("C_UPDATE_USER <", value, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("C_UPDATE_USER <=", value, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserLike(String value) {
            addCriterion("C_UPDATE_USER like", value, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserNotLike(String value) {
            addCriterion("C_UPDATE_USER not like", value, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserIn(List<String> values) {
            addCriterion("C_UPDATE_USER in", values, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserNotIn(List<String> values) {
            addCriterion("C_UPDATE_USER not in", values, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserBetween(String value1, String value2) {
            addCriterion("C_UPDATE_USER between", value1, value2, "cUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCUpdateUserNotBetween(String value1, String value2) {
            addCriterion("C_UPDATE_USER not between", value1, value2, "cUpdateUser");
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