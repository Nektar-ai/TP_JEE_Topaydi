package fr.epsi.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.epsi.entity.User;
import fr.epsi.repository.UserRepository;
import fr.epsi.repository.UserRepositoryImpl;

@Stateless
public class UserServiceImpl implements UserService {

	@EJB
	UserRepository dao = new UserRepositoryImpl();
	
	public User getUserByName(String n) {
		User user = new User();
		user = dao.getUserByName(n);
		return user;
	}

	public void saveUser(User u) {
		User user = new User();
		user.setNickname(u.getNickname());
		user.setPassword(u.getPassword());
		dao.saveUser(user);
	}
	
	public void createDummyUser(User u) {
		User user = new User();
		user.setNickname(u.getNickname());
		user.setPassword(u.getPassword());
		dao.saveUser(user);
	}
}
