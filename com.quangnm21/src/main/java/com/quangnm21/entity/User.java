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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class User implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID", unique = true)
	private int id;

	@Column(name ="UserName", length = 30)
	private String username;

	@Column(name ="Email", length = 30)
	private String email;

	@Column(name ="Password", length = 30)
	private String password;

	@Column(name ="TimeInEnd")
	private String timeInEnd;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Store> store = new HashSet<Store>(0);


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

	public String getTimeInEnd() {
		return timeInEnd;
	}

	public void setTimeInEnd(String timeInEnd) {
		this.timeInEnd = timeInEnd;
	}

	public Set<Store> getStore() {
		return store;
	}

	public void setStore(Set<Store> store) {
		this.store = store;
	}

}
