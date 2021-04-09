package fr.epsi.service;

import java.util.List;

import fr.epsi.entity.User;

public interface UserService {

	public User getUserByName(String n);
	public List<User> getNotValidatedUser();
	public void createUser(User u);
	
}
