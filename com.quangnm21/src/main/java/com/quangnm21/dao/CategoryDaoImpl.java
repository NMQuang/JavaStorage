package com.quangnm21.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.entity.Category;
import com.quangnm21.util.HibernateUtil;


@Repository
@Transactional
public class CategoryDaoImpl implements ICategoryDao {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public List<Category> getAllCategorys() {
		return hibernateUtil.fetchAll(Category.class);
	}

}
