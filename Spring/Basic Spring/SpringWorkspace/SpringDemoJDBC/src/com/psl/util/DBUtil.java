package com.psl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static Connection con;
	
	static
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/test";
			String username ="root";
			String password = "root";
			
			con = DriverManager.getConnection(url,username,password);
		}catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		if(con==null)
			System.out.println("connection error");
		return con;
	}
	
	public static void close()
	{
		try {
			con.close();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	
}
