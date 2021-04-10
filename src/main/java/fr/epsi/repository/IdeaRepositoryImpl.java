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
		ideaz = (List<Idea>) em.createQuery("SELECT i FROM Idea i ORDER BY i.tops DESC", Idea.class).getResultList();
		return ideaz;
	}
	
//	public List<Idea> getBuzzIdeas() {
//		List<Idea> ideaz = new ArrayList<Idea>();
//		ideaz = (List<Idea>) em.createQuery("SELECT i, SUM(i.tops+i.flops) AS buzz FROM "
//				+ "(SELECT DISTINCT i FROM Idea)"
//				+ "GROUP BY i.id ORDER BY buzz DESC", Idea.class).getResultList();
//		return ideaz;
//	}

	public List<Idea> getBuzzIdeas() {
		List<Idea> ideaz = new ArrayList<Idea>();
		ideaz = (List<Idea>) em.createQuery("SELECT i FROM Idea i GROUP BY i.id ORDER BY SUM(i.tops+i.flops) DESC ", Idea.class).getResultList();
		return ideaz;
	}
	
	public Idea getOneIdeaById(Long id) {
		Idea idea = new Idea();
		idea = (Idea) em.createQuery("SELECT i FROM Idea i WHERE id = " + id, Idea.class).getSingleResult();
		return idea;
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
	
	public void topVote(Idea i) {
		i.setTops(i.getTops()+1);
		try {
			utx.begin();
			em.merge(i);
			utx.commit();
		} catch (Exception e) {
			
		}
	}
	
	public void flopVote(Idea i) {
		i.setFlops(i.getFlops()+1);
		try {
			utx.begin();
			em.merge(i);
			utx.commit();
		} catch (Exception e) {
			
		}
	}
}