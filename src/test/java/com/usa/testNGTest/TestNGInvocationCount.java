package com.usa.testNGTest;

import org.testng.annotations.Test;

public class TestNGInvocationCount {
	@Test(invocationCount=10)
	
	public void getCount() {
		System.out.println("Tset");
		
	}

}
