package com.quangnm21.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.quangnm21.entity.Channel;

@Entity
@Table(name ="episode")
public class Episode implements Serializable {

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

	@Column(name ="audiopath", length = 45)
	private String audiopath;

	@Column(name ="duration")
	private int duration;

	@Column(name ="image", length = 45)
	private String image;

	@Column(name ="guid", length = 45)
	private String guid;

	@Column(name ="pubdate")
	private String pubdate;

	@Column(name ="description", length = 45)
	private String description;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "user_favorite", joinColumns = {
			@JoinColumn(name = "episodeid", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "userid",
					nullable = false, updatable = false) })
	private Set<User> users = new HashSet<User>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="channelid", nullable = false)
	private Channel channel;

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

	public String getAudiopath() {
		return audiopath;
	}

	public void setAudiopath(String audiopath) {
		this.audiopath = audiopath;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

}
