package com.example.UserRegistration.service;

import com.example.UserRegistration.dtos.SignupRequest;
import com.example.UserRegistration.dtos.UserDTO;
import com.example.UserRegistration.model.User;

public interface UserService {

	UserDTO createUser(SignupRequest signupRequest);
}
