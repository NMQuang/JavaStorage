package com.quangnm21.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quangnm21.entity.ConfigProduct;
import com.quangnm21.util.HibernateUtil;



@Repository
public class ConfigProductDAOImpl implements IConfigProductDAO {

	@Autowired
	private HibernateUtil hibernateUtil;

	public ConfigProduct getConfigProduct(String IDConfig) {

		String sql = "from ConfigProduct where ProductID = "+ IDConfig;
		return (ConfigProduct) hibernateUtil.fetchAll(sql).get(0);
	}

}
