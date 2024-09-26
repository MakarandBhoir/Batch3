package com.infinity;

import java.util.List;

public class UserService {
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public void displayUsers() {
		for (User user : users) {
			System.out.println(user);
		}
	}

	public void addUser(User user) {
		users.add(user);
	}
}
