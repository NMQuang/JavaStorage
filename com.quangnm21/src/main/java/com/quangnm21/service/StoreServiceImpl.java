package com.quangnm21.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dao.IStoreDao;
import com.quangnm21.entity.Store;


@Service
@Transactional
public class StoreServiceImpl implements IStoreService {

	@Autowired
	private IStoreDao storeDao;

	public List<Store> getStoreList() {
		return storeDao.getStoreList();
	}

	@Override
	public List<String> getAllStoreById(int id) {
		List<String> esposides = new ArrayList<String>();
		List<Store> stores = storeDao.getListStoreById(id);

		for (Store store : stores) {

		}
		return null;
	}

}
