package com.example.fevouritecity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fevouritecity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//	public List<Fevourite> findByUserName(String userName);
//	
//	public void deleteByUserName(String userName);
	
//	City getCityById(Long cityId);
	
	User findByUsername(String username);
	
}
