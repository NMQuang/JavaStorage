package com.quangnm21.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class User implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private int id;

	@Column(name ="username", length = 16)
	private String username;

	@Column(name ="email", length = 255)
	private String email;

	@Column(name ="password", length = 32)
	private String password;

	@Column(name ="create_time")
	private String create_time;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "users")
	private Set<Episode> episodes = new HashSet<Episode>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<UserRating> userRating = new HashSet<UserRating>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public Set<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(Set<Episode> episodes) {
		this.episodes = episodes;
	}

	public Set<UserRating> getUserRating() {
		return userRating;
	}

	public void setUserRating(Set<UserRating> userRating) {
		this.userRating = userRating;
	}

}
