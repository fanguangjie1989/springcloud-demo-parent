package com.cnoic.app.demo.feign;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnoic.app.demo.model.Menu;

@FeignClient(name = "springcloud-demo-provider", fallbackFactory = MenuFeignClientFallBackFactory.class)
public interface MenuFeignClient {

	@RequestMapping(value = "/menu/" , method = RequestMethod.POST)
	public int postMenu(@RequestBody Menu menu);

	@RequestMapping(value = "/menu/{id}" , method = RequestMethod.GET)
	public Menu getMenu(@PathVariable("id") BigDecimal id);

	@RequestMapping(value = "/menu/" , method = RequestMethod.GET)
	public List<Menu> getMenus();

	@RequestMapping(value = "/menu/{id}" , method = RequestMethod.PUT)
	public int deleteMenu(@PathVariable("id") BigDecimal id);

	@RequestMapping(value = "/menu/" , method = RequestMethod.PUT)
	public int updateMenu(@RequestBody Menu menu);

}
