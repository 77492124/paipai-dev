package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class DepositExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepositExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
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

        public Criteria andDmoneyIsNull() {
            addCriterion("dmoney is null");
            return (Criteria) this;
        }

        public Criteria andDmoneyIsNotNull() {
            addCriterion("dmoney is not null");
            return (Criteria) this;
        }

        public Criteria andDmoneyEqualTo(Double value) {
            addCriterion("dmoney =", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyNotEqualTo(Double value) {
            addCriterion("dmoney <>", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyGreaterThan(Double value) {
            addCriterion("dmoney >", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("dmoney >=", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyLessThan(Double value) {
            addCriterion("dmoney <", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyLessThanOrEqualTo(Double value) {
            addCriterion("dmoney <=", value, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyIn(List<Double> values) {
            addCriterion("dmoney in", values, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyNotIn(List<Double> values) {
            addCriterion("dmoney not in", values, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyBetween(Double value1, Double value2) {
            addCriterion("dmoney between", value1, value2, "dmoney");
            return (Criteria) this;
        }

        public Criteria andDmoneyNotBetween(Double value1, Double value2) {
            addCriterion("dmoney not between", value1, value2, "dmoney");
            return (Criteria) this;
        }

        public Criteria andGstateIsNull() {
            addCriterion("gstate is null");
            return (Criteria) this;
        }

        public Criteria andGstateIsNotNull() {
            addCriterion("gstate is not null");
            return (Criteria) this;
        }

        public Criteria andGstateEqualTo(Integer value) {
            addCriterion("gstate =", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateNotEqualTo(Integer value) {
            addCriterion("gstate <>", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateGreaterThan(Integer value) {
            addCriterion("gstate >", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("gstate >=", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateLessThan(Integer value) {
            addCriterion("gstate <", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateLessThanOrEqualTo(Integer value) {
            addCriterion("gstate <=", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateIn(List<Integer> values) {
            addCriterion("gstate in", values, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateNotIn(List<Integer> values) {
            addCriterion("gstate not in", values, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateBetween(Integer value1, Integer value2) {
            addCriterion("gstate between", value1, value2, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateNotBetween(Integer value1, Integer value2) {
            addCriterion("gstate not between", value1, value2, "gstate");
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