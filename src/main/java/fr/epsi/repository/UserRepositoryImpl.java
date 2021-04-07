package fr.epsi.repository;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

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
		u = (User) em.createQuery("SELECT u FROM User u WHERE u.nom = :n", User.class)
				.setParameter("n", n)
				.getSingleResult();		
		return u;
	}

	public void saveUser(User u) 
	{		
		try {
			utx.begin();
			em.merge(u);
			utx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
