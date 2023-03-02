package com.sharepic.AccountService.mapper;

import java.util.Date;

import org.springframework.stereotype.Component;
import com.sharepic.AccountService.entity.User;

@Component
public class UserMapper {
	
	public User mapUserModeltoEntity(com.sharepic.AccountService.model.User input)
	{
		User user = new User();
		user.setFullName(input.getFullName());
	    user.setUserName(input.getUserName());
	    user.setProfilePicture(input.getprofilePicture());
	    user.setProfileDescription(input.getprofileDescription());
	    user.setPassword(input.getPassword());
	    user.setCreatedOn(new Date());
		System.out.println("inside mapper method" + user.getPassword());
		return user;
		
	}

}
