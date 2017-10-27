package com.quangnm21.entity;

import java.util.HashSet;
import java.util.Set;

public class ChucVu {

	private int id;
	private String ten;
	private String moTa;
	private Set<NhanVien> luongChoNhanVien = new HashSet<NhanVien>(0);
}
