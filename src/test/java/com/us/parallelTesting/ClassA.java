package com.us.parallelTesting;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {

	@Test
	public static void getTest1() {              //use static method
		Assert.assertTrue(true);                //Assert and asserTtrue method
		System.out.println("getTest1");        //use syso
		
		
	}
	@Test
	public static void getTest2() {
		Assert.assertTrue(true);
		System.out.println("getTest2");

}
	@Test
	public static void getTest3() {
		Assert.assertTrue(true);
		System.out.println("getTest3");
}
}