package com.quangnm21.entity;

@Entity
@Table(name ="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoryID", unique = true, nullable = false)
	private int id;

	@Column(name = "CatName", length= 30)
	private String CatName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "channel")
	private Set<Channel> channel = new HashSet<Channel>(0);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return CatName;
	}

	public void setCatName(String catName) {
		CatName = catName;
	}

	public Set<Channel> getChannel() {
		return channel;
	}

	public void setChannel(Set<Channel> channel) {
		this.channel = channel;
	}


}
