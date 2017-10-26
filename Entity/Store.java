package com.quangnm21.entity;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="store")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StoreID", unique = true, nullable = false)
	private int id;

	@Column(name = "Name", length= 30)
	private String name;

	@Column(name = "View")
	private int view;

	@Column(name = "Favorite")
	private int favorite;

	@Column(name = "State")
	private int state;

	@Column(name = "TimeCreate")
	private String timeCreate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="ChanID", nullable = false)
	private Channel channel;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="UserID", nullable = false)
	private User user;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
	private Set<MP3> mp3 = new HashSet<MP3>(0);

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

	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}

	public int getFavorite() {
		return favorite;
	}
	public void setFavorite(int favorite) {
		this.favorite = favorite;
	}

	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	public String getTimeCreate() {
		return timeCreate;
	}
	public void setTimeCreate(String timeCreate) {
		this.timeCreate = timeCreate;
	}

	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public set<MP3> getMp3() {
		return mp3;
	}
	public void setMp3(set<MP3> mp3) {
		this.mp3 = mp3;
	}

}
