package com.logistics.module.model;

import java.util.ArrayList;
import java.util.List;

public class TSubAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSubAreaExample() {
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

        public Criteria andCAssistKeyWordsIsNull() {
            addCriterion("C_ASSIST_KEY_WORDS is null");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsIsNotNull() {
            addCriterion("C_ASSIST_KEY_WORDS is not null");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsEqualTo(String value) {
            addCriterion("C_ASSIST_KEY_WORDS =", value, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsNotEqualTo(String value) {
            addCriterion("C_ASSIST_KEY_WORDS <>", value, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsGreaterThan(String value) {
            addCriterion("C_ASSIST_KEY_WORDS >", value, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsGreaterThanOrEqualTo(String value) {
            addCriterion("C_ASSIST_KEY_WORDS >=", value, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsLessThan(String value) {
            addCriterion("C_ASSIST_KEY_WORDS <", value, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsLessThanOrEqualTo(String value) {
            addCriterion("C_ASSIST_KEY_WORDS <=", value, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsLike(String value) {
            addCriterion("C_ASSIST_KEY_WORDS like", value, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsNotLike(String value) {
            addCriterion("C_ASSIST_KEY_WORDS not like", value, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsIn(List<String> values) {
            addCriterion("C_ASSIST_KEY_WORDS in", values, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsNotIn(List<String> values) {
            addCriterion("C_ASSIST_KEY_WORDS not in", values, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsBetween(String value1, String value2) {
            addCriterion("C_ASSIST_KEY_WORDS between", value1, value2, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCAssistKeyWordsNotBetween(String value1, String value2) {
            addCriterion("C_ASSIST_KEY_WORDS not between", value1, value2, "cAssistKeyWords");
            return (Criteria) this;
        }

        public Criteria andCEndnumIsNull() {
            addCriterion("C_ENDNUM is null");
            return (Criteria) this;
        }

        public Criteria andCEndnumIsNotNull() {
            addCriterion("C_ENDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCEndnumEqualTo(String value) {
            addCriterion("C_ENDNUM =", value, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumNotEqualTo(String value) {
            addCriterion("C_ENDNUM <>", value, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumGreaterThan(String value) {
            addCriterion("C_ENDNUM >", value, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumGreaterThanOrEqualTo(String value) {
            addCriterion("C_ENDNUM >=", value, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumLessThan(String value) {
            addCriterion("C_ENDNUM <", value, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumLessThanOrEqualTo(String value) {
            addCriterion("C_ENDNUM <=", value, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumLike(String value) {
            addCriterion("C_ENDNUM like", value, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumNotLike(String value) {
            addCriterion("C_ENDNUM not like", value, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumIn(List<String> values) {
            addCriterion("C_ENDNUM in", values, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumNotIn(List<String> values) {
            addCriterion("C_ENDNUM not in", values, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumBetween(String value1, String value2) {
            addCriterion("C_ENDNUM between", value1, value2, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCEndnumNotBetween(String value1, String value2) {
            addCriterion("C_ENDNUM not between", value1, value2, "cEndnum");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsIsNull() {
            addCriterion("C_KEY_WORDS is null");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsIsNotNull() {
            addCriterion("C_KEY_WORDS is not null");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsEqualTo(String value) {
            addCriterion("C_KEY_WORDS =", value, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsNotEqualTo(String value) {
            addCriterion("C_KEY_WORDS <>", value, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsGreaterThan(String value) {
            addCriterion("C_KEY_WORDS >", value, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsGreaterThanOrEqualTo(String value) {
            addCriterion("C_KEY_WORDS >=", value, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsLessThan(String value) {
            addCriterion("C_KEY_WORDS <", value, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsLessThanOrEqualTo(String value) {
            addCriterion("C_KEY_WORDS <=", value, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsLike(String value) {
            addCriterion("C_KEY_WORDS like", value, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsNotLike(String value) {
            addCriterion("C_KEY_WORDS not like", value, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsIn(List<String> values) {
            addCriterion("C_KEY_WORDS in", values, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsNotIn(List<String> values) {
            addCriterion("C_KEY_WORDS not in", values, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsBetween(String value1, String value2) {
            addCriterion("C_KEY_WORDS between", value1, value2, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCKeyWordsNotBetween(String value1, String value2) {
            addCriterion("C_KEY_WORDS not between", value1, value2, "cKeyWords");
            return (Criteria) this;
        }

        public Criteria andCSingleIsNull() {
            addCriterion("C_SINGLE is null");
            return (Criteria) this;
        }

        public Criteria andCSingleIsNotNull() {
            addCriterion("C_SINGLE is not null");
            return (Criteria) this;
        }

        public Criteria andCSingleEqualTo(String value) {
            addCriterion("C_SINGLE =", value, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleNotEqualTo(String value) {
            addCriterion("C_SINGLE <>", value, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleGreaterThan(String value) {
            addCriterion("C_SINGLE >", value, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleGreaterThanOrEqualTo(String value) {
            addCriterion("C_SINGLE >=", value, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleLessThan(String value) {
            addCriterion("C_SINGLE <", value, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleLessThanOrEqualTo(String value) {
            addCriterion("C_SINGLE <=", value, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleLike(String value) {
            addCriterion("C_SINGLE like", value, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleNotLike(String value) {
            addCriterion("C_SINGLE not like", value, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleIn(List<String> values) {
            addCriterion("C_SINGLE in", values, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleNotIn(List<String> values) {
            addCriterion("C_SINGLE not in", values, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleBetween(String value1, String value2) {
            addCriterion("C_SINGLE between", value1, value2, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCSingleNotBetween(String value1, String value2) {
            addCriterion("C_SINGLE not between", value1, value2, "cSingle");
            return (Criteria) this;
        }

        public Criteria andCStartNumIsNull() {
            addCriterion("C_START_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCStartNumIsNotNull() {
            addCriterion("C_START_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCStartNumEqualTo(String value) {
            addCriterion("C_START_NUM =", value, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumNotEqualTo(String value) {
            addCriterion("C_START_NUM <>", value, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumGreaterThan(String value) {
            addCriterion("C_START_NUM >", value, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_START_NUM >=", value, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumLessThan(String value) {
            addCriterion("C_START_NUM <", value, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumLessThanOrEqualTo(String value) {
            addCriterion("C_START_NUM <=", value, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumLike(String value) {
            addCriterion("C_START_NUM like", value, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumNotLike(String value) {
            addCriterion("C_START_NUM not like", value, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumIn(List<String> values) {
            addCriterion("C_START_NUM in", values, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumNotIn(List<String> values) {
            addCriterion("C_START_NUM not in", values, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumBetween(String value1, String value2) {
            addCriterion("C_START_NUM between", value1, value2, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCStartNumNotBetween(String value1, String value2) {
            addCriterion("C_START_NUM not between", value1, value2, "cStartNum");
            return (Criteria) this;
        }

        public Criteria andCAreaIdIsNull() {
            addCriterion("C_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCAreaIdIsNotNull() {
            addCriterion("C_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCAreaIdEqualTo(String value) {
            addCriterion("C_AREA_ID =", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdNotEqualTo(String value) {
            addCriterion("C_AREA_ID <>", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdGreaterThan(String value) {
            addCriterion("C_AREA_ID >", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_AREA_ID >=", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdLessThan(String value) {
            addCriterion("C_AREA_ID <", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdLessThanOrEqualTo(String value) {
            addCriterion("C_AREA_ID <=", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdLike(String value) {
            addCriterion("C_AREA_ID like", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdNotLike(String value) {
            addCriterion("C_AREA_ID not like", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdIn(List<String> values) {
            addCriterion("C_AREA_ID in", values, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdNotIn(List<String> values) {
            addCriterion("C_AREA_ID not in", values, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdBetween(String value1, String value2) {
            addCriterion("C_AREA_ID between", value1, value2, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdNotBetween(String value1, String value2) {
            addCriterion("C_AREA_ID not between", value1, value2, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdIsNull() {
            addCriterion("C_FIXEDAREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdIsNotNull() {
            addCriterion("C_FIXEDAREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdEqualTo(String value) {
            addCriterion("C_FIXEDAREA_ID =", value, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdNotEqualTo(String value) {
            addCriterion("C_FIXEDAREA_ID <>", value, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdGreaterThan(String value) {
            addCriterion("C_FIXEDAREA_ID >", value, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_FIXEDAREA_ID >=", value, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdLessThan(String value) {
            addCriterion("C_FIXEDAREA_ID <", value, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdLessThanOrEqualTo(String value) {
            addCriterion("C_FIXEDAREA_ID <=", value, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdLike(String value) {
            addCriterion("C_FIXEDAREA_ID like", value, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdNotLike(String value) {
            addCriterion("C_FIXEDAREA_ID not like", value, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdIn(List<String> values) {
            addCriterion("C_FIXEDAREA_ID in", values, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdNotIn(List<String> values) {
            addCriterion("C_FIXEDAREA_ID not in", values, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdBetween(String value1, String value2) {
            addCriterion("C_FIXEDAREA_ID between", value1, value2, "cFixedareaId");
            return (Criteria) this;
        }

        public Criteria andCFixedareaIdNotBetween(String value1, String value2) {
            addCriterion("C_FIXEDAREA_ID not between", value1, value2, "cFixedareaId");
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