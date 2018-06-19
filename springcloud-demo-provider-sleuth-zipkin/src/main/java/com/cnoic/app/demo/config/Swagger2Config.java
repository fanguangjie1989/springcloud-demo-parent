package com.cnoic.app.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @title Swagger2Config
 * @desc swagger2 配置类
 * @author fangj
 * @date 2018年4月14日
 * @version v1.0
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

	@Value("${app.api.title}")
	private String title;

	@Value("${app.api.desc}")
	private String desc;

	@Value("${app.api.version}")
	private String version;

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("pulic-api").apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.cnoic.app.demo.controller"))
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(title).description(desc).version(version).build();
	}
}
