package com.sharepic.AccountService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharepic.AccountService.model	.User;
import com.sharepic.AccountService.service.AccountHandleService;

@CrossOrigin
@RestController
@RequestMapping ("/sharepic")
public class AccountController {
	
	
	@Autowired
	private AccountHandleService service;
	
	//end-point for registering a user
	@PostMapping("/signup")
	public String registerUserAccount(@RequestBody User user)
	{
		String status =service.createUser(user);
		System.out.println(new ResponseEntity<Void>(HttpStatus.OK));
		System.out.println(user);
		return status;
		
	}
	
	@GetMapping("/login")
	public String userLogin(@RequestBody User user)
	{
		return "User Signed in";
	}
	
	@GetMapping("/logff")
	public String userLogOff()
	{
		return "User Successfully logged out";
	}
	
	@GetMapping("/checkSession")
	public String sessionCheck()
	{
		return "Hello";
	}

}
