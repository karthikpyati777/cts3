package com.example.UserRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserRegistration.dtos.SignupRequest;
import com.example.UserRegistration.dtos.UserDTO;
import com.example.UserRegistration.service.UserService;

@RestController
@RequestMapping("api/v1")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping(value="register",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> saveUser(@RequestBody SignupRequest signupRequest){
		
		UserDTO createduser=service.createUser(signupRequest);
		
		if(createduser==null) 
			return new ResponseEntity<>("user not created ,try again later", HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(createduser, HttpStatus.CREATED);
		
	}
}
