package com.usa.failedTestRun;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {

	@Test
	public void getTest1() {                    //use void method
		AssertJUnit.assertTrue(true);           //Assert method and asserTtrue method
		System.out.println("getTest1");         //use syso
		
		
	}
	@Test
	public void getTest2() {
		AssertJUnit.assertTrue(true);
		System.out.println("getTest2");

}
	@Test
	public void getTest3() {
		AssertJUnit.assertTrue(true);
		System.out.println("getTest3");
}
}