package com.quangnm21.entity;

@Entity
@Table(name ="category")
public class MP3 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MP3ID", unique = true, nullable = false)
	private int id;

	@Column(name = "Path")
	private byte[] path;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="StoreID", nullable = false)
	private Store store;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getPath() {
		return path;
	}

	public void setPath(byte[] path) {
		this.path = path;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}


}
