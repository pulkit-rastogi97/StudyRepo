package com.psl.dmart.dao;

import java.util.List;

import com.psl.dmart.bean.Product;

public interface ProductDao {
	
	public List<Product> getAllProducts();
	
	public Product getProductById(int id);

}
