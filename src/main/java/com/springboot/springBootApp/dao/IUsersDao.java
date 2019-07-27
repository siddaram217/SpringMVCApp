package com.springboot.springBootApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.springBootApp.dto.User;

public interface IUsersDao extends CrudRepository<User, Integer>{
	
	public List<User> findAll();
	
	public Optional<User> findById(Integer id);
	
	@Transactional
	public User save(User user);
	
/*	@Transactional
	public User update(User user);*/

	@Transactional
	public void deleteById(Integer id);
}
