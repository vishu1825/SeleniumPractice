package com.inetbanking.pageObject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo222 {
	
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("BeforeClass>1");
	}
	@BeforeMethod
	public void preConditions()
	{
		System.out.println("BeforeMethod>1");

	}
	@BeforeTest
	public void test1()
	{
		System.out.println("Before Test ");

	}
	//@BeforeTest
	//public void test3()
	//{
	//	System.out.println("Before Test ");

	//}

	@Test(priority=-10)
	public void add()
	{
		System.out.println("Add Method ");

	}
	@Test(priority=-2)
	public void ab()
	{
		System.out.println("Sub Method ");//Priority order executes from left to right 

	}
	@AfterTest
	public void test2()
	{
		System.out.println("After Test>1 ");

	}


	@AfterClass
	public void postCondition()
	{
		System.out.println("AfterClass>1");

	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("AfterMethod>1");

	}
}
