package fr.epsi.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.entity.Idea;
import fr.epsi.entity.User;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext(unitName = "topaydiPU")
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public User getUserByName(String n) 
	{
		User u = new User();		
		try {
		u = (User) em.createQuery("SELECT u FROM User u WHERE u.nickname = :n", User.class)
				.setParameter("n", n)
				.getSingleResult();
		} catch (Exception e) {
			return new User();
		}
		return u;
	}
	
	public List<User> getBrainsIdeas() {
		List<User> userz = new ArrayList<User>();
		userz = (List<User>) em.createQuery("SELECT count(u) FROM User u ORDER BY  DESC", User.class).getResultList();
		return userz;
	}

	public void createUser(User u) 
	{		
		try {
			utx.begin();
			em.merge(u);
			utx.commit();
		} catch (Exception e) {
			
		}
	}
	
	public List<User> getAllUsers()
	{
		List<User> users = new ArrayList<User>();
		users = (List<User>) em.createQuery("SELECT u FROM User u", User.class).getResultList();
		return users;
	}
	
	public List<User> getValidatedUsers()
	{
		List<User> users = new ArrayList<User>();
		users = (List<User>) em.createQuery("SELECT u FROM User u WHERE u.isValidated = true", User.class).getResultList();
		return users;
	}
	
	public List<User> getNotValidatedUsers() {
		List<User> users = new ArrayList<User>();
		users = (List<User>) em.createQuery("SELECT u FROM User u WHERE u.isValidated = false", User.class).getResultList();
		return users;
	}
}
