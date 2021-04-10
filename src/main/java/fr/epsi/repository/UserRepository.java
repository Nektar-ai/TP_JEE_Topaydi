package fr.epsi.repository;

import java.util.List;

import fr.epsi.entity.User;

public interface UserRepository {

	public User getUserByName(String n);
	public void createUser(User u);
	public void deleteUser(User u);
	public void updateUser(User u);
	public List<User> getAllUsers();
	public List<User> getNotValidatedUsers();
	public List<User> getValidatedUsers();
	public List<User> getDeactivatedUsers();
}
