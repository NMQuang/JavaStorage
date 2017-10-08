package com.quangnm21.dao;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.entity.Product;
import com.quangnm21.util.HibernateUtil;



@Repository
@Transactional
public class ProductDAOImpl implements IProductDAO{

	@Autowired
	private HibernateUtil hibernateUtil;

	public Product getlistProductByID(int id) {
		return hibernateUtil.fetchById(id, Product.class);
	}

	public List<Product> getlistProduct() {
		return hibernateUtil.fetchAll(Product.class);
	}

	public List<Product> getlistTopBestSaleProduct() {
		return null;
	}

	public List<Product> getlistNewProduct() {
		return null;
	}
}