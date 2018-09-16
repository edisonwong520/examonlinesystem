package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionsExample() {
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

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andTaotiidIsNull() {
            addCriterion("taotiid is null");
            return (Criteria) this;
        }

        public Criteria andTaotiidIsNotNull() {
            addCriterion("taotiid is not null");
            return (Criteria) this;
        }

        public Criteria andTaotiidEqualTo(Integer value) {
            addCriterion("taotiid =", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidNotEqualTo(Integer value) {
            addCriterion("taotiid <>", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidGreaterThan(Integer value) {
            addCriterion("taotiid >", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taotiid >=", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidLessThan(Integer value) {
            addCriterion("taotiid <", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidLessThanOrEqualTo(Integer value) {
            addCriterion("taotiid <=", value, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidIn(List<Integer> values) {
            addCriterion("taotiid in", values, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidNotIn(List<Integer> values) {
            addCriterion("taotiid not in", values, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidBetween(Integer value1, Integer value2) {
            addCriterion("taotiid between", value1, value2, "taotiid");
            return (Criteria) this;
        }

        public Criteria andTaotiidNotBetween(Integer value1, Integer value2) {
            addCriterion("taotiid not between", value1, value2, "taotiid");
            return (Criteria) this;
        }

        public Criteria andOptionaIsNull() {
            addCriterion("optiona is null");
            return (Criteria) this;
        }

        public Criteria andOptionaIsNotNull() {
            addCriterion("optiona is not null");
            return (Criteria) this;
        }

        public Criteria andOptionaEqualTo(String value) {
            addCriterion("optiona =", value, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaNotEqualTo(String value) {
            addCriterion("optiona <>", value, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaGreaterThan(String value) {
            addCriterion("optiona >", value, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaGreaterThanOrEqualTo(String value) {
            addCriterion("optiona >=", value, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaLessThan(String value) {
            addCriterion("optiona <", value, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaLessThanOrEqualTo(String value) {
            addCriterion("optiona <=", value, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaLike(String value) {
            addCriterion("optiona like", value, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaNotLike(String value) {
            addCriterion("optiona not like", value, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaIn(List<String> values) {
            addCriterion("optiona in", values, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaNotIn(List<String> values) {
            addCriterion("optiona not in", values, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaBetween(String value1, String value2) {
            addCriterion("optiona between", value1, value2, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionaNotBetween(String value1, String value2) {
            addCriterion("optiona not between", value1, value2, "optiona");
            return (Criteria) this;
        }

        public Criteria andOptionbIsNull() {
            addCriterion("optionb is null");
            return (Criteria) this;
        }

        public Criteria andOptionbIsNotNull() {
            addCriterion("optionb is not null");
            return (Criteria) this;
        }

        public Criteria andOptionbEqualTo(String value) {
            addCriterion("optionb =", value, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbNotEqualTo(String value) {
            addCriterion("optionb <>", value, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbGreaterThan(String value) {
            addCriterion("optionb >", value, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbGreaterThanOrEqualTo(String value) {
            addCriterion("optionb >=", value, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbLessThan(String value) {
            addCriterion("optionb <", value, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbLessThanOrEqualTo(String value) {
            addCriterion("optionb <=", value, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbLike(String value) {
            addCriterion("optionb like", value, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbNotLike(String value) {
            addCriterion("optionb not like", value, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbIn(List<String> values) {
            addCriterion("optionb in", values, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbNotIn(List<String> values) {
            addCriterion("optionb not in", values, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbBetween(String value1, String value2) {
            addCriterion("optionb between", value1, value2, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptionbNotBetween(String value1, String value2) {
            addCriterion("optionb not between", value1, value2, "optionb");
            return (Criteria) this;
        }

        public Criteria andOptioncIsNull() {
            addCriterion("optionc is null");
            return (Criteria) this;
        }

        public Criteria andOptioncIsNotNull() {
            addCriterion("optionc is not null");
            return (Criteria) this;
        }

        public Criteria andOptioncEqualTo(String value) {
            addCriterion("optionc =", value, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncNotEqualTo(String value) {
            addCriterion("optionc <>", value, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncGreaterThan(String value) {
            addCriterion("optionc >", value, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncGreaterThanOrEqualTo(String value) {
            addCriterion("optionc >=", value, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncLessThan(String value) {
            addCriterion("optionc <", value, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncLessThanOrEqualTo(String value) {
            addCriterion("optionc <=", value, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncLike(String value) {
            addCriterion("optionc like", value, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncNotLike(String value) {
            addCriterion("optionc not like", value, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncIn(List<String> values) {
            addCriterion("optionc in", values, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncNotIn(List<String> values) {
            addCriterion("optionc not in", values, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncBetween(String value1, String value2) {
            addCriterion("optionc between", value1, value2, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptioncNotBetween(String value1, String value2) {
            addCriterion("optionc not between", value1, value2, "optionc");
            return (Criteria) this;
        }

        public Criteria andOptiondIsNull() {
            addCriterion("optiond is null");
            return (Criteria) this;
        }

        public Criteria andOptiondIsNotNull() {
            addCriterion("optiond is not null");
            return (Criteria) this;
        }

        public Criteria andOptiondEqualTo(String value) {
            addCriterion("optiond =", value, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondNotEqualTo(String value) {
            addCriterion("optiond <>", value, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondGreaterThan(String value) {
            addCriterion("optiond >", value, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondGreaterThanOrEqualTo(String value) {
            addCriterion("optiond >=", value, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondLessThan(String value) {
            addCriterion("optiond <", value, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondLessThanOrEqualTo(String value) {
            addCriterion("optiond <=", value, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondLike(String value) {
            addCriterion("optiond like", value, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondNotLike(String value) {
            addCriterion("optiond not like", value, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondIn(List<String> values) {
            addCriterion("optiond in", values, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondNotIn(List<String> values) {
            addCriterion("optiond not in", values, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondBetween(String value1, String value2) {
            addCriterion("optiond between", value1, value2, "optiond");
            return (Criteria) this;
        }

        public Criteria andOptiondNotBetween(String value1, String value2) {
            addCriterion("optiond not between", value1, value2, "optiond");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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