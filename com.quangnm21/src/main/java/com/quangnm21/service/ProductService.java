package com.quangnm21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dao.IProductDAO;
import com.quangnm21.entity.Product;



@Service
@Transactional
public class ProductService implements IProductService{

	@Autowired
	private IProductDAO dao_Product;


	public ProductService() {

	}

	public Product getlistProductByID(int id) {
		// TODO Auto-generated method stub

		return dao_Product.getlistProductByID(id);
	}


	public List<Product> getlistProduct() {
		// TODO Auto-generated method stub
		return dao_Product.getlistProduct();

	}

	public List<Product> getlistTopBestSaleProduct() {
		// TODO Auto-generated method stub
		return dao_Product.getlistTopBestSaleProduct();
	}

}
