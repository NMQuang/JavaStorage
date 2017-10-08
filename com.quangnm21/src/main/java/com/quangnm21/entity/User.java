package com.quangnm21.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class User implements Serializable{
	

	private int _userID;
	
	private String _mail;
	
	private String _password;
	
	private String _fullname;
	
	private String _phonenumber;

	public User(){
	}
	public User( String _mail, String _password,
			String _fullname, String _phonenumber) {
		super();
		
		this._mail = _mail;
		this._password = _password;
		this._fullname = _fullname;
		this._phonenumber = _phonenumber;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID", unique = true)
	public int get_userID() {
		return _userID;
	}

	

	public void set_userID(int _userID) {
		this._userID = _userID;
	}
	@Column(name ="Email", length = 20)
	public String get_mail() {
		return _mail;
	}

	public void set_mail(String _mail) {
		this._mail = _mail;
	}

	@Column(name ="PassWord", length = 20)
	public String get_password() {
		return _password;
	}

	public void set_password(String _password) {
		this._password = _password;
	}

	@Column(name ="UserFullName", length = 30)
	public String get_fullname() {
		return _fullname;
	}

	public void set_fullname(String _fullname) {
		this._fullname = _fullname;
	}

	@Column(name ="PhoneNumber", length = 12)
	public String get_phonenumber() {
		return _phonenumber;
	}

	public void set_phonenumber(String _phonenumber) {
		this._phonenumber = _phonenumber;
	}
	

}
