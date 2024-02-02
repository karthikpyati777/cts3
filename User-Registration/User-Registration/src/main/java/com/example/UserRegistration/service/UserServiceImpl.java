package com.example.UserRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.UserRegistration.dtos.SignupRequest;
import com.example.UserRegistration.dtos.UserDTO;
import com.example.UserRegistration.model.User;
import com.example.UserRegistration.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	@Override
	public UserDTO createUser(SignupRequest signupRequest) {
		// TODO Auto-generated method stub

		User user = new User();
		user.setName(signupRequest.getName());
		user.setEmail(signupRequest.getEmail());
		user.setCity(signupRequest.getCity());
		user.setPincode(signupRequest.getPincode());
//		user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
		user.setPassword(signupRequest.getPassword());
		User createduser = repo.save(user);
		UserDTO userDTO = new UserDTO();
		userDTO.setName(createduser.getName());
		userDTO.setCity(createduser.getCity());
		userDTO.setEmail(createduser.getEmail());
		userDTO.setPincode(createduser.getPincode());
		userDTO.setPassword(createduser.getPassword());
		userDTO.setUserId(createduser.getUserId());
		

		return userDTO;
	}

}
