package com.psl.dmart.dao;

import java.util.HashMap;

import com.psl.dmart.bean.Product;

public interface ProductDao {
	
	public HashMap<Integer,Product> getAllProducts();

}
