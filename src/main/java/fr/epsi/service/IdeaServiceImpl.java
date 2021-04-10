package fr.epsi.service;

import fr.epsi.entity.Idea;
import fr.epsi.repository.IdeaRepository;
import fr.epsi.repository.IdeaRepositoryImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class IdeaServiceImpl implements IdeaService {
	
	@EJB
	IdeaRepository dao = new IdeaRepositoryImpl();
	
	public List<Idea> getAllIdeas() {
		List<Idea> ideaz = new ArrayList<Idea>();
		ideaz = dao.getAllIdeas();
		return ideaz;
	}
	
	public List<Idea> getBuzzIdeas() {
		List<Idea> ideaz = new ArrayList<Idea>();
		ideaz = dao.getBuzzIdeas();
		return ideaz;
	}
	
	public void createDummyIdea() {
		List<Idea> Ideaz = new ArrayList<Idea>();
		
		Idea id1 = new Idea("Idee de ouf", "Lorem Ipsum Bo Goss Deus Ex Wouayte Pantairz",
				"https://www.leguerandais.fr/sites/default/files/styles/recette/public/recettes/2012-plancha-de-mini-poivrons-au-sel-de-guerande-le-guerandais.jpg");
		Ideaz.add(id1);
		Idea id2 = new Idea("Space Travel", "Time for some space shit",
				"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/pmx040119touristguidespace-01-1551108233.jpg?resize=480:*");
		Ideaz.add(id2);
		Idea id3 = new Idea("Drone Flight", "Let's Get Droned",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEe5s0bFg0kiHsZgI-4UPsGFzdBVDBm9ZdqKKdcknDNnZbo2VgTwXZE8HOaUr7xIYysX0&usqp=CAU");
		Ideaz.add(id3);
		Idea id4 = new Idea("Blonde Big Boobs", "Triple B Baby",
				"https://img-9gag-fun.9cache.com/photo/aAbGoBL_700b.jpg");
		Ideaz.add(id4);

		for (Idea id : Ideaz) {
			dao.createDummyIdea(id);
		}
	}
	
	public void topVote(Long id) {
		Idea idea = dao.getOneIdeaById(id);
		dao.topVote(idea);
	}
	
	public void flopVote(Long id) {
		Idea idea = dao.getOneIdeaById(id);
		dao.flopVote(idea);
	}
}