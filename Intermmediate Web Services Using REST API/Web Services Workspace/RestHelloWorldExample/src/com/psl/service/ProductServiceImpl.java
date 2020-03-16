package com.psl.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.bean.Product;
import com.psl.dao.ProductDaoImpl;


@Service("service")
public class ProductServiceImpl {

	@Autowired
	ProductDaoImpl dao;
	
	public Product getProductById(String productId)
	{
		return dao.getProductById(productId);
	}
	public HashMap<String, Product> getAllProducts()
	{
		return dao.getAllProducts();
	}
	public Product updateProduct(Product product) {
		return dao.updateProduct(product);
	}
	public Product addProoduct(Product product) {
		return dao.addProduct(product);
	} 
}
