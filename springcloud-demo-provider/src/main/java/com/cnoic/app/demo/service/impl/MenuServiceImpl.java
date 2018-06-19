package com.cnoic.app.demo.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnoic.app.demo.model.Menu;
import com.cnoic.app.demo.model.MenuExample;
import com.cnoic.app.demo.service.MenuService;
import com.cnoic.app.demo.mapper.MenuMapper;

@Service
@Transactional(rollbackFor=Exception.class)
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuMapper menuMapper;
	
	@Transactional(readOnly=true )
	@Override
	public long countByExample(MenuExample example) {
		return menuMapper.countByExample(example);
	}

	@Transactional(readOnly=true )
	@Override
	public int deleteByExample(MenuExample example) {
		return menuMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(BigDecimal id) {
		return menuMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Menu record) {
		return menuMapper.insert(record);
	}

	@Override
	public int insertSelective(Menu record) {
		return menuMapper.insertSelective(record);
	}

	@Transactional(readOnly=true )
	@Override
	public List<Menu> selectByExample(MenuExample example) {
		return menuMapper.selectByExample(example);
	}

	@Transactional(readOnly=true )
	@Override
	public Menu selectByPrimaryKey(BigDecimal id) {
		return menuMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Menu record, MenuExample example) {
		return menuMapper.updateByExample(record, example);
	}

	@Override
	public int updateByExample(Menu record, MenuExample example) {
		return menuMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Menu record) {
		return menuMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Menu record) {
		return menuMapper.updateByPrimaryKey(record);
	}

}
