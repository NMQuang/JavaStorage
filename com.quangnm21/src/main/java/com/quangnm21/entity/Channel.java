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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="channel")
public class Channel  implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ChannelID", unique = true, nullable = false)
	private int id;

	@Column(name = "ChanName", length= 30)
	private String chanName;

	@Column(name = "Timer")
	private String time;

	@Column(name = "Appreciate")
	private int appreciate;

	@Column(name = "State")
	private int state;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="CatID", nullable = false)
	private Category category;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "channel")
	private Set<Store> store = new HashSet<Store>(0);

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChanName() {
		return chanName;
	}
	public void setChanName(String chanName) {
		this.chanName = chanName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getAppreciate() {
		return appreciate;
	}
	public void setAppreciate(int appreciate) {
		this.appreciate = appreciate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Set<Store> getStore() {
		return store;
	}
	public void setStore(Set<Store> store) {
		this.store = store;
	}

}
