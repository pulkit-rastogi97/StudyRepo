package com.psl.Question2.test;

import static org.junit.Assert.*;

import org.junit.*;

import com.psl.Question2.dto.Person;

public class PersonException {
	
	Person p;
	
	@Before
	public void init()
	{
		p=new Person();
	}
	@After
	public void destroy()
	{
		p=null;
	}
	
	@Test
	public void testIsEligible()
	{
		p.setAge(121);
		p.setName("Pulkit");
	
		assertFalse(p.isEligible(p));
	}

}
