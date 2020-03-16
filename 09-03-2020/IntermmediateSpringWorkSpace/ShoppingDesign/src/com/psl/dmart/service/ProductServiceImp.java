package com.psl.dmart.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.dmart.bean.Product;
import com.psl.dmart.dao.ProductDao;

@Service("productService")
public class ProductServiceImp implements ProductService{

	@Autowired
	ProductDao productDao;

	static List<Product> cart = new ArrayList<Product>();
	
	static HashMap<Integer,Product> products = new HashMap<Integer, Product>();
	
	@Override
	public HashMap<Integer, Product> getAllProducts() {
		
		products = productDao.getAllProducts();
		return products;
	}

	@Override
	public void addToCart(int id) {
		
		cart.add(products.get(id));
		
	}

	@Override
	public void removeFromCart(int id) {
		cart.remove(products.get(id));
	}

	@Override
	public List<Product> displayCartItems() {
		return cart;
	}
	
	

}
