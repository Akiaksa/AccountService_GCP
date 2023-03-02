package com.sharepic.AccountService.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.sharepic.AccountService.entity.User;


@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private UserJpaRepository userRepository;
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		try {
			userRepository.save(user);
		}
		catch (DataAccessException e)
		{
			System.out.print("Hello i am here " + e);
		}

	}
/*
	@Override
	public User getByUserName(String UserName) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	
	

}
