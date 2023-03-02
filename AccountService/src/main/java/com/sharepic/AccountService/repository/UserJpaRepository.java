package com.sharepic.AccountService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sharepic.AccountService.entity.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Integer> {

	//get id by username
	@Query ("SELECT u.id FROM User u WHERE u.userName= ?1")
	int getIdByUserName(String userName);
	
	//search user with username
	@Query ("SELECT u FROM User u WHERE u.userName= ?1")
	User findByUserName(String userName);
	
	
}
