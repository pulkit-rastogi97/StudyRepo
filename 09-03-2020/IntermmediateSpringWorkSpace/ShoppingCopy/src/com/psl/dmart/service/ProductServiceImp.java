package com.psl.dmart.service;

import java.util.ArrayList;
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
	static List<Product> products = new ArrayList<Product>();
	
	@Override
	public List<Product> getAllProducts() {
		
		products = productDao.getAllProducts();
		return products;
	}

	@Override
	public void addToCart(int id) {
		System.out.println("add to cart");
		cart.add(getProductById(id));
		System.out.println("add to cart "+cart);
		
	}

	@Override
	public void removeFromCart(int id) {
		Product product = getProductById(id);
		
		cart.remove(product);
	}

	@Override
	public List<Product> displayCartItems() {
		System.out.println("returnuin");
		System.out.println(cart);
		return cart;
	}
	
	public Product getProductById(int id)
	{
		
		//For DataBase (Won't Work)
		//return productDao.getProductById(id);
		
		//Not Database (Work)
		String productId = ""+id;
		Product toReturn=null;
		for(Product product : products)
		{
			if(product.getProductId().equals(productId))
			{
				//Will Work
				toReturn = product;
				
				//Will Not Work
				//toReturn = new Product(product.getProductId(),product.getProductName(),product.getProductPrice());
				
				break;
			}
		}
		return toReturn;
		
		
		
	}
	

}
