package com.cnoic.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * @title 	App
 * @desc 	springcloud eureka demo
 * @author  fangj
 * @date 	2018年5月28日
 * @version v1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class DemoEurekaServerApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaServerApp.class, args);
	}
}
