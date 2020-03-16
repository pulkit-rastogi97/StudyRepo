package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.psl.bean.Product;

@Repository("dao")
public class ProductDaoImpl extends JdbcDaoSupport  implements ProductDao{

	@Autowired
	DataSource dataSource;
	
	
	@PostConstruct
	public void init()
	{
		this.setDataSource(dataSource);
	}
	
	@Override
	public Boolean validate(final String username,final String password) {
		// TODO Auto-generated method stub
		String q="";
		String sql="select userid from userdetails where userid=? and password=?";
		try
		{
			 q= this.getJdbcTemplate().queryForObject(sql,new Object[]{username,password},String.class);	
		}
		catch(EmptyResultDataAccessException e)
		{
			return false;
		}
		if(q!=null)
		{
			return true;
		}
		return false;
	
	}

	@Override
	public Product addProduct(Product porduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product removeProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> showCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> showAllProducts() {
		// TODO Auto-generated method stub
		String sql="select * from products1 ";
		return this.getJdbcTemplate().query(sql,new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rows) throws SQLException {
				// TODO Auto-generated method stub
				Product product =new Product();
				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setProductPrice(rs.getInt(3));
				return product;
			}
		}
			);
	}

	@Override
	public Product getproductbyId(int productId) {
		// TODO Auto-generated method stub
		String sql="select * from products1 where productId=?";
		Product prod=  this.getJdbcTemplate().queryForObject(sql, new Object[]{productId},new RowMapper<Product>()
				{

					@Override
					public Product mapRow(ResultSet rs, int rows)
							throws SQLException {
						// TODO Auto-generated method stub
						Product product=new Product();
						product.setProductId(rs.getInt(1));
						product.setProductName(rs.getString(2));
						product.setProductPrice(rs.getInt(3));
						return product;
					}
			
				});  
			return prod;
	}
	

}
