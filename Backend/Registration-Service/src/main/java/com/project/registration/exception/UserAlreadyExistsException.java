package com.project.registration.exception;

public class UserAlreadyExistsException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "user is already present";
	}

}
