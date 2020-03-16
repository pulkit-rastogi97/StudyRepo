package com.psl.dmart.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.psl.dmart.bean.Product;

@Repository("productDao")
public class ProductDaoImpl extends JdbcDaoSupport implements ProductDao{

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void init()
	{
		this.setDataSource(dataSource);
	}
	
	
	@Override
	public HashMap<Integer,Product> getAllProducts() 
	{
		final HashMap<Integer,Product> productMap = new HashMap<Integer, Product>();
		String sql = "Select * from ProductDetails";
		
		this.getJdbcTemplate().query(sql, new RowMapper<Product>()
				{

					@Override
					public Product mapRow(ResultSet rs, int noOfRows) throws SQLException {
						
						Product product = new Product
								(rs.getString("productId"),rs.getString("productName"),rs.getString("productPrice"));
						productMap.put(Integer.parseInt(product.getProductId()), product);
						return product;
					}
			
				});
		
		return productMap;
		
		
	}

}
