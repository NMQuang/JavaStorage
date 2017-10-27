package com.quangnm21.entity;

import java.util.HashSet;
import java.util.Set;

public class ChiNhanh {

	private int id;
	private String ten;
	private String diaChi;
	private String dienThoai;
	private TinhThanh tinhThanh;
	private Set<AccountChiNhanh> accountChiNhanh = new HashSet<AccountChiNhanh>(0);
	private Set<TienThueNha> tienThueNha = new HashSet<TienThueNha>(0);
	private Set<ChiPhiNgay> chiPhiNgay = new HashSet<ChiPhiNgay>(0);
	private Set<NhanVien> nhanVien = new HashSet<NhanVien>(0);
	private Set<Mon> mon = new HashSet<Mon>(0);
}
