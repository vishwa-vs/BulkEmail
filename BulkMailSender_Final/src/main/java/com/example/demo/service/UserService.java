package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository uRepo;
	
	
	public boolean checkEmail(String email) {
		
		return uRepo.existsByuemail(email);
	}
}
