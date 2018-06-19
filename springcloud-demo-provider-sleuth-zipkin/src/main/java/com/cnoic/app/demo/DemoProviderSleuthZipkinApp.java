package com.cnoic.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * 
 * @title 	App
 * @desc 	springcloud eureka demo
 * @author  fangj
 * @date 	2018年5月28日
 * @version v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
public class DemoProviderSleuthZipkinApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoProviderSleuthZipkinApp.class, args);
	}
}
