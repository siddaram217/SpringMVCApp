package com.springboot.springBootApp.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springBootApp.dao.IUsersDao;
import com.springboot.springBootApp.dto.User;

@RestController
public class TestController {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(TestController.class);

	 @GetMapping("/test")
	public String getGreetingMsg() {
		System.out.println("inside Rest");
		return "Well Come to Spring Boot !!";
	}
	 
	 @Autowired
	 private IUsersDao usersDao;
	
	 @GetMapping("/findAll")
	public List<User> findAll(){
		return usersDao.findAll();
	}
	
	 @GetMapping("/findById/{id}")
	public Optional<User> findById(@PathVariable("id") Integer id){
		return usersDao.findById(id);
	}

	@PostMapping("/deleteById/{id}")
	public void deleteById(@PathVariable("id") Integer id){
		usersDao.deleteById(id);
	}

	@PostMapping("/save")
	public User save(@RequestBody User user){
		logger.info("save user "+user);
		return usersDao.save(user);
	}
	
	@PostMapping("/update")
	public User update(@RequestBody User user){
		logger.info("update user "+user);
		return usersDao.save(user);
	}
}
