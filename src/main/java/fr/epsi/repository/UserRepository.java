package fr.epsi.repository;

import fr.epsi.entity.User;

public interface UserRepository {

	public User getUserByName(String n);
	public void saveUser(User u);
	
}
