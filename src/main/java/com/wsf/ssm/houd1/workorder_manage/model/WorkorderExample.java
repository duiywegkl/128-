package com.wsf.ssm.houd1.workorder_manage.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public WorkorderExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andw_idIsNull() {
            addCriterion("w_id is null");
            return (Criteria) this;
        }

        public Criteria andw_idIsNotNull() {
            addCriterion("w_id is not null");
            return (Criteria) this;
        }

        public Criteria andw_idEqualTo(Integer value) {
            addCriterion("w_id =", value, "w_id");
            return (Criteria) this;
        }

        public Criteria andw_idNotEqualTo(Integer value) {
            addCriterion("w_id <>", value, "w_id");
            return (Criteria) this;
        }

        public Criteria andw_idGreaterThan(Integer value) {
            addCriterion("w_id >", value, "w_id");
            return (Criteria) this;
        }

        public Criteria andw_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_id >=", value, "w_id");
            return (Criteria) this;
        }

        public Criteria andw_idLessThan(Integer value) {
            addCriterion("w_id <", value, "w_id");
            return (Criteria) this;
        }

        public Criteria andw_idLessThanOrEqualTo(Integer value) {
            addCriterion("w_id <=", value, "w_id");
            return (Criteria) this;
        }

        public Criteria andw_idIn(List<Integer> values) {
            addCriterion("w_id in", values, "w_id");
            return (Criteria) this;
        }

        public Criteria andw_idNotIn(List<Integer> values) {
            addCriterion("w_id not in", values, "w_id");
            return (Criteria) this;
        }

        public Criteria andw_idBetween(Integer value1, Integer value2) {
            addCriterion("w_id between", value1, value2, "w_id");
            return (Criteria) this;
        }

        public Criteria andw_idNotBetween(Integer value1, Integer value2) {
            addCriterion("w_id not between", value1, value2, "w_id");
            return (Criteria) this;
        }

        public Criteria andw_typeIsNull() {
            addCriterion("w_type is null");
            return (Criteria) this;
        }

        public Criteria andw_typeIsNotNull() {
            addCriterion("w_type is not null");
            return (Criteria) this;
        }

        public Criteria andw_typeEqualTo(Integer value) {
            addCriterion("w_type =", value, "w_type");
            return (Criteria) this;
        }

        public Criteria andw_typeNotEqualTo(Integer value) {
            addCriterion("w_type <>", value, "w_type");
            return (Criteria) this;
        }

        public Criteria andw_typeGreaterThan(Integer value) {
            addCriterion("w_type >", value, "w_type");
            return (Criteria) this;
        }

        public Criteria andw_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_type >=", value, "w_type");
            return (Criteria) this;
        }

        public Criteria andw_typeLessThan(Integer value) {
            addCriterion("w_type <", value, "w_type");
            return (Criteria) this;
        }

        public Criteria andw_typeLessThanOrEqualTo(Integer value) {
            addCriterion("w_type <=", value, "w_type");
            return (Criteria) this;
        }

        public Criteria andw_typeIn(List<Integer> values) {
            addCriterion("w_type in", values, "w_type");
            return (Criteria) this;
        }

        public Criteria andw_typeNotIn(List<Integer> values) {
            addCriterion("w_type not in", values, "w_type");
            return (Criteria) this;
        }

        public Criteria andw_typeBetween(Integer value1, Integer value2) {
            addCriterion("w_type between", value1, value2, "w_type");
            return (Criteria) this;
        }

        public Criteria andw_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("w_type not between", value1, value2, "w_type");
            return (Criteria) this;
        }

        public Criteria andu_idIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andu_idIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andu_idEqualTo(Integer value) {
            addCriterion("u_id =", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idGreaterThan(Integer value) {
            addCriterion("u_id >", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idLessThan(Integer value) {
            addCriterion("u_id <", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idIn(List<Integer> values) {
            addCriterion("u_id in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria anduser_commIsNull() {
            addCriterion("user_comm is null");
            return (Criteria) this;
        }

        public Criteria anduser_commIsNotNull() {
            addCriterion("user_comm is not null");
            return (Criteria) this;
        }

        public Criteria anduser_commEqualTo(String value) {
            addCriterion("user_comm =", value, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commNotEqualTo(String value) {
            addCriterion("user_comm <>", value, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commGreaterThan(String value) {
            addCriterion("user_comm >", value, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commGreaterThanOrEqualTo(String value) {
            addCriterion("user_comm >=", value, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commLessThan(String value) {
            addCriterion("user_comm <", value, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commLessThanOrEqualTo(String value) {
            addCriterion("user_comm <=", value, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commLike(String value) {
            addCriterion("user_comm like", value, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commNotLike(String value) {
            addCriterion("user_comm not like", value, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commIn(List<String> values) {
            addCriterion("user_comm in", values, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commNotIn(List<String> values) {
            addCriterion("user_comm not in", values, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commBetween(String value1, String value2) {
            addCriterion("user_comm between", value1, value2, "user_comm");
            return (Criteria) this;
        }

        public Criteria anduser_commNotBetween(String value1, String value2) {
            addCriterion("user_comm not between", value1, value2, "user_comm");
            return (Criteria) this;
        }

        public Criteria andis_passedIsNull() {
            addCriterion("is_passed is null");
            return (Criteria) this;
        }

        public Criteria andis_passedIsNotNull() {
            addCriterion("is_passed is not null");
            return (Criteria) this;
        }

        public Criteria andis_passedEqualTo(Byte value) {
            addCriterion("is_passed =", value, "is_passed");
            return (Criteria) this;
        }

        public Criteria andis_passedNotEqualTo(Byte value) {
            addCriterion("is_passed <>", value, "is_passed");
            return (Criteria) this;
        }

        public Criteria andis_passedGreaterThan(Byte value) {
            addCriterion("is_passed >", value, "is_passed");
            return (Criteria) this;
        }

        public Criteria andis_passedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_passed >=", value, "is_passed");
            return (Criteria) this;
        }

        public Criteria andis_passedLessThan(Byte value) {
            addCriterion("is_passed <", value, "is_passed");
            return (Criteria) this;
        }

        public Criteria andis_passedLessThanOrEqualTo(Byte value) {
            addCriterion("is_passed <=", value, "is_passed");
            return (Criteria) this;
        }

        public Criteria andis_passedIn(List<Byte> values) {
            addCriterion("is_passed in", values, "is_passed");
            return (Criteria) this;
        }

        public Criteria andis_passedNotIn(List<Byte> values) {
            addCriterion("is_passed not in", values, "is_passed");
            return (Criteria) this;
        }

        public Criteria andis_passedBetween(Byte value1, Byte value2) {
            addCriterion("is_passed between", value1, value2, "is_passed");
            return (Criteria) this;
        }

        public Criteria andis_passedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_passed not between", value1, value2, "is_passed");
            return (Criteria) this;
        }

        public Criteria andadmin_commIsNull() {
            addCriterion("admin_comm is null");
            return (Criteria) this;
        }

        public Criteria andadmin_commIsNotNull() {
            addCriterion("admin_comm is not null");
            return (Criteria) this;
        }

        public Criteria andadmin_commEqualTo(String value) {
            addCriterion("admin_comm =", value, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commNotEqualTo(String value) {
            addCriterion("admin_comm <>", value, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commGreaterThan(String value) {
            addCriterion("admin_comm >", value, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commGreaterThanOrEqualTo(String value) {
            addCriterion("admin_comm >=", value, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commLessThan(String value) {
            addCriterion("admin_comm <", value, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commLessThanOrEqualTo(String value) {
            addCriterion("admin_comm <=", value, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commLike(String value) {
            addCriterion("admin_comm like", value, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commNotLike(String value) {
            addCriterion("admin_comm not like", value, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commIn(List<String> values) {
            addCriterion("admin_comm in", values, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commNotIn(List<String> values) {
            addCriterion("admin_comm not in", values, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commBetween(String value1, String value2) {
            addCriterion("admin_comm between", value1, value2, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andadmin_commNotBetween(String value1, String value2) {
            addCriterion("admin_comm not between", value1, value2, "admin_comm");
            return (Criteria) this;
        }

        public Criteria andw_dateIsNull() {
            addCriterion("w_date is null");
            return (Criteria) this;
        }

        public Criteria andw_dateIsNotNull() {
            addCriterion("w_date is not null");
            return (Criteria) this;
        }

        public Criteria andw_dateEqualTo(Date value) {
            addCriterion("w_date =", value, "w_date");
            return (Criteria) this;
        }

        public Criteria andw_dateNotEqualTo(Date value) {
            addCriterion("w_date <>", value, "w_date");
            return (Criteria) this;
        }

        public Criteria andw_dateGreaterThan(Date value) {
            addCriterion("w_date >", value, "w_date");
            return (Criteria) this;
        }

        public Criteria andw_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("w_date >=", value, "w_date");
            return (Criteria) this;
        }

        public Criteria andw_dateLessThan(Date value) {
            addCriterion("w_date <", value, "w_date");
            return (Criteria) this;
        }

        public Criteria andw_dateLessThanOrEqualTo(Date value) {
            addCriterion("w_date <=", value, "w_date");
            return (Criteria) this;
        }

        public Criteria andw_dateIn(List<Date> values) {
            addCriterion("w_date in", values, "w_date");
            return (Criteria) this;
        }

        public Criteria andw_dateNotIn(List<Date> values) {
            addCriterion("w_date not in", values, "w_date");
            return (Criteria) this;
        }

        public Criteria andw_dateBetween(Date value1, Date value2) {
            addCriterion("w_date between", value1, value2, "w_date");
            return (Criteria) this;
        }

        public Criteria andw_dateNotBetween(Date value1, Date value2) {
            addCriterion("w_date not between", value1, value2, "w_date");
            return (Criteria) this;
        }
    }

    /**
     */
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