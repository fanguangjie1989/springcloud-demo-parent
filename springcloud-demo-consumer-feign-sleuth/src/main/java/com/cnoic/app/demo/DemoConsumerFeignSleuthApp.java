package com.cnoic.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoConsumerFeignSleuthApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoConsumerFeignSleuthApp.class, args);
	}
}
