package fr.epsi.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.entity.User;
import fr.epsi.repository.UserRepository;
import fr.epsi.repository.UserRepositoryImpl;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class UserServiceImpl implements UserService {

	@PersistenceContext(unitName = "topaydiPU")
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	@EJB
	UserRepository dao = new UserRepositoryImpl();
	
	public User getUserByName(String n) {
		User user = new User();
		user = dao.getUserByName(n);
		return user;
	}
	
	public List<User> getBrainsIdeas() {
		List<User> userz = new ArrayList<User>();
		userz = dao.getBrainsIdeas();
		return userz;
	}

	public void createUser(User u) {
		User user = new User(u.getNickname(), u.getMail(), u.getPassword());
		dao.createUser(user);
	}
	
	public void updateUser(User u) {
		
		dao.updateUser(u);
	}
	
	public void deleteUser(User u)
	{
		dao.deleteUser(u);
	}
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		users = dao.getAllUsers();
		return users;
	}
	
	public List<User> getNotValidatedUsers() {
		List<User> users = new ArrayList<User>();
		users = dao.getNotValidatedUsers();
		return users;
	}
	
	public List<User> getValidatedUsers() {
		List<User> users = new ArrayList<User>();
		users = dao.getValidatedUsers();
		return users;
	}
	
	public List<User> getDeactivatedUsers() {
		List<User> users = new ArrayList<User>();
		users = dao.getDeactivatedUsers();
		return users;
	}
}
