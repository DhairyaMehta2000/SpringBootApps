package com.example.springrestdemo.ServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.springrestdemo.Entities.UserEntity;

@Service
public class UserServiceImpl {

//	LinkedHashMap<String,Integer> userList = new LinkedHashMap<>();
	ArrayList<UserEntity> userList = new ArrayList<>();
	
	public UserServiceImpl() {
		userList.add(new UserEntity("Dhairya",23));
		userList.add(new UserEntity("Rishi",22));
	}
	
	
	public List<UserEntity> getAllUsers() {
		return userList;
	}
	
	public String getAUser(Integer id) {
		List<UserEntity> user = userList.stream().filter(u->u.getAge()==id).collect(Collectors.toList());
		if(user.size()>=1) {
			return "User with id "+id + " found"; 
		}
		else {
			return "User not found";
		}
	}
	
	public String addUser(UserEntity user) {
		userList.add(user);
		return "User with name " +user.getName() + " age " + user.getAge()+" added";
	}
	
	public String updateUser(Integer id, UserEntity user) {
		List<UserEntity> filteredUser = userList.stream().filter(u->u.getAge()==id).collect(Collectors.toList());
		filteredUser.forEach((u)->{
			u.setAge(user.getAge());
			u.setName(user.getName());
		});
		return "User with name " +user.getName() + " age " + user.getAge()+" updated";
	}
	
	public List<UserEntity> deleteUser(Integer id) {
		
		userList.removeIf(u->u.getAge()==id);
		return userList;
	};
	
//		public List<UserEntity> getUsers() {
//			return userList;
//		}
//		
//		public String getUserById(Integer id) {
//			 Stream<UserEntity> filteredUser = userList.stream().filter(user->user.getAge()==id);
//			 
//			if(filteredUser!=null) {
//				return "User with age "+ id + " found";
//			}
//			else {
//				return "user not found";
//			}
//			
//		}
//		
//		public ArrayList<UserEntity> addUser(UserEntity user){
//			 userList.add(user);
//			 return userList;
//		}
//		
//		public ArrayList<UserEntity> updateUser(UserEntity user, Integer id){
//			UserEntity user_to_be_updated = userList.stream().filter(u->
//				u.getAge()==id).findFirst().orElse(null);
//			
//			if(user_to_be_updated!=null) {
//				user_to_be_updated.setAge(user.getAge());
//				user_to_be_updated.setName(user.getName());
//			}
//			return userList;
//		}
//		
//		public List<UserEntity> deleteUser(Integer id){
//			userList.removeIf(user->user.getAge()==id);
//			return userList;
//		}
//		 
}
