package com.psl.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	static Connection con;
	static
	{
		try{
			
			Properties prop = new Properties();
			prop.load(new FileInputStream("jdbc.properties"));
			String url=prop.getProperty("url");
			String driver = prop.getProperty("driver");
			String userName = prop.getProperty("username");
			String password = prop.getProperty("password");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,userName,password);
			
		}catch(SQLException | IOException | ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static Connection getConnect()
	{
		return con;
	}
}
