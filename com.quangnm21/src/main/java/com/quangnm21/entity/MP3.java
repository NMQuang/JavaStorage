package com.quangnm21.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="mp3")
public class MP3  implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

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
