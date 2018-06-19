package com.cnoic.app.demo.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cnoic.app.demo.feign.MenuFeignClient;
import com.cnoic.app.demo.model.Menu;

@RestController
@RequestMapping("/consume/menu")
public class MenuConsumerController {

	@Autowired
	private MenuFeignClient menuFeignClient;

	@RequestMapping(value="/",method= RequestMethod.POST)
	public int postMenu(@RequestBody Menu menu) {
		return menuFeignClient.postMenu(menu);
	}

	@RequestMapping(value="/{id}",method= RequestMethod.GET)
	public Menu getMenu(@PathVariable("id") BigDecimal id) {
		return menuFeignClient.getMenu(id);
	}

	@RequestMapping(value="/",method= RequestMethod.GET)
	public List<Menu> getMenus() {
		return menuFeignClient.getMenus();
	}

	@RequestMapping(value="/{id}",method= RequestMethod.PUT)
	public int deleteMenu(@PathVariable("id") BigDecimal id) {
		return menuFeignClient.deleteMenu(id);
	}

	@RequestMapping(value="/",method= RequestMethod.PUT)
	public int updateMenu(@RequestBody Menu menu) {
		return menuFeignClient.updateMenu(menu);
	}
}
