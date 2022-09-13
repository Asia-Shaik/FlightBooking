package com.project.registration.service;

import com.project.registration.exception.UserAlreadyExistsException;
import com.project.registration.model.User;
import com.project.registration.model.UserInfo;

public interface UserInterface {
	
	public UserInfo  addUser(User user) throws UserAlreadyExistsException;

}
