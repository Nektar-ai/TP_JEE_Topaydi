package fr.epsi.repository;

import java.util.List;

import fr.epsi.entity.Idea;

public interface IdeaRepository {
	
	public List<Idea> getAllIdeas();
	public Idea getOneIdeaById(Long id);
	public void createDummyIdea(Idea i);
	public void createIdea(Idea i);
	public void topVote(Idea idea);
	public void flopVote(Idea idea);
	public List<Idea> getBuzzIdeas();
}