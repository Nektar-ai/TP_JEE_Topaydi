package fr.epsi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Idea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	private Date date;
	private String photo;
	private int tops;
	private int flops;
	
	@ManyToMany
	private List<Category> category;
	
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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

}
