package com.sharepic.AccountService.service;

import org.springframework.stereotype.Service;

import com.sharepic.AccountService.entity.User;

import java.util.ArrayList;
import java.util.Collections;

@Service
public interface AccountHandleService {
	
	//method for registering user - signup
	String createUser(com.sharepic.AccountService.model.User user);
	
	//to get a user with given username
	User getByUserName(String UserName);
	
	//method called before login to check if username and password is valid
	User checkUser(String userName, String password);
	
	//searches user by name
	ArrayList<User> searchByName(String fullname);
	
	//to checck if user exists
	boolean checkUser(String userName);

}
