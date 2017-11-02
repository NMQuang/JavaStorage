package com.quangnm21.dao;

import java.util.List;

import com.quangnm21.entity.Store;


public interface IStoreDao {

	List<Store> getStoreList();

	List<Store> getListStoreById(int id);
}
