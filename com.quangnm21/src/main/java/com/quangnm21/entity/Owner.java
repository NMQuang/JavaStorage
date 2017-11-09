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
@Table(name ="owner")
public class Owner implements Serializable {

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

	@Column(name ="website", length = 45)
	private String website;

	@Column(name ="logo", length = 45)
	private String logo;

	@Column(name ="description", length = 45)
	private String description;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "owner")
	private Set<Channel> channel = new HashSet<Channel>();

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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Channel> getChannel() {
		return channel;
	}

	public void setChannel(Set<Channel> channel) {
		this.channel = channel;
	}

}
