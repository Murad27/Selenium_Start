package com.us.parallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnitTesting {
	WebDriver driver;                                                  //Instant level use
	
	@BeforeMethod                                                      //Annotation
	public void getSetUp() {                                           //Per-requisition
		WebDriverManager.chromedriver().setup();                       //For Chrome browser version issue
		driver=new ChromeDriver();                                        // create object but Use the Instant level thats why rmv the webdriver 
		System.out.println("Running with thread"+Thread.currentThread().getId()); //method
		driver.get("https://www.zoopla.co.uk/");                         //get method for URL
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); //implicit wait method
		driver.manage().window().maximize();                          //maximize the window
		System.out.println("open the Browser");
		
	}
	@Test
	public void getTest1() throws InterruptedException {
		Thread.sleep(3000);                               // for wait 
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.id("email")).sendKeys("hasanmurad4201@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Murad123");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/form/div[6]/div/button")).click();
		System.out.println("Test1");
		Thread.sleep(3000);
		
	
		
}
	@Test
	public void getTest2() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")).click();
		System.out.println("Test2");
		Thread.sleep(3000);
		
	}
	@Test
	public void getTest3() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")).click();
		System.out.println("Test3");
		Thread.sleep(3000);
		
	}
	@AfterMethod  
	public void tearDown() {                                    //Close the browser use tear down method
		driver.quit();
		System.out.println("open the Browser");
		
	}

}
