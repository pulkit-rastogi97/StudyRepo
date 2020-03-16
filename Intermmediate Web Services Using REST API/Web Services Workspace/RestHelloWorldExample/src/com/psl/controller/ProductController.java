package com.psl.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.psl.bean.Product;
import com.psl.service.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	ProductServiceImpl service;
	
	@RequestMapping(value="/product/{id}")
	public @ResponseBody Product getProductById(@PathVariable("id") String productId)
	{
		return service.getProductById(productId);
	}
	
	@RequestMapping("/product/getAll")
	public @ResponseBody HashMap<String,Product> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	@RequestMapping(value="/products",method = RequestMethod.POST,headers = "Accept=application/json")
	public Product addProduct(@RequestBody Product product)
	{
		return service.addProoduct(product);
	}
	
	@RequestMapping(value="/products", method = RequestMethod.POST, headers ="Accept=application/json")
	public Product updateProduct(@RequestBody Product product)
	{
		return service.updateProduct(product);
	}
	
	
}
