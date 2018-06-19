package com.cnoic.app.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuExample {
    /**
     * This field corresponds to PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    protected String orderByClause;

    /**
     * This field corresponds to PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    protected boolean distinct;

    /**
     * This field corresponds to PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    protected List<Criteria> oredCriteria;

    /**
     * this method MenuExample using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public MenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * this method setOrderByClause using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * this method getOrderByClause using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * this method setDistinct using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * this method isDistinct using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * this method getOredCriteria using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * this method or using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * this method or using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * this method createCriteria using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * this method createCriteriaInternal using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * this method clear using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class corresponds to the database table PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andI18nIsNull() {
            addCriterion("I18N is null");
            return (Criteria) this;
        }

        public Criteria andI18nIsNotNull() {
            addCriterion("I18N is not null");
            return (Criteria) this;
        }

        public Criteria andI18nEqualTo(String value) {
            addCriterion("I18N =", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nNotEqualTo(String value) {
            addCriterion("I18N <>", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nGreaterThan(String value) {
            addCriterion("I18N >", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nGreaterThanOrEqualTo(String value) {
            addCriterion("I18N >=", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nLessThan(String value) {
            addCriterion("I18N <", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nLessThanOrEqualTo(String value) {
            addCriterion("I18N <=", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nLike(String value) {
            addCriterion("I18N like", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nNotLike(String value) {
            addCriterion("I18N not like", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nIn(List<String> values) {
            addCriterion("I18N in", values, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nNotIn(List<String> values) {
            addCriterion("I18N not in", values, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nBetween(String value1, String value2) {
            addCriterion("I18N between", value1, value2, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nNotBetween(String value1, String value2) {
            addCriterion("I18N not between", value1, value2, "i18n");
            return (Criteria) this;
        }

        public Criteria andIsGroupIsNull() {
            addCriterion("IS_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andIsGroupIsNotNull() {
            addCriterion("IS_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andIsGroupEqualTo(String value) {
            addCriterion("IS_GROUP =", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotEqualTo(String value) {
            addCriterion("IS_GROUP <>", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupGreaterThan(String value) {
            addCriterion("IS_GROUP >", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GROUP >=", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLessThan(String value) {
            addCriterion("IS_GROUP <", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLessThanOrEqualTo(String value) {
            addCriterion("IS_GROUP <=", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLike(String value) {
            addCriterion("IS_GROUP like", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotLike(String value) {
            addCriterion("IS_GROUP not like", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupIn(List<String> values) {
            addCriterion("IS_GROUP in", values, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotIn(List<String> values) {
            addCriterion("IS_GROUP not in", values, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupBetween(String value1, String value2) {
            addCriterion("IS_GROUP between", value1, value2, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotBetween(String value1, String value2) {
            addCriterion("IS_GROUP not between", value1, value2, "isGroup");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("LINK is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("LINK is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("LINK =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("LINK <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("LINK >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("LINK >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("LINK <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("LINK <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("LINK like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("LINK not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("LINK in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("LINK not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("LINK between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("LINK not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactIsNull() {
            addCriterion("IS_LINK_EXACT is null");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactIsNotNull() {
            addCriterion("IS_LINK_EXACT is not null");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactEqualTo(String value) {
            addCriterion("IS_LINK_EXACT =", value, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactNotEqualTo(String value) {
            addCriterion("IS_LINK_EXACT <>", value, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactGreaterThan(String value) {
            addCriterion("IS_LINK_EXACT >", value, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LINK_EXACT >=", value, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactLessThan(String value) {
            addCriterion("IS_LINK_EXACT <", value, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactLessThanOrEqualTo(String value) {
            addCriterion("IS_LINK_EXACT <=", value, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactLike(String value) {
            addCriterion("IS_LINK_EXACT like", value, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactNotLike(String value) {
            addCriterion("IS_LINK_EXACT not like", value, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactIn(List<String> values) {
            addCriterion("IS_LINK_EXACT in", values, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactNotIn(List<String> values) {
            addCriterion("IS_LINK_EXACT not in", values, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactBetween(String value1, String value2) {
            addCriterion("IS_LINK_EXACT between", value1, value2, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andIsLinkExactNotBetween(String value1, String value2) {
            addCriterion("IS_LINK_EXACT not between", value1, value2, "isLinkExact");
            return (Criteria) this;
        }

        public Criteria andExternalLinkIsNull() {
            addCriterion("EXTERNAL_LINK is null");
            return (Criteria) this;
        }

        public Criteria andExternalLinkIsNotNull() {
            addCriterion("EXTERNAL_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andExternalLinkEqualTo(String value) {
            addCriterion("EXTERNAL_LINK =", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotEqualTo(String value) {
            addCriterion("EXTERNAL_LINK <>", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkGreaterThan(String value) {
            addCriterion("EXTERNAL_LINK >", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkGreaterThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_LINK >=", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkLessThan(String value) {
            addCriterion("EXTERNAL_LINK <", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkLessThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_LINK <=", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkLike(String value) {
            addCriterion("EXTERNAL_LINK like", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotLike(String value) {
            addCriterion("EXTERNAL_LINK not like", value, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkIn(List<String> values) {
            addCriterion("EXTERNAL_LINK in", values, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotIn(List<String> values) {
            addCriterion("EXTERNAL_LINK not in", values, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkBetween(String value1, String value2) {
            addCriterion("EXTERNAL_LINK between", value1, value2, "externalLink");
            return (Criteria) this;
        }

        public Criteria andExternalLinkNotBetween(String value1, String value2) {
            addCriterion("EXTERNAL_LINK not between", value1, value2, "externalLink");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("TARGET is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("TARGET =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("TARGET <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("TARGET >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("TARGET <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("TARGET <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("TARGET like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("TARGET not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("TARGET in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("TARGET not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("TARGET between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("TARGET not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andBadgeIsNull() {
            addCriterion("BADGE is null");
            return (Criteria) this;
        }

        public Criteria andBadgeIsNotNull() {
            addCriterion("BADGE is not null");
            return (Criteria) this;
        }

        public Criteria andBadgeEqualTo(BigDecimal value) {
            addCriterion("BADGE =", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotEqualTo(BigDecimal value) {
            addCriterion("BADGE <>", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeGreaterThan(BigDecimal value) {
            addCriterion("BADGE >", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BADGE >=", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeLessThan(BigDecimal value) {
            addCriterion("BADGE <", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BADGE <=", value, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeIn(List<BigDecimal> values) {
            addCriterion("BADGE in", values, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotIn(List<BigDecimal> values) {
            addCriterion("BADGE not in", values, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BADGE between", value1, value2, "badge");
            return (Criteria) this;
        }

        public Criteria andBadgeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BADGE not between", value1, value2, "badge");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotIsNull() {
            addCriterion("IS_BADGE_DOT is null");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotIsNotNull() {
            addCriterion("IS_BADGE_DOT is not null");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotEqualTo(String value) {
            addCriterion("IS_BADGE_DOT =", value, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotNotEqualTo(String value) {
            addCriterion("IS_BADGE_DOT <>", value, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotGreaterThan(String value) {
            addCriterion("IS_BADGE_DOT >", value, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BADGE_DOT >=", value, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotLessThan(String value) {
            addCriterion("IS_BADGE_DOT <", value, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotLessThanOrEqualTo(String value) {
            addCriterion("IS_BADGE_DOT <=", value, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotLike(String value) {
            addCriterion("IS_BADGE_DOT like", value, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotNotLike(String value) {
            addCriterion("IS_BADGE_DOT not like", value, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotIn(List<String> values) {
            addCriterion("IS_BADGE_DOT in", values, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotNotIn(List<String> values) {
            addCriterion("IS_BADGE_DOT not in", values, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotBetween(String value1, String value2) {
            addCriterion("IS_BADGE_DOT between", value1, value2, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andIsBadgeDotNotBetween(String value1, String value2) {
            addCriterion("IS_BADGE_DOT not between", value1, value2, "isBadgeDot");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusIsNull() {
            addCriterion("BADGE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusIsNotNull() {
            addCriterion("BADGE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusEqualTo(String value) {
            addCriterion("BADGE_STATUS =", value, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusNotEqualTo(String value) {
            addCriterion("BADGE_STATUS <>", value, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusGreaterThan(String value) {
            addCriterion("BADGE_STATUS >", value, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BADGE_STATUS >=", value, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusLessThan(String value) {
            addCriterion("BADGE_STATUS <", value, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusLessThanOrEqualTo(String value) {
            addCriterion("BADGE_STATUS <=", value, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusLike(String value) {
            addCriterion("BADGE_STATUS like", value, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusNotLike(String value) {
            addCriterion("BADGE_STATUS not like", value, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusIn(List<String> values) {
            addCriterion("BADGE_STATUS in", values, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusNotIn(List<String> values) {
            addCriterion("BADGE_STATUS not in", values, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusBetween(String value1, String value2) {
            addCriterion("BADGE_STATUS between", value1, value2, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andBadgeStatusNotBetween(String value1, String value2) {
            addCriterion("BADGE_STATUS not between", value1, value2, "badgeStatus");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNull() {
            addCriterion("IS_HIDE is null");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNotNull() {
            addCriterion("IS_HIDE is not null");
            return (Criteria) this;
        }

        public Criteria andIsHideEqualTo(String value) {
            addCriterion("IS_HIDE =", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotEqualTo(String value) {
            addCriterion("IS_HIDE <>", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThan(String value) {
            addCriterion("IS_HIDE >", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThanOrEqualTo(String value) {
            addCriterion("IS_HIDE >=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThan(String value) {
            addCriterion("IS_HIDE <", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThanOrEqualTo(String value) {
            addCriterion("IS_HIDE <=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLike(String value) {
            addCriterion("IS_HIDE like", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotLike(String value) {
            addCriterion("IS_HIDE not like", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideIn(List<String> values) {
            addCriterion("IS_HIDE in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotIn(List<String> values) {
            addCriterion("IS_HIDE not in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideBetween(String value1, String value2) {
            addCriterion("IS_HIDE between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotBetween(String value1, String value2) {
            addCriterion("IS_HIDE not between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbIsNull() {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB is null");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbIsNotNull() {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB is not null");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbEqualTo(String value) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB =", value, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbNotEqualTo(String value) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB <>", value, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbGreaterThan(String value) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB >", value, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbGreaterThanOrEqualTo(String value) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB >=", value, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbLessThan(String value) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB <", value, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbLessThanOrEqualTo(String value) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB <=", value, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbLike(String value) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB like", value, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbNotLike(String value) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB not like", value, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbIn(List<String> values) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB in", values, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbNotIn(List<String> values) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB not in", values, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbBetween(String value1, String value2) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB between", value1, value2, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsHideInBreadCrumbNotBetween(String value1, String value2) {
            addCriterion("IS_HIDE_IN_BREAD_CRUMB not between", value1, value2, "isHideInBreadCrumb");
            return (Criteria) this;
        }

        public Criteria andIsShortcutIsNull() {
            addCriterion("IS_SHORTCUT is null");
            return (Criteria) this;
        }

        public Criteria andIsShortcutIsNotNull() {
            addCriterion("IS_SHORTCUT is not null");
            return (Criteria) this;
        }

        public Criteria andIsShortcutEqualTo(String value) {
            addCriterion("IS_SHORTCUT =", value, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutNotEqualTo(String value) {
            addCriterion("IS_SHORTCUT <>", value, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutGreaterThan(String value) {
            addCriterion("IS_SHORTCUT >", value, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHORTCUT >=", value, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutLessThan(String value) {
            addCriterion("IS_SHORTCUT <", value, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutLessThanOrEqualTo(String value) {
            addCriterion("IS_SHORTCUT <=", value, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutLike(String value) {
            addCriterion("IS_SHORTCUT like", value, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutNotLike(String value) {
            addCriterion("IS_SHORTCUT not like", value, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutIn(List<String> values) {
            addCriterion("IS_SHORTCUT in", values, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutNotIn(List<String> values) {
            addCriterion("IS_SHORTCUT not in", values, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutBetween(String value1, String value2) {
            addCriterion("IS_SHORTCUT between", value1, value2, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutNotBetween(String value1, String value2) {
            addCriterion("IS_SHORTCUT not between", value1, value2, "isShortcut");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootIsNull() {
            addCriterion("IS_SHORTCUT_ROOT is null");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootIsNotNull() {
            addCriterion("IS_SHORTCUT_ROOT is not null");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootEqualTo(String value) {
            addCriterion("IS_SHORTCUT_ROOT =", value, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootNotEqualTo(String value) {
            addCriterion("IS_SHORTCUT_ROOT <>", value, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootGreaterThan(String value) {
            addCriterion("IS_SHORTCUT_ROOT >", value, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHORTCUT_ROOT >=", value, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootLessThan(String value) {
            addCriterion("IS_SHORTCUT_ROOT <", value, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootLessThanOrEqualTo(String value) {
            addCriterion("IS_SHORTCUT_ROOT <=", value, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootLike(String value) {
            addCriterion("IS_SHORTCUT_ROOT like", value, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootNotLike(String value) {
            addCriterion("IS_SHORTCUT_ROOT not like", value, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootIn(List<String> values) {
            addCriterion("IS_SHORTCUT_ROOT in", values, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootNotIn(List<String> values) {
            addCriterion("IS_SHORTCUT_ROOT not in", values, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootBetween(String value1, String value2) {
            addCriterion("IS_SHORTCUT_ROOT between", value1, value2, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsShortcutRootNotBetween(String value1, String value2) {
            addCriterion("IS_SHORTCUT_ROOT not between", value1, value2, "isShortcutRoot");
            return (Criteria) this;
        }

        public Criteria andIsReuseIsNull() {
            addCriterion("IS_REUSE is null");
            return (Criteria) this;
        }

        public Criteria andIsReuseIsNotNull() {
            addCriterion("IS_REUSE is not null");
            return (Criteria) this;
        }

        public Criteria andIsReuseEqualTo(String value) {
            addCriterion("IS_REUSE =", value, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseNotEqualTo(String value) {
            addCriterion("IS_REUSE <>", value, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseGreaterThan(String value) {
            addCriterion("IS_REUSE >", value, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REUSE >=", value, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseLessThan(String value) {
            addCriterion("IS_REUSE <", value, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseLessThanOrEqualTo(String value) {
            addCriterion("IS_REUSE <=", value, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseLike(String value) {
            addCriterion("IS_REUSE like", value, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseNotLike(String value) {
            addCriterion("IS_REUSE not like", value, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseIn(List<String> values) {
            addCriterion("IS_REUSE in", values, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseNotIn(List<String> values) {
            addCriterion("IS_REUSE not in", values, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseBetween(String value1, String value2) {
            addCriterion("IS_REUSE between", value1, value2, "isReuse");
            return (Criteria) this;
        }

        public Criteria andIsReuseNotBetween(String value1, String value2) {
            addCriterion("IS_REUSE not between", value1, value2, "isReuse");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(BigDecimal value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(BigDecimal value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(BigDecimal value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(BigDecimal value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<BigDecimal> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<BigDecimal> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRecordVersionIsNull() {
            addCriterion("RECORD_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andRecordVersionIsNotNull() {
            addCriterion("RECORD_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andRecordVersionEqualTo(BigDecimal value) {
            addCriterion("RECORD_VERSION =", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionNotEqualTo(BigDecimal value) {
            addCriterion("RECORD_VERSION <>", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionGreaterThan(BigDecimal value) {
            addCriterion("RECORD_VERSION >", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECORD_VERSION >=", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionLessThan(BigDecimal value) {
            addCriterion("RECORD_VERSION <", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECORD_VERSION <=", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionIn(List<BigDecimal> values) {
            addCriterion("RECORD_VERSION in", values, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionNotIn(List<BigDecimal> values) {
            addCriterion("RECORD_VERSION not in", values, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECORD_VERSION between", value1, value2, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECORD_VERSION not between", value1, value2, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateDescIsNull() {
            addCriterion("UPDATE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDescIsNotNull() {
            addCriterion("UPDATE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDescEqualTo(String value) {
            addCriterion("UPDATE_DESC =", value, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescNotEqualTo(String value) {
            addCriterion("UPDATE_DESC <>", value, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescGreaterThan(String value) {
            addCriterion("UPDATE_DESC >", value, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DESC >=", value, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescLessThan(String value) {
            addCriterion("UPDATE_DESC <", value, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DESC <=", value, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescLike(String value) {
            addCriterion("UPDATE_DESC like", value, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescNotLike(String value) {
            addCriterion("UPDATE_DESC not like", value, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescIn(List<String> values) {
            addCriterion("UPDATE_DESC in", values, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescNotIn(List<String> values) {
            addCriterion("UPDATE_DESC not in", values, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescBetween(String value1, String value2) {
            addCriterion("UPDATE_DESC between", value1, value2, "updateDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateDescNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DESC not between", value1, value2, "updateDesc");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table PAYMENT_MENU
     *
     * @mbg.generated do_not_delete_during_merge 2018-06-14 16:54:25
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
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