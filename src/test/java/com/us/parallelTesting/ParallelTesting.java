package com.us.parallelTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
	@Test
	
	public void getBrowser1() {                  //create void method
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("GetChromeOne method is running on thread:" + Thread.currentThread().getId());
		driver.get("https://www.zoopla.co.uk/");
		ClassA.getTest1();
		ClassA.getTest2();
		ClassA.getTest3();
	}
@Test
	
	public void getBrowser2() {                  //create void method
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("GetChromeOne method is running on thread:" + Thread.currentThread().getId());
		driver.get("https://www.zoopla.co.uk/");
		ClassB.getTest4();
		ClassB.getTest5();
		ClassB.getTest6();
}
@Test

public void getBrowser3() {                  //create void method
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	System.out.println("GetChromeOne method is running on thread:" + Thread.currentThread().getId());
	driver.get("https://www.zoopla.co.uk/");
	ClassC.getTest7();
	ClassC.getTest8();
	ClassC.getTest9();
}
}