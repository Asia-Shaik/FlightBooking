package com.project.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.project.registration.model.User;
import com.project.registration.model.UserInfo;
import com.project.registration.repository.UserRepository;

public class UserRegistrationService implements UserInterface {
	
	@Autowired
	private UserRepository userrepo;
	
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
	
	@Override
	public UserInfo addUser(User user) {
		
		String encodedPass = bcryptEncoder.encode(user.getPassword());



		UserInfo newuser = new UserInfo(user.getUsername(), encodedPass);
		
		return userrepo.save(newuser);
	}

}
