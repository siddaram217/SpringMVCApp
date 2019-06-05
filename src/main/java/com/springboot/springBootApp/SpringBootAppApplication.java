package com.springboot.springBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.springBootApp.controller.TestController;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext confic = SpringApplication.run(SpringBootAppApplication.class, args);
		TestController testCon = confic.getBean(TestController.class);
		testCon.getGreetingMsg();
	}
}
