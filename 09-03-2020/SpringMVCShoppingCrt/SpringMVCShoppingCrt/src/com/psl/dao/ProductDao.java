package com.psl.dao;

import java.util.ArrayList;
import java.util.List;

import com.psl.bean.Product;

public interface ProductDao {

	public Boolean validate(String username,String password);
	public Product addProduct(Product porduct);
	public Product removeProduct(int productId);
	public List<Product> showCart(); 
	public List<Product> showAllProducts();
	public Product getproductbyId(int productId);
	 List<Product> prodlist=new ArrayList<Product>();
}
