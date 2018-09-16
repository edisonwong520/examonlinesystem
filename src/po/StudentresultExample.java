package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentresultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentresultExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andExamnumberIsNull() {
            addCriterion("examnumber is null");
            return (Criteria) this;
        }

        public Criteria andExamnumberIsNotNull() {
            addCriterion("examnumber is not null");
            return (Criteria) this;
        }

        public Criteria andExamnumberEqualTo(String value) {
            addCriterion("examnumber =", value, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberNotEqualTo(String value) {
            addCriterion("examnumber <>", value, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberGreaterThan(String value) {
            addCriterion("examnumber >", value, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberGreaterThanOrEqualTo(String value) {
            addCriterion("examnumber >=", value, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberLessThan(String value) {
            addCriterion("examnumber <", value, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberLessThanOrEqualTo(String value) {
            addCriterion("examnumber <=", value, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberLike(String value) {
            addCriterion("examnumber like", value, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberNotLike(String value) {
            addCriterion("examnumber not like", value, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberIn(List<String> values) {
            addCriterion("examnumber in", values, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberNotIn(List<String> values) {
            addCriterion("examnumber not in", values, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberBetween(String value1, String value2) {
            addCriterion("examnumber between", value1, value2, "examnumber");
            return (Criteria) this;
        }

        public Criteria andExamnumberNotBetween(String value1, String value2) {
            addCriterion("examnumber not between", value1, value2, "examnumber");
            return (Criteria) this;
        }

        public Criteria andLessonidIsNull() {
            addCriterion("lessonid is null");
            return (Criteria) this;
        }

        public Criteria andLessonidIsNotNull() {
            addCriterion("lessonid is not null");
            return (Criteria) this;
        }

        public Criteria andLessonidEqualTo(Integer value) {
            addCriterion("lessonid =", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotEqualTo(Integer value) {
            addCriterion("lessonid <>", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidGreaterThan(Integer value) {
            addCriterion("lessonid >", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lessonid >=", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidLessThan(Integer value) {
            addCriterion("lessonid <", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidLessThanOrEqualTo(Integer value) {
            addCriterion("lessonid <=", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidIn(List<Integer> values) {
            addCriterion("lessonid in", values, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotIn(List<Integer> values) {
            addCriterion("lessonid not in", values, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidBetween(Integer value1, Integer value2) {
            addCriterion("lessonid between", value1, value2, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotBetween(Integer value1, Integer value2) {
            addCriterion("lessonid not between", value1, value2, "lessonid");
            return (Criteria) this;
        }

        public Criteria andResingleIsNull() {
            addCriterion("resingle is null");
            return (Criteria) this;
        }

        public Criteria andResingleIsNotNull() {
            addCriterion("resingle is not null");
            return (Criteria) this;
        }

        public Criteria andResingleEqualTo(Integer value) {
            addCriterion("resingle =", value, "resingle");
            return (Criteria) this;
        }

        public Criteria andResingleNotEqualTo(Integer value) {
            addCriterion("resingle <>", value, "resingle");
            return (Criteria) this;
        }

        public Criteria andResingleGreaterThan(Integer value) {
            addCriterion("resingle >", value, "resingle");
            return (Criteria) this;
        }

        public Criteria andResingleGreaterThanOrEqualTo(Integer value) {
            addCriterion("resingle >=", value, "resingle");
            return (Criteria) this;
        }

        public Criteria andResingleLessThan(Integer value) {
            addCriterion("resingle <", value, "resingle");
            return (Criteria) this;
        }

        public Criteria andResingleLessThanOrEqualTo(Integer value) {
            addCriterion("resingle <=", value, "resingle");
            return (Criteria) this;
        }

        public Criteria andResingleIn(List<Integer> values) {
            addCriterion("resingle in", values, "resingle");
            return (Criteria) this;
        }

        public Criteria andResingleNotIn(List<Integer> values) {
            addCriterion("resingle not in", values, "resingle");
            return (Criteria) this;
        }

        public Criteria andResingleBetween(Integer value1, Integer value2) {
            addCriterion("resingle between", value1, value2, "resingle");
            return (Criteria) this;
        }

        public Criteria andResingleNotBetween(Integer value1, Integer value2) {
            addCriterion("resingle not between", value1, value2, "resingle");
            return (Criteria) this;
        }

        public Criteria andResmoreIsNull() {
            addCriterion("resmore is null");
            return (Criteria) this;
        }

        public Criteria andResmoreIsNotNull() {
            addCriterion("resmore is not null");
            return (Criteria) this;
        }

        public Criteria andResmoreEqualTo(Integer value) {
            addCriterion("resmore =", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreNotEqualTo(Integer value) {
            addCriterion("resmore <>", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreGreaterThan(Integer value) {
            addCriterion("resmore >", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("resmore >=", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreLessThan(Integer value) {
            addCriterion("resmore <", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreLessThanOrEqualTo(Integer value) {
            addCriterion("resmore <=", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreIn(List<Integer> values) {
            addCriterion("resmore in", values, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreNotIn(List<Integer> values) {
            addCriterion("resmore not in", values, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreBetween(Integer value1, Integer value2) {
            addCriterion("resmore between", value1, value2, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreNotBetween(Integer value1, Integer value2) {
            addCriterion("resmore not between", value1, value2, "resmore");
            return (Criteria) this;
        }

        public Criteria andRestotalIsNull() {
            addCriterion("restotal is null");
            return (Criteria) this;
        }

        public Criteria andRestotalIsNotNull() {
            addCriterion("restotal is not null");
            return (Criteria) this;
        }

        public Criteria andRestotalEqualTo(Integer value) {
            addCriterion("restotal =", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalNotEqualTo(Integer value) {
            addCriterion("restotal <>", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalGreaterThan(Integer value) {
            addCriterion("restotal >", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("restotal >=", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalLessThan(Integer value) {
            addCriterion("restotal <", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalLessThanOrEqualTo(Integer value) {
            addCriterion("restotal <=", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalIn(List<Integer> values) {
            addCriterion("restotal in", values, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalNotIn(List<Integer> values) {
            addCriterion("restotal not in", values, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalBetween(Integer value1, Integer value2) {
            addCriterion("restotal between", value1, value2, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalNotBetween(Integer value1, Integer value2) {
            addCriterion("restotal not between", value1, value2, "restotal");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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