package com.usa.testNGTest;

import org.testng.annotations.Test;

public class DependsOnMethodTesting {
	
    @Test()
	public void getEmployees() {
    	System.out.println("Employee working");
		
		
	}
    @Test (dependsOnMethods = { "getEmployees" })
	public void getSalary() {
		System.out.println("Employee working and getSalary ");
		
		
	} 
  @Test (dependsOnMethods = { "getSalary" })
    public void getBonus() {
    	System.out.println("Employee working and getSalary and bonus ");
    }
  @Test (dependsOnMethods = { "getBonus" })
  public void getTax() {
	  System.out.println("Employee tax ");
  }
}
