package com.hg.hgc.web.model;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    public MenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
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

        public Criteria andMenuidIsNull() {
            addCriterion("MenuID is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("MenuID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("MenuID =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("MenuID <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("MenuID >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MenuID >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("MenuID <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("MenuID <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("MenuID in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("MenuID not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("MenuID between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("MenuID not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenucodeIsNull() {
            addCriterion("MenuCode is null");
            return (Criteria) this;
        }

        public Criteria andMenucodeIsNotNull() {
            addCriterion("MenuCode is not null");
            return (Criteria) this;
        }

        public Criteria andMenucodeEqualTo(String value) {
            addCriterion("MenuCode =", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeNotEqualTo(String value) {
            addCriterion("MenuCode <>", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeGreaterThan(String value) {
            addCriterion("MenuCode >", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeGreaterThanOrEqualTo(String value) {
            addCriterion("MenuCode >=", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeLessThan(String value) {
            addCriterion("MenuCode <", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeLessThanOrEqualTo(String value) {
            addCriterion("MenuCode <=", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeLike(String value) {
            addCriterion("MenuCode like", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeNotLike(String value) {
            addCriterion("MenuCode not like", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeIn(List<String> values) {
            addCriterion("MenuCode in", values, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeNotIn(List<String> values) {
            addCriterion("MenuCode not in", values, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeBetween(String value1, String value2) {
            addCriterion("MenuCode between", value1, value2, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeNotBetween(String value1, String value2) {
            addCriterion("MenuCode not between", value1, value2, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("MenuName is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MenuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("MenuName =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("MenuName <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("MenuName >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("MenuName >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("MenuName <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("MenuName <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("MenuName like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("MenuName not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("MenuName in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("MenuName not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("MenuName between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("MenuName not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeIsNull() {
            addCriterion("ParentMenuCode is null");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeIsNotNull() {
            addCriterion("ParentMenuCode is not null");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeEqualTo(String value) {
            addCriterion("ParentMenuCode =", value, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeNotEqualTo(String value) {
            addCriterion("ParentMenuCode <>", value, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeGreaterThan(String value) {
            addCriterion("ParentMenuCode >", value, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeGreaterThanOrEqualTo(String value) {
            addCriterion("ParentMenuCode >=", value, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeLessThan(String value) {
            addCriterion("ParentMenuCode <", value, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeLessThanOrEqualTo(String value) {
            addCriterion("ParentMenuCode <=", value, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeLike(String value) {
            addCriterion("ParentMenuCode like", value, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeNotLike(String value) {
            addCriterion("ParentMenuCode not like", value, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeIn(List<String> values) {
            addCriterion("ParentMenuCode in", values, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeNotIn(List<String> values) {
            addCriterion("ParentMenuCode not in", values, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeBetween(String value1, String value2) {
            addCriterion("ParentMenuCode between", value1, value2, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andParentmenucodeNotBetween(String value1, String value2) {
            addCriterion("ParentMenuCode not between", value1, value2, "parentmenucode");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNull() {
            addCriterion("IsLeaf is null");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNotNull() {
            addCriterion("IsLeaf is not null");
            return (Criteria) this;
        }

        public Criteria andIsleafEqualTo(Integer value) {
            addCriterion("IsLeaf =", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotEqualTo(Integer value) {
            addCriterion("IsLeaf <>", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThan(Integer value) {
            addCriterion("IsLeaf >", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsLeaf >=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThan(Integer value) {
            addCriterion("IsLeaf <", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThanOrEqualTo(Integer value) {
            addCriterion("IsLeaf <=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafIn(List<Integer> values) {
            addCriterion("IsLeaf in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotIn(List<Integer> values) {
            addCriterion("IsLeaf not in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafBetween(Integer value1, Integer value2) {
            addCriterion("IsLeaf between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotBetween(Integer value1, Integer value2) {
            addCriterion("IsLeaf not between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andMenulevelIsNull() {
            addCriterion("MenuLevel is null");
            return (Criteria) this;
        }

        public Criteria andMenulevelIsNotNull() {
            addCriterion("MenuLevel is not null");
            return (Criteria) this;
        }

        public Criteria andMenulevelEqualTo(Integer value) {
            addCriterion("MenuLevel =", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotEqualTo(Integer value) {
            addCriterion("MenuLevel <>", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelGreaterThan(Integer value) {
            addCriterion("MenuLevel >", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("MenuLevel >=", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelLessThan(Integer value) {
            addCriterion("MenuLevel <", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelLessThanOrEqualTo(Integer value) {
            addCriterion("MenuLevel <=", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelIn(List<Integer> values) {
            addCriterion("MenuLevel in", values, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotIn(List<Integer> values) {
            addCriterion("MenuLevel not in", values, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelBetween(Integer value1, Integer value2) {
            addCriterion("MenuLevel between", value1, value2, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotBetween(Integer value1, Integer value2) {
            addCriterion("MenuLevel not between", value1, value2, "menulevel");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table menu
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 26 10:49:31 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table menu
     *
     * @mbggenerated Tue Apr 26 10:49:31 CST 2016
     */
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