package com.sharepic.AccountService.repository;

import org.springframework.stereotype.Repository;


import com.sharepic.AccountService.entity.User;

@Repository
public interface UserRepository {
	

	void saveUser(User user);
	
	//User getByUserName(String UserName);
	
	
	

}
