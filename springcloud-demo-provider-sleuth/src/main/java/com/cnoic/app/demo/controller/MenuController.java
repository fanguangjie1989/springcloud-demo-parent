package com.cnoic.app.demo.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cnoic.app.demo.model.Menu;
import com.cnoic.app.demo.model.MenuExample;
import com.cnoic.app.demo.service.MenuService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value="/",method=RequestMethod.POST )
	public int postMenu(@RequestBody Menu menu) {
		return menuService.insertSelective(menu);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET )
	public Menu getMenu(@PathVariable("id") BigDecimal id) {
		return menuService.selectByPrimaryKey(id);
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET )
	public List<Menu> getMenus(){
		MenuExample example = new MenuExample();
		return menuService.selectByExample(example);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT )
	public int deleteMenu(@PathVariable("id") BigDecimal id) {
		return menuService.deleteByPrimaryKey(id);
	}
	
	@RequestMapping(value="/",method=RequestMethod.PUT )
	public int updateMenu(@RequestBody Menu menu) {
		return menuService.updateByPrimaryKeySelective(menu);
	}
}
