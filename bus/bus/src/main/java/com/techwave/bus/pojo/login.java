package com.techwave.bus.pojo;



public class login 
{	
	private String username;
	private String Password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public login(String username, String password) {
		super();
		this.username = username;
		Password = password;
	}
	
	
	

}
