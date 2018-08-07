package com.qxcjs.mybatis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TableDependInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableDependInfoExample() {
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

        public Criteria andFindexIsNull() {
            addCriterion("Findex is null");
            return (Criteria) this;
        }

        public Criteria andFindexIsNotNull() {
            addCriterion("Findex is not null");
            return (Criteria) this;
        }

        public Criteria andFindexEqualTo(Integer value) {
            addCriterion("Findex =", value, "findex");
            return (Criteria) this;
        }

        public Criteria andFindexNotEqualTo(Integer value) {
            addCriterion("Findex <>", value, "findex");
            return (Criteria) this;
        }

        public Criteria andFindexGreaterThan(Integer value) {
            addCriterion("Findex >", value, "findex");
            return (Criteria) this;
        }

        public Criteria andFindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("Findex >=", value, "findex");
            return (Criteria) this;
        }

        public Criteria andFindexLessThan(Integer value) {
            addCriterion("Findex <", value, "findex");
            return (Criteria) this;
        }

        public Criteria andFindexLessThanOrEqualTo(Integer value) {
            addCriterion("Findex <=", value, "findex");
            return (Criteria) this;
        }

        public Criteria andFindexIn(List<Integer> values) {
            addCriterion("Findex in", values, "findex");
            return (Criteria) this;
        }

        public Criteria andFindexNotIn(List<Integer> values) {
            addCriterion("Findex not in", values, "findex");
            return (Criteria) this;
        }

        public Criteria andFindexBetween(Integer value1, Integer value2) {
            addCriterion("Findex between", value1, value2, "findex");
            return (Criteria) this;
        }

        public Criteria andFindexNotBetween(Integer value1, Integer value2) {
            addCriterion("Findex not between", value1, value2, "findex");
            return (Criteria) this;
        }

        public Criteria andFhostKeyIsNull() {
            addCriterion("Fhost_key is null");
            return (Criteria) this;
        }

        public Criteria andFhostKeyIsNotNull() {
            addCriterion("Fhost_key is not null");
            return (Criteria) this;
        }

        public Criteria andFhostKeyEqualTo(Integer value) {
            addCriterion("Fhost_key =", value, "fhostKey");
            return (Criteria) this;
        }

        public Criteria andFhostKeyNotEqualTo(Integer value) {
            addCriterion("Fhost_key <>", value, "fhostKey");
            return (Criteria) this;
        }

        public Criteria andFhostKeyGreaterThan(Integer value) {
            addCriterion("Fhost_key >", value, "fhostKey");
            return (Criteria) this;
        }

        public Criteria andFhostKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fhost_key >=", value, "fhostKey");
            return (Criteria) this;
        }

        public Criteria andFhostKeyLessThan(Integer value) {
            addCriterion("Fhost_key <", value, "fhostKey");
            return (Criteria) this;
        }

        public Criteria andFhostKeyLessThanOrEqualTo(Integer value) {
            addCriterion("Fhost_key <=", value, "fhostKey");
            return (Criteria) this;
        }

        public Criteria andFhostKeyIn(List<Integer> values) {
            addCriterion("Fhost_key in", values, "fhostKey");
            return (Criteria) this;
        }

        public Criteria andFhostKeyNotIn(List<Integer> values) {
            addCriterion("Fhost_key not in", values, "fhostKey");
            return (Criteria) this;
        }

        public Criteria andFhostKeyBetween(Integer value1, Integer value2) {
            addCriterion("Fhost_key between", value1, value2, "fhostKey");
            return (Criteria) this;
        }

        public Criteria andFhostKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("Fhost_key not between", value1, value2, "fhostKey");
            return (Criteria) this;
        }

        public Criteria andFhostIdIsNull() {
            addCriterion("Fhost_id is null");
            return (Criteria) this;
        }

        public Criteria andFhostIdIsNotNull() {
            addCriterion("Fhost_id is not null");
            return (Criteria) this;
        }

        public Criteria andFhostIdEqualTo(String value) {
            addCriterion("Fhost_id =", value, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdNotEqualTo(String value) {
            addCriterion("Fhost_id <>", value, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdGreaterThan(String value) {
            addCriterion("Fhost_id >", value, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdGreaterThanOrEqualTo(String value) {
            addCriterion("Fhost_id >=", value, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdLessThan(String value) {
            addCriterion("Fhost_id <", value, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdLessThanOrEqualTo(String value) {
            addCriterion("Fhost_id <=", value, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdLike(String value) {
            addCriterion("Fhost_id like", value, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdNotLike(String value) {
            addCriterion("Fhost_id not like", value, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdIn(List<String> values) {
            addCriterion("Fhost_id in", values, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdNotIn(List<String> values) {
            addCriterion("Fhost_id not in", values, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdBetween(String value1, String value2) {
            addCriterion("Fhost_id between", value1, value2, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFhostIdNotBetween(String value1, String value2) {
            addCriterion("Fhost_id not between", value1, value2, "fhostId");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyIsNull() {
            addCriterion("Fdatabase_key is null");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyIsNotNull() {
            addCriterion("Fdatabase_key is not null");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyEqualTo(Integer value) {
            addCriterion("Fdatabase_key =", value, "fdatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyNotEqualTo(Integer value) {
            addCriterion("Fdatabase_key <>", value, "fdatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyGreaterThan(Integer value) {
            addCriterion("Fdatabase_key >", value, "fdatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fdatabase_key >=", value, "fdatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyLessThan(Integer value) {
            addCriterion("Fdatabase_key <", value, "fdatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyLessThanOrEqualTo(Integer value) {
            addCriterion("Fdatabase_key <=", value, "fdatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyIn(List<Integer> values) {
            addCriterion("Fdatabase_key in", values, "fdatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyNotIn(List<Integer> values) {
            addCriterion("Fdatabase_key not in", values, "fdatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyBetween(Integer value1, Integer value2) {
            addCriterion("Fdatabase_key between", value1, value2, "fdatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdatabaseKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("Fdatabase_key not between", value1, value2, "fdatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameIsNull() {
            addCriterion("Fdatabase_name is null");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameIsNotNull() {
            addCriterion("Fdatabase_name is not null");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameEqualTo(String value) {
            addCriterion("Fdatabase_name =", value, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameNotEqualTo(String value) {
            addCriterion("Fdatabase_name <>", value, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameGreaterThan(String value) {
            addCriterion("Fdatabase_name >", value, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("Fdatabase_name >=", value, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameLessThan(String value) {
            addCriterion("Fdatabase_name <", value, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameLessThanOrEqualTo(String value) {
            addCriterion("Fdatabase_name <=", value, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameLike(String value) {
            addCriterion("Fdatabase_name like", value, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameNotLike(String value) {
            addCriterion("Fdatabase_name not like", value, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameIn(List<String> values) {
            addCriterion("Fdatabase_name in", values, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameNotIn(List<String> values) {
            addCriterion("Fdatabase_name not in", values, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameBetween(String value1, String value2) {
            addCriterion("Fdatabase_name between", value1, value2, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdatabaseNameNotBetween(String value1, String value2) {
            addCriterion("Fdatabase_name not between", value1, value2, "fdatabaseName");
            return (Criteria) this;
        }

        public Criteria andFtableKeyIsNull() {
            addCriterion("Ftable_key is null");
            return (Criteria) this;
        }

        public Criteria andFtableKeyIsNotNull() {
            addCriterion("Ftable_key is not null");
            return (Criteria) this;
        }

        public Criteria andFtableKeyEqualTo(Integer value) {
            addCriterion("Ftable_key =", value, "ftableKey");
            return (Criteria) this;
        }

        public Criteria andFtableKeyNotEqualTo(Integer value) {
            addCriterion("Ftable_key <>", value, "ftableKey");
            return (Criteria) this;
        }

        public Criteria andFtableKeyGreaterThan(Integer value) {
            addCriterion("Ftable_key >", value, "ftableKey");
            return (Criteria) this;
        }

        public Criteria andFtableKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ftable_key >=", value, "ftableKey");
            return (Criteria) this;
        }

        public Criteria andFtableKeyLessThan(Integer value) {
            addCriterion("Ftable_key <", value, "ftableKey");
            return (Criteria) this;
        }

        public Criteria andFtableKeyLessThanOrEqualTo(Integer value) {
            addCriterion("Ftable_key <=", value, "ftableKey");
            return (Criteria) this;
        }

        public Criteria andFtableKeyIn(List<Integer> values) {
            addCriterion("Ftable_key in", values, "ftableKey");
            return (Criteria) this;
        }

        public Criteria andFtableKeyNotIn(List<Integer> values) {
            addCriterion("Ftable_key not in", values, "ftableKey");
            return (Criteria) this;
        }

        public Criteria andFtableKeyBetween(Integer value1, Integer value2) {
            addCriterion("Ftable_key between", value1, value2, "ftableKey");
            return (Criteria) this;
        }

        public Criteria andFtableKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("Ftable_key not between", value1, value2, "ftableKey");
            return (Criteria) this;
        }

        public Criteria andFtableNameIsNull() {
            addCriterion("Ftable_name is null");
            return (Criteria) this;
        }

        public Criteria andFtableNameIsNotNull() {
            addCriterion("Ftable_name is not null");
            return (Criteria) this;
        }

        public Criteria andFtableNameEqualTo(String value) {
            addCriterion("Ftable_name =", value, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameNotEqualTo(String value) {
            addCriterion("Ftable_name <>", value, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameGreaterThan(String value) {
            addCriterion("Ftable_name >", value, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameGreaterThanOrEqualTo(String value) {
            addCriterion("Ftable_name >=", value, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameLessThan(String value) {
            addCriterion("Ftable_name <", value, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameLessThanOrEqualTo(String value) {
            addCriterion("Ftable_name <=", value, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameLike(String value) {
            addCriterion("Ftable_name like", value, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameNotLike(String value) {
            addCriterion("Ftable_name not like", value, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameIn(List<String> values) {
            addCriterion("Ftable_name in", values, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameNotIn(List<String> values) {
            addCriterion("Ftable_name not in", values, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameBetween(String value1, String value2) {
            addCriterion("Ftable_name between", value1, value2, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFtableNameNotBetween(String value1, String value2) {
            addCriterion("Ftable_name not between", value1, value2, "ftableName");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyIsNull() {
            addCriterion("Fdepend_host_key is null");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyIsNotNull() {
            addCriterion("Fdepend_host_key is not null");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyEqualTo(Integer value) {
            addCriterion("Fdepend_host_key =", value, "fdependHostKey");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyNotEqualTo(Integer value) {
            addCriterion("Fdepend_host_key <>", value, "fdependHostKey");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyGreaterThan(Integer value) {
            addCriterion("Fdepend_host_key >", value, "fdependHostKey");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fdepend_host_key >=", value, "fdependHostKey");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyLessThan(Integer value) {
            addCriterion("Fdepend_host_key <", value, "fdependHostKey");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyLessThanOrEqualTo(Integer value) {
            addCriterion("Fdepend_host_key <=", value, "fdependHostKey");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyIn(List<Integer> values) {
            addCriterion("Fdepend_host_key in", values, "fdependHostKey");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyNotIn(List<Integer> values) {
            addCriterion("Fdepend_host_key not in", values, "fdependHostKey");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyBetween(Integer value1, Integer value2) {
            addCriterion("Fdepend_host_key between", value1, value2, "fdependHostKey");
            return (Criteria) this;
        }

        public Criteria andFdependHostKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("Fdepend_host_key not between", value1, value2, "fdependHostKey");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdIsNull() {
            addCriterion("Fdepend_host_id is null");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdIsNotNull() {
            addCriterion("Fdepend_host_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdEqualTo(String value) {
            addCriterion("Fdepend_host_id =", value, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdNotEqualTo(String value) {
            addCriterion("Fdepend_host_id <>", value, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdGreaterThan(String value) {
            addCriterion("Fdepend_host_id >", value, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdGreaterThanOrEqualTo(String value) {
            addCriterion("Fdepend_host_id >=", value, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdLessThan(String value) {
            addCriterion("Fdepend_host_id <", value, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdLessThanOrEqualTo(String value) {
            addCriterion("Fdepend_host_id <=", value, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdLike(String value) {
            addCriterion("Fdepend_host_id like", value, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdNotLike(String value) {
            addCriterion("Fdepend_host_id not like", value, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdIn(List<String> values) {
            addCriterion("Fdepend_host_id in", values, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdNotIn(List<String> values) {
            addCriterion("Fdepend_host_id not in", values, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdBetween(String value1, String value2) {
            addCriterion("Fdepend_host_id between", value1, value2, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependHostIdNotBetween(String value1, String value2) {
            addCriterion("Fdepend_host_id not between", value1, value2, "fdependHostId");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyIsNull() {
            addCriterion("Fdepend_database_key is null");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyIsNotNull() {
            addCriterion("Fdepend_database_key is not null");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyEqualTo(Integer value) {
            addCriterion("Fdepend_database_key =", value, "fdependDatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyNotEqualTo(Integer value) {
            addCriterion("Fdepend_database_key <>", value, "fdependDatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyGreaterThan(Integer value) {
            addCriterion("Fdepend_database_key >", value, "fdependDatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fdepend_database_key >=", value, "fdependDatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyLessThan(Integer value) {
            addCriterion("Fdepend_database_key <", value, "fdependDatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyLessThanOrEqualTo(Integer value) {
            addCriterion("Fdepend_database_key <=", value, "fdependDatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyIn(List<Integer> values) {
            addCriterion("Fdepend_database_key in", values, "fdependDatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyNotIn(List<Integer> values) {
            addCriterion("Fdepend_database_key not in", values, "fdependDatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyBetween(Integer value1, Integer value2) {
            addCriterion("Fdepend_database_key between", value1, value2, "fdependDatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("Fdepend_database_key not between", value1, value2, "fdependDatabaseKey");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameIsNull() {
            addCriterion("Fdepend_database_name is null");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameIsNotNull() {
            addCriterion("Fdepend_database_name is not null");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameEqualTo(String value) {
            addCriterion("Fdepend_database_name =", value, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameNotEqualTo(String value) {
            addCriterion("Fdepend_database_name <>", value, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameGreaterThan(String value) {
            addCriterion("Fdepend_database_name >", value, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("Fdepend_database_name >=", value, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameLessThan(String value) {
            addCriterion("Fdepend_database_name <", value, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameLessThanOrEqualTo(String value) {
            addCriterion("Fdepend_database_name <=", value, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameLike(String value) {
            addCriterion("Fdepend_database_name like", value, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameNotLike(String value) {
            addCriterion("Fdepend_database_name not like", value, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameIn(List<String> values) {
            addCriterion("Fdepend_database_name in", values, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameNotIn(List<String> values) {
            addCriterion("Fdepend_database_name not in", values, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameBetween(String value1, String value2) {
            addCriterion("Fdepend_database_name between", value1, value2, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependDatabaseNameNotBetween(String value1, String value2) {
            addCriterion("Fdepend_database_name not between", value1, value2, "fdependDatabaseName");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyIsNull() {
            addCriterion("Fdepend_table_key is null");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyIsNotNull() {
            addCriterion("Fdepend_table_key is not null");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyEqualTo(Integer value) {
            addCriterion("Fdepend_table_key =", value, "fdependTableKey");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyNotEqualTo(Integer value) {
            addCriterion("Fdepend_table_key <>", value, "fdependTableKey");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyGreaterThan(Integer value) {
            addCriterion("Fdepend_table_key >", value, "fdependTableKey");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fdepend_table_key >=", value, "fdependTableKey");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyLessThan(Integer value) {
            addCriterion("Fdepend_table_key <", value, "fdependTableKey");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyLessThanOrEqualTo(Integer value) {
            addCriterion("Fdepend_table_key <=", value, "fdependTableKey");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyIn(List<Integer> values) {
            addCriterion("Fdepend_table_key in", values, "fdependTableKey");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyNotIn(List<Integer> values) {
            addCriterion("Fdepend_table_key not in", values, "fdependTableKey");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyBetween(Integer value1, Integer value2) {
            addCriterion("Fdepend_table_key between", value1, value2, "fdependTableKey");
            return (Criteria) this;
        }

        public Criteria andFdependTableKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("Fdepend_table_key not between", value1, value2, "fdependTableKey");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameIsNull() {
            addCriterion("Fdepend_table_name is null");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameIsNotNull() {
            addCriterion("Fdepend_table_name is not null");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameEqualTo(String value) {
            addCriterion("Fdepend_table_name =", value, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameNotEqualTo(String value) {
            addCriterion("Fdepend_table_name <>", value, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameGreaterThan(String value) {
            addCriterion("Fdepend_table_name >", value, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("Fdepend_table_name >=", value, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameLessThan(String value) {
            addCriterion("Fdepend_table_name <", value, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameLessThanOrEqualTo(String value) {
            addCriterion("Fdepend_table_name <=", value, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameLike(String value) {
            addCriterion("Fdepend_table_name like", value, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameNotLike(String value) {
            addCriterion("Fdepend_table_name not like", value, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameIn(List<String> values) {
            addCriterion("Fdepend_table_name in", values, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameNotIn(List<String> values) {
            addCriterion("Fdepend_table_name not in", values, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameBetween(String value1, String value2) {
            addCriterion("Fdepend_table_name between", value1, value2, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFdependTableNameNotBetween(String value1, String value2) {
            addCriterion("Fdepend_table_name not between", value1, value2, "fdependTableName");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemIsNull() {
            addCriterion("fbelong_system is null");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemIsNotNull() {
            addCriterion("fbelong_system is not null");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemEqualTo(String value) {
            addCriterion("fbelong_system =", value, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemNotEqualTo(String value) {
            addCriterion("fbelong_system <>", value, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemGreaterThan(String value) {
            addCriterion("fbelong_system >", value, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemGreaterThanOrEqualTo(String value) {
            addCriterion("fbelong_system >=", value, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemLessThan(String value) {
            addCriterion("fbelong_system <", value, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemLessThanOrEqualTo(String value) {
            addCriterion("fbelong_system <=", value, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemLike(String value) {
            addCriterion("fbelong_system like", value, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemNotLike(String value) {
            addCriterion("fbelong_system not like", value, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemIn(List<String> values) {
            addCriterion("fbelong_system in", values, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemNotIn(List<String> values) {
            addCriterion("fbelong_system not in", values, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemBetween(String value1, String value2) {
            addCriterion("fbelong_system between", value1, value2, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFbelongSystemNotBetween(String value1, String value2) {
            addCriterion("fbelong_system not between", value1, value2, "fbelongSystem");
            return (Criteria) this;
        }

        public Criteria andFuseFlagIsNull() {
            addCriterion("Fuse_flag is null");
            return (Criteria) this;
        }

        public Criteria andFuseFlagIsNotNull() {
            addCriterion("Fuse_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFuseFlagEqualTo(Integer value) {
            addCriterion("Fuse_flag =", value, "fuseFlag");
            return (Criteria) this;
        }

        public Criteria andFuseFlagNotEqualTo(Integer value) {
            addCriterion("Fuse_flag <>", value, "fuseFlag");
            return (Criteria) this;
        }

        public Criteria andFuseFlagGreaterThan(Integer value) {
            addCriterion("Fuse_flag >", value, "fuseFlag");
            return (Criteria) this;
        }

        public Criteria andFuseFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fuse_flag >=", value, "fuseFlag");
            return (Criteria) this;
        }

        public Criteria andFuseFlagLessThan(Integer value) {
            addCriterion("Fuse_flag <", value, "fuseFlag");
            return (Criteria) this;
        }

        public Criteria andFuseFlagLessThanOrEqualTo(Integer value) {
            addCriterion("Fuse_flag <=", value, "fuseFlag");
            return (Criteria) this;
        }

        public Criteria andFuseFlagIn(List<Integer> values) {
            addCriterion("Fuse_flag in", values, "fuseFlag");
            return (Criteria) this;
        }

        public Criteria andFuseFlagNotIn(List<Integer> values) {
            addCriterion("Fuse_flag not in", values, "fuseFlag");
            return (Criteria) this;
        }

        public Criteria andFuseFlagBetween(Integer value1, Integer value2) {
            addCriterion("Fuse_flag between", value1, value2, "fuseFlag");
            return (Criteria) this;
        }

        public Criteria andFuseFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Fuse_flag not between", value1, value2, "fuseFlag");
            return (Criteria) this;
        }

        public Criteria andFremarkIsNull() {
            addCriterion("fremark is null");
            return (Criteria) this;
        }

        public Criteria andFremarkIsNotNull() {
            addCriterion("fremark is not null");
            return (Criteria) this;
        }

        public Criteria andFremarkEqualTo(String value) {
            addCriterion("fremark =", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkNotEqualTo(String value) {
            addCriterion("fremark <>", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkGreaterThan(String value) {
            addCriterion("fremark >", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkGreaterThanOrEqualTo(String value) {
            addCriterion("fremark >=", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkLessThan(String value) {
            addCriterion("fremark <", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkLessThanOrEqualTo(String value) {
            addCriterion("fremark <=", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkLike(String value) {
            addCriterion("fremark like", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkNotLike(String value) {
            addCriterion("fremark not like", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkIn(List<String> values) {
            addCriterion("fremark in", values, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkNotIn(List<String> values) {
            addCriterion("fremark not in", values, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkBetween(String value1, String value2) {
            addCriterion("fremark between", value1, value2, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkNotBetween(String value1, String value2) {
            addCriterion("fremark not between", value1, value2, "fremark");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeIsNull() {
            addCriterion("Fcreate_time is null");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeIsNotNull() {
            addCriterion("Fcreate_time is not null");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeEqualTo(Date value) {
            addCriterion("Fcreate_time =", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeNotEqualTo(Date value) {
            addCriterion("Fcreate_time <>", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeGreaterThan(Date value) {
            addCriterion("Fcreate_time >", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Fcreate_time >=", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeLessThan(Date value) {
            addCriterion("Fcreate_time <", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Fcreate_time <=", value, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeIn(List<Date> values) {
            addCriterion("Fcreate_time in", values, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeNotIn(List<Date> values) {
            addCriterion("Fcreate_time not in", values, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeBetween(Date value1, Date value2) {
            addCriterion("Fcreate_time between", value1, value2, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFcreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Fcreate_time not between", value1, value2, "fcreateTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeIsNull() {
            addCriterion("Fmodify_time is null");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeIsNotNull() {
            addCriterion("Fmodify_time is not null");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeEqualTo(Date value) {
            addCriterion("Fmodify_time =", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeNotEqualTo(Date value) {
            addCriterion("Fmodify_time <>", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeGreaterThan(Date value) {
            addCriterion("Fmodify_time >", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Fmodify_time >=", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeLessThan(Date value) {
            addCriterion("Fmodify_time <", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("Fmodify_time <=", value, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeIn(List<Date> values) {
            addCriterion("Fmodify_time in", values, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeNotIn(List<Date> values) {
            addCriterion("Fmodify_time not in", values, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeBetween(Date value1, Date value2) {
            addCriterion("Fmodify_time between", value1, value2, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("Fmodify_time not between", value1, value2, "fmodifyTime");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserIsNull() {
            addCriterion("Fmodify_user is null");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserIsNotNull() {
            addCriterion("Fmodify_user is not null");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserEqualTo(String value) {
            addCriterion("Fmodify_user =", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserNotEqualTo(String value) {
            addCriterion("Fmodify_user <>", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserGreaterThan(String value) {
            addCriterion("Fmodify_user >", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("Fmodify_user >=", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserLessThan(String value) {
            addCriterion("Fmodify_user <", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserLessThanOrEqualTo(String value) {
            addCriterion("Fmodify_user <=", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserLike(String value) {
            addCriterion("Fmodify_user like", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserNotLike(String value) {
            addCriterion("Fmodify_user not like", value, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserIn(List<String> values) {
            addCriterion("Fmodify_user in", values, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserNotIn(List<String> values) {
            addCriterion("Fmodify_user not in", values, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserBetween(String value1, String value2) {
            addCriterion("Fmodify_user between", value1, value2, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFmodifyUserNotBetween(String value1, String value2) {
            addCriterion("Fmodify_user not between", value1, value2, "fmodifyUser");
            return (Criteria) this;
        }

        public Criteria andFversionIsNull() {
            addCriterion("Fversion is null");
            return (Criteria) this;
        }

        public Criteria andFversionIsNotNull() {
            addCriterion("Fversion is not null");
            return (Criteria) this;
        }

        public Criteria andFversionEqualTo(Integer value) {
            addCriterion("Fversion =", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionNotEqualTo(Integer value) {
            addCriterion("Fversion <>", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionGreaterThan(Integer value) {
            addCriterion("Fversion >", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fversion >=", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionLessThan(Integer value) {
            addCriterion("Fversion <", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionLessThanOrEqualTo(Integer value) {
            addCriterion("Fversion <=", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionIn(List<Integer> values) {
            addCriterion("Fversion in", values, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionNotIn(List<Integer> values) {
            addCriterion("Fversion not in", values, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionBetween(Integer value1, Integer value2) {
            addCriterion("Fversion between", value1, value2, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionNotBetween(Integer value1, Integer value2) {
            addCriterion("Fversion not between", value1, value2, "fversion");
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