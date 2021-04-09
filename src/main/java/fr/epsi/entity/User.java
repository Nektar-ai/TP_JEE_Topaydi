package fr.epsi.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nickname;
	private String mail;
	private String password;
	
	@ManyToMany
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
	
}
