package com.psl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.psl.bean.Employee;
import com.psl.exception.EmployeeException;
import com.psl.util.DBUtil;

public class EmployeeDao implements EmployeeDaoI{

	Connection con;
	Employee emp=null;
	public EmployeeDao()
	{
		con = DBUtil.getConnect();
	}
	@Override
	public ArrayList<Employee> getAllEmployees() throws EmployeeException
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		String sql = "SELECT * FROM Employee";
		try{
		Statement stmt = 
				con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int sal = rs.getInt(3);
			Employee emp = new Employee(id,name,sal);
			list.add(emp);
		}
		}catch(SQLException e)
		{
			throw new EmployeeException(e.getMessage());
		}
		if(list.isEmpty())
		{
			throw new EmployeeException("No Employee Found !!");
		}
		else
		{
			return list;
		}
	}
	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException{
		String sql  = "SELECT * FROM Employee WHERE empId =  "+empId;
		try{
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int sal = rs.getInt(3);
			emp = new Employee(id,name,sal);
		}
		}catch(SQLException e)
		{
			throw new EmployeeException(e.getMessage());
		}
		if(emp==null)
		{
			throw new EmployeeException("Search Failed : Employee doesn't exist !! ");
		}
		return emp;
	}
	@Override
	public Employee updateEmployee(int empId, int empSal) throws EmployeeException{
		int row;
		emp = getEmployeeById(empId);
		if(emp==null)
		{
			throw new EmployeeException("Updation Failed : Employee doesn't exist !! ");
		}
		else
		{
			emp.setEmpSal(empSal);
			String sql = "UPDATE Employee SET empSal = "+emp.getEmpSal()+" WHERE empId = "+emp.getEmpId();
			try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			row = pstmt.executeUpdate();
			}catch(SQLException e)
			{
				throw new EmployeeException(e.getMessage());
			}
			if(row > 0 )
			{
				return emp;
			}
			else
				throw new EmployeeException("Updation Failed : Due to some uncertain databse errors ");
		}
		
}
	@Override
	public Employee deleteEmployee(int empId) throws EmployeeException{
		int row;
		emp = getEmployeeById(empId);
		if(emp==null)
		{
			throw new EmployeeException("Deletion Failed : Employee doesn't exist !! ");
		}
		else
		{
			String sql = "DELETE FROM Employee WHERE empId = "+emp.getEmpId();
			try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			row = pstmt.executeUpdate();
			}catch(SQLException e )
			{
				throw new EmployeeException(e.getMessage());
			}
			if(row>0)
				return emp;
			else
				throw new EmployeeException("Deletion Failed : Due to some uncertain databse errors ");
		}
	}
	@Override
	public int insertEmployee(Employee emp) throws EmployeeException{
		int id = 0,row;
		String sql = "INSERT INTO Employee VALUES(default,?,?)";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, emp.getEmpName());
			pstmt.setInt(2, emp.getEmpSal());
			row = pstmt.executeUpdate();
		
			if(row > 0)
			{
				id = getCurrentId();
			}
			else
			{
				throw new EmployeeException("Insertion Failed : Due to some uncertain database errors ");
			}
	}catch(SQLException e)
		{
		throw new EmployeeException(e.getMessage());
	}
					
		return id;
	}	
		public int getCurrentId() throws EmployeeException
		{
			int id = 0;
		/*	String sql = "SELECT 'Auto_Increment' FROM INFORMATION_SCHEMA.TABLES "+"WHERE TABLE_SCHEMA = 'mysql' AND TABLE_NAME = 'EMPLOYEE'";
		 * */
		 String sql = "SELECT LAST_INSERT_ID()";
		 try{
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next())
				{
					 id = rs.getInt(1);
			   }else{
				 throw new EmployeeException("ID Generation Error : Due to some uncertainity in databases");
			   }
		 }catch(SQLException e )
		 {
			 throw new EmployeeException(e.getMessage());
		 }
			return id;
		}

	}

