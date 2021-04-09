package fr.epsi.service;

import java.util.List;

import fr.epsi.entity.Idea;

public interface IdeaService {
	
	public List<Idea> getAllIdeas();
	public void createDummyIdea(Idea i);
	
}