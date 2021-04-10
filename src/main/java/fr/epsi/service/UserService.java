package fr.epsi.service;

import java.util.List;

import fr.epsi.entity.Idea;
import fr.epsi.entity.User;

public interface UserService {

	public User getUserByName(String n);
	public List<User> getAllUsers();
	public List<User> getValidatedUsers();
	public List<User> getNotValidatedUsers();
	public void createUser(User u);
	public List<User> getBrainsIdeas();
	
}
