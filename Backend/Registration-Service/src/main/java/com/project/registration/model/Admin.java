package com.project.registration.model;

public class Admin {
	
	private String username;
	private String password;
	private String confirmpassword;
	
	public Admin(String username, String password, String confirmpassword) {
		super();
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + ", confirmpassword=" + confirmpassword + "]";
	}
	
	

}
