package com.psl.tx.pl;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.tx.bean.StudentMarks;
import com.psl.tx.dao.StudentJDBCTemplate;

public class Client 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		
		System.out.println("----------Records Creation------------");
		studentJDBCTemplate.create("priya",11,99,2010);
		studentJDBCTemplate.create("Nina",20,97,2010);
		studentJDBCTemplate.create("Anay",25,100,2011);
		
		System.out.println("---------Listing all the records-------------");
		List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
		
		for(StudentMarks record : studentMarks)
		{
			System.out.println(record);
		}
		
	}
}
