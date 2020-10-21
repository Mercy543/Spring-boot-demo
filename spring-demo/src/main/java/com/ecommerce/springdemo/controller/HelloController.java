package com.ecommerce.springdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String  helloWorld() {
		return "Hello , to Spring Boot App";
	}
	
}
