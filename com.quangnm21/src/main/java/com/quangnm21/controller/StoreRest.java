package com.quangnm21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quangnm21.entity.Store;
import com.quangnm21.service.IStoreService;


@RestController
@RequestMapping("/store")
public class StoreRest {

	@Autowired
	private IStoreService storeService;

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Store> listAllStore () {
	    return storeService.getStoreList();
	}
}
