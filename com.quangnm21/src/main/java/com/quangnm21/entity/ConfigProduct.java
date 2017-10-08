package com.quangnm21.entity;

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
@Table(name= "productconfig")
public class ConfigProduct {

	private int _proconfigID;
	private String _operatingSys;
	private String _screen;
	private int _camera;
	private int _memory;
	private int _pin;
	private Product _product;
	
	
	public ConfigProduct(int _proconfigID, String _operatingSys,
			String _screen, int _camera, int _memory, int _pin,
			Product _product) {
		super();
		this._proconfigID = _proconfigID;
		this._operatingSys = _operatingSys;
		this._screen = _screen;
		this._camera = _camera;
		this._memory = _memory;
		this._pin = _pin;
		this._product = _product;
	}
	public ConfigProduct() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProConfigID", unique = true, nullable = false)
	public int get_proconfigID() {
		return _proconfigID;
	}
	public void set_proconfigID(int _proconfigID) {
		this._proconfigID = _proconfigID;
	}
	@Column(name = "OperatingSys", length= 20)
	public String get_operatingSys() {
		return _operatingSys;
	}
	public void set_operatingSys(String _operatingSys) {
		this._operatingSys = _operatingSys;
	}
	@Column(name = "Screen")
	public String get_screen() {
		return _screen;
	}
	public void set_screen(String _screen) {
		this._screen = _screen;
	}
	@Column(name = "Camera")
	public int get_camera() {
		return _camera;
	}
	public void set_camera(int _camera) {
		this._camera = _camera;
	}
	@Column(name = "Memory")
	public int get_memory() {
		return _memory;
	}
	public void set_memory(int _memory) {
		this._memory = _memory;
	}
	@Column(name = "Pin")
	public int get_pin() {
		return _pin;
	}
	public void set_pin(int _pin) {
		this._pin = _pin;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="ProductID", nullable = false)
	public Product get_product() {
		return _product;
	}
	public void set_product(Product _product) {
		this._product = _product;
	}
}
