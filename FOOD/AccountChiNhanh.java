package com.quangnm21.entity;

public class AccountChiNhanh {

	private String username;
	private String password;
	private String ten;
	private String cmnd;
	private String gioiTinh;
	private ChiNhanh chiNhanh;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public ChiNhanh getChiNhanh() {
		return chiNhanh;
	}
	public void setChiNhanh(ChiNhanh chiNhanh) {
		this.chiNhanh = chiNhanh;
	}


}
