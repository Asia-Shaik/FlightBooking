package com.javainuse.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javainuse.model.UserInfo;
import com.javainuse.repository.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional <UserInfo> findById = userRepo.findById(username);
        if (findById.isEmpty()) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        String password= findById.get().getPassword();
        return new User(username,password,new ArrayList<>());

    }
  
}