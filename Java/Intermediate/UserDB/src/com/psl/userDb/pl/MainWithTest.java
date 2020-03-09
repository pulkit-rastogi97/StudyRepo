package com.psl.userDb.pl;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.psl.userDb.test.TestUserDao;

public class MainWithTest {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestUserDao.class);
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
