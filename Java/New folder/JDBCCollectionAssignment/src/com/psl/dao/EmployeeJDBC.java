package com.psl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.psl.bean.Employee;

public class EmployeeJDBC {

		public static ArrayList<Employee> fetch() throws SQLException, ClassNotFoundException
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String userName = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, userName,password);
			ArrayList<Employee> empset = new ArrayList<Employee>();
			String sql = "SELECT * FROM Employee";
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			Employee emp = null;
			while(rs.next())
			{
				emp = new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
				empset.add(emp);
				
			}
			return empset;
			
					
		}
	}

