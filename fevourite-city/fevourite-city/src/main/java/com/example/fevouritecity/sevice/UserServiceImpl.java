package com.example.fevouritecity.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fevouritecity.model.User;
import com.example.fevouritecity.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

//	@Override
//	public User getUserByUsername(String username) {
//		// TODO Auto-generated method stub
//		return userRepository.findByUsername(username);
//	}

	

//	@Override
//	public City addCity(City city) {
//		// TODO Auto-generated method stub
//		return cityRepository.save(city);
//	}
	
	
}
