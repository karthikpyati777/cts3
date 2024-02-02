package com.example.UserRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserRegistration.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
