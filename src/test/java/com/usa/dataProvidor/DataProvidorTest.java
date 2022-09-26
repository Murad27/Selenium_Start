package com.usa.dataProvidor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidorTest {
	WebDriver driver;
	
	@DataProvider(name="passData")              //3.Before the method call the dataprovider annotation 
	                                            //and pass argument
	
	public static Object[][]credentials(){              //1.create a method help of the java object
		return new Object[][]{ 
			   {"hasanmurad4201@gmail.com","Murad123"},     //2.multidymantion array
			   {"hasanmurad4201@gmail.com","Murad123"},
			  {"hasanmurad4201@gmail.com","Murad123"}};
		}
	@Test(dataProvider="passData")       //5.Then call test data annotation pass the argm                     
			                             // 1st data providor then test name.
	public void Test1 (String email,String password){     //4.Then as usual create test case  
		                                                   // and inside the method pass the String veriable
		WebDriverManager.chromedriver().setup();
		System.out.println("get Method Thread " +Thread.currentThread().getId());
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hasanmurad4201@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murad123");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/form/div[6]/div/button")).click();
		driver.quit();
		
	}
		


}
	
