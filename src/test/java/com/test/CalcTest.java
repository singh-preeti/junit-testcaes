package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {

	Calculator cal = new Calculator();
	@BeforeClass
	public  static void setup()
	{
		System.out.println("setting resource for all the test cases");
	}
	@Before
	public void start()
	{
		System.out.println("started");
	}
	
	@Test
	public void testSub()
	{
		assertEquals(3,cal.sub(4, 2));
	}
	@Test
	public void testadd()
	{
		assertEquals(30,cal.add(20, 10));
	}
	@Test
	public void testdiv()
	{
		assertEquals(2,cal.div(20, 10));
	}
	@After
	public void stop()
	{
		System.out.println("stopping!");
	}
	@AfterClass
	public  static void tearDown()
	{
		System.out.println("releasing the resources!");
	}
}