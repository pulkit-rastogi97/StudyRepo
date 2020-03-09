
package com.psl.dao;
import com.psl.bean.*;

import java.sql.*;
import java.util.ArrayList;
public class JDBCcode {
	
	public static ArrayList<Employee> fetch() throws SQLException,ClassNotFoundException {
		boolean flag=false;
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/sys?autoReconnect=TRUE&useSSL=FALSE ";
		String username= "root";
		String password = "vijay@2019";
		Connection con = DriverManager.getConnection(url,username,password);
		String sql = "SELECT * FROM Employee;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Employee emp = null;
		while(rs.next()) {
			
			emp = new Employee (rs.getInt(1),rs.getString(2),rs.getInt(3));
			employees.add(emp);
		}
		
		return employees;
	}

}
