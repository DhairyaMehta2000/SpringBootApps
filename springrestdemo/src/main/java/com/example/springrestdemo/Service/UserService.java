package com.example.springrestdemo.Service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springrestdemo.Entities.UserEntity;
import com.example.springrestdemo.ServiceImpl.UserServiceImpl;

@Service
public class UserService {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	public List<UserEntity> getAllUsers() {
		return userServiceImpl.getAllUsers();
	}
	
	public String getAUser(Integer id) {
		return userServiceImpl.getAUser(id);
	}
	
	public String addUser(UserEntity user) {
		return userServiceImpl.addUser(user);
	}
	public String updateUser(Integer id, UserEntity user) {
		return userServiceImpl.updateUser(id,user);
	}
	
	public List<UserEntity> deleteUser(Integer id) {
		return userServiceImpl.deleteUser(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Object getUsers() {
//		return userServiceImpl.getUsers();
//	}
//	
//	public Object getUserById(Integer id) {
//		return userServiceImpl.getUserById(id);
//	}
//	
//	public Object addUser(@RequestBody UserEntity user) {
//		return userServiceImpl.addUser(user);
//	}
//	
//	public Object updateUser(UserEntity user, Integer id) {
//		return userServiceImpl.updateUser(user, id);
//	}
//	public Object deleteUser(Integer id) {
//		return userServiceImpl.deleteUser(id);
//	}
}
