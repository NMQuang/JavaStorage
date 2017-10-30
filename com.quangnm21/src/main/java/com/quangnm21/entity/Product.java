package com.quangnm21.entity;



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
@Table(name = "product")
public class Product implements Comparable{
	private int _productID;
	private String _productName;
	private String _productPrice;
	
	private String  _productColor;
	private String _productCompany;
	private String _productImage;
	
	private Set<ConfigProduct> _configproduct = new HashSet<ConfigProduct>(
			0);

	
	
	public Product(int _productID, String _productName, String _productPrice,
			String _productColor, String _productCompany, String _productImage,
			Set<ConfigProduct> _configproduct) {
		super();
		this._productID = _productID;
		this._productName = _productName;
		this._productPrice = _productPrice;
		this._productColor = _productColor;
		this._productCompany = _productCompany;
		this._productImage = _productImage;
		this._configproduct = _configproduct;
	}
	public Product() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProductID", unique = true, nullable = false)
	public int get_productID() {
		return _productID;
	}
	public void set_productID(int _productID) {
		this._productID = _productID;
	}
	
	@Column(name ="ProductName", length = 20)
	public String get_productName() {
		return _productName;
	}
	public void set_productName(String _productName) {
		this._productName = _productName;
	}
	
	@Column(name ="ProductPrice", length = 10)
	public String get_productPrice() {
		return _productPrice;
	}
	public void set_productPrice(String _productPrice) {
		this._productPrice = _productPrice;
	}
	
	@Column(name ="ProductColor", length = 20)
	public String get_productColor() {
		return _productColor;
	}
	public void set_productColor(String _productColor) {
		this._productColor = _productColor;
	}
	
	@Column(name ="ProductCompany", length = 20)
	public String get_productCompany() {
		return _productCompany;
	}
	public void set_productCompany(String _productCompany) {
		this._productCompany = _productCompany;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "_product")
	public Set<ConfigProduct> get_configproduct() {
		return _configproduct;
	}
	
	
	public void set_configproduct(Set<ConfigProduct> _configproduct) {
		this._configproduct = _configproduct;
	}
	@Column(name ="ProductImage", length = 30)
	public String get_productImage() {
		return _productImage;
	}
	public void set_productImage(String _productImage) {
		this._productImage = _productImage;
	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
