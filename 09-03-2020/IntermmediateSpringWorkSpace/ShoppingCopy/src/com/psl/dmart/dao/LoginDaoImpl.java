package com.psl.dmart.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.psl.dmart.bean.Login;

@Repository("loginDao")
public class LoginDaoImpl extends JdbcDaoSupport implements LoginDao{

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void initialize()
	{
		this.setDataSource(dataSource);
	}
	
	@Override
	public boolean validateUser(final Login login) 
	{
		
		String sql = "SELECT * FROM USERDETAILS WHERE USERID = \""+login.getUserId()+"\"  AND PASSWORD = \""+login.getPassword()+"\"";
		
		try
		{
		if(this.getJdbcTemplate().queryForObject(sql,new RowMapper<Login>()
		{
			
			
					@Override
					public Login mapRow(ResultSet rs, int noOfRows) throws SQLException {
						Login user = null;
						if(rs!=null)
						{
							user = new Login(rs.getString("userId"),rs.getString("password"));
							return user;
						}
							
						else
						{ System.out.println("hiiiii");
							return user;
							
						}
					}
					
			
			
				})!=null)
				{
					return true;
				}
		return false;
	}catch(EmptyResultDataAccessException e)
	{
		return false;
	}

}
}
