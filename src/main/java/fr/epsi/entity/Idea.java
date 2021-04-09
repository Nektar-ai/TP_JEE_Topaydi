package fr.epsi.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Idea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String titre;
	private String description;
	private LocalDate date = LocalDate.now();
	private String photo;
	private int tops;
	private int flops;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User creator;

	@ManyToMany
	private List<Category> category;
	
	@ManyToMany
	@JoinColumn(name="user_id")
	private List<User> user;
	
	public Idea() {}
	
	public Idea(String titre, String description, String photo) {
		this.titre = titre;
		this.description = description;
		this.photo = photo;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getTops() {
		return tops;
	}

	public void setTops(int tops) {
		this.tops = tops;
	}

	public int getFlops() {
		return flops;
	}

	public void setFlops(int flops) {
		this.flops = flops;
	}

	public List<Category> getCategory() {
		return this.category;
	}

	public void setCategory(List<Category> cats) {
		this.category = cats;
	}
	public User getCreator() {
		return creator;
	}

	public void setUser(User user) {
		this.creator = user;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> users) {
		this.user = users;
	}
}
