package fr.epsi.repository;

import java.util.List;

import fr.epsi.entity.User;

public interface UserRepository {

	public User getUserByName(String n);
	public void createUser(User u);
	public List<User> getNotValidatedUser();
}
