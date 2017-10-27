package com.quangnm21.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class NhanVien {

	private int id;
	private ChiNhanh chiNhanh;
	private ChucVu chucVu;
	private String ten;
	private String ngaySinh;
	private String gioiTinh;
	private String cmnd;
	private String sdt;
	private String diaChi;
	private BigDecimal luong;
	private Set<LuongChoNhanVien> luongChoNhanVien = new HashSet<LuongChoNhanVien>(0);
	private Set<HoaDon> hoaDon = new HashSet<HoaDon>(0);
}
