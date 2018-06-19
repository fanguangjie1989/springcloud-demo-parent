package com.cnoic.app.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.cnoic.app.demo.model.Menu;
import com.cnoic.app.demo.model.MenuExample;

public interface MenuService {

	long countByExample(MenuExample example);

	int deleteByExample(MenuExample example);

	int deleteByPrimaryKey(BigDecimal id);

	int insert(Menu record);

	int insertSelective(Menu record);

	List<Menu> selectByExample(MenuExample example);

	Menu selectByPrimaryKey(BigDecimal id);

	int updateByExampleSelective(Menu record, MenuExample example);

	int updateByExample(Menu record, MenuExample example);

	int updateByPrimaryKeySelective(Menu record);

	int updateByPrimaryKey(Menu record);
}
