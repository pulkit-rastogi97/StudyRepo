package com.psl.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class MyClass1 extends JdbcDaoSupport implements MyInterface{

	static int id = 0;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, noRollbackFor=org.springframework.jdbc.BadSqlGrammarException.class)
	public void method1() {
		
		String sql = "insert into table1(id,name) values(?,?)";
		this.getJdbcTemplate().update(sql, new Object[]{++id,"name"});
		System.out.println("record added with id  = "+id);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		MyInterface ref = (MyInterface)context.getBean("cls2");
		ref.method2();
		
	}

	@Override
	public void method2() {
		System.out.println("hiiii did you just called me !! "+this.getClass());
		
	}

}
