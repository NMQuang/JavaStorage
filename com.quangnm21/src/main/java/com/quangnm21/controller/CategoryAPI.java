package com.quangnm21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quangnm21.entity.Category;
import com.quangnm21.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryAPI {

	@Autowired
	private CategoryService categoryService;

	/***
	 * API lấy danh sách các category
	 * @return
	 */

	@RequestMapping(value = "/get-all", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Category>> listAllCategorys() {
		List<Category> categorys = categoryService.getAllCategorys();
		if(categorys.isEmpty()){
			return new ResponseEntity<List<Category>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Category>>(categorys, HttpStatus.OK);
	}
}
