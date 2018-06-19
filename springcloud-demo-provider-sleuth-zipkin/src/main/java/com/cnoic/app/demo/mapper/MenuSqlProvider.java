package com.cnoic.app.demo.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

import com.cnoic.app.demo.model.Menu;
import com.cnoic.app.demo.model.MenuExample;
import com.cnoic.app.demo.model.MenuExample.Criteria;
import com.cnoic.app.demo.model.MenuExample.Criterion;

public class MenuSqlProvider {

    /**
     * this method countByExample using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String countByExample(MenuExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("PAYMENT_MENU");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * this method deleteByExample using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String deleteByExample(MenuExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("PAYMENT_MENU");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * this method insertSelective using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String insertSelective(Menu record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("PAYMENT_MENU");
        
        sql.VALUES("ID", "#{id,jdbcType=DECIMAL}");
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getI18n() != null) {
            sql.VALUES("I18N", "#{i18n,jdbcType=VARCHAR}");
        }
        
        if (record.getIsGroup() != null) {
            sql.VALUES("IS_GROUP", "#{isGroup,jdbcType=CHAR}");
        }
        
        if (record.getLink() != null) {
            sql.VALUES("LINK", "#{link,jdbcType=VARCHAR}");
        }
        
        if (record.getIsLinkExact() != null) {
            sql.VALUES("IS_LINK_EXACT", "#{isLinkExact,jdbcType=CHAR}");
        }
        
        if (record.getExternalLink() != null) {
            sql.VALUES("EXTERNAL_LINK", "#{externalLink,jdbcType=VARCHAR}");
        }
        
        if (record.getTarget() != null) {
            sql.VALUES("TARGET", "#{target,jdbcType=VARCHAR}");
        }
        
        if (record.getIcon() != null) {
            sql.VALUES("ICON", "#{icon,jdbcType=VARCHAR}");
        }
        
        if (record.getBadge() != null) {
            sql.VALUES("BADGE", "#{badge,jdbcType=DECIMAL}");
        }
        
        if (record.getIsBadgeDot() != null) {
            sql.VALUES("IS_BADGE_DOT", "#{isBadgeDot,jdbcType=CHAR}");
        }
        
        if (record.getBadgeStatus() != null) {
            sql.VALUES("BADGE_STATUS", "#{badgeStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIsHide() != null) {
            sql.VALUES("IS_HIDE", "#{isHide,jdbcType=CHAR}");
        }
        
        if (record.getIsHideInBreadCrumb() != null) {
            sql.VALUES("IS_HIDE_IN_BREAD_CRUMB", "#{isHideInBreadCrumb,jdbcType=CHAR}");
        }
        
        if (record.getIsShortcut() != null) {
            sql.VALUES("IS_SHORTCUT", "#{isShortcut,jdbcType=CHAR}");
        }
        
        if (record.getIsShortcutRoot() != null) {
            sql.VALUES("IS_SHORTCUT_ROOT", "#{isShortcutRoot,jdbcType=CHAR}");
        }
        
        if (record.getIsReuse() != null) {
            sql.VALUES("IS_REUSE", "#{isReuse,jdbcType=CHAR}");
        }
        
        if (record.getParentId() != null) {
            sql.VALUES("PARENT_ID", "#{parentId,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("CREATE_TIME", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("UPDATE_TIME", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRecordVersion() != null) {
            sql.VALUES("RECORD_VERSION", "#{recordVersion,jdbcType=DECIMAL}");
        }
        
        if (record.getUpdateDesc() != null) {
            sql.VALUES("UPDATE_DESC", "#{updateDesc,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * this method selectByExample using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String selectByExample(MenuExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("NAME");
        sql.SELECT("I18N");
        sql.SELECT("IS_GROUP");
        sql.SELECT("LINK");
        sql.SELECT("IS_LINK_EXACT");
        sql.SELECT("EXTERNAL_LINK");
        sql.SELECT("TARGET");
        sql.SELECT("ICON");
        sql.SELECT("BADGE");
        sql.SELECT("IS_BADGE_DOT");
        sql.SELECT("BADGE_STATUS");
        sql.SELECT("IS_HIDE");
        sql.SELECT("IS_HIDE_IN_BREAD_CRUMB");
        sql.SELECT("IS_SHORTCUT");
        sql.SELECT("IS_SHORTCUT_ROOT");
        sql.SELECT("IS_REUSE");
        sql.SELECT("PARENT_ID");
        sql.SELECT("CREATE_TIME");
        sql.SELECT("UPDATE_TIME");
        sql.SELECT("RECORD_VERSION");
        sql.SELECT("UPDATE_DESC");
        sql.FROM("PAYMENT_MENU");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * this method updateByExampleSelective using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Menu record = (Menu) parameter.get("record");
        MenuExample example = (MenuExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("PAYMENT_MENU");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=DECIMAL}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getI18n() != null) {
            sql.SET("I18N = #{record.i18n,jdbcType=VARCHAR}");
        }
        
        if (record.getIsGroup() != null) {
            sql.SET("IS_GROUP = #{record.isGroup,jdbcType=CHAR}");
        }
        
        if (record.getLink() != null) {
            sql.SET("LINK = #{record.link,jdbcType=VARCHAR}");
        }
        
        if (record.getIsLinkExact() != null) {
            sql.SET("IS_LINK_EXACT = #{record.isLinkExact,jdbcType=CHAR}");
        }
        
        if (record.getExternalLink() != null) {
            sql.SET("EXTERNAL_LINK = #{record.externalLink,jdbcType=VARCHAR}");
        }
        
        if (record.getTarget() != null) {
            sql.SET("TARGET = #{record.target,jdbcType=VARCHAR}");
        }
        
        if (record.getIcon() != null) {
            sql.SET("ICON = #{record.icon,jdbcType=VARCHAR}");
        }
        
        if (record.getBadge() != null) {
            sql.SET("BADGE = #{record.badge,jdbcType=DECIMAL}");
        }
        
        if (record.getIsBadgeDot() != null) {
            sql.SET("IS_BADGE_DOT = #{record.isBadgeDot,jdbcType=CHAR}");
        }
        
        if (record.getBadgeStatus() != null) {
            sql.SET("BADGE_STATUS = #{record.badgeStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIsHide() != null) {
            sql.SET("IS_HIDE = #{record.isHide,jdbcType=CHAR}");
        }
        
        if (record.getIsHideInBreadCrumb() != null) {
            sql.SET("IS_HIDE_IN_BREAD_CRUMB = #{record.isHideInBreadCrumb,jdbcType=CHAR}");
        }
        
        if (record.getIsShortcut() != null) {
            sql.SET("IS_SHORTCUT = #{record.isShortcut,jdbcType=CHAR}");
        }
        
        if (record.getIsShortcutRoot() != null) {
            sql.SET("IS_SHORTCUT_ROOT = #{record.isShortcutRoot,jdbcType=CHAR}");
        }
        
        if (record.getIsReuse() != null) {
            sql.SET("IS_REUSE = #{record.isReuse,jdbcType=CHAR}");
        }
        
        if (record.getParentId() != null) {
            sql.SET("PARENT_ID = #{record.parentId,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRecordVersion() != null) {
            sql.SET("RECORD_VERSION = #{record.recordVersion,jdbcType=DECIMAL}");
        }
        
        if (record.getUpdateDesc() != null) {
            sql.SET("UPDATE_DESC = #{record.updateDesc,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * this method updateByExample using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PAYMENT_MENU");
        
        sql.SET("ID = #{record.id,jdbcType=DECIMAL}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("I18N = #{record.i18n,jdbcType=VARCHAR}");
        sql.SET("IS_GROUP = #{record.isGroup,jdbcType=CHAR}");
        sql.SET("LINK = #{record.link,jdbcType=VARCHAR}");
        sql.SET("IS_LINK_EXACT = #{record.isLinkExact,jdbcType=CHAR}");
        sql.SET("EXTERNAL_LINK = #{record.externalLink,jdbcType=VARCHAR}");
        sql.SET("TARGET = #{record.target,jdbcType=VARCHAR}");
        sql.SET("ICON = #{record.icon,jdbcType=VARCHAR}");
        sql.SET("BADGE = #{record.badge,jdbcType=DECIMAL}");
        sql.SET("IS_BADGE_DOT = #{record.isBadgeDot,jdbcType=CHAR}");
        sql.SET("BADGE_STATUS = #{record.badgeStatus,jdbcType=VARCHAR}");
        sql.SET("IS_HIDE = #{record.isHide,jdbcType=CHAR}");
        sql.SET("IS_HIDE_IN_BREAD_CRUMB = #{record.isHideInBreadCrumb,jdbcType=CHAR}");
        sql.SET("IS_SHORTCUT = #{record.isShortcut,jdbcType=CHAR}");
        sql.SET("IS_SHORTCUT_ROOT = #{record.isShortcutRoot,jdbcType=CHAR}");
        sql.SET("IS_REUSE = #{record.isReuse,jdbcType=CHAR}");
        sql.SET("PARENT_ID = #{record.parentId,jdbcType=DECIMAL}");
        sql.SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("RECORD_VERSION = #{record.recordVersion,jdbcType=DECIMAL}");
        sql.SET("UPDATE_DESC = #{record.updateDesc,jdbcType=VARCHAR}");
        
        MenuExample example = (MenuExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * this method updateByPrimaryKeySelective using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String updateByPrimaryKeySelective(Menu record) {
        SQL sql = new SQL();
        sql.UPDATE("PAYMENT_MENU");
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getI18n() != null) {
            sql.SET("I18N = #{i18n,jdbcType=VARCHAR}");
        }
        
        if (record.getIsGroup() != null) {
            sql.SET("IS_GROUP = #{isGroup,jdbcType=CHAR}");
        }
        
        if (record.getLink() != null) {
            sql.SET("LINK = #{link,jdbcType=VARCHAR}");
        }
        
        if (record.getIsLinkExact() != null) {
            sql.SET("IS_LINK_EXACT = #{isLinkExact,jdbcType=CHAR}");
        }
        
        if (record.getExternalLink() != null) {
            sql.SET("EXTERNAL_LINK = #{externalLink,jdbcType=VARCHAR}");
        }
        
        if (record.getTarget() != null) {
            sql.SET("TARGET = #{target,jdbcType=VARCHAR}");
        }
        
        if (record.getIcon() != null) {
            sql.SET("ICON = #{icon,jdbcType=VARCHAR}");
        }
        
        if (record.getBadge() != null) {
            sql.SET("BADGE = #{badge,jdbcType=DECIMAL}");
        }
        
        if (record.getIsBadgeDot() != null) {
            sql.SET("IS_BADGE_DOT = #{isBadgeDot,jdbcType=CHAR}");
        }
        
        if (record.getBadgeStatus() != null) {
            sql.SET("BADGE_STATUS = #{badgeStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIsHide() != null) {
            sql.SET("IS_HIDE = #{isHide,jdbcType=CHAR}");
        }
        
        if (record.getIsHideInBreadCrumb() != null) {
            sql.SET("IS_HIDE_IN_BREAD_CRUMB = #{isHideInBreadCrumb,jdbcType=CHAR}");
        }
        
        if (record.getIsShortcut() != null) {
            sql.SET("IS_SHORTCUT = #{isShortcut,jdbcType=CHAR}");
        }
        
        if (record.getIsShortcutRoot() != null) {
            sql.SET("IS_SHORTCUT_ROOT = #{isShortcutRoot,jdbcType=CHAR}");
        }
        
        if (record.getIsReuse() != null) {
            sql.SET("IS_REUSE = #{isReuse,jdbcType=CHAR}");
        }
        
        if (record.getParentId() != null) {
            sql.SET("PARENT_ID = #{parentId,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRecordVersion() != null) {
            sql.SET("RECORD_VERSION = #{recordVersion,jdbcType=DECIMAL}");
        }
        
        if (record.getUpdateDesc() != null) {
            sql.SET("UPDATE_DESC = #{updateDesc,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=DECIMAL}");
        
        return sql.toString();
    }

    /**
     * this method applyWhere using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    protected void applyWhere(SQL sql, MenuExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}