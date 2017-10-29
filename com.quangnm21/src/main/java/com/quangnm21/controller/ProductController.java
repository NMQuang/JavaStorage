package com.quangnm21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quangnm21.entity.ConfigProduct;
import com.quangnm21.entity.Product;
import com.quangnm21.service.IConfigProductService;
import com.quangnm21.service.IProductService;

@Controller
public class ProductController {

	@Autowired
	private IProductService productservice;
	@Autowired
	private IConfigProductService cfproductservice;

	@RequestMapping(value = {"/","/list" }, method = RequestMethod.GET)
    public String listProducts(ModelMap model) {

        List<Product> products = productservice.getlistProduct();
       // System.out.println(products.size() + "|choooooooooooooo" + products.get(0).get_productImage());
        model.addAttribute("listproduct", products);
        model.addAttribute("page", "HomePage");
        String view ="index";
        return view;
    }

	@RequestMapping(value = { "/singleProduct/{pId}" }, method = RequestMethod.GET)
    public String DetailProduct(@PathVariable("pId") String pId,ModelMap model) {

		int id = Integer.parseInt(pId);
        Product product = productservice.getlistProductByID(id);
        ConfigProduct configproduct = cfproductservice.getConfigProduct(pId);

        model.addAttribute("product", product);
        model.addAttribute("cfgproduct", configproduct);
        model.addAttribute("page", "DetailProduct");
        String view ="index";
        return view;
    }

}
