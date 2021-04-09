package fr.epsi.service;

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

	public void createUser(User u) {
		User user = new User();
		user.setNickname(u.getNickname());
		user.setPassword(u.getPassword());
		dao.createUser(user);
	}	
}
