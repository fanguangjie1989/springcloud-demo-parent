package com.cnoic.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class DemoZipkinServerApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoZipkinServerApp.class, args);
	}
}
