package com.project.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.registration.exception.UserAlreadyExistsException;
import com.project.registration.model.User;
import com.project.registration.model.UserInfo;
import com.project.registration.service.UserRegistrationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Registration")
public class UserController {
	
	@Autowired
	private UserRegistrationService userRegistrationService;
	

	
	@PostMapping("/user")
	public UserInfo addUser(@RequestBody User user) throws UserAlreadyExistsException {
		return userRegistrationService.addUser(user);
	}
	
	/*@PostMapping("/addBook")
    public String addBook(@RequestBody Book book)  throws BookValidationException{
	return bookservice.addBook(book);
       }*/

}
