package com.springboot.springBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	 @GetMapping("/test")
	public String getGreetingMsg() {
		System.out.println("inside Rest");
		return "Well Come to Spring Boot !!";
	}
	
}
