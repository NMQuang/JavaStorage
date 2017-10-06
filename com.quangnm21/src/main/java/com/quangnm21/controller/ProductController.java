package com.quangnm21.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quangnm21.entity.Product;
import com.quangnm21.service.IProductService;

@Controller
@ComponentScan("com.nmquang21.service")
public class ProductController {

    public static Logger logger = Logger.getLogger(ProductController.class);

    @Autowired
    private IProductService productService;

    @RequestMapping(value="/lists",method=RequestMethod.GET, produces="application/x-www-form-urlencoded;charset=UTF-8")
    public String getAllProduct(ModelMap modelMap) {
        List<Product> products = productService.getAllProduct();
        modelMap.put("products", products);
        return "index";
    }
}
