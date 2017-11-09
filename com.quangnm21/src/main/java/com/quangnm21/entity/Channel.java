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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="channel")
public class Channel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private int id;

	@Column(name ="name", length = 45)
	private String name;

	@Column(name ="viewcount")
	private int viewcount;

	@Column(name ="status")
	private int status;

	@Column(name ="created_time")
	private String created_time;

	@Column(name ="rsspath", length = 45)
	private String rsspath;

	@Column(name ="channelcode", length = 45)
	private String channelcode;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "channel")
	private Set<Episode> episode = new HashSet<Episode>();

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "channels")
	private Set<Category> categories = new HashSet<Category>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="ownerID", nullable = false)
	private Owner owner;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "channel")
	private Set<UserRating> userRating = new HashSet<UserRating>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getViewcount() {
		return viewcount;
	}

	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCreated_time() {
		return created_time;
	}

	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}

	public String getRsspath() {
		return rsspath;
	}

	public void setRsspath(String rsspath) {
		this.rsspath = rsspath;
	}

	public String getChannelcode() {
		return channelcode;
	}

	public void setChannelcode(String channelcode) {
		this.channelcode = channelcode;
	}

	public Set<Episode> getEpisode() {
		return episode;
	}

	public void setEpisode(Set<Episode> episode) {
		this.episode = episode;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Set<UserRating> getUserRating() {
		return userRating;
	}

	public void setUserRating(Set<UserRating> userRating) {
		this.userRating = userRating;
	}

}
