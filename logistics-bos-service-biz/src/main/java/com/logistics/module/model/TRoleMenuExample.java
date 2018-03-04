package com.logistics.module.model;

import java.util.ArrayList;
import java.util.List;

public class TRoleMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRoleMenuExample() {
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

        public Criteria andCRoleIdIsNull() {
            addCriterion("C_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCRoleIdIsNotNull() {
            addCriterion("C_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCRoleIdEqualTo(Integer value) {
            addCriterion("C_ROLE_ID =", value, "cRoleId");
            return (Criteria) this;
        }

        public Criteria andCRoleIdNotEqualTo(Integer value) {
            addCriterion("C_ROLE_ID <>", value, "cRoleId");
            return (Criteria) this;
        }

        public Criteria andCRoleIdGreaterThan(Integer value) {
            addCriterion("C_ROLE_ID >", value, "cRoleId");
            return (Criteria) this;
        }

        public Criteria andCRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ROLE_ID >=", value, "cRoleId");
            return (Criteria) this;
        }

        public Criteria andCRoleIdLessThan(Integer value) {
            addCriterion("C_ROLE_ID <", value, "cRoleId");
            return (Criteria) this;
        }

        public Criteria andCRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ROLE_ID <=", value, "cRoleId");
            return (Criteria) this;
        }

        public Criteria andCRoleIdIn(List<Integer> values) {
            addCriterion("C_ROLE_ID in", values, "cRoleId");
            return (Criteria) this;
        }

        public Criteria andCRoleIdNotIn(List<Integer> values) {
            addCriterion("C_ROLE_ID not in", values, "cRoleId");
            return (Criteria) this;
        }

        public Criteria andCRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ROLE_ID between", value1, value2, "cRoleId");
            return (Criteria) this;
        }

        public Criteria andCRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ROLE_ID not between", value1, value2, "cRoleId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdIsNull() {
            addCriterion("C_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andCMenuIdIsNotNull() {
            addCriterion("C_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCMenuIdEqualTo(Integer value) {
            addCriterion("C_MENU_ID =", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdNotEqualTo(Integer value) {
            addCriterion("C_MENU_ID <>", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdGreaterThan(Integer value) {
            addCriterion("C_MENU_ID >", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_MENU_ID >=", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdLessThan(Integer value) {
            addCriterion("C_MENU_ID <", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_MENU_ID <=", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdIn(List<Integer> values) {
            addCriterion("C_MENU_ID in", values, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdNotIn(List<Integer> values) {
            addCriterion("C_MENU_ID not in", values, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("C_MENU_ID between", value1, value2, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_MENU_ID not between", value1, value2, "cMenuId");
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