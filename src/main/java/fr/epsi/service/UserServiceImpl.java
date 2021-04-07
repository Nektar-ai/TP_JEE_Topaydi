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
		// TODO Auto-generated method stub
		return null;
	}

	public void saveUser(User u) {
		// TODO Auto-generated method stub
		
	}

	
	
}
