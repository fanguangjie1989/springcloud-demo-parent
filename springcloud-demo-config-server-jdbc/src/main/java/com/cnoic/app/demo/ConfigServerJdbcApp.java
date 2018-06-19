package com.cnoic.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerJdbcApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerJdbcApp.class, args);
	}
}
