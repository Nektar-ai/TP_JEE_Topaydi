package fr.epsi.service;

import fr.epsi.entity.User;

public interface UserService {

	public User getUserByName(String n);

	public void createUser(User u);
	
}
