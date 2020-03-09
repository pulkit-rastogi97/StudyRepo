package com.psl.Question1.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Period;

import org.junit.*;

import com.psl.Question1.dto.DateOperations;
import com.psl.Question1.exception.DateOperationsException;

public class TestDateOperations {

	
	DateOperations d ;
	@Before
	public void init()
	{
		d = new DateOperations();
	}
	@After
	public void destroy()
	{
		d=null;
	}
	
	@Test
	public void testgetDate() throws DateOperationsException
	{
		int days = 12;
		int month = 4;
		int years = 2009;
		LocalDate date = d.getDate(days, month, years);
		assertNotNull(date);
	}
	
	@Test(expected=DateOperationsException.class)
	public void testGetDifference() throws DateOperationsException
	{
		int days1 = 14;
		int month1 = 9;
		int years1 = 2029;
		int days2 = 22;
		int month2 = 11;
		int years2 = 2021;
		Period period = d.getDifference(days1, month1, years1, days2, month2, years2);
		System.out.println("days = " +period.getDays()+" months = "+period.getMonths()+" years = "+period.getYears());
		System.out.println(period);
		
		assertTrue(period.isNegative());
		
	}
}
