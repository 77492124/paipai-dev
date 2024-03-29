package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PricehistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PricehistoryExample() {
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

        public Criteria andPhidIsNull() {
            addCriterion("phid is null");
            return (Criteria) this;
        }

        public Criteria andPhidIsNotNull() {
            addCriterion("phid is not null");
            return (Criteria) this;
        }

        public Criteria andPhidEqualTo(Integer value) {
            addCriterion("phid =", value, "phid");
            return (Criteria) this;
        }

        public Criteria andPhidNotEqualTo(Integer value) {
            addCriterion("phid <>", value, "phid");
            return (Criteria) this;
        }

        public Criteria andPhidGreaterThan(Integer value) {
            addCriterion("phid >", value, "phid");
            return (Criteria) this;
        }

        public Criteria andPhidGreaterThanOrEqualTo(Integer value) {
            addCriterion("phid >=", value, "phid");
            return (Criteria) this;
        }

        public Criteria andPhidLessThan(Integer value) {
            addCriterion("phid <", value, "phid");
            return (Criteria) this;
        }

        public Criteria andPhidLessThanOrEqualTo(Integer value) {
            addCriterion("phid <=", value, "phid");
            return (Criteria) this;
        }

        public Criteria andPhidIn(List<Integer> values) {
            addCriterion("phid in", values, "phid");
            return (Criteria) this;
        }

        public Criteria andPhidNotIn(List<Integer> values) {
            addCriterion("phid not in", values, "phid");
            return (Criteria) this;
        }

        public Criteria andPhidBetween(Integer value1, Integer value2) {
            addCriterion("phid between", value1, value2, "phid");
            return (Criteria) this;
        }

        public Criteria andPhidNotBetween(Integer value1, Integer value2) {
            addCriterion("phid not between", value1, value2, "phid");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPhmoneyIsNull() {
            addCriterion("phmoney is null");
            return (Criteria) this;
        }

        public Criteria andPhmoneyIsNotNull() {
            addCriterion("phmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPhmoneyEqualTo(Double value) {
            addCriterion("phmoney =", value, "phmoney");
            return (Criteria) this;
        }

        public Criteria andPhmoneyNotEqualTo(Double value) {
            addCriterion("phmoney <>", value, "phmoney");
            return (Criteria) this;
        }

        public Criteria andPhmoneyGreaterThan(Double value) {
            addCriterion("phmoney >", value, "phmoney");
            return (Criteria) this;
        }

        public Criteria andPhmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("phmoney >=", value, "phmoney");
            return (Criteria) this;
        }

        public Criteria andPhmoneyLessThan(Double value) {
            addCriterion("phmoney <", value, "phmoney");
            return (Criteria) this;
        }

        public Criteria andPhmoneyLessThanOrEqualTo(Double value) {
            addCriterion("phmoney <=", value, "phmoney");
            return (Criteria) this;
        }

        public Criteria andPhmoneyIn(List<Double> values) {
            addCriterion("phmoney in", values, "phmoney");
            return (Criteria) this;
        }

        public Criteria andPhmoneyNotIn(List<Double> values) {
            addCriterion("phmoney not in", values, "phmoney");
            return (Criteria) this;
        }

        public Criteria andPhmoneyBetween(Double value1, Double value2) {
            addCriterion("phmoney between", value1, value2, "phmoney");
            return (Criteria) this;
        }

        public Criteria andPhmoneyNotBetween(Double value1, Double value2) {
            addCriterion("phmoney not between", value1, value2, "phmoney");
            return (Criteria) this;
        }

        public Criteria andPhtimeIsNull() {
            addCriterion("phtime is null");
            return (Criteria) this;
        }

        public Criteria andPhtimeIsNotNull() {
            addCriterion("phtime is not null");
            return (Criteria) this;
        }

        public Criteria andPhtimeEqualTo(Date value) {
            addCriterion("phtime =", value, "phtime");
            return (Criteria) this;
        }

        public Criteria andPhtimeNotEqualTo(Date value) {
            addCriterion("phtime <>", value, "phtime");
            return (Criteria) this;
        }

        public Criteria andPhtimeGreaterThan(Date value) {
            addCriterion("phtime >", value, "phtime");
            return (Criteria) this;
        }

        public Criteria andPhtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("phtime >=", value, "phtime");
            return (Criteria) this;
        }

        public Criteria andPhtimeLessThan(Date value) {
            addCriterion("phtime <", value, "phtime");
            return (Criteria) this;
        }

        public Criteria andPhtimeLessThanOrEqualTo(Date value) {
            addCriterion("phtime <=", value, "phtime");
            return (Criteria) this;
        }

        public Criteria andPhtimeIn(List<Date> values) {
            addCriterion("phtime in", values, "phtime");
            return (Criteria) this;
        }

        public Criteria andPhtimeNotIn(List<Date> values) {
            addCriterion("phtime not in", values, "phtime");
            return (Criteria) this;
        }

        public Criteria andPhtimeBetween(Date value1, Date value2) {
            addCriterion("phtime between", value1, value2, "phtime");
            return (Criteria) this;
        }

        public Criteria andPhtimeNotBetween(Date value1, Date value2) {
            addCriterion("phtime not between", value1, value2, "phtime");
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