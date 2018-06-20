package com.cnoic.app.demo.feign;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cnoic.app.demo.model.Menu;

@Component
public class MenuFeignClientFallBack implements MenuFeignClient {

	@Override
	public int postMenu(Menu menu) {
		return 0;
	}

	@Override
	public Menu getMenu(BigDecimal id) {
		return null;
	}

	@Override
	public List<Menu> getMenus() {
		return null;
	}

	@Override
	public int deleteMenu(BigDecimal id) {
		return 0;
	}

	@Override
	public int updateMenu(Menu menu) {
		return 0;
	}

}
