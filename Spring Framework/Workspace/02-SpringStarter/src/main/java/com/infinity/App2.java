package com.infinity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		UserService userService = (UserService) context.getBean("userService");
		
		User user = (User) context.getBean("user");
		user.setFirstName("Sneha");
		user.setLastName("Bhagat");
		
		userService.displayUsers();
		System.out.println("---------------");
		userService.addUser(user);
		userService.displayUsers();
		
	}
}
