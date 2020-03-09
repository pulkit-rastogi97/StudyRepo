package com.psl.userDb.util;

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
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("jdbc.properties"));
			final String username = prop.getProperty("username");
			final String password = prop.getProperty("password");
			final String JDBC_DRIVER = prop.getProperty("driver");
			final String URL = prop.getProperty("url");
			
			Class.forName(JDBC_DRIVER);
			
			con = DriverManager.getConnection(URL,username,password);
			
			
		} catch (IOException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		return con;
	}
}
