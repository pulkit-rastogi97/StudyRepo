package com.psl.dao;

import java.sql.*;
import com.psl.dto.Employee;
import com.psl.util.DBUtil;

public class EmployeeDao implements EmployeeDaoI{

	Connection con;
	public EmployeeDao()
	{
		con=DBUtil.getConnect();
	}
	@Override
	public Employee getEmployeeById(int id) {
		
		Employee emp = null;
		try{
		String sql = "SELECT * FROM EMPLOYEE WHERE empId = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,  id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next())
		{
			emp = new Employee();
			emp.setEmpId(rs.getInt(1));
			emp.setEmpName(rs.getString(2));
			emp.setEmpSal(rs.getInt(3));
			emp.setDate(rs.getDate(4).toLocalDate());
		}
		
		}catch(SQLException e){e.printStackTrace();}		
		return emp;
	}

}
