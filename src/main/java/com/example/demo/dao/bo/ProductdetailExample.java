package com.example.demo.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class ProductdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductdetailExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andPricture1IsNull() {
            addCriterion("pricture1 is null");
            return (Criteria) this;
        }

        public Criteria andPricture1IsNotNull() {
            addCriterion("pricture1 is not null");
            return (Criteria) this;
        }

        public Criteria andPricture1EqualTo(String value) {
            addCriterion("pricture1 =", value, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1NotEqualTo(String value) {
            addCriterion("pricture1 <>", value, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1GreaterThan(String value) {
            addCriterion("pricture1 >", value, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1GreaterThanOrEqualTo(String value) {
            addCriterion("pricture1 >=", value, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1LessThan(String value) {
            addCriterion("pricture1 <", value, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1LessThanOrEqualTo(String value) {
            addCriterion("pricture1 <=", value, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1Like(String value) {
            addCriterion("pricture1 like", value, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1NotLike(String value) {
            addCriterion("pricture1 not like", value, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1In(List<String> values) {
            addCriterion("pricture1 in", values, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1NotIn(List<String> values) {
            addCriterion("pricture1 not in", values, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1Between(String value1, String value2) {
            addCriterion("pricture1 between", value1, value2, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPricture1NotBetween(String value1, String value2) {
            addCriterion("pricture1 not between", value1, value2, "pricture1");
            return (Criteria) this;
        }

        public Criteria andPicture2IsNull() {
            addCriterion("picture2 is null");
            return (Criteria) this;
        }

        public Criteria andPicture2IsNotNull() {
            addCriterion("picture2 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture2EqualTo(String value) {
            addCriterion("picture2 =", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotEqualTo(String value) {
            addCriterion("picture2 <>", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2GreaterThan(String value) {
            addCriterion("picture2 >", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2GreaterThanOrEqualTo(String value) {
            addCriterion("picture2 >=", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2LessThan(String value) {
            addCriterion("picture2 <", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2LessThanOrEqualTo(String value) {
            addCriterion("picture2 <=", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2Like(String value) {
            addCriterion("picture2 like", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotLike(String value) {
            addCriterion("picture2 not like", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2In(List<String> values) {
            addCriterion("picture2 in", values, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotIn(List<String> values) {
            addCriterion("picture2 not in", values, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2Between(String value1, String value2) {
            addCriterion("picture2 between", value1, value2, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotBetween(String value1, String value2) {
            addCriterion("picture2 not between", value1, value2, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture3IsNull() {
            addCriterion("picture3 is null");
            return (Criteria) this;
        }

        public Criteria andPicture3IsNotNull() {
            addCriterion("picture3 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture3EqualTo(String value) {
            addCriterion("picture3 =", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotEqualTo(String value) {
            addCriterion("picture3 <>", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3GreaterThan(String value) {
            addCriterion("picture3 >", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3GreaterThanOrEqualTo(String value) {
            addCriterion("picture3 >=", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3LessThan(String value) {
            addCriterion("picture3 <", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3LessThanOrEqualTo(String value) {
            addCriterion("picture3 <=", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3Like(String value) {
            addCriterion("picture3 like", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotLike(String value) {
            addCriterion("picture3 not like", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3In(List<String> values) {
            addCriterion("picture3 in", values, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotIn(List<String> values) {
            addCriterion("picture3 not in", values, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3Between(String value1, String value2) {
            addCriterion("picture3 between", value1, value2, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotBetween(String value1, String value2) {
            addCriterion("picture3 not between", value1, value2, "picture3");
            return (Criteria) this;
        }

        public Criteria andInfosIsNull() {
            addCriterion("infos is null");
            return (Criteria) this;
        }

        public Criteria andInfosIsNotNull() {
            addCriterion("infos is not null");
            return (Criteria) this;
        }

        public Criteria andInfosEqualTo(String value) {
            addCriterion("infos =", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotEqualTo(String value) {
            addCriterion("infos <>", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosGreaterThan(String value) {
            addCriterion("infos >", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosGreaterThanOrEqualTo(String value) {
            addCriterion("infos >=", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLessThan(String value) {
            addCriterion("infos <", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLessThanOrEqualTo(String value) {
            addCriterion("infos <=", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLike(String value) {
            addCriterion("infos like", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotLike(String value) {
            addCriterion("infos not like", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosIn(List<String> values) {
            addCriterion("infos in", values, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotIn(List<String> values) {
            addCriterion("infos not in", values, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosBetween(String value1, String value2) {
            addCriterion("infos between", value1, value2, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotBetween(String value1, String value2) {
            addCriterion("infos not between", value1, value2, "infos");
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