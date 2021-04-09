package fr.epsi.repository;

import fr.epsi.entity.Idea;
import fr.epsi.entity.User;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;


@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class IdeaRepositoryImpl implements IdeaRepository {

	@PersistenceContext(unitName = "topaydiPU")
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public List<Idea> getAllIdeas() {
		List<Idea> ideaz = new ArrayList<Idea>();
		ideaz = (List<Idea>) em.createQuery("SELECT i FROM Idea i", Idea.class).getResultList();
		return ideaz;
	}
	
	public void createDummyIdea(Idea i) 
	{		
		try {
			utx.begin();
			em.merge(i);
			utx.commit();
		} catch (Exception e) {
			
		}	
	}
	
}