package com.cnoic.app.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
	
	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}
}
