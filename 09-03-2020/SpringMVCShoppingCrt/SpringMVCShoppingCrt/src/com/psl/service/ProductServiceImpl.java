package com.psl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.bean.Product;
import com.psl.dao.ProductDao;

@Service("service")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;
	
	

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public Product removeProduct(int productId) {
		// TODO Auto-generated method stub
		return dao.removeProduct(productId);
	}

	@Override
	public List<Product> showCart() {
		// TODO Auto-generated method stub
		return dao.showCart();
	}

	@Override
	public Boolean validate(String username, String password) {
		// TODO Auto-generated method stub
		return dao.validate(username, password);
	}

	@Override
	public List<Product> showAllProducts() {
		// TODO Auto-generated method stub
	
		return dao.showAllProducts();
	}

	@Override
	public Product getproductbyId(int productId) {
		// TODO Auto-generated method stub
		return dao.getproductbyId(productId);
	}

}
