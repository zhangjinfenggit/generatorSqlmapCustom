package com.yhksxt.admin.model;

import java.util.ArrayList;
import java.util.List;

public class TitleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TitleExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andXinduIsNull() {
            addCriterion("xindu is null");
            return (Criteria) this;
        }

        public Criteria andXinduIsNotNull() {
            addCriterion("xindu is not null");
            return (Criteria) this;
        }

        public Criteria andXinduEqualTo(Integer value) {
            addCriterion("xindu =", value, "xindu");
            return (Criteria) this;
        }

        public Criteria andXinduNotEqualTo(Integer value) {
            addCriterion("xindu <>", value, "xindu");
            return (Criteria) this;
        }

        public Criteria andXinduGreaterThan(Integer value) {
            addCriterion("xindu >", value, "xindu");
            return (Criteria) this;
        }

        public Criteria andXinduGreaterThanOrEqualTo(Integer value) {
            addCriterion("xindu >=", value, "xindu");
            return (Criteria) this;
        }

        public Criteria andXinduLessThan(Integer value) {
            addCriterion("xindu <", value, "xindu");
            return (Criteria) this;
        }

        public Criteria andXinduLessThanOrEqualTo(Integer value) {
            addCriterion("xindu <=", value, "xindu");
            return (Criteria) this;
        }

        public Criteria andXinduIn(List<Integer> values) {
            addCriterion("xindu in", values, "xindu");
            return (Criteria) this;
        }

        public Criteria andXinduNotIn(List<Integer> values) {
            addCriterion("xindu not in", values, "xindu");
            return (Criteria) this;
        }

        public Criteria andXinduBetween(Integer value1, Integer value2) {
            addCriterion("xindu between", value1, value2, "xindu");
            return (Criteria) this;
        }

        public Criteria andXinduNotBetween(Integer value1, Integer value2) {
            addCriterion("xindu not between", value1, value2, "xindu");
            return (Criteria) this;
        }

        public Criteria andXiaoduIsNull() {
            addCriterion("xiaodu is null");
            return (Criteria) this;
        }

        public Criteria andXiaoduIsNotNull() {
            addCriterion("xiaodu is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoduEqualTo(Integer value) {
            addCriterion("xiaodu =", value, "xiaodu");
            return (Criteria) this;
        }

        public Criteria andXiaoduNotEqualTo(Integer value) {
            addCriterion("xiaodu <>", value, "xiaodu");
            return (Criteria) this;
        }

        public Criteria andXiaoduGreaterThan(Integer value) {
            addCriterion("xiaodu >", value, "xiaodu");
            return (Criteria) this;
        }

        public Criteria andXiaoduGreaterThanOrEqualTo(Integer value) {
            addCriterion("xiaodu >=", value, "xiaodu");
            return (Criteria) this;
        }

        public Criteria andXiaoduLessThan(Integer value) {
            addCriterion("xiaodu <", value, "xiaodu");
            return (Criteria) this;
        }

        public Criteria andXiaoduLessThanOrEqualTo(Integer value) {
            addCriterion("xiaodu <=", value, "xiaodu");
            return (Criteria) this;
        }

        public Criteria andXiaoduIn(List<Integer> values) {
            addCriterion("xiaodu in", values, "xiaodu");
            return (Criteria) this;
        }

        public Criteria andXiaoduNotIn(List<Integer> values) {
            addCriterion("xiaodu not in", values, "xiaodu");
            return (Criteria) this;
        }

        public Criteria andXiaoduBetween(Integer value1, Integer value2) {
            addCriterion("xiaodu between", value1, value2, "xiaodu");
            return (Criteria) this;
        }

        public Criteria andXiaoduNotBetween(Integer value1, Integer value2) {
            addCriterion("xiaodu not between", value1, value2, "xiaodu");
            return (Criteria) this;
        }

        public Criteria andQufenIsNull() {
            addCriterion("qufen is null");
            return (Criteria) this;
        }

        public Criteria andQufenIsNotNull() {
            addCriterion("qufen is not null");
            return (Criteria) this;
        }

        public Criteria andQufenEqualTo(Integer value) {
            addCriterion("qufen =", value, "qufen");
            return (Criteria) this;
        }

        public Criteria andQufenNotEqualTo(Integer value) {
            addCriterion("qufen <>", value, "qufen");
            return (Criteria) this;
        }

        public Criteria andQufenGreaterThan(Integer value) {
            addCriterion("qufen >", value, "qufen");
            return (Criteria) this;
        }

        public Criteria andQufenGreaterThanOrEqualTo(Integer value) {
            addCriterion("qufen >=", value, "qufen");
            return (Criteria) this;
        }

        public Criteria andQufenLessThan(Integer value) {
            addCriterion("qufen <", value, "qufen");
            return (Criteria) this;
        }

        public Criteria andQufenLessThanOrEqualTo(Integer value) {
            addCriterion("qufen <=", value, "qufen");
            return (Criteria) this;
        }

        public Criteria andQufenIn(List<Integer> values) {
            addCriterion("qufen in", values, "qufen");
            return (Criteria) this;
        }

        public Criteria andQufenNotIn(List<Integer> values) {
            addCriterion("qufen not in", values, "qufen");
            return (Criteria) this;
        }

        public Criteria andQufenBetween(Integer value1, Integer value2) {
            addCriterion("qufen between", value1, value2, "qufen");
            return (Criteria) this;
        }

        public Criteria andQufenNotBetween(Integer value1, Integer value2) {
            addCriterion("qufen not between", value1, value2, "qufen");
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

        public Criteria andSubjectEqualTo(Integer value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(Integer value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(Integer value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(Integer value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(Integer value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<Integer> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<Integer> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(Integer value1, Integer value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(Integer value1, Integer value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andChapterIsNull() {
            addCriterion("chapter is null");
            return (Criteria) this;
        }

        public Criteria andChapterIsNotNull() {
            addCriterion("chapter is not null");
            return (Criteria) this;
        }

        public Criteria andChapterEqualTo(Integer value) {
            addCriterion("chapter =", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterNotEqualTo(Integer value) {
            addCriterion("chapter <>", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterGreaterThan(Integer value) {
            addCriterion("chapter >", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter >=", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterLessThan(Integer value) {
            addCriterion("chapter <", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterLessThanOrEqualTo(Integer value) {
            addCriterion("chapter <=", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterIn(List<Integer> values) {
            addCriterion("chapter in", values, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterNotIn(List<Integer> values) {
            addCriterion("chapter not in", values, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterBetween(Integer value1, Integer value2) {
            addCriterion("chapter between", value1, value2, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter not between", value1, value2, "chapter");
            return (Criteria) this;
        }

        public Criteria andSectionIsNull() {
            addCriterion("section is null");
            return (Criteria) this;
        }

        public Criteria andSectionIsNotNull() {
            addCriterion("section is not null");
            return (Criteria) this;
        }

        public Criteria andSectionEqualTo(Integer value) {
            addCriterion("section =", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotEqualTo(Integer value) {
            addCriterion("section <>", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThan(Integer value) {
            addCriterion("section >", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("section >=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThan(Integer value) {
            addCriterion("section <", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThanOrEqualTo(Integer value) {
            addCriterion("section <=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionIn(List<Integer> values) {
            addCriterion("section in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotIn(List<Integer> values) {
            addCriterion("section not in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionBetween(Integer value1, Integer value2) {
            addCriterion("section between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotBetween(Integer value1, Integer value2) {
            addCriterion("section not between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andChoose1IsNull() {
            addCriterion("choose1 is null");
            return (Criteria) this;
        }

        public Criteria andChoose1IsNotNull() {
            addCriterion("choose1 is not null");
            return (Criteria) this;
        }

        public Criteria andChoose1EqualTo(String value) {
            addCriterion("choose1 =", value, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1NotEqualTo(String value) {
            addCriterion("choose1 <>", value, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1GreaterThan(String value) {
            addCriterion("choose1 >", value, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1GreaterThanOrEqualTo(String value) {
            addCriterion("choose1 >=", value, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1LessThan(String value) {
            addCriterion("choose1 <", value, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1LessThanOrEqualTo(String value) {
            addCriterion("choose1 <=", value, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1Like(String value) {
            addCriterion("choose1 like", value, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1NotLike(String value) {
            addCriterion("choose1 not like", value, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1In(List<String> values) {
            addCriterion("choose1 in", values, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1NotIn(List<String> values) {
            addCriterion("choose1 not in", values, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1Between(String value1, String value2) {
            addCriterion("choose1 between", value1, value2, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose1NotBetween(String value1, String value2) {
            addCriterion("choose1 not between", value1, value2, "choose1");
            return (Criteria) this;
        }

        public Criteria andChoose2IsNull() {
            addCriterion("choose2 is null");
            return (Criteria) this;
        }

        public Criteria andChoose2IsNotNull() {
            addCriterion("choose2 is not null");
            return (Criteria) this;
        }

        public Criteria andChoose2EqualTo(String value) {
            addCriterion("choose2 =", value, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2NotEqualTo(String value) {
            addCriterion("choose2 <>", value, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2GreaterThan(String value) {
            addCriterion("choose2 >", value, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2GreaterThanOrEqualTo(String value) {
            addCriterion("choose2 >=", value, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2LessThan(String value) {
            addCriterion("choose2 <", value, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2LessThanOrEqualTo(String value) {
            addCriterion("choose2 <=", value, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2Like(String value) {
            addCriterion("choose2 like", value, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2NotLike(String value) {
            addCriterion("choose2 not like", value, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2In(List<String> values) {
            addCriterion("choose2 in", values, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2NotIn(List<String> values) {
            addCriterion("choose2 not in", values, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2Between(String value1, String value2) {
            addCriterion("choose2 between", value1, value2, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose2NotBetween(String value1, String value2) {
            addCriterion("choose2 not between", value1, value2, "choose2");
            return (Criteria) this;
        }

        public Criteria andChoose3IsNull() {
            addCriterion("choose3 is null");
            return (Criteria) this;
        }

        public Criteria andChoose3IsNotNull() {
            addCriterion("choose3 is not null");
            return (Criteria) this;
        }

        public Criteria andChoose3EqualTo(String value) {
            addCriterion("choose3 =", value, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3NotEqualTo(String value) {
            addCriterion("choose3 <>", value, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3GreaterThan(String value) {
            addCriterion("choose3 >", value, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3GreaterThanOrEqualTo(String value) {
            addCriterion("choose3 >=", value, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3LessThan(String value) {
            addCriterion("choose3 <", value, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3LessThanOrEqualTo(String value) {
            addCriterion("choose3 <=", value, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3Like(String value) {
            addCriterion("choose3 like", value, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3NotLike(String value) {
            addCriterion("choose3 not like", value, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3In(List<String> values) {
            addCriterion("choose3 in", values, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3NotIn(List<String> values) {
            addCriterion("choose3 not in", values, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3Between(String value1, String value2) {
            addCriterion("choose3 between", value1, value2, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose3NotBetween(String value1, String value2) {
            addCriterion("choose3 not between", value1, value2, "choose3");
            return (Criteria) this;
        }

        public Criteria andChoose4IsNull() {
            addCriterion("choose4 is null");
            return (Criteria) this;
        }

        public Criteria andChoose4IsNotNull() {
            addCriterion("choose4 is not null");
            return (Criteria) this;
        }

        public Criteria andChoose4EqualTo(String value) {
            addCriterion("choose4 =", value, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4NotEqualTo(String value) {
            addCriterion("choose4 <>", value, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4GreaterThan(String value) {
            addCriterion("choose4 >", value, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4GreaterThanOrEqualTo(String value) {
            addCriterion("choose4 >=", value, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4LessThan(String value) {
            addCriterion("choose4 <", value, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4LessThanOrEqualTo(String value) {
            addCriterion("choose4 <=", value, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4Like(String value) {
            addCriterion("choose4 like", value, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4NotLike(String value) {
            addCriterion("choose4 not like", value, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4In(List<String> values) {
            addCriterion("choose4 in", values, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4NotIn(List<String> values) {
            addCriterion("choose4 not in", values, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4Between(String value1, String value2) {
            addCriterion("choose4 between", value1, value2, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose4NotBetween(String value1, String value2) {
            addCriterion("choose4 not between", value1, value2, "choose4");
            return (Criteria) this;
        }

        public Criteria andChoose5IsNull() {
            addCriterion("choose5 is null");
            return (Criteria) this;
        }

        public Criteria andChoose5IsNotNull() {
            addCriterion("choose5 is not null");
            return (Criteria) this;
        }

        public Criteria andChoose5EqualTo(String value) {
            addCriterion("choose5 =", value, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5NotEqualTo(String value) {
            addCriterion("choose5 <>", value, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5GreaterThan(String value) {
            addCriterion("choose5 >", value, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5GreaterThanOrEqualTo(String value) {
            addCriterion("choose5 >=", value, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5LessThan(String value) {
            addCriterion("choose5 <", value, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5LessThanOrEqualTo(String value) {
            addCriterion("choose5 <=", value, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5Like(String value) {
            addCriterion("choose5 like", value, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5NotLike(String value) {
            addCriterion("choose5 not like", value, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5In(List<String> values) {
            addCriterion("choose5 in", values, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5NotIn(List<String> values) {
            addCriterion("choose5 not in", values, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5Between(String value1, String value2) {
            addCriterion("choose5 between", value1, value2, "choose5");
            return (Criteria) this;
        }

        public Criteria andChoose5NotBetween(String value1, String value2) {
            addCriterion("choose5 not between", value1, value2, "choose5");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filePath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filePath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filePath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filePath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filePath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filePath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filePath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filePath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filePath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filePath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filePath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filePath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filePath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filePath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andRealfilenameIsNull() {
            addCriterion("realFileName is null");
            return (Criteria) this;
        }

        public Criteria andRealfilenameIsNotNull() {
            addCriterion("realFileName is not null");
            return (Criteria) this;
        }

        public Criteria andRealfilenameEqualTo(String value) {
            addCriterion("realFileName =", value, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameNotEqualTo(String value) {
            addCriterion("realFileName <>", value, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameGreaterThan(String value) {
            addCriterion("realFileName >", value, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("realFileName >=", value, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameLessThan(String value) {
            addCriterion("realFileName <", value, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameLessThanOrEqualTo(String value) {
            addCriterion("realFileName <=", value, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameLike(String value) {
            addCriterion("realFileName like", value, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameNotLike(String value) {
            addCriterion("realFileName not like", value, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameIn(List<String> values) {
            addCriterion("realFileName in", values, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameNotIn(List<String> values) {
            addCriterion("realFileName not in", values, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameBetween(String value1, String value2) {
            addCriterion("realFileName between", value1, value2, "realfilename");
            return (Criteria) this;
        }

        public Criteria andRealfilenameNotBetween(String value1, String value2) {
            addCriterion("realFileName not between", value1, value2, "realfilename");
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

        public Criteria andMroleidIsNull() {
            addCriterion("mroleId is null");
            return (Criteria) this;
        }

        public Criteria andMroleidIsNotNull() {
            addCriterion("mroleId is not null");
            return (Criteria) this;
        }

        public Criteria andMroleidEqualTo(Integer value) {
            addCriterion("mroleId =", value, "mroleid");
            return (Criteria) this;
        }

        public Criteria andMroleidNotEqualTo(Integer value) {
            addCriterion("mroleId <>", value, "mroleid");
            return (Criteria) this;
        }

        public Criteria andMroleidGreaterThan(Integer value) {
            addCriterion("mroleId >", value, "mroleid");
            return (Criteria) this;
        }

        public Criteria andMroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mroleId >=", value, "mroleid");
            return (Criteria) this;
        }

        public Criteria andMroleidLessThan(Integer value) {
            addCriterion("mroleId <", value, "mroleid");
            return (Criteria) this;
        }

        public Criteria andMroleidLessThanOrEqualTo(Integer value) {
            addCriterion("mroleId <=", value, "mroleid");
            return (Criteria) this;
        }

        public Criteria andMroleidIn(List<Integer> values) {
            addCriterion("mroleId in", values, "mroleid");
            return (Criteria) this;
        }

        public Criteria andMroleidNotIn(List<Integer> values) {
            addCriterion("mroleId not in", values, "mroleid");
            return (Criteria) this;
        }

        public Criteria andMroleidBetween(Integer value1, Integer value2) {
            addCriterion("mroleId between", value1, value2, "mroleid");
            return (Criteria) this;
        }

        public Criteria andMroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("mroleId not between", value1, value2, "mroleid");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNull() {
            addCriterion("m_time is null");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNotNull() {
            addCriterion("m_time is not null");
            return (Criteria) this;
        }

        public Criteria andMTimeEqualTo(String value) {
            addCriterion("m_time =", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotEqualTo(String value) {
            addCriterion("m_time <>", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThan(String value) {
            addCriterion("m_time >", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThanOrEqualTo(String value) {
            addCriterion("m_time >=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThan(String value) {
            addCriterion("m_time <", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThanOrEqualTo(String value) {
            addCriterion("m_time <=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLike(String value) {
            addCriterion("m_time like", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotLike(String value) {
            addCriterion("m_time not like", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIn(List<String> values) {
            addCriterion("m_time in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotIn(List<String> values) {
            addCriterion("m_time not in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeBetween(String value1, String value2) {
            addCriterion("m_time between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotBetween(String value1, String value2) {
            addCriterion("m_time not between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andSroleidIsNull() {
            addCriterion("sroleId is null");
            return (Criteria) this;
        }

        public Criteria andSroleidIsNotNull() {
            addCriterion("sroleId is not null");
            return (Criteria) this;
        }

        public Criteria andSroleidEqualTo(String value) {
            addCriterion("sroleId =", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidNotEqualTo(String value) {
            addCriterion("sroleId <>", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidGreaterThan(String value) {
            addCriterion("sroleId >", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidGreaterThanOrEqualTo(String value) {
            addCriterion("sroleId >=", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidLessThan(String value) {
            addCriterion("sroleId <", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidLessThanOrEqualTo(String value) {
            addCriterion("sroleId <=", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidLike(String value) {
            addCriterion("sroleId like", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidNotLike(String value) {
            addCriterion("sroleId not like", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidIn(List<String> values) {
            addCriterion("sroleId in", values, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidNotIn(List<String> values) {
            addCriterion("sroleId not in", values, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidBetween(String value1, String value2) {
            addCriterion("sroleId between", value1, value2, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidNotBetween(String value1, String value2) {
            addCriterion("sroleId not between", value1, value2, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNull() {
            addCriterion("s_time is null");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNotNull() {
            addCriterion("s_time is not null");
            return (Criteria) this;
        }

        public Criteria andSTimeEqualTo(String value) {
            addCriterion("s_time =", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotEqualTo(String value) {
            addCriterion("s_time <>", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThan(String value) {
            addCriterion("s_time >", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThanOrEqualTo(String value) {
            addCriterion("s_time >=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThan(String value) {
            addCriterion("s_time <", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThanOrEqualTo(String value) {
            addCriterion("s_time <=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLike(String value) {
            addCriterion("s_time like", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotLike(String value) {
            addCriterion("s_time not like", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeIn(List<String> values) {
            addCriterion("s_time in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotIn(List<String> values) {
            addCriterion("s_time not in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeBetween(String value1, String value2) {
            addCriterion("s_time between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotBetween(String value1, String value2) {
            addCriterion("s_time not between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSydxIsNull() {
            addCriterion("sydx is null");
            return (Criteria) this;
        }

        public Criteria andSydxIsNotNull() {
            addCriterion("sydx is not null");
            return (Criteria) this;
        }

        public Criteria andSydxEqualTo(String value) {
            addCriterion("sydx =", value, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxNotEqualTo(String value) {
            addCriterion("sydx <>", value, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxGreaterThan(String value) {
            addCriterion("sydx >", value, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxGreaterThanOrEqualTo(String value) {
            addCriterion("sydx >=", value, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxLessThan(String value) {
            addCriterion("sydx <", value, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxLessThanOrEqualTo(String value) {
            addCriterion("sydx <=", value, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxLike(String value) {
            addCriterion("sydx like", value, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxNotLike(String value) {
            addCriterion("sydx not like", value, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxIn(List<String> values) {
            addCriterion("sydx in", values, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxNotIn(List<String> values) {
            addCriterion("sydx not in", values, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxBetween(String value1, String value2) {
            addCriterion("sydx between", value1, value2, "sydx");
            return (Criteria) this;
        }

        public Criteria andSydxNotBetween(String value1, String value2) {
            addCriterion("sydx not between", value1, value2, "sydx");
            return (Criteria) this;
        }

        public Criteria andMinuteIsNull() {
            addCriterion("minute is null");
            return (Criteria) this;
        }

        public Criteria andMinuteIsNotNull() {
            addCriterion("minute is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteEqualTo(Integer value) {
            addCriterion("minute =", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotEqualTo(Integer value) {
            addCriterion("minute <>", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteGreaterThan(Integer value) {
            addCriterion("minute >", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("minute >=", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLessThan(Integer value) {
            addCriterion("minute <", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("minute <=", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteIn(List<Integer> values) {
            addCriterion("minute in", values, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotIn(List<Integer> values) {
            addCriterion("minute not in", values, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteBetween(Integer value1, Integer value2) {
            addCriterion("minute between", value1, value2, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("minute not between", value1, value2, "minute");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
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