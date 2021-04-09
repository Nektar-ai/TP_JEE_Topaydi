package fr.epsi.service;

import fr.epsi.entity.Idea;
import fr.epsi.repository.IdeaRepository;
import fr.epsi.repository.IdeaRepositoryImpl;
import fr.epsi.repository.UserRepository;
import fr.epsi.repository.UserRepositoryImpl;

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


@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class IdeaServiceImpl implements IdeaService {

	@PersistenceContext(unitName = "topaydiPU")
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	@EJB
	IdeaRepository dao = new IdeaRepositoryImpl();
	
	public List<Idea> getAllIdeas() {
		List<Idea> ideaz = new ArrayList<Idea>();
		ideaz = dao.getAllIdeas();
		return ideaz;
	}
	
	public void createDummyIdea(Idea i) {
		Idea idea = new Idea("Idee de ouf", "Lorem Ipsum Bo Goss Deus Ex Wouayte Pantairz",
				"https://www.leguerandais.fr/sites/default/files/styles/recette/public/recettes/2012-plancha-de-mini-poivrons-au-sel-de-guerande-le-guerandais.jpg");
		for (int j = 0; j<11; j++) {
			dao.createDummyIdea(idea);
		}
	}
	
}