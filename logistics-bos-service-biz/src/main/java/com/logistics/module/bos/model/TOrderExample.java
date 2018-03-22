package com.logistics.module.bos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderExample() {
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

        public Criteria andCCustomerIdIsNull() {
            addCriterion("C_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdIsNotNull() {
            addCriterion("C_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdEqualTo(Integer value) {
            addCriterion("C_CUSTOMER_ID =", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdNotEqualTo(Integer value) {
            addCriterion("C_CUSTOMER_ID <>", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdGreaterThan(Integer value) {
            addCriterion("C_CUSTOMER_ID >", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_CUSTOMER_ID >=", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdLessThan(Integer value) {
            addCriterion("C_CUSTOMER_ID <", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_CUSTOMER_ID <=", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdIn(List<Integer> values) {
            addCriterion("C_CUSTOMER_ID in", values, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdNotIn(List<Integer> values) {
            addCriterion("C_CUSTOMER_ID not in", values, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("C_CUSTOMER_ID between", value1, value2, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_CUSTOMER_ID not between", value1, value2, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIsNull() {
            addCriterion("C_GOODS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIsNotNull() {
            addCriterion("C_GOODS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeEqualTo(String value) {
            addCriterion("C_GOODS_TYPE =", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeNotEqualTo(String value) {
            addCriterion("C_GOODS_TYPE <>", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeGreaterThan(String value) {
            addCriterion("C_GOODS_TYPE >", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_GOODS_TYPE >=", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeLessThan(String value) {
            addCriterion("C_GOODS_TYPE <", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("C_GOODS_TYPE <=", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeLike(String value) {
            addCriterion("C_GOODS_TYPE like", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeNotLike(String value) {
            addCriterion("C_GOODS_TYPE not like", value, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeIn(List<String> values) {
            addCriterion("C_GOODS_TYPE in", values, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeNotIn(List<String> values) {
            addCriterion("C_GOODS_TYPE not in", values, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeBetween(String value1, String value2) {
            addCriterion("C_GOODS_TYPE between", value1, value2, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("C_GOODS_TYPE not between", value1, value2, "cGoodsType");
            return (Criteria) this;
        }

        public Criteria andCOrderNumIsNull() {
            addCriterion("C_ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCOrderNumIsNotNull() {
            addCriterion("C_ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderNumEqualTo(String value) {
            addCriterion("C_ORDER_NUM =", value, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumNotEqualTo(String value) {
            addCriterion("C_ORDER_NUM <>", value, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumGreaterThan(String value) {
            addCriterion("C_ORDER_NUM >", value, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_ORDER_NUM >=", value, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumLessThan(String value) {
            addCriterion("C_ORDER_NUM <", value, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumLessThanOrEqualTo(String value) {
            addCriterion("C_ORDER_NUM <=", value, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumLike(String value) {
            addCriterion("C_ORDER_NUM like", value, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumNotLike(String value) {
            addCriterion("C_ORDER_NUM not like", value, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumIn(List<String> values) {
            addCriterion("C_ORDER_NUM in", values, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumNotIn(List<String> values) {
            addCriterion("C_ORDER_NUM not in", values, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumBetween(String value1, String value2) {
            addCriterion("C_ORDER_NUM between", value1, value2, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderNumNotBetween(String value1, String value2) {
            addCriterion("C_ORDER_NUM not between", value1, value2, "cOrderNum");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeIsNull() {
            addCriterion("C_ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeIsNotNull() {
            addCriterion("C_ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeEqualTo(Date value) {
            addCriterion("C_ORDER_TIME =", value, "cOrderTime");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeNotEqualTo(Date value) {
            addCriterion("C_ORDER_TIME <>", value, "cOrderTime");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeGreaterThan(Date value) {
            addCriterion("C_ORDER_TIME >", value, "cOrderTime");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_ORDER_TIME >=", value, "cOrderTime");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeLessThan(Date value) {
            addCriterion("C_ORDER_TIME <", value, "cOrderTime");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("C_ORDER_TIME <=", value, "cOrderTime");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeIn(List<Date> values) {
            addCriterion("C_ORDER_TIME in", values, "cOrderTime");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeNotIn(List<Date> values) {
            addCriterion("C_ORDER_TIME not in", values, "cOrderTime");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeBetween(Date value1, Date value2) {
            addCriterion("C_ORDER_TIME between", value1, value2, "cOrderTime");
            return (Criteria) this;
        }

        public Criteria andCOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("C_ORDER_TIME not between", value1, value2, "cOrderTime");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeIsNull() {
            addCriterion("C_ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeIsNotNull() {
            addCriterion("C_ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeEqualTo(String value) {
            addCriterion("C_ORDER_TYPE =", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeNotEqualTo(String value) {
            addCriterion("C_ORDER_TYPE <>", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeGreaterThan(String value) {
            addCriterion("C_ORDER_TYPE >", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_ORDER_TYPE >=", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeLessThan(String value) {
            addCriterion("C_ORDER_TYPE <", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("C_ORDER_TYPE <=", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeLike(String value) {
            addCriterion("C_ORDER_TYPE like", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeNotLike(String value) {
            addCriterion("C_ORDER_TYPE not like", value, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeIn(List<String> values) {
            addCriterion("C_ORDER_TYPE in", values, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeNotIn(List<String> values) {
            addCriterion("C_ORDER_TYPE not in", values, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeBetween(String value1, String value2) {
            addCriterion("C_ORDER_TYPE between", value1, value2, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCOrderTypeNotBetween(String value1, String value2) {
            addCriterion("C_ORDER_TYPE not between", value1, value2, "cOrderType");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumIsNull() {
            addCriterion("C_PAY_TYPE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumIsNotNull() {
            addCriterion("C_PAY_TYPE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumEqualTo(String value) {
            addCriterion("C_PAY_TYPE_NUM =", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumNotEqualTo(String value) {
            addCriterion("C_PAY_TYPE_NUM <>", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumGreaterThan(String value) {
            addCriterion("C_PAY_TYPE_NUM >", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_PAY_TYPE_NUM >=", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumLessThan(String value) {
            addCriterion("C_PAY_TYPE_NUM <", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumLessThanOrEqualTo(String value) {
            addCriterion("C_PAY_TYPE_NUM <=", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumLike(String value) {
            addCriterion("C_PAY_TYPE_NUM like", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumNotLike(String value) {
            addCriterion("C_PAY_TYPE_NUM not like", value, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumIn(List<String> values) {
            addCriterion("C_PAY_TYPE_NUM in", values, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumNotIn(List<String> values) {
            addCriterion("C_PAY_TYPE_NUM not in", values, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumBetween(String value1, String value2) {
            addCriterion("C_PAY_TYPE_NUM between", value1, value2, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCPayTypeNumNotBetween(String value1, String value2) {
            addCriterion("C_PAY_TYPE_NUM not between", value1, value2, "cPayTypeNum");
            return (Criteria) this;
        }

        public Criteria andCRecAddressIsNull() {
            addCriterion("C_REC_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCRecAddressIsNotNull() {
            addCriterion("C_REC_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCRecAddressEqualTo(String value) {
            addCriterion("C_REC_ADDRESS =", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressNotEqualTo(String value) {
            addCriterion("C_REC_ADDRESS <>", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressGreaterThan(String value) {
            addCriterion("C_REC_ADDRESS >", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_REC_ADDRESS >=", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressLessThan(String value) {
            addCriterion("C_REC_ADDRESS <", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressLessThanOrEqualTo(String value) {
            addCriterion("C_REC_ADDRESS <=", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressLike(String value) {
            addCriterion("C_REC_ADDRESS like", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressNotLike(String value) {
            addCriterion("C_REC_ADDRESS not like", value, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressIn(List<String> values) {
            addCriterion("C_REC_ADDRESS in", values, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressNotIn(List<String> values) {
            addCriterion("C_REC_ADDRESS not in", values, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressBetween(String value1, String value2) {
            addCriterion("C_REC_ADDRESS between", value1, value2, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecAddressNotBetween(String value1, String value2) {
            addCriterion("C_REC_ADDRESS not between", value1, value2, "cRecAddress");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyIsNull() {
            addCriterion("C_REC_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyIsNotNull() {
            addCriterion("C_REC_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyEqualTo(String value) {
            addCriterion("C_REC_COMPANY =", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyNotEqualTo(String value) {
            addCriterion("C_REC_COMPANY <>", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyGreaterThan(String value) {
            addCriterion("C_REC_COMPANY >", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("C_REC_COMPANY >=", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyLessThan(String value) {
            addCriterion("C_REC_COMPANY <", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyLessThanOrEqualTo(String value) {
            addCriterion("C_REC_COMPANY <=", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyLike(String value) {
            addCriterion("C_REC_COMPANY like", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyNotLike(String value) {
            addCriterion("C_REC_COMPANY not like", value, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyIn(List<String> values) {
            addCriterion("C_REC_COMPANY in", values, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyNotIn(List<String> values) {
            addCriterion("C_REC_COMPANY not in", values, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyBetween(String value1, String value2) {
            addCriterion("C_REC_COMPANY between", value1, value2, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecCompanyNotBetween(String value1, String value2) {
            addCriterion("C_REC_COMPANY not between", value1, value2, "cRecCompany");
            return (Criteria) this;
        }

        public Criteria andCRecMobileIsNull() {
            addCriterion("C_REC_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andCRecMobileIsNotNull() {
            addCriterion("C_REC_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andCRecMobileEqualTo(String value) {
            addCriterion("C_REC_MOBILE =", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileNotEqualTo(String value) {
            addCriterion("C_REC_MOBILE <>", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileGreaterThan(String value) {
            addCriterion("C_REC_MOBILE >", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileGreaterThanOrEqualTo(String value) {
            addCriterion("C_REC_MOBILE >=", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileLessThan(String value) {
            addCriterion("C_REC_MOBILE <", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileLessThanOrEqualTo(String value) {
            addCriterion("C_REC_MOBILE <=", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileLike(String value) {
            addCriterion("C_REC_MOBILE like", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileNotLike(String value) {
            addCriterion("C_REC_MOBILE not like", value, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileIn(List<String> values) {
            addCriterion("C_REC_MOBILE in", values, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileNotIn(List<String> values) {
            addCriterion("C_REC_MOBILE not in", values, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileBetween(String value1, String value2) {
            addCriterion("C_REC_MOBILE between", value1, value2, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecMobileNotBetween(String value1, String value2) {
            addCriterion("C_REC_MOBILE not between", value1, value2, "cRecMobile");
            return (Criteria) this;
        }

        public Criteria andCRecNameIsNull() {
            addCriterion("C_REC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCRecNameIsNotNull() {
            addCriterion("C_REC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCRecNameEqualTo(String value) {
            addCriterion("C_REC_NAME =", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameNotEqualTo(String value) {
            addCriterion("C_REC_NAME <>", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameGreaterThan(String value) {
            addCriterion("C_REC_NAME >", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_REC_NAME >=", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameLessThan(String value) {
            addCriterion("C_REC_NAME <", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameLessThanOrEqualTo(String value) {
            addCriterion("C_REC_NAME <=", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameLike(String value) {
            addCriterion("C_REC_NAME like", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameNotLike(String value) {
            addCriterion("C_REC_NAME not like", value, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameIn(List<String> values) {
            addCriterion("C_REC_NAME in", values, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameNotIn(List<String> values) {
            addCriterion("C_REC_NAME not in", values, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameBetween(String value1, String value2) {
            addCriterion("C_REC_NAME between", value1, value2, "cRecName");
            return (Criteria) this;
        }

        public Criteria andCRecNameNotBetween(String value1, String value2) {
            addCriterion("C_REC_NAME not between", value1, value2, "cRecName");
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

        public Criteria andCSendAddressIsNull() {
            addCriterion("C_SEND_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCSendAddressIsNotNull() {
            addCriterion("C_SEND_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCSendAddressEqualTo(String value) {
            addCriterion("C_SEND_ADDRESS =", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressNotEqualTo(String value) {
            addCriterion("C_SEND_ADDRESS <>", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressGreaterThan(String value) {
            addCriterion("C_SEND_ADDRESS >", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_ADDRESS >=", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressLessThan(String value) {
            addCriterion("C_SEND_ADDRESS <", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_ADDRESS <=", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressLike(String value) {
            addCriterion("C_SEND_ADDRESS like", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressNotLike(String value) {
            addCriterion("C_SEND_ADDRESS not like", value, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressIn(List<String> values) {
            addCriterion("C_SEND_ADDRESS in", values, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressNotIn(List<String> values) {
            addCriterion("C_SEND_ADDRESS not in", values, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressBetween(String value1, String value2) {
            addCriterion("C_SEND_ADDRESS between", value1, value2, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendAddressNotBetween(String value1, String value2) {
            addCriterion("C_SEND_ADDRESS not between", value1, value2, "cSendAddress");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyIsNull() {
            addCriterion("C_SEND_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyIsNotNull() {
            addCriterion("C_SEND_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyEqualTo(String value) {
            addCriterion("C_SEND_COMPANY =", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyNotEqualTo(String value) {
            addCriterion("C_SEND_COMPANY <>", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyGreaterThan(String value) {
            addCriterion("C_SEND_COMPANY >", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_COMPANY >=", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyLessThan(String value) {
            addCriterion("C_SEND_COMPANY <", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_COMPANY <=", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyLike(String value) {
            addCriterion("C_SEND_COMPANY like", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyNotLike(String value) {
            addCriterion("C_SEND_COMPANY not like", value, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyIn(List<String> values) {
            addCriterion("C_SEND_COMPANY in", values, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyNotIn(List<String> values) {
            addCriterion("C_SEND_COMPANY not in", values, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyBetween(String value1, String value2) {
            addCriterion("C_SEND_COMPANY between", value1, value2, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendCompanyNotBetween(String value1, String value2) {
            addCriterion("C_SEND_COMPANY not between", value1, value2, "cSendCompany");
            return (Criteria) this;
        }

        public Criteria andCSendMobileIsNull() {
            addCriterion("C_SEND_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andCSendMobileIsNotNull() {
            addCriterion("C_SEND_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andCSendMobileEqualTo(String value) {
            addCriterion("C_SEND_MOBILE =", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileNotEqualTo(String value) {
            addCriterion("C_SEND_MOBILE <>", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileGreaterThan(String value) {
            addCriterion("C_SEND_MOBILE >", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_MOBILE >=", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileLessThan(String value) {
            addCriterion("C_SEND_MOBILE <", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_MOBILE <=", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileLike(String value) {
            addCriterion("C_SEND_MOBILE like", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileNotLike(String value) {
            addCriterion("C_SEND_MOBILE not like", value, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileIn(List<String> values) {
            addCriterion("C_SEND_MOBILE in", values, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileNotIn(List<String> values) {
            addCriterion("C_SEND_MOBILE not in", values, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileBetween(String value1, String value2) {
            addCriterion("C_SEND_MOBILE between", value1, value2, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileNotBetween(String value1, String value2) {
            addCriterion("C_SEND_MOBILE not between", value1, value2, "cSendMobile");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgIsNull() {
            addCriterion("C_SEND_MOBILE_MSG is null");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgIsNotNull() {
            addCriterion("C_SEND_MOBILE_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgEqualTo(String value) {
            addCriterion("C_SEND_MOBILE_MSG =", value, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgNotEqualTo(String value) {
            addCriterion("C_SEND_MOBILE_MSG <>", value, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgGreaterThan(String value) {
            addCriterion("C_SEND_MOBILE_MSG >", value, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_MOBILE_MSG >=", value, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgLessThan(String value) {
            addCriterion("C_SEND_MOBILE_MSG <", value, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_MOBILE_MSG <=", value, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgLike(String value) {
            addCriterion("C_SEND_MOBILE_MSG like", value, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgNotLike(String value) {
            addCriterion("C_SEND_MOBILE_MSG not like", value, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgIn(List<String> values) {
            addCriterion("C_SEND_MOBILE_MSG in", values, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgNotIn(List<String> values) {
            addCriterion("C_SEND_MOBILE_MSG not in", values, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgBetween(String value1, String value2) {
            addCriterion("C_SEND_MOBILE_MSG between", value1, value2, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendMobileMsgNotBetween(String value1, String value2) {
            addCriterion("C_SEND_MOBILE_MSG not between", value1, value2, "cSendMobileMsg");
            return (Criteria) this;
        }

        public Criteria andCSendNameIsNull() {
            addCriterion("C_SEND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCSendNameIsNotNull() {
            addCriterion("C_SEND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCSendNameEqualTo(String value) {
            addCriterion("C_SEND_NAME =", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameNotEqualTo(String value) {
            addCriterion("C_SEND_NAME <>", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameGreaterThan(String value) {
            addCriterion("C_SEND_NAME >", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_NAME >=", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameLessThan(String value) {
            addCriterion("C_SEND_NAME <", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_NAME <=", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameLike(String value) {
            addCriterion("C_SEND_NAME like", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameNotLike(String value) {
            addCriterion("C_SEND_NAME not like", value, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameIn(List<String> values) {
            addCriterion("C_SEND_NAME in", values, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameNotIn(List<String> values) {
            addCriterion("C_SEND_NAME not in", values, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameBetween(String value1, String value2) {
            addCriterion("C_SEND_NAME between", value1, value2, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendNameNotBetween(String value1, String value2) {
            addCriterion("C_SEND_NAME not between", value1, value2, "cSendName");
            return (Criteria) this;
        }

        public Criteria andCSendProNumIsNull() {
            addCriterion("C_SEND_PRO_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCSendProNumIsNotNull() {
            addCriterion("C_SEND_PRO_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCSendProNumEqualTo(String value) {
            addCriterion("C_SEND_PRO_NUM =", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumNotEqualTo(String value) {
            addCriterion("C_SEND_PRO_NUM <>", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumGreaterThan(String value) {
            addCriterion("C_SEND_PRO_NUM >", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_PRO_NUM >=", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumLessThan(String value) {
            addCriterion("C_SEND_PRO_NUM <", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_PRO_NUM <=", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumLike(String value) {
            addCriterion("C_SEND_PRO_NUM like", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumNotLike(String value) {
            addCriterion("C_SEND_PRO_NUM not like", value, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumIn(List<String> values) {
            addCriterion("C_SEND_PRO_NUM in", values, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumNotIn(List<String> values) {
            addCriterion("C_SEND_PRO_NUM not in", values, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumBetween(String value1, String value2) {
            addCriterion("C_SEND_PRO_NUM between", value1, value2, "cSendProNum");
            return (Criteria) this;
        }

        public Criteria andCSendProNumNotBetween(String value1, String value2) {
            addCriterion("C_SEND_PRO_NUM not between", value1, value2, "cSendProNum");
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

        public Criteria andCWeightIsNull() {
            addCriterion("C_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andCWeightIsNotNull() {
            addCriterion("C_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andCWeightEqualTo(Double value) {
            addCriterion("C_WEIGHT =", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightNotEqualTo(Double value) {
            addCriterion("C_WEIGHT <>", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightGreaterThan(Double value) {
            addCriterion("C_WEIGHT >", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("C_WEIGHT >=", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightLessThan(Double value) {
            addCriterion("C_WEIGHT <", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightLessThanOrEqualTo(Double value) {
            addCriterion("C_WEIGHT <=", value, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightIn(List<Double> values) {
            addCriterion("C_WEIGHT in", values, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightNotIn(List<Double> values) {
            addCriterion("C_WEIGHT not in", values, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightBetween(Double value1, Double value2) {
            addCriterion("C_WEIGHT between", value1, value2, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCWeightNotBetween(Double value1, Double value2) {
            addCriterion("C_WEIGHT not between", value1, value2, "cWeight");
            return (Criteria) this;
        }

        public Criteria andCCourierIdIsNull() {
            addCriterion("C_COURIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCourierIdIsNotNull() {
            addCriterion("C_COURIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCourierIdEqualTo(Integer value) {
            addCriterion("C_COURIER_ID =", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdNotEqualTo(Integer value) {
            addCriterion("C_COURIER_ID <>", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdGreaterThan(Integer value) {
            addCriterion("C_COURIER_ID >", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_COURIER_ID >=", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdLessThan(Integer value) {
            addCriterion("C_COURIER_ID <", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_COURIER_ID <=", value, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdIn(List<Integer> values) {
            addCriterion("C_COURIER_ID in", values, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdNotIn(List<Integer> values) {
            addCriterion("C_COURIER_ID not in", values, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdBetween(Integer value1, Integer value2) {
            addCriterion("C_COURIER_ID between", value1, value2, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCCourierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_COURIER_ID not between", value1, value2, "cCourierId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdIsNull() {
            addCriterion("C_REC_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdIsNotNull() {
            addCriterion("C_REC_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdEqualTo(String value) {
            addCriterion("C_REC_AREA_ID =", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdNotEqualTo(String value) {
            addCriterion("C_REC_AREA_ID <>", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdGreaterThan(String value) {
            addCriterion("C_REC_AREA_ID >", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_REC_AREA_ID >=", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdLessThan(String value) {
            addCriterion("C_REC_AREA_ID <", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdLessThanOrEqualTo(String value) {
            addCriterion("C_REC_AREA_ID <=", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdLike(String value) {
            addCriterion("C_REC_AREA_ID like", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdNotLike(String value) {
            addCriterion("C_REC_AREA_ID not like", value, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdIn(List<String> values) {
            addCriterion("C_REC_AREA_ID in", values, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdNotIn(List<String> values) {
            addCriterion("C_REC_AREA_ID not in", values, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdBetween(String value1, String value2) {
            addCriterion("C_REC_AREA_ID between", value1, value2, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCRecAreaIdNotBetween(String value1, String value2) {
            addCriterion("C_REC_AREA_ID not between", value1, value2, "cRecAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdIsNull() {
            addCriterion("C_SEND_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdIsNotNull() {
            addCriterion("C_SEND_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdEqualTo(String value) {
            addCriterion("C_SEND_AREA_ID =", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdNotEqualTo(String value) {
            addCriterion("C_SEND_AREA_ID <>", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdGreaterThan(String value) {
            addCriterion("C_SEND_AREA_ID >", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_SEND_AREA_ID >=", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdLessThan(String value) {
            addCriterion("C_SEND_AREA_ID <", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdLessThanOrEqualTo(String value) {
            addCriterion("C_SEND_AREA_ID <=", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdLike(String value) {
            addCriterion("C_SEND_AREA_ID like", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdNotLike(String value) {
            addCriterion("C_SEND_AREA_ID not like", value, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdIn(List<String> values) {
            addCriterion("C_SEND_AREA_ID in", values, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdNotIn(List<String> values) {
            addCriterion("C_SEND_AREA_ID not in", values, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdBetween(String value1, String value2) {
            addCriterion("C_SEND_AREA_ID between", value1, value2, "cSendAreaId");
            return (Criteria) this;
        }

        public Criteria andCSendAreaIdNotBetween(String value1, String value2) {
            addCriterion("C_SEND_AREA_ID not between", value1, value2, "cSendAreaId");
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