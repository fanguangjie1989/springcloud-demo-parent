package com.cnoic.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableFeignClients
@EnableHystrixDashboard
public class DemoConsumerFeignHystrixDashBoardApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoConsumerFeignHystrixDashBoardApp.class, args);
	}
}
