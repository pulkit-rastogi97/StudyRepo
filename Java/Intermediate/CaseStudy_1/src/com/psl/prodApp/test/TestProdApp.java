package com.psl.prodApp.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.psl.prodApp.dao.ProductDao;
import com.psl.prodApp.dao.ProductDaoImpl;
import com.psl.prodApp.dto.Product;
import com.psl.prodApp.exception.ProdAppException;
import com.psl.prodApp.service.ProductServiceImpl;

public class TestProdApp {

	ProductDao dao ;
	ProductServiceImpl service;
	
	@Before
	public void init()
	{
		dao = new ProductDaoImpl();
		service = new ProductServiceImpl();
		service.setDao(dao);
	}
	
	@After
	public void destroy()
	{
		dao = null;
		service = null;
		
	}
	
	@Test
	public void testaddproduct()
	{
		Product test = null;
		try {
			Product pro = new Product(1,1,"Physics");
			test = service.addProduct(pro, "electronics");
		} catch (ProdAppException e) {
			
			System.out.println(e.getMessage());
		}
		assertNotNull(test);
	}
	
	@Test
	public void testgetallproducts()
	{
		HashMap<Integer,Product> map = null;
		try {
			map = service.getAllProducts();
		} catch (ProdAppException e) {
			System.out.println(e.getMessage());		}
		assertNotNull(map);
	}
	
	@Test(expected=ProdAppException.class)
	public void testGetProductsById() throws ProdAppException
	{
		ArrayList<Product> list = null;
		
			list = service.getProductById(39);
		
		assertNotNull(list);
	}
	
	@Test(expected=ProdAppException.class)
	public void testdeleteProduct() throws ProdAppException
	{
	
			Product p = service.deleteProduct(20);
			assertNotNull(p);
		
	}

}
