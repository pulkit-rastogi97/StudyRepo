package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.psl.bean.User;

@Repository("dao")
public class LoginDaoImpl extends JdbcDaoSupport implements LoginDao{

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void initialize()
	{
		this.setDataSource(dataSource);
	}

	@Override
	public Boolean validateUser(final User user) {
String sql = "SELECT * FROM USERDETAILS WHERE USERID = \""+
	user.getUserId()+"\"  AND PASSWORD = \""+user.getPassword()+"\"";
		
		try
		{
		if(this.getJdbcTemplate().queryForObject(sql,new RowMapper<User>()
		{
			
			
					@Override
					public User mapRow(ResultSet rs, int noOfRows) throws SQLException {
						User user = null;
						if(rs!=null)
						{
							user = new User(rs.getString("userId"),rs.getString("password"));
							return user;
						}
							
						else
						{ 
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