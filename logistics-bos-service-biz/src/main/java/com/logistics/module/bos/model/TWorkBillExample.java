package com.logistics.module.bos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TWorkBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWorkBillExample() {
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

        public Criteria andCAttachbilltimesIsNull() {
            addCriterion("C_ATTACHBILLTIMES is null");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesIsNotNull() {
            addCriterion("C_ATTACHBILLTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesEqualTo(Integer value) {
            addCriterion("C_ATTACHBILLTIMES =", value, "cAttachbilltimes");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesNotEqualTo(Integer value) {
            addCriterion("C_ATTACHBILLTIMES <>", value, "cAttachbilltimes");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesGreaterThan(Integer value) {
            addCriterion("C_ATTACHBILLTIMES >", value, "cAttachbilltimes");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ATTACHBILLTIMES >=", value, "cAttachbilltimes");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesLessThan(Integer value) {
            addCriterion("C_ATTACHBILLTIMES <", value, "cAttachbilltimes");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesLessThanOrEqualTo(Integer value) {
            addCriterion("C_ATTACHBILLTIMES <=", value, "cAttachbilltimes");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesIn(List<Integer> values) {
            addCriterion("C_ATTACHBILLTIMES in", values, "cAttachbilltimes");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesNotIn(List<Integer> values) {
            addCriterion("C_ATTACHBILLTIMES not in", values, "cAttachbilltimes");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesBetween(Integer value1, Integer value2) {
            addCriterion("C_ATTACHBILLTIMES between", value1, value2, "cAttachbilltimes");
            return (Criteria) this;
        }

        public Criteria andCAttachbilltimesNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ATTACHBILLTIMES not between", value1, value2, "cAttachbilltimes");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeIsNull() {
            addCriterion("C_BUILDTIME is null");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeIsNotNull() {
            addCriterion("C_BUILDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeEqualTo(Date value) {
            addCriterion("C_BUILDTIME =", value, "cBuildtime");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeNotEqualTo(Date value) {
            addCriterion("C_BUILDTIME <>", value, "cBuildtime");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeGreaterThan(Date value) {
            addCriterion("C_BUILDTIME >", value, "cBuildtime");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_BUILDTIME >=", value, "cBuildtime");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeLessThan(Date value) {
            addCriterion("C_BUILDTIME <", value, "cBuildtime");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeLessThanOrEqualTo(Date value) {
            addCriterion("C_BUILDTIME <=", value, "cBuildtime");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeIn(List<Date> values) {
            addCriterion("C_BUILDTIME in", values, "cBuildtime");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeNotIn(List<Date> values) {
            addCriterion("C_BUILDTIME not in", values, "cBuildtime");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeBetween(Date value1, Date value2) {
            addCriterion("C_BUILDTIME between", value1, value2, "cBuildtime");
            return (Criteria) this;
        }

        public Criteria andCBuildtimeNotBetween(Date value1, Date value2) {
            addCriterion("C_BUILDTIME not between", value1, value2, "cBuildtime");
            return (Criteria) this;
        }

        public Criteria andCPickstateIsNull() {
            addCriterion("C_PICKSTATE is null");
            return (Criteria) this;
        }

        public Criteria andCPickstateIsNotNull() {
            addCriterion("C_PICKSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCPickstateEqualTo(String value) {
            addCriterion("C_PICKSTATE =", value, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateNotEqualTo(String value) {
            addCriterion("C_PICKSTATE <>", value, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateGreaterThan(String value) {
            addCriterion("C_PICKSTATE >", value, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateGreaterThanOrEqualTo(String value) {
            addCriterion("C_PICKSTATE >=", value, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateLessThan(String value) {
            addCriterion("C_PICKSTATE <", value, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateLessThanOrEqualTo(String value) {
            addCriterion("C_PICKSTATE <=", value, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateLike(String value) {
            addCriterion("C_PICKSTATE like", value, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateNotLike(String value) {
            addCriterion("C_PICKSTATE not like", value, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateIn(List<String> values) {
            addCriterion("C_PICKSTATE in", values, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateNotIn(List<String> values) {
            addCriterion("C_PICKSTATE not in", values, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateBetween(String value1, String value2) {
            addCriterion("C_PICKSTATE between", value1, value2, "cPickstate");
            return (Criteria) this;
        }

        public Criteria andCPickstateNotBetween(String value1, String value2) {
            addCriterion("C_PICKSTATE not between", value1, value2, "cPickstate");
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

        public Criteria andCSmsnumberIsNull() {
            addCriterion("C_SMSNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberIsNotNull() {
            addCriterion("C_SMSNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberEqualTo(String value) {
            addCriterion("C_SMSNUMBER =", value, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberNotEqualTo(String value) {
            addCriterion("C_SMSNUMBER <>", value, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberGreaterThan(String value) {
            addCriterion("C_SMSNUMBER >", value, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("C_SMSNUMBER >=", value, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberLessThan(String value) {
            addCriterion("C_SMSNUMBER <", value, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberLessThanOrEqualTo(String value) {
            addCriterion("C_SMSNUMBER <=", value, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberLike(String value) {
            addCriterion("C_SMSNUMBER like", value, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberNotLike(String value) {
            addCriterion("C_SMSNUMBER not like", value, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberIn(List<String> values) {
            addCriterion("C_SMSNUMBER in", values, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberNotIn(List<String> values) {
            addCriterion("C_SMSNUMBER not in", values, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberBetween(String value1, String value2) {
            addCriterion("C_SMSNUMBER between", value1, value2, "cSmsnumber");
            return (Criteria) this;
        }

        public Criteria andCSmsnumberNotBetween(String value1, String value2) {
            addCriterion("C_SMSNUMBER not between", value1, value2, "cSmsnumber");
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

        public Criteria andCCourierIsNull() {
            addCriterion("C_COURIER is null");
            return (Criteria) this;
        }

        public Criteria andCCourierIsNotNull() {
            addCriterion("C_COURIER is not null");
            return (Criteria) this;
        }

        public Criteria andCCourierEqualTo(Integer value) {
            addCriterion("C_COURIER =", value, "cCourier");
            return (Criteria) this;
        }

        public Criteria andCCourierNotEqualTo(Integer value) {
            addCriterion("C_COURIER <>", value, "cCourier");
            return (Criteria) this;
        }

        public Criteria andCCourierGreaterThan(Integer value) {
            addCriterion("C_COURIER >", value, "cCourier");
            return (Criteria) this;
        }

        public Criteria andCCourierGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_COURIER >=", value, "cCourier");
            return (Criteria) this;
        }

        public Criteria andCCourierLessThan(Integer value) {
            addCriterion("C_COURIER <", value, "cCourier");
            return (Criteria) this;
        }

        public Criteria andCCourierLessThanOrEqualTo(Integer value) {
            addCriterion("C_COURIER <=", value, "cCourier");
            return (Criteria) this;
        }

        public Criteria andCCourierIn(List<Integer> values) {
            addCriterion("C_COURIER in", values, "cCourier");
            return (Criteria) this;
        }

        public Criteria andCCourierNotIn(List<Integer> values) {
            addCriterion("C_COURIER not in", values, "cCourier");
            return (Criteria) this;
        }

        public Criteria andCCourierBetween(Integer value1, Integer value2) {
            addCriterion("C_COURIER between", value1, value2, "cCourier");
            return (Criteria) this;
        }

        public Criteria andCCourierNotBetween(Integer value1, Integer value2) {
            addCriterion("C_COURIER not between", value1, value2, "cCourier");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIsNull() {
            addCriterion("C_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIsNotNull() {
            addCriterion("C_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderIdEqualTo(Integer value) {
            addCriterion("C_ORDER_ID =", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotEqualTo(Integer value) {
            addCriterion("C_ORDER_ID <>", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdGreaterThan(Integer value) {
            addCriterion("C_ORDER_ID >", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ORDER_ID >=", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdLessThan(Integer value) {
            addCriterion("C_ORDER_ID <", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ORDER_ID <=", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIn(List<Integer> values) {
            addCriterion("C_ORDER_ID in", values, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotIn(List<Integer> values) {
            addCriterion("C_ORDER_ID not in", values, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ORDER_ID between", value1, value2, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ORDER_ID not between", value1, value2, "cOrderId");
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