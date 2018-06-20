package com.cnoic.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
/**
 * 
 * @title 	DemoHystrixTurbineApp
 * @desc 	TODO
 * @author  fangj
 * @date 	2018年6月20日
 * @version v1.0
 */
@SpringBootApplication
@EnableTurbine
public class DemoHystrixTurbineApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoHystrixTurbineApp.class, args);
	}
}
