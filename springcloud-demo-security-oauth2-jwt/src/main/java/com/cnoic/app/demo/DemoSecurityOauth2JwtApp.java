package com.cnoic.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
/**
 * 
 * @title 	App
 * @desc 	springcloud eureka demo
 * @author  fangj
 * @date 	2018年5月28日
 * @version v1.0
 */
@SpringBootApplication
@EnableResourceServer
public class DemoSecurityOauth2JwtApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoSecurityOauth2JwtApp.class, args);
	}
}
