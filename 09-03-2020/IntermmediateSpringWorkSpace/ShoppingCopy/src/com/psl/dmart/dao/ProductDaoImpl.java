package com.psl.dmart.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
	public List<Product> getAllProducts() 
	{
		String sql = "Select * from ProductDetails";
		
		return this.getJdbcTemplate().query(sql, new RowMapper<Product>()
				{

					@Override
					public Product mapRow(ResultSet rs, int noOfRows) throws SQLException {
						
						Product product = new Product
								(rs.getString("productId"),rs.getString("productName"),rs.getString("productPrice"));
						return product;
					}
			
				});		
		
	}


	@Override
	public Product getProductById(int id) {
		String sql = "Select * from productDetails where productId = "+id;
		Product product = null;
//		return this.getJdbcTemplate().queryForObject(sql, new Object[]{}, new RowMapper<Product>()
//				{
//
//					@Override
//					public Product mapRow(ResultSet rs, int arg1)
//							throws SQLException {
//						Product product = new Product(rs.getString("productId"),rs.getString("productName"),rs.getString("productPrice"));
//						return product;
//					}
//			
//				});
		
		List<Product> prod =this.getJdbcTemplate().query(sql, new RowMapper<Product>()
				{

					@Override
					public Product mapRow(ResultSet rs, int arg1)
							throws SQLException {
						Product product = new Product(rs.getString("productId"),rs.getString("productName"),rs.getString("productPrice"));
						return product;
					}
			
				});
		if(prod.size()==1)
			product = prod.get(0);
		return product;
	
	}

}
