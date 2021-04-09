package fr.epsi.repository;

import java.util.List;

import fr.epsi.entity.Idea;

public interface IdeaRepository {
	
	public List<Idea> getAllIdeas();
	public void createDummyIdea(Idea i);
	
}