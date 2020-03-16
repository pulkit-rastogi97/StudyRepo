package com.psl.service;

import java.util.List;

import com.psl.bean.Product;

public interface ProductService {

	public Boolean validate(String username,String password);
	public Product addProduct(Product product);
	public Product removeProduct(int productId);
	public List<Product> showCart(); 
	public List<Product> showAllProducts();
	public Product getproductbyId(int productId);
}
