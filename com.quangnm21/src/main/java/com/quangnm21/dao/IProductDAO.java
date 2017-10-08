package com.quangnm21.dao;

import java.util.List;

import com.quangnm21.entity.Product;

public interface IProductDAO {

	//public void addStrategy(Strategy strategy);
    public Product getlistProductByID(int id);
   // public void updateStrategy(Strategy strategy);
   // public void deleteStrategy(int id);
    public List<Product> getlistProduct();
    public List<Product> getlistTopBestSaleProduct();
    public List<Product> getlistNewProduct();

}
