package com.cnoic.app.demo.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class corresponds to the database table BP_DEV.PAYMENT_MENU
 *@author	mggfgj	
 *@date2018-06-14 16:54:25
 *@version v1.0
 *
 * @mbg.generated do_not_delete_during_merge 2018-06-14 16:54:25
 */
public class Menu {
    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.ID
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private BigDecimal id;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.NAME
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String name;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.I18N
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String i18n;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.IS_GROUP
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String isGroup;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.LINK
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String link;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.IS_LINK_EXACT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String isLinkExact;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.EXTERNAL_LINK
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String externalLink;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.TARGET
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String target;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.ICON
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String icon;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.BADGE
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private BigDecimal badge;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.IS_BADGE_DOT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String isBadgeDot;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.BADGE_STATUS
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String badgeStatus;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.IS_HIDE
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String isHide;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.IS_HIDE_IN_BREAD_CRUMB
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String isHideInBreadCrumb;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.IS_SHORTCUT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String isShortcut;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.IS_SHORTCUT_ROOT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String isShortcutRoot;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.IS_REUSE
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String isReuse;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.PARENT_ID
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private BigDecimal parentId;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.CREATE_TIME
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private Date createTime;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.UPDATE_TIME
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private Date updateTime;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.RECORD_VERSION
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private BigDecimal recordVersion;

    /**
     *
     * This field corresponds to BP_DEV.PAYMENT_MENU.UPDATE_DESC
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    private String updateDesc;

    /**
     * this method Menu using for BP_DEV.PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public Menu(BigDecimal id, String name, String i18n, String isGroup, String link, String isLinkExact, String externalLink, String target, String icon, BigDecimal badge, String isBadgeDot, String badgeStatus, String isHide, String isHideInBreadCrumb, String isShortcut, String isShortcutRoot, String isReuse, BigDecimal parentId, Date createTime, Date updateTime, BigDecimal recordVersion, String updateDesc) {
        this.id = id;
        this.name = name;
        this.i18n = i18n;
        this.isGroup = isGroup;
        this.link = link;
        this.isLinkExact = isLinkExact;
        this.externalLink = externalLink;
        this.target = target;
        this.icon = icon;
        this.badge = badge;
        this.isBadgeDot = isBadgeDot;
        this.badgeStatus = badgeStatus;
        this.isHide = isHide;
        this.isHideInBreadCrumb = isHideInBreadCrumb;
        this.isShortcut = isShortcut;
        this.isShortcutRoot = isShortcutRoot;
        this.isReuse = isReuse;
        this.parentId = parentId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.recordVersion = recordVersion;
        this.updateDesc = updateDesc;
    }

    /**
     * this method Menu using for BP_DEV.PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public Menu() {
        super();
    }

    /**
     * @return  ID 对应BP_DEV.PAYMENT_MENU.ID
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id 对应 BP_DEV.PAYMENT_MENU.ID
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return  NAME 对应BP_DEV.PAYMENT_MENU.NAME
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 对应 BP_DEV.PAYMENT_MENU.NAME
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  I18N 对应BP_DEV.PAYMENT_MENU.I18N
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getI18n() {
        return i18n;
    }

    /**
     * @param i18n 对应 BP_DEV.PAYMENT_MENU.I18N
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setI18n(String i18n) {
        this.i18n = i18n == null ? null : i18n.trim();
    }

    /**
     * @return  IS_GROUP 对应BP_DEV.PAYMENT_MENU.IS_GROUP
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getIsGroup() {
        return isGroup;
    }

    /**
     * @param isGroup 对应 BP_DEV.PAYMENT_MENU.IS_GROUP
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setIsGroup(String isGroup) {
        this.isGroup = isGroup == null ? null : isGroup.trim();
    }

    /**
     * @return  LINK 对应BP_DEV.PAYMENT_MENU.LINK
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link 对应 BP_DEV.PAYMENT_MENU.LINK
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * @return  IS_LINK_EXACT 对应BP_DEV.PAYMENT_MENU.IS_LINK_EXACT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getIsLinkExact() {
        return isLinkExact;
    }

    /**
     * @param isLinkExact 对应 BP_DEV.PAYMENT_MENU.IS_LINK_EXACT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setIsLinkExact(String isLinkExact) {
        this.isLinkExact = isLinkExact == null ? null : isLinkExact.trim();
    }

    /**
     * @return  EXTERNAL_LINK 对应BP_DEV.PAYMENT_MENU.EXTERNAL_LINK
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getExternalLink() {
        return externalLink;
    }

    /**
     * @param externalLink 对应 BP_DEV.PAYMENT_MENU.EXTERNAL_LINK
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink == null ? null : externalLink.trim();
    }

    /**
     * @return  TARGET 对应BP_DEV.PAYMENT_MENU.TARGET
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getTarget() {
        return target;
    }

    /**
     * @param target 对应 BP_DEV.PAYMENT_MENU.TARGET
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    /**
     * @return  ICON 对应BP_DEV.PAYMENT_MENU.ICON
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon 对应 BP_DEV.PAYMENT_MENU.ICON
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * @return  BADGE 对应BP_DEV.PAYMENT_MENU.BADGE
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public BigDecimal getBadge() {
        return badge;
    }

    /**
     * @param badge 对应 BP_DEV.PAYMENT_MENU.BADGE
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setBadge(BigDecimal badge) {
        this.badge = badge;
    }

    /**
     * @return  IS_BADGE_DOT 对应BP_DEV.PAYMENT_MENU.IS_BADGE_DOT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getIsBadgeDot() {
        return isBadgeDot;
    }

    /**
     * @param isBadgeDot 对应 BP_DEV.PAYMENT_MENU.IS_BADGE_DOT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setIsBadgeDot(String isBadgeDot) {
        this.isBadgeDot = isBadgeDot == null ? null : isBadgeDot.trim();
    }

    /**
     * @return  BADGE_STATUS 对应BP_DEV.PAYMENT_MENU.BADGE_STATUS
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getBadgeStatus() {
        return badgeStatus;
    }

    /**
     * @param badgeStatus 对应 BP_DEV.PAYMENT_MENU.BADGE_STATUS
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setBadgeStatus(String badgeStatus) {
        this.badgeStatus = badgeStatus == null ? null : badgeStatus.trim();
    }

    /**
     * @return  IS_HIDE 对应BP_DEV.PAYMENT_MENU.IS_HIDE
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getIsHide() {
        return isHide;
    }

    /**
     * @param isHide 对应 BP_DEV.PAYMENT_MENU.IS_HIDE
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setIsHide(String isHide) {
        this.isHide = isHide == null ? null : isHide.trim();
    }

    /**
     * @return  IS_HIDE_IN_BREAD_CRUMB 对应BP_DEV.PAYMENT_MENU.IS_HIDE_IN_BREAD_CRUMB
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getIsHideInBreadCrumb() {
        return isHideInBreadCrumb;
    }

    /**
     * @param isHideInBreadCrumb 对应 BP_DEV.PAYMENT_MENU.IS_HIDE_IN_BREAD_CRUMB
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setIsHideInBreadCrumb(String isHideInBreadCrumb) {
        this.isHideInBreadCrumb = isHideInBreadCrumb == null ? null : isHideInBreadCrumb.trim();
    }

    /**
     * @return  IS_SHORTCUT 对应BP_DEV.PAYMENT_MENU.IS_SHORTCUT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getIsShortcut() {
        return isShortcut;
    }

    /**
     * @param isShortcut 对应 BP_DEV.PAYMENT_MENU.IS_SHORTCUT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setIsShortcut(String isShortcut) {
        this.isShortcut = isShortcut == null ? null : isShortcut.trim();
    }

    /**
     * @return  IS_SHORTCUT_ROOT 对应BP_DEV.PAYMENT_MENU.IS_SHORTCUT_ROOT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getIsShortcutRoot() {
        return isShortcutRoot;
    }

    /**
     * @param isShortcutRoot 对应 BP_DEV.PAYMENT_MENU.IS_SHORTCUT_ROOT
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setIsShortcutRoot(String isShortcutRoot) {
        this.isShortcutRoot = isShortcutRoot == null ? null : isShortcutRoot.trim();
    }

    /**
     * @return  IS_REUSE 对应BP_DEV.PAYMENT_MENU.IS_REUSE
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getIsReuse() {
        return isReuse;
    }

    /**
     * @param isReuse 对应 BP_DEV.PAYMENT_MENU.IS_REUSE
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setIsReuse(String isReuse) {
        this.isReuse = isReuse == null ? null : isReuse.trim();
    }

    /**
     * @return  PARENT_ID 对应BP_DEV.PAYMENT_MENU.PARENT_ID
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public BigDecimal getParentId() {
        return parentId;
    }

    /**
     * @param parentId 对应 BP_DEV.PAYMENT_MENU.PARENT_ID
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }

    /**
     * @return  CREATE_TIME 对应BP_DEV.PAYMENT_MENU.CREATE_TIME
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime 对应 BP_DEV.PAYMENT_MENU.CREATE_TIME
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return  UPDATE_TIME 对应BP_DEV.PAYMENT_MENU.UPDATE_TIME
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime 对应 BP_DEV.PAYMENT_MENU.UPDATE_TIME
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return  RECORD_VERSION 对应BP_DEV.PAYMENT_MENU.RECORD_VERSION
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public BigDecimal getRecordVersion() {
        return recordVersion;
    }

    /**
     * @param recordVersion 对应 BP_DEV.PAYMENT_MENU.RECORD_VERSION
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setRecordVersion(BigDecimal recordVersion) {
        this.recordVersion = recordVersion;
    }

    /**
     * @return  UPDATE_DESC 对应BP_DEV.PAYMENT_MENU.UPDATE_DESC
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public String getUpdateDesc() {
        return updateDesc;
    }

    /**
     * @param updateDesc 对应 BP_DEV.PAYMENT_MENU.UPDATE_DESC
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    public void setUpdateDesc(String updateDesc) {
        this.updateDesc = updateDesc == null ? null : updateDesc.trim();
    }
}