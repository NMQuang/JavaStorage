package com.quangnm21.service;

import java.util.List;

import com.quangnm21.entity.Store;


public interface IStoreService {

	List<Store> getStoreList();

	List<String> getAllStoreById(int id);
}
