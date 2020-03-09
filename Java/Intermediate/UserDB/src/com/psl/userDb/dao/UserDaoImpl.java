package com.psl.userDb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.psl.userDb.dto.UserDetails;
import com.psl.userDb.util.DBUtil;

public class UserDaoImpl implements UserDao{

	Connection con;
	public UserDaoImpl()
	{
		System.out.println("sersdfhtshjn");
		con = DBUtil.getConnection();
	}
	@Override
	public UserDetails addUser(UserDetails obj) throws Exception {
		UserDetails ref = null;
		String sql = "INSERT INTO UserDetails VALUES(?,?)";
		try
		{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj.getUserName());
			pstmt.setString(2, obj.getPassword());
			int row = pstmt.executeUpdate();
			if(row>0)
			{
				ref = obj;
			}
			else
				throw new Exception("User Can't be added");
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return ref;
	}

	@Override
	public UserDetails deleteUser(UserDetails obj) {
		UserDetails ref = null  ;
		String sql = "DELETE FROM UserDetails WHERE username = "+obj.getUserName();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				ref=new UserDetails(rs.getString(1),rs.getString(2));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ref;
	}

	@Override
	public UserDetails updateUser(UserDetails obj) {
		String sql = "UPDATE UserDetails SET username = \'"+obj.getPassword()+"\' WHERE username = \'"+obj.getUserName()+"\'";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			int row = pstmt.executeUpdate();
			if(row>0)
			{
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
