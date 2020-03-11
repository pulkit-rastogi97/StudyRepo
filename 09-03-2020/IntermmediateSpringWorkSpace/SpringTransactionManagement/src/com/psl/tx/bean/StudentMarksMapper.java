package com.psl.tx.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<StudentMarks>
{

	@Override
	public StudentMarks mapRow(ResultSet rs, int totalRows) throws SQLException 
	{
		StudentMarks studentMarks = new StudentMarks();
		
		studentMarks.setId(rs.getInt("stuId"));
		studentMarks.setName(rs.getString("stuName"));
		studentMarks.setAge(rs.getInt("age"));
		studentMarks.setSid(rs.getInt("SID"));
		studentMarks.setYear(rs.getInt("YEAR"));
		studentMarks.setMarks(rs.getInt("MARKS"));
		
		return studentMarks;
	}

}
