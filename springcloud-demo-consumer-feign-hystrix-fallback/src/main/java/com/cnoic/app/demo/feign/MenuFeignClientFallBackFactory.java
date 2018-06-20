package com.cnoic.app.demo.feign;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cnoic.app.demo.model.Menu;

import feign.hystrix.FallbackFactory;

@Component
public class MenuFeignClientFallBackFactory implements FallbackFactory<MenuFeignClient> {
	private static final Logger logger = LoggerFactory.getLogger(MenuFeignClientFallBackFactory.class);
	
	@Override
	public MenuFeignClient create(Throwable cause) {
		return new MenuFeignClient() {
			
			@Override
			public int postMenu(Menu menu) {
				logger.error("fallback resean was",cause);
				return 0;
			}

			@Override
			public Menu getMenu(BigDecimal id) {
				logger.error("fallback resean was",cause);
				return null;
			}

			@Override
			public List<Menu> getMenus() {
				logger.error("fallback resean was",cause);
				return null;
			}

			@Override
			public int deleteMenu(BigDecimal id) {
				logger.error("fallback resean was",cause);
				return 0;
			}

			@Override
			public int updateMenu(Menu menu) {
				logger.error("fallback resean was",cause);
				return 0;
			}
			
		};
	}

}
