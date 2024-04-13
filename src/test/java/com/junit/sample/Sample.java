package com.junit.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("Before Test method");
	}
	
	@Ignore
	@Test
	public void testMethod1() {
		System.out.println("Test 1");
	}	
	
	@Test
	public void testMethod2() {
		System.out.println("Test 2");
	}
	
	
	@After
	public void afterMethod() {
		System.out.println("After Test method");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
