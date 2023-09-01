package com.example.springrestdemo.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrestdemo.Entities.UserEntity;
import com.example.springrestdemo.Service.UserService;

@RestController
public class Controller {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String homePage() {
		return "Welcome to home page";
	}
	
	@GetMapping("/users")
	public List<UserEntity> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public String getUserById(@PathVariable Integer id) {
		return userService.getAUser(id);
	}
	
	@PostMapping("/users")
	public String addUser(@RequestBody UserEntity user) {
		return userService.addUser(user);
	}
	
	@PutMapping("users/{id}")
	public String updateUser(@PathVariable Integer id, @RequestBody UserEntity user) {
		return userService.updateUser(id,user);
	}
	
	@DeleteMapping("users/{id}")
	public List<UserEntity> deleteUser(@PathVariable Integer id) {
		return userService.deleteUser(id);
	}
	
	
	
	
	
	
//	@GetMapping("/")
//	public String get() {
//		return "Welcome to the home page";
//	}
//	
//	@GetMapping("/users")
//	public Object getUsers() {
//		return userService.getUsers();
//	}
//	
//	@GetMapping("/users/{id}")
//	public Object getUserById(@PathVariable Integer id) {
//		return userService.getUserById(id);
//	}
//	
//	@PostMapping("users/addUser")
//	
//		public Object postUser(@RequestBody UserEntity user) {
//			return userService.addUser(user);
//		}
//	
//	@PutMapping("users/updateUser/{id}")
//	public Object updateUser(@RequestBody UserEntity user, @PathVariable Integer id) {
//		return userService.updateUser(user,id);
//	}
//	
//	@DeleteMapping("users/deleteUser/{id}")
//		public Object deleteUser(@PathVariable Integer id) {
//			return userService.deleteUser(id);
//		
//	}
}
