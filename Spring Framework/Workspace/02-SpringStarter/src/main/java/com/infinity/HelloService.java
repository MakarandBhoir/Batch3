package com.infinity;

public class HelloService {
	private User user;
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String sayHello() {
		return "Hello "+user.getFirstName()+" "+user.getLastName()+" From Spring!";
	}
}
