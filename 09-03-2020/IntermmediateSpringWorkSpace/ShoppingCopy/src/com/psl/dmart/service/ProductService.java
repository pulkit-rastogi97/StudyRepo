package com.psl.dmart.service;

import java.util.List;

import com.psl.dmart.bean.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	
	public void addToCart(int id);
	
	public void removeFromCart(int id);
	
	public List<Product> displayCartItems();
}
