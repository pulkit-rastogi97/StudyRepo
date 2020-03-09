package com.psl.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.psl.bean.Product;

public class ProductDao {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean insert(final Product product)
	{
		return jdbcTemplate.execute("insert into Product values (?,?,?)", new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				
				pstmt.setInt(1, product.getProductId());
				pstmt.setString(2,  product.getProductName());
				pstmt.setInt(3, product.getPrice());			
				int row = pstmt.executeUpdate();
				if(row==1)
					return true;
				else
					return false;
			}
		});
	}
	
	public boolean delete(final String productName)
	{
		return jdbcTemplate.execute("delete from Product where productName=?", new PreparedStatementCallback<Boolean>() 
		{
			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, productName);
				int row = pstmt.executeUpdate();
				if(row==1)
					return true;
				else
					return false;
		}
		});
	}
	
}
