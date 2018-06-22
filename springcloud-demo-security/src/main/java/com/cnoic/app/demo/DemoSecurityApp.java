package com.cnoic.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
/**
 * 
 * @title 	App
 * @desc 	springcloud eureka demo
 * @author  fangj
 * @date 	2018年5月28日
 * @version v1.0
 */
@SpringBootApplication
public class DemoSecurityApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoSecurityApp.class, args);
	}
}
