package com.cnoic.app.demo.mapper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.cnoic.app.demo.model.Menu;
import com.cnoic.app.demo.model.MenuExample;

@Mapper
public interface MenuMapper {
    /**
     * this method countByExample using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @SelectProvider(type=MenuSqlProvider.class, method="countByExample")
    long countByExample(MenuExample example);

    /**
     * this method deleteByExample using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @DeleteProvider(type=MenuSqlProvider.class, method="deleteByExample")
    int deleteByExample(MenuExample example);

    /**
     * this method deleteByPrimaryKey using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @Delete({
        "delete from PAYMENT_MENU",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * this method insert using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @Insert({
        "insert into PAYMENT_MENU (ID, NAME, ",
        "I18N, IS_GROUP, LINK, ",
        "IS_LINK_EXACT, EXTERNAL_LINK, ",
        "TARGET, ICON, BADGE, ",
        "IS_BADGE_DOT, BADGE_STATUS, ",
        "IS_HIDE, IS_HIDE_IN_BREAD_CRUMB, ",
        "IS_SHORTCUT, IS_SHORTCUT_ROOT, ",
        "IS_REUSE, PARENT_ID, ",
        "CREATE_TIME, UPDATE_TIME, ",
        "RECORD_VERSION, UPDATE_DESC)",
        "values (#{id,jdbcType=DECIMAL}, #{name,jdbcType=VARCHAR}, ",
        "#{i18n,jdbcType=VARCHAR}, #{isGroup,jdbcType=CHAR}, #{link,jdbcType=VARCHAR}, ",
        "#{isLinkExact,jdbcType=CHAR}, #{externalLink,jdbcType=VARCHAR}, ",
        "#{target,jdbcType=VARCHAR}, #{icon,jdbcType=VARCHAR}, #{badge,jdbcType=DECIMAL}, ",
        "#{isBadgeDot,jdbcType=CHAR}, #{badgeStatus,jdbcType=VARCHAR}, ",
        "#{isHide,jdbcType=CHAR}, #{isHideInBreadCrumb,jdbcType=CHAR}, ",
        "#{isShortcut,jdbcType=CHAR}, #{isShortcutRoot,jdbcType=CHAR}, ",
        "#{isReuse,jdbcType=CHAR}, #{parentId,jdbcType=DECIMAL}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{recordVersion,jdbcType=DECIMAL}, #{updateDesc,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="select seq_payment_menu_id.nextval from dual", keyProperty="id", before=true, resultType=BigDecimal.class)
    int insert(Menu record);

    /**
     * this method insertSelective using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @InsertProvider(type=MenuSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select seq_payment_menu_id.nextval from dual", keyProperty="id", before=true, resultType=BigDecimal.class)
    int insertSelective(Menu record);

    /**
     * this method selectByExample using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @SelectProvider(type=MenuSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="ID", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL, id=true),
        @Arg(column="NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="I18N", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="IS_GROUP", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LINK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="IS_LINK_EXACT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="EXTERNAL_LINK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TARGET", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ICON", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BADGE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="IS_BADGE_DOT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BADGE_STATUS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="IS_HIDE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="IS_HIDE_IN_BREAD_CRUMB", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="IS_SHORTCUT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="IS_SHORTCUT_ROOT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="IS_REUSE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PARENT_ID", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="UPDATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="RECORD_VERSION", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="UPDATE_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Menu> selectByExample(MenuExample example);

    /**
     * this method selectByPrimaryKey using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @Select({
        "select",
        "ID, NAME, I18N, IS_GROUP, LINK, IS_LINK_EXACT, EXTERNAL_LINK, TARGET, ICON, ",
        "BADGE, IS_BADGE_DOT, BADGE_STATUS, IS_HIDE, IS_HIDE_IN_BREAD_CRUMB, IS_SHORTCUT, ",
        "IS_SHORTCUT_ROOT, IS_REUSE, PARENT_ID, CREATE_TIME, UPDATE_TIME, RECORD_VERSION, ",
        "UPDATE_DESC",
        "from PAYMENT_MENU",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @ConstructorArgs({
        @Arg(column="ID", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL, id=true),
        @Arg(column="NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="I18N", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="IS_GROUP", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LINK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="IS_LINK_EXACT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="EXTERNAL_LINK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TARGET", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ICON", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BADGE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="IS_BADGE_DOT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BADGE_STATUS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="IS_HIDE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="IS_HIDE_IN_BREAD_CRUMB", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="IS_SHORTCUT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="IS_SHORTCUT_ROOT", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="IS_REUSE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PARENT_ID", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="UPDATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="RECORD_VERSION", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="UPDATE_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Menu selectByPrimaryKey(BigDecimal id);

    /**
     * this method updateByExampleSelective using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @UpdateProvider(type=MenuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     * this method updateByExample using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @UpdateProvider(type=MenuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     * this method updateByPrimaryKeySelective using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @UpdateProvider(type=MenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Menu record);

    /**
     * this method updateByPrimaryKey using for PAYMENT_MENU
     *
     * @mbg.generated 2018-06-14 16:54:25
     */
    @Update({
        "update PAYMENT_MENU",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "I18N = #{i18n,jdbcType=VARCHAR},",
          "IS_GROUP = #{isGroup,jdbcType=CHAR},",
          "LINK = #{link,jdbcType=VARCHAR},",
          "IS_LINK_EXACT = #{isLinkExact,jdbcType=CHAR},",
          "EXTERNAL_LINK = #{externalLink,jdbcType=VARCHAR},",
          "TARGET = #{target,jdbcType=VARCHAR},",
          "ICON = #{icon,jdbcType=VARCHAR},",
          "BADGE = #{badge,jdbcType=DECIMAL},",
          "IS_BADGE_DOT = #{isBadgeDot,jdbcType=CHAR},",
          "BADGE_STATUS = #{badgeStatus,jdbcType=VARCHAR},",
          "IS_HIDE = #{isHide,jdbcType=CHAR},",
          "IS_HIDE_IN_BREAD_CRUMB = #{isHideInBreadCrumb,jdbcType=CHAR},",
          "IS_SHORTCUT = #{isShortcut,jdbcType=CHAR},",
          "IS_SHORTCUT_ROOT = #{isShortcutRoot,jdbcType=CHAR},",
          "IS_REUSE = #{isReuse,jdbcType=CHAR},",
          "PARENT_ID = #{parentId,jdbcType=DECIMAL},",
          "CREATE_TIME = #{createTime,jdbcType=TIMESTAMP},",
          "UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP},",
          "RECORD_VERSION = #{recordVersion,jdbcType=DECIMAL},",
          "UPDATE_DESC = #{updateDesc,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(Menu record);
}