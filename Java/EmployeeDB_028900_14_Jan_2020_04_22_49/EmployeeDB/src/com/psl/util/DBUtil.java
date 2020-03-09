package com.psl.util;

import java.sql.*;
import java.sql.DriverManager;

public class DBUtil {

	static Connection con;
	
	static 
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");//it will load the driver class
			String url = "jdbc:mysql://localhost:3306/test";
			String username = "root";
			String password = "root";
			//con will refer current connection
			 con = 
					DriverManager.getConnection(url,username,password);
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getConnect()
	{
		return con;
	}
}
