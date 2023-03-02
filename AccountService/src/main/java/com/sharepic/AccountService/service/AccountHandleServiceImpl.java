package com.sharepic.AccountService.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharepic.AccountService.entity.*;
import com.sharepic.AccountService.mapper.UserMapper;
import com.sharepic.AccountService.repository.UserRepository;
import com.sharepic.AccountService.repository.UserJpaRepository;


@Service
public class AccountHandleServiceImpl implements AccountHandleService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserJpaRepository userJpaRepository;
	
	
	@Override
	public User createUser(com.sharepic.AccountService.model.User user) {
		// TODO Auto-generated method stub
			User obj = userMapper.mapUserModeltoEntity(user);
			System.out.println(obj);
			userRepo.saveUser(userMapper.mapUserModeltoEntity(user));
			System.out.println("User Registered");
			return obj;
		
	}

	@Override
	public User getByUserName(String UserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User checkUser(String userName, String password) {
		// TODO Auto-generated method stub
		try {
			
			User user = userJpaRepository.findByUserName(userName);
			if(user.getPassword().equals(password))
			{
				return user;
			}
			else
				return null; 
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	@Override
	public ArrayList<User> searchByName(String fullname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkUser(String userName) {
		// TODO Auto-generated method stub
		try {
			
			int id = userJpaRepository.getIdByUserName(userName);
			System.out.println("Checking user " + id);
			if(id !=0)
				return true;
		}
		catch (Exception e)
		{
			System.out.println("Exception occured " + e );
		}
		return false;
	}

	

}
