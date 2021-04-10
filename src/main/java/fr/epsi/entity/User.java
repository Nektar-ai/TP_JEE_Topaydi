package fr.epsi.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nickname;
	private String mail;
	private String password;
	private boolean isAdmin = false;
	private boolean isValidated = false;
	private boolean isActive = true;

	@OneToMany
	@JoinColumn(name="idea_id")
	private List<Idea> ideacreated;
	
	@ManyToMany(mappedBy="user")
	private List<Idea> idea;

//	@ElementCollection(targetClass = Roles.class)
//	@JoinTable(name = "RolesTable", joinColumns = @JoinColumn(name = "user_id"))
//	@Column(name = "roles", nullable = false)
//	@Enumerated(EnumType.STRING)
//	Collection<Roles> roles;
	
	public User() {}
	
	public User(String nickname, String password) {
		this.nickname = nickname;
		this.password = password;
	}
	
	public User(String nickname, String mail, String password) {
		this.nickname = nickname;
		this.mail = mail;
		this.password = password;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Idea> getIdeacreated() {
		return ideacreated;
	}

	public void setIdeacreated(List<Idea> ideacreated) {
		this.ideacreated = ideacreated;
	}

	public List<Idea> getIdea() {
		return idea;
	}

	public void setIdea(List<Idea> idea) {
		this.idea = idea;
	}
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public boolean isValidated() {
		return isValidated;
	}

	public void setValidated(boolean validated) {
		this.isValidated = validated;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
