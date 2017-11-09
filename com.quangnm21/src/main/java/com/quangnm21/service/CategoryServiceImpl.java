package com.quangnm21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dao.CategoryDao;
import com.quangnm21.entity.Category;


@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Category> getAllCategorys() {
		return categoryDao.getAllCategorys();
	}
}
