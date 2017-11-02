package com.quangnm21.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.entity.Store;
import com.quangnm21.util.HibernateUtil;


@Repository
@Transactional
public class StoreDaoImpl implements IStoreDao {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public List<Store> getStoreList() {
		return hibernateUtil.fetchAll(Store.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Store> getListStoreById(int id) {
		String query = "select ";
		return hibernateUtil.fetchAll(query);
	}
}
